/**
 * @Title: MemberDetailController.java 
 * @Package com.glacier.frame.web.controller.member 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-12-9 下午3:07:52 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-9
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.member;

import javax.servlet.http.HttpSession;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.frame.entity.member.ShipperIndividualityMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.service.member.ShipperMemberService;
import com.glacier.jqueryui.util.JqReturnJson;


/**
 * @ClassName: MemberDetailController 
 * @Description: TODO(会员中心详细控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-12-9 下午3:07:52
 */
@Controller
@RequestMapping(value="memberDetail")
public class MemberDetailController {
  
	@Autowired
	private ShipperMemberService shipperMemberService;
	
	//个体会员信息添加
    @RequestMapping(value="addPro.json")
	@ResponseBody
	private Object addPro(ShipperIndividualityMember shipperIndividualityMember,int mobileValidate,HttpSession session){
    	int mobile_true=(Integer)session.getAttribute("mobile_code");
        return shipperMemberService.addProInfo(shipperIndividualityMember, mobileValidate,mobile_true);
     }
    
    //会员邮箱修改
    @RequestMapping(value="sendMailCode.json")
    @ResponseBody
    private Object sendMailCode(HttpSession session){
    	int mailCode = (int)((Math.random()*9+1)*100000);
    	session.setAttribute("mailCode", mailCode);
    	System.out.print("当前发送的邮箱验证码:"+mailCode);
    	JqReturnJson returnResult=new JqReturnJson();
    	Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
     	// 基于org.apache.commons.mail,封装好的mail，发邮件流程比较简单，比原生态mail简单。
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.qq.com");// QQ郵箱服務器
        // email.setHostName("smtp.163.com");// 163郵箱服務器
        // email.setHostName("smtp.gmail.com");// gmail郵箱服務器
        email.setSmtpPort(465);// 设置端口号
        email.setAuthenticator(new DefaultAuthenticator("1240033960@qq.com", "zx5304960"));// 用1240033960@qq.com这个邮箱发送验证邮件的
        email.setTLS(true);// tls要设置为true,没有设置会报错。
        email.setSSL(true);// ssl要设置为true,没有设置会报错。
        try {
            email.setFrom("1240033960@qq.com", "冰川物流管理员", "UTF-8");
            // email.setFrom("13798985542@163.com", "13798985542@163.com","UTF-8");
            // email.setFrom("yuzexu1@gmail.com", "yuzexu1@gmail.com", "UTF-8");
        } catch (EmailException e1) {
            e1.printStackTrace();
        }
        email.setCharset("UTF-8");// 没有设置会乱码。
        try {
            email.setSubject("冰川物流消息提示");// 设置邮件名称
            email.setHtmlMsg("尊敬的"+pricipalMember.getMemberName()+"用户你好,你正在执行修改邮箱绑定操作,你获取的验证码信息为:"+mailCode+",请谨慎修改!");// 设置邮件内容
            email.addTo(pricipalMember.getEmail());// 给会员发邮件
            // email.addTo("804346249@qq.com");
            email.send();// 邮件发送
            returnResult.setSuccess(true);
            returnResult.setMsg("邮箱验证码已成功发出!");
        } catch (EmailException e) {
        	 returnResult.setMsg("邮箱验证码发送失败!");
        }
        return returnResult;
     }
    
    
  //个体会员信息添加
    @RequestMapping(value="updateMail.json")
	@ResponseBody
	private Object updateMail(String email,int emailValidate,String memberId,HttpSession session){
    	int mailCode=(Integer)session.getAttribute("mailCode");
        return shipperMemberService.updateMail(email, emailValidate, mailCode);
     }
    
}
