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
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.service.carrier.CarrierMemberMessageNoticeService;
import com.glacier.frame.service.orders.OrdersDispatchingService;
import com.glacier.frame.service.orders.OrdersOrderService;

/**
 * @ClassName: indexController 
 * @Description: TODO(公用控制器) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-10-28 上午9:33:46
 */
@Controller
@RequestMapping(value="/index")
public class indexController {
	
	@Autowired
	private CarrierMemberMessageNoticeService messageNoticeService;
	
	@Autowired
	private OrdersOrderService orderService;
	
	@Autowired
	private OrdersDispatchingService DispatchingService;
    
    @RequestMapping(value = "/center", method = RequestMethod.GET)
    public Object intoIndex() {
    	Subject pricipalSubject = SecurityUtils.getSubject();
    	CarrierMember pricipalCarrier = (CarrierMember) pricipalSubject.getPrincipal();
    	ModelAndView mav=null;
    	if(pricipalCarrier.getMemberName().equals("admin")){
    		mav = new ModelAndView("layout/adminCenter");
    	}else{
    		mav = new ModelAndView("layout/center");
    	}
        //站内信 未读条数 已读条数
        mav.addObject("countAlready", messageNoticeService.getCountAlready(pricipalCarrier.getCarrierMemberId()));
        mav.addObject("countWithout", messageNoticeService.getCountWithout(pricipalCarrier.getCarrierMemberId()));
        //配送信息 待分配订单条数 已分配订单条数
        mav.addObject("hasdistribute", orderService.getOrdersNumByHasdistribute(pricipalCarrier.getCarrierMemberId()));
        mav.addObject("waitdistribute", orderService.getOrdersNumByWaitdistribute(pricipalCarrier.getCarrierMemberId()));
        //签收信息 待签收配送记录条数 已签收配送记录
        mav.addObject("havesigned", DispatchingService.getCountHavesigned(pricipalCarrier.getCarrierMemberId()));
        mav.addObject("notsigned", DispatchingService.getCountNotsigned(pricipalCarrier.getCarrierMemberId()));
        return mav;
    }
}
