/**
 * @Title: CommonController.java 
 * @Package com.glacier.frame.web.controller.common 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-2-13 下午3:29:07 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-2-13
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.common;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.orders.OrdersOrderInfoQueryDTO;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.service.carrier.CarrierRouterService;
import com.glacier.frame.service.orders.OrdersOrderInfoService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;
import com.glacier.frame.service.website.WebsiteAnnouncementService;
import com.glacier.frame.service.website.WebsiteNavService;
import com.glacier.frame.service.website.WebsiteNewsService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: CommonController 
 * @Description: TODO(公用控制器) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-10-15 下午2:12:10
 */
@Controller
public class CommonController {

	@Autowired
	private WebsiteAnnouncementService announcementService;//注入公告业务类
	
	@Autowired
	private WebsiteNewsService newsService;//注入新闻业务类
	
	@Autowired
	private WebsiteNavService NavService;//注入网站导航业务类
	
	@Autowired
	private OrdersOrderInfoService order_infoService;//注入订单详情业务类
	
	@Autowired
	private StorehouseBelaidupService  storehouseBelaidupService;
	
	@Autowired
    private CarrierRouterService carrierRouterService;
	
    /**
     * 
     * @Title: index
     * @Description: TODO(默认访问控制器跳转至index.jsp)
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    @RequestMapping(value = "/")
    private Object index(JqPager pager,HttpSession sessionStauts) {
        ModelAndView mav = new ModelAndView("index");
        // 进入首页初始化导航信息
        mav.addObject("announcementDatas", announcementService.listAsWebsite(pager, 1));//主页加载公告信息
        mav.addObject("newsDatas", newsService.listAsWebsite(pager, 1,"trade"));//主页加载新闻信息
        mav.addObject("belaidupList", storehouseBelaidupService.listAsGridWBE(pager));
        mav.addObject("routerDatas", carrierRouterService.listAsGridWEB(pager));
        mav.addObject("routerSale",carrierRouterService.listAsGrid(pager));
        mav.addObject("announcementDatas", announcementService.listAsGrid(pager));
        sessionStauts.setAttribute("newClass", "");
        return mav;
    }

    /**
     * 
     * @Title: mappingIndexPage
     * @Description: TODO(使用/index.htm一样可以访问主页)
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    @RequestMapping(value = "/index.htm")
    private Object mappingIndexPage(JqPager pager) {
        ModelAndView mav = new ModelAndView("index");
        // 进入首页初始化导航信息
        mav.addObject("announcementDatas", announcementService.listAsWebsite(pager, 1));//主页加载公告信息
        mav.addObject("newsDatas", newsService.listAsWebsite(pager, 1,"trade"));//主页加载新闻信息
        mav.addObject("belaidupList", storehouseBelaidupService.listAsGridWBE(pager));
        mav.addObject("routerSale",carrierRouterService.listAsGrid(pager));
        mav.addObject("routerDatas", carrierRouterService.listAsGridWEB(pager));
        mav.addObject("announcementDatas", announcementService.listAsGrid(pager));
        return mav;
    }
    
    /**
     * 
     * @Title: orderQuery
     * @Description: TODO(点击“订单查询”去到订单查询页面)
     * @param @return
     * @throws 备注
     */
    @RequestMapping(value = "/orderQuery.htm")
    private Object orderQuery(int p,String codeNumber,OrdersOrderInfoQueryDTO orderQueryDTO,String orderCodeDisplay
    		,Date createStartTime,Date createEndTime) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
    	ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
    	ModelAndView mav=null;
    	if(null == pricipalMember){
    		mav = new ModelAndView("orderQuery/notLoginQuery");
    	}else{
    		mav = new ModelAndView("orderQuery/loginQuery");
    		if(null != orderCodeDisplay){
    			mav.addObject("orderCodeDisplay", orderCodeDisplay);
    		}
    		if(null != createStartTime){
    			mav.addObject("createStartTime", createStartTime);
    		}
    		if(null != createEndTime){
    			mav.addObject("createEndTime", createEndTime);
    		}
    		mav.addObject("getDatas", order_infoService.listAsOrderGrid(p,codeNumber,orderQueryDTO));
    	}
        return mav;
    }
    
    /**
     * @Title: postLogin 
     * @Description: TODO(跳转到登录页面) 
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @RequestMapping(value = "/login.htm")
    public Object postLogin() {
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入登录页面，默认把登录用户注销
        }
        return "login";
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
    String username,String password, Model model,ShipperMember shipperMember,HttpServletRequest request) {
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入登录页面，默认把登录用户注销
        }
        model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, username);
        shipperMember.setMemberName(username);
        shipperMember.setMemberPassword(password);
        request.setAttribute("shipperMember", shipperMember);
        return "login";
    }
    
    /**
     * @Title: logout 
     * @Description: TODO(退出系统) 
     * @param  @param pager
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @RequestMapping(value = "/logout.htm")
    public Object logout(){
    	ModelAndView mav = new ModelAndView("index");
    	if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// ，默认把登录用户注销
        }
        // 进入首页初始化导航信息
        return mav;
    }
}