/**
 * @Title: OedersOrderHistoryController.java 
 * @Package com.glacier.frame.web.controller.orders 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-12-18 下午3:29:47 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-18
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.orders;
 

import javax.servlet.http.HttpSession; 
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.frame.dto.query.orders.OrdersOrderQueryDTO;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.service.orders.OrdersOrderService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  OedersOrderHistoryController
 * @Description: TODO(所有已经确认了的订单，或者是交易完了的订单)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-12-18  下午3:29:47
 */
@Controller
@RequestMapping(value = "/orderHistory")
public class OedersOrderHistoryController  extends AbstractController{

	@Autowired
	private OrdersOrderService orderSetService;
	
	// 进入订单信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("orders_mgr/ordersorderHistory_mgr/order");
        return mav;
    } 
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, OrdersOrderQueryDTO orderSetQueryDTO) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
    	CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
    	orderSetQueryDTO.setCarrierMemberId(pricipalUser.getCarrierMemberId());
    	orderSetQueryDTO.setOrderStatus("waitconfirm"); 
    	orderSetQueryDTO.setDistributeStatus("hasdistribute");
    	return orderSetService.listAsGrid(jqPager, orderSetQueryDTO);
    }
      
    // 进入订单信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberOrderDetailPage(String orderId,HttpSession httpSession) { 
    	ModelAndView mav = new ModelAndView("orders_mgr/ordersorderHistory_mgr/order_detail");
        if(StringUtils.isNotBlank(orderId)){
        	httpSession.setAttribute("orderId", orderId); 
        }
	    return mav;
    }
    
    // 进入订单信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoOrderFormPnews(String orderId) {
        ModelAndView mav = new ModelAndView("orders_mgr/ordersorderHistory_mgr/order_form");
        if(StringUtils.isNotBlank(orderId)){
            mav.addObject("orderDate", orderSetService.getOrder(orderId));
        }
        return mav;
    }
    
}
