/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.frame.web.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.glacier.basic.exception.IncorrectCaptchaException;
import com.glacier.basic.util.IpUtil;
import com.glacier.frame.compent.realm.CaptchaUsernamePasswordToken;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.service.carrier.CarrierMemberService;

/**
 * @ClassName: CaptchaFormAuthenticationFilter 
 * @Description: TODO(登录认证) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-10-28 上午9:33:59
 */
public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {
	

    public static final String DEFAULT_CAPTCHA_PARAM = "captcha";

    private String captchaParam = DEFAULT_CAPTCHA_PARAM;

    @Autowired
    private CarrierMemberService carrierMemberService;
    
    public String getCaptchaParam() {
        return captchaParam;
    }

    
    protected String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }

    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {

        String username=getUsername(request);
        //判断该会员的状态是否禁用
        CarrierMember carrierMember = carrierMemberService.retrieveName(username);
        if(carrierMember!=null){
            //是否禁用了该会员
            if(carrierMember.getStatus().equals("disable")){
                username="NO";//不让它登陆
            }
            //审核状态是否为审核中和审核失败
            if(carrierMember.getAuditState().equals("authstr")){
                username="AUTHSTR";//不让它登陆
            } else if (carrierMember.getAuditState().equals("failure")) {
                username="FAILURE";//不让它登陆
            }
        } 
        String password = getPassword(request);
        String captcha = getCaptcha(request);
        boolean rememberMe = isRememberMe(request);
        String ip = IpUtil.getIpAddr((HttpServletRequest) request);
        String host = ip + IpUtil.getIpInfo(ip);

        char[] charPassword = null;

        if (StringUtils.isNotBlank(password)) {
            charPassword = password.toCharArray();
        }

        return new CaptchaUsernamePasswordToken(username, charPassword, rememberMe, host, captcha);
    }

    /**
     * 登录认证，失败会捕获相关异常信息
     */
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) createToken(request, response);
        try {
            doCaptchaValidate( (HttpServletRequest)request,token);
            if(token.getUsername().equals("NO")){
                throw new DisabledAccountException("该用户被禁用，请联系客服！");
            } 
            if(token.getUsername().equals("AUTHSTR")){
                throw new DisabledAccountException("该用户还未通过审核，请等待审核通过，或者联系客服！");
            }
            if(token.getUsername().equals("FAILURE")){
                throw new DisabledAccountException("该用户审核失败，请联系客服！");
            }
            Subject subject = getSubject(request, response);
            subject.login(token);
            HttpSession session = ((HttpServletRequest) request).getSession(false);
            session.setAttribute("currentUser", subject.getPrincipal());
            return onLoginSuccess(token, subject, request, response);
        } catch (AuthenticationException e) {
            return onLoginFailure(token, e, request, response);
        }
    }

    // 验证码校验
    protected void doCaptchaValidate(HttpServletRequest request, CaptchaUsernamePasswordToken token) {
        String captcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (StringUtils.isBlank(captcha) || !captcha.equalsIgnoreCase(token.getCaptcha())) {
            throw new IncorrectCaptchaException("验证码错误！");
        }
    }
}
