package com.glacier.frame.web.controller.common;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.basic.util.IpUtil;
import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.service.carrier.CarrierMemberService;
import com.glacier.frame.service.common.HtmlEmailPublic;
import com.glacier.frame.service.member.ShipperMemberService;
import com.glacier.frame.service.website.WebsiteAnnouncementService;
import com.glacier.frame.service.website.WebsiteNewsService;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: RegisterController 
 * @Description: TODO(注册控制器) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-10-11 下午2:14:28
 */
@Controller
public class RegisterController extends AbstractController {

    @Autowired
    private ShipperMemberService shipperMemberService;// 注入会员货主业务类

    @Autowired
    private CarrierMemberService carrierMemberService;// 注入会员货主业务类
    
    @Autowired
    private WebsiteAnnouncementService announcementService;// 注入公告业务类

    @Autowired
    private WebsiteNewsService newsService;// 注入新闻业务类

    @Autowired
    private HtmlEmailPublic htmlEmailPublic;// 注入邮箱工具类

    /**
     * @Title: intoregister
     * @Description: TODO(前台货主注册转向页面)
     * @param @return设定文件
     * @return String 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/intoregister.htm")
    public String intoregister(HttpSession session) {
        session.removeAttribute("currentShipperMember");
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入注册页面，默认把登录用户注销
        }
        return "register";
    }

    /**
     * @Title: intoregister
     * @Description: TODO(前台承运商注册转向页面)
     * @param @return设定文件
     * @return String 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/intoregisterCarrier.htm")
    public String intoregisterCarrier(HttpSession session) {
        session.removeAttribute("currentCarrierMember");
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入注册页面，默认把登录用户注销
        }
        return "registerCarrier";
    }

    /**
     * @Title: perfectMemberPhoto
     * @Description: TODO(前台会员更改头像)
     * @param @param member
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/perfectMemberPhoto.htm", method = RequestMethod.POST)
    @ResponseBody
    public Object perfectMemberPhoto(@Valid
    ShipperMember shipperMember, HttpSession session) {
        JqReturnJson perfectRegister = (JqReturnJson) shipperMemberService.editMemberPhotoReception(shipperMember);
        ShipperMember loginMember = (ShipperMember) shipperMemberService.getShipperMember(shipperMember.getMemberId());
        session.removeAttribute("currentMember");
        session.setAttribute("currentMember", loginMember);
        return perfectRegister;
    }
    
    /**
     * @Title: register
     * @Description: TODO(前台货主注册功能)
     * @param @param shipperMember
     * @param @param bindingResult
     * @param @param captcha
     * @param @param request
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/register.htm", method = RequestMethod.POST)
    public Object register(@Valid
    ShipperMember shipperMember, BindingResult bindingResult, String captcha, HttpServletRequest request, HttpSession session) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
        Matcher matcher = pattern.matcher(shipperMember.getEmail());
        // 验证邮箱的合法性
        if (matcher.matches() == false) {
            return "register";
        }
        String isCaptcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (StringUtils.isBlank(captcha) || !isCaptcha.equalsIgnoreCase(captcha)) {
            // throw new IncorrectCaptchaException("验证码错误！");
            request.setAttribute("errorCaptcha", "errorCaptcha");// 通过设置errorCaptcha的
                                                                 // 值，来判断验证码是否正确。
            request.setAttribute("shipperMember", shipperMember);
            return "register";
        }
        session.setAttribute("isCaptcha", isCaptcha);
        // 判断用户名是否重复
        JqReturnJson returnisUsernameRepeat = (JqReturnJson) shipperMemberService.isUsernameRepeat(shipperMember);
        if (!returnisUsernameRepeat.isSuccess()) {
            request.setAttribute("usernameRepeat", "usernameRepeat");// 通过设置usernameRepeat的
                                                                     // 值，来判断用户名是否重复。
            request.setAttribute("shipperMember", shipperMember);
            return "register";
        }
        // 判断邮箱是否重复isEmailRepeat
        JqReturnJson returnisEmailRepeat = (JqReturnJson) shipperMemberService.isEmailRepeat(shipperMember);
        if (!returnisEmailRepeat.isSuccess()) {
            request.setAttribute("emailRepeat", "emailRepeat");// 通过设置emailRepeat的
                                                               // 值，来判断邮箱是否重复。
            request.setAttribute("shipperMember", shipperMember);
            return "register";
        }
        ModelAndView mav = new ModelAndView("sendMailSuccess");

        // 创建一个临时用户注册ID
        String registerId = "" + Math.random() * Math.random();
        /**
         * 得到web系统url路径的方法
         * */
        // 得到web的url路径：http://localhost:8080/ssh1/
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
        // 邮件发送成功后，用户点在邮箱中点击这个链接回到注册网站。
        // http://localhost:8080/frame-website//mailBack.htm?registerId=" +
        // registerId;
        String url = basePath + "mailBack.htm?registerId=" + registerId;
        // 将验证邮箱链接后面的registerId存到session中
        session.setAttribute(registerId, shipperMember.getMemberName());
        session.setAttribute("shipperMemberSimple", shipperMember);
        // 设置session的有效时间，为10分钟，10分钟内没有点击链接的话，注册将失败
        session.setMaxInactiveInterval(600);
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
            email.setFrom("1240033960@qq.com", "互联网管理员", "UTF-8");
            // email.setFrom("13798985542@163.com", "13798985542@163.com",
            // "UTF-8");
            // email.setFrom("yuzexu1@gmail.com", "yuzexu1@gmail.com", "UTF-8");
        } catch (EmailException e1) {
            e1.printStackTrace();
        }
        email.setCharset("UTF-8");// 没有设置会乱码。
        try {
            email.setSubject("互联网注册");// 设置邮件名称
            email.setHtmlMsg("点击<a href='" + url + "'>" + url + "</a>完成注册！");// 设置邮件内容
            email.addTo(shipperMember.getEmail());// 给会员发邮件
            // email.addTo("804346249@qq.com");
            email.send();// 邮件发送
        } catch (EmailException e) {
            // throw new RuntimeException(e);
            return mav;
        }
        return mav;
    }
    
    /**
     * @Title: register
     * @Description: TODO(前台承运商注册功能)
     * @param @param shipperMember
     * @param @param bindingResult
     * @param @param captcha
     * @param @param request
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/registerCarrier.htm", method = RequestMethod.POST)
    public Object registerCarrier(@Valid
            CarrierMember carrierMember, BindingResult bindingResult, String captcha, HttpServletRequest request, HttpSession session) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
        Matcher matcher = pattern.matcher(carrierMember.getEmail());
        // 验证邮箱的合法性
        if (matcher.matches() == false) {
            return "register";
        }
        String isCaptcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (StringUtils.isBlank(captcha) || !isCaptcha.equalsIgnoreCase(captcha)) {
            // throw new IncorrectCaptchaException("验证码错误！");
            request.setAttribute("errorCaptcha", "errorCaptcha");// 通过设置errorCaptcha的
                                                                 // 值，来判断验证码是否正确。
            request.setAttribute("carrierMember", carrierMember);
            return "register";
        }
        session.setAttribute("isCaptcha", isCaptcha);
        // 判断用户名是否重复
        JqReturnJson returnisUsernameRepeat = (JqReturnJson) carrierMemberService.isUsernameRepeat(carrierMember);
        if (!returnisUsernameRepeat.isSuccess()) {
            request.setAttribute("usernameRepeat", "usernameRepeat");// 通过设置usernameRepeat的
                                                                     // 值，来判断用户名是否重复。
            request.setAttribute("carrierMember", carrierMember);
            return "register";
        }
        // 判断邮箱是否重复isEmailRepeat
        JqReturnJson returnisEmailRepeat = (JqReturnJson) carrierMemberService.isEmailRepeat(carrierMember);
        if (!returnisEmailRepeat.isSuccess()) {
            request.setAttribute("emailRepeat", "emailRepeat");// 通过设置emailRepeat的
                                                               // 值，来判断邮箱是否重复。
            request.setAttribute("carrierMember", carrierMember);
            return "register";
        }
        ModelAndView mav = new ModelAndView("sendMailSuccess");

        // 创建一个临时用户注册ID
        String registerId = "" + Math.random() * Math.random();
        /**
         * 得到web系统url路径的方法
         * */
        // 得到web的url路径：http://localhost:8080/ssh1/
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
        // 邮件发送成功后，用户点在邮箱中点击这个链接回到注册网站。
        // http://localhost:8080/frame-website//mailBack.htm?registerId=" +
        // registerId;
        String url = basePath + "mailBackCarrier.htm?registerId=" + registerId;
        // 将验证邮箱链接后面的registerId存到session中
        session.setAttribute(registerId, carrierMember.getMemberName());
        session.setAttribute("carrierMemberSimple", carrierMember);
        // 设置session的有效时间，为10分钟，10分钟内没有点击链接的话，注册将失败
        session.setMaxInactiveInterval(600);
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
            email.setFrom("1240033960@qq.com", "互联网管理员", "UTF-8");
            // email.setFrom("13798985542@163.com", "13798985542@163.com",
            // "UTF-8");
            // email.setFrom("yuzexu1@gmail.com", "yuzexu1@gmail.com", "UTF-8");
        } catch (EmailException e1) {
            e1.printStackTrace();
        }
        email.setCharset("UTF-8");// 没有设置会乱码。
        try {
            email.setSubject("互联网注册");// 设置邮件名称
            email.setHtmlMsg("点击<a href='" + url + "'>" + url + "</a>完成注册！");// 设置邮件内容
            email.addTo(carrierMember.getEmail());// 给会员发邮件
            // email.addTo("804346249@qq.com");
            email.send();// 邮件发送
        } catch (EmailException e) {
            // throw new RuntimeException(e);
            return mav;
        }
        return mav;
    }

    /**
     * @Title: mailBack
     * @Description: TODO(货主注册，点击邮件验证，转向页面。)
     * @param @param registerId
     * @param @param request
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/mailBack.htm")
    public Object mailBack(JqPager pager, String pagetype, String shipperMemberId, String registerId, HttpServletRequest request, HttpSession session) {
        // 获取主页显示的借款、新闻、公告的数据列表
        ModelAndView mav = new ModelAndView("index");
        //int p = 1;
        mav.addObject("announcementDatas", announcementService.listAsWebsite(pager, 1));// 主页加载公告信息
        //mav.addObject("newsDatas", newsService.listAsWebsite(pager, 1, "type"));// 主页加载新闻信息
        if (registerId == null) {
            return mav;
        }
        String registerName = (String) session.getAttribute(registerId);
        // 如果session设置的有限时间过期，则注册不成功，直接返回
        if (registerName == null || registerName.equals("")) {
            return mav;
        }
        session.setAttribute("registerName", registerName);
        ShipperMember shipperMember = (ShipperMember) session.getAttribute("shipperMemberSimple");
        // 获取最后登录ip地址
        String ip = IpUtil.getIpAddr((HttpServletRequest) request);
        String host = ip + IpUtil.getIpInfo(ip);
        shipperMember.setLastLoginIpAddress(host);
        // 注册时，生成会员信息
        JqReturnJson returnResult = (JqReturnJson) shipperMemberService.addShipperMemberReception(shipperMember);// 注册会员，调用添加会员方法
        request.setAttribute("returnResult", returnResult);
        if (!returnResult.isSuccess()) {
            return mav;
        }
        String shipperMemberMsg="尊敬的用户：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;恭喜您!您在互联网注册会员成功！注册的账号为"+shipperMember.getMemberName()+"。" +
                "<br/><br/><font color='red'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注：此邮件由互联网系统自动发送，请勿回复！</font>";
        //htmlEmailPublic.goEmail(shipperMember,shipperMemberMsg);
        List<String> ShipperMemberMailList = new ArrayList<String>();
        ShipperMemberMailList.add(shipperMember.getEmail());
        htmlEmailPublic.setToMailsList(ShipperMemberMailList);
        htmlEmailPublic.setTitle("互联网提示");
        htmlEmailPublic.setMsg(shipperMemberMsg);
        Thread borrowingLoanThread = new Thread(htmlEmailPublic);
        borrowingLoanThread.start();//启动线程
        return "login";
    }

    /**
     * @Title: mailBack
     * @Description: TODO(承运商注册，点击邮件验证，转向页面。)
     * @param @param registerId
     * @param @param request
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/mailBackCarrier.htm")
    public Object mailBackCarrier(JqPager pager, String pagetype, String carrierMemberId, String registerId, HttpServletRequest request, HttpSession session) {
        // 获取主页显示的借款、新闻、公告的数据列表
        ModelAndView mav = new ModelAndView("index");
        //int p = 1;
        mav.addObject("announcementDatas", announcementService.listAsWebsite(pager, 1));// 主页加载公告信息
        //mav.addObject("newsDatas", newsService.listAsWebsite(pager, 1, "type"));// 主页加载新闻信息
        if (registerId == null) {
            return mav;
        }
        String registerName = (String) session.getAttribute(registerId);
        // 如果session设置的有限时间过期，则注册不成功，直接返回
        if (registerName == null || registerName.equals("")) {
            return mav;
        }
        session.setAttribute("registerName", registerName);
        CarrierMember carrierMember = (CarrierMember) session.getAttribute("carrierMemberSimple");
        // 获取最后登录ip地址
        String ip = IpUtil.getIpAddr((HttpServletRequest) request);
        String host = ip + IpUtil.getIpInfo(ip);
        carrierMember.setLastLoginIpAddress(host);
        // 注册时，生成会员信息
        JqReturnJson returnResult = (JqReturnJson) carrierMemberService.addCarrierMemberReception(carrierMember);// 注册会员，调用添加会员方法
        request.setAttribute("returnResult", returnResult);
        if (!returnResult.isSuccess()) {
            return mav;
        }
        return "registerCarrierSucceed";
    }
    
    /**
     * @Title: sendMailSuccess
     * @Description: TODO(邮件发送成功，转向页面)
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/sendMailSuccess.htm")
    public Object sendMailSuccess() {
        return "sendMailSuccess";
    }

    /**
     * @Title: sendMailSuccessEmal
     * @Description: TODO(邮件发送成功，转向页面，会员找回密码)
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/sendMail.htm")
    public Object sendMailSuccessEmal() {
        return "retrievePassword/sendMail";
    }

    /**
     * @Title: perfectShipperMemberPhoto
     * @Description: TODO(前台会员更改头像)
     * @param @param shipperMember
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/perfectShipperMemberPhoto.htm", method = RequestMethod.POST)
    @ResponseBody
    public Object perfectShipperMemberPhoto(@Valid
    ShipperMember shipperMember, HttpSession session) {
        JqReturnJson perfectRegister = (JqReturnJson) shipperMemberService.editMemberPhotoReception(shipperMember);
//        ShipperMember loginShipperMember = (ShipperMember) shipperMemberService.getShipperMember(shipperMember.getMemberId());
        session.removeAttribute("currentShipperMember");
//        session.setAttribute("currentShipperMember", loginShipperMember);
        return perfectRegister;
    }

    /**
     * @Title: getpassword
     * @Description: TODO(会员忘记密码，通过邮箱获取密码)
     * @param @param shipperMember
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/getPasswrod.htm", method = RequestMethod.GET)
    public Object getPasswrod(@Valid
    String useremal, HttpServletRequest request, HttpSession session) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperMember shipperMember = new ShipperMember();
        if (useremal == null) {
            returnResult.setMsg("邮箱不能为空");
            // 邮箱不存在，就返回这个消息给前台
            session.setAttribute("emailStatus", "false");
            return "retrievePassword/retrievePasswordEmail";
        }
        shipperMember = shipperMemberService.retrieveEmail(useremal);
        if (shipperMember == null) {
            returnResult.setMsg("邮箱不存在");
            // 邮箱不存在，就返回这个消息给前台
            session.setAttribute("emailStatus", "false");
            return "retrievePassword/retrievePasswordEmail";
        }
        returnResult.setSuccess(true);
        ModelAndView mav = new ModelAndView("retrievePassword/sendMail");
        // 创建一个临时ID
        String retrieveId = "" + Math.random() * Math.random();
        /**
         * 得到web系统url路径的方法
         * */
        // 得到web的url路径：http://localhost:8080/ssh1/
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
        // 邮件发送成功后，用户点在邮箱中点击这个链接回到设置新密码网站。
        String url = basePath + "mailBackPassword.htm?retrieveId=" + retrieveId;
        // 将验证邮箱链接后面的registerId存到session中
        session.setAttribute(retrieveId, retrieveId);
        session.setAttribute("userEmail", useremal);// 把用户邮箱保存起来
        // 把用户邮箱存起来
        // 设置session的有效时间，为10分钟，10分钟内没有点击链接的话，设置密码将失败
        session.setMaxInactiveInterval(600);
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
            email.setFrom("1240033960@qq.com", "互联网管理员", "UTF-8");
        } catch (EmailException e1) {
            e1.printStackTrace();
        }
        email.setCharset("UTF-8");// 没有设置会乱码。
        try {
            email.setSubject("互联网密码找回");// 设置邮件名称
            email.setHtmlMsg("尊敬的会员：<font color='blue'>" + shipperMember.getMemberName() + "</font>,请点击<a href='" + url + "'>" + url + "</a>完成新密码设置！");// 设置邮件内容
            email.addTo(useremal);// 给会员发邮件
            email.send();// 邮件发送
        } catch (EmailException e) {
            throw new RuntimeException(e);
        }
        return mav;
    }

    /**
     * @Title: mailBackPassword
     * @Description: TODO(密码找回功能，点击邮件验证，转向页面。)
     * @param @param retrieveId
     * @param @param request
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    @RequestMapping(value = "/mailBackPassword.htm")
    public Object mailBackPassword(String retrieveId, HttpServletRequest request, HttpSession session) {
        if (retrieveId == null) {
            return "index";
        }
        String registerName = (String) session.getAttribute(retrieveId);
        // 如果session设置的有限时间过期，则注册不成功，直接返回主页
        if (registerName == null || registerName.equals("")) {
            return "index";
        }
        return "retrievePassword/setNewPassword";// 点击找回密码跳转到的页面
    }

    /**
     * @Title: confinMenberName
     * @Description: TODO(货主会员注册验证邮箱和用户名是否存在)
     * @param @param retrieveId
     * @param @param request
     * @param @param session
     * @param @return设定文件
     * @return Object 返回类型
     * @throws ,method=RequestMethod.POST
     */
    @RequestMapping(value = "/confinMenberName.json", method = RequestMethod.POST)
    @ResponseBody
    public Object confinMenberName(String str, String action) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperMember shipperMember = new ShipperMember();
        if (action.equals("E")) {
            shipperMember.setEmail(str);
            returnResult = (JqReturnJson) shipperMemberService.isEmailRepeat(shipperMember);
        } else {
            shipperMember.setMemberName(str);
            returnResult = (JqReturnJson) shipperMemberService.isUsernameRepeat(shipperMember);
        }
        return returnResult;
    }

    /**
     * @Title: confinMenberNameCarrier 
     * @Description: TODO(承运商会员注册验证邮箱和用户名是否存在) 
     * @param  @param str
     * @param  @param action
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    @RequestMapping(value = "/confinMenberNameCarrier.json", method = RequestMethod.POST)
    @ResponseBody
    public Object confinMenberNameCarrier(String str, String action) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierMember carrierMember = new CarrierMember();
        if (action.equals("E")) {
            carrierMember.setEmail(str);
            returnResult = (JqReturnJson) carrierMemberService.isEmailRepeat(carrierMember);
        } else {
            carrierMember.setMemberName(str);
            returnResult = (JqReturnJson) carrierMemberService.isUsernameRepeat(carrierMember);
        }
        return returnResult;
    }

    // 找回密码,设置新的密码
    @RequestMapping(value = "/setNewPassword.htm")
    private Object setNewPassword(String captcha, String newPassword, String memberPassword, HttpServletRequest request, HttpSession session) {
        // 后台验证
        String isCaptcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        // 判断验证码是否输入正确
        if (StringUtils.isBlank(captcha) || !isCaptcha.equalsIgnoreCase(captcha)) {
            request.setAttribute("errorCaptcha", "errorCaptcha");// 通过设置errorCaptcha的
                                                                 // 值，来判断验证码是否正确。
            return "retrievePassword/setNewPassword";
        }
        String userEmail = (String) session.getAttribute("userEmail");// 取出刚刚找回密码的那个邮箱
        if (newPassword.equals(memberPassword) && newPassword != "") {
            JqReturnJson setNewPassword = (JqReturnJson) shipperMemberService.setNewPassword(userEmail, memberPassword);// 调用server层方法，修改密码
            if (setNewPassword.isSuccess()) {// 设置新密码成功，跳到登录页面
                return "login";
            }
        }
        return "retrievePassword/setNewPassword";
    }

    // 转到“关于我们”页面
    @RequestMapping(value = "/aboutUs.htm")
    public Object aboutUs() {
        return "about_mgr/aboutUs";
    }
    
    // 转到“越海物流展会”页面
    @RequestMapping(value = "/logisticsExhibition.htm")
    public Object logisticsExhibition() {
        return "about_mgr/logisticsExhibition";
    }
    
    // 转到“越海物流园区”页面
    @RequestMapping(value = "/logisticsPark.htm")
    public Object logisticsPark() {
        return "about_mgr/logisticsPark";
    }

    // 转到“招纳贤士”页面
    @RequestMapping(value = "/hiring.htm")
    public Object hiring() {
        return "about_mgr/hiring";
    }

    // 转到“联系我们”页面
    @RequestMapping(value = "/contactUs.htm")
    public Object contactUs() {
        return "about_mgr/contactUs";
    }

    // 转到'找回密码'页面
    @RequestMapping(value = "/retrievePasswordEmail.htm")
    public String retrievePasswordEmail() {
        return "retrievePassword/retrievePasswordEmail";
    }
    
    // 转到“违禁物品说明”页面
    @RequestMapping(value = "/contrabandExplain.htm")
    public Object contrabandExplain() {
        return "help_mgr/contrabandExplain";
    }
    
    // 转到“增值服务及收费标准”页面
    @RequestMapping(value = "/collectFees.htm")
    public Object collectFees() {
        return "help_mgr/collectFees";
    }
    
    // 转到“轻重货物说明”页面
    @RequestMapping(value = "/weightExplain.htm")
    public Object weightExplain() {
        return "help_mgr/weightExplain";
    }
    
    // 转到“承运险说明”页面
    @RequestMapping(value = "/insuranceExplain.htm")
    public Object insuranceExplain() {
        return "help_mgr/insuranceExplain";
    }
}