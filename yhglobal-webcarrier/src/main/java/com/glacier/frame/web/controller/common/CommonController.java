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
package com.glacier.frame.web.controller.common;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: CommonController 
 * @Description: TODO(公用控制器) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-10-28 上午9:29:09
 */
@Controller
public class CommonController {

    /**
     * @Title: login
     * @Description: TODO(进入登录页面)
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    @RequestMapping(value = "/login.htm", method = RequestMethod.GET)
    public String login() {
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入登录页面，默认把登录用户注销
        }
        return "login";
    }

    /**
     * @Title: index
     * @Description: TODO(登录成功进入首页)
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public Object index() {
        return "index";
    }

    /**
     * @Title: fail
     * @Description: TODO(该方法调用前会被Filter拦截，交给shiro验证，如果验证失败会调用该方法)
     * @param @param userName
     * @param @param model
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    @RequestMapping(value = "/login.htm", method = RequestMethod.POST)
    public String fail(@RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM)
    String userName, Model model) {
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入登录页面，默认把登录用户注销
        }
        model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, userName);
        return "login";
    }
}
