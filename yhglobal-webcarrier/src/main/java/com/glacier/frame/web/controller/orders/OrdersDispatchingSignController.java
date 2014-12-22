/**
 * @Title: OrdersDispatchingSignController.java 
 * @Package com.glacier.frame.web.controller.orders 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-12-22 上午11:19:31 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-22
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.orders;

import java.util.List; 
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

import com.glacier.frame.dto.query.orders.OrdersDispatchingQueryDTO;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.orders.OrdersDispatching; 
import com.glacier.frame.service.orders.OrdersDispatchingService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  OrdersDispatchingSignController
 * @Description: TODO(已签收货物运单记录)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-12-22  上午11:19:31
 */

@Controller
@RequestMapping(value="ordersDispatchingSign")
public class OrdersDispatchingSignController {
	   
		@Autowired
		private OrdersDispatchingService  ordersDispatchingService;
		  
		//进入货物配送记录展示页面
	    @RequestMapping(value = "/index.htm")
	    private Object intoIndexPservice() {
	        ModelAndView mav = new ModelAndView("orders_mgr/ordersDispatchingSign_mgr/ordersDispatching");
	        return mav;
	    }
	    
	   //获取表格结构的所有货物配送记录信息
	    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	  	@ResponseBody
	  	private Object listActionAsGridByMenuId(JqPager jqPager, OrdersDispatchingQueryDTO ordersDispatchingQueryDTO, String q,HttpSession session) {
	    	Subject pricipalSubject = SecurityUtils.getSubject();
	    	CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
	    	ordersDispatchingQueryDTO.setCarrierId(pricipalUser.getCarrierMemberId());
	    	ordersDispatchingQueryDTO.setDispatchingSignfor("havesigned"); 
	    	JqGridReturn returnResult=(JqGridReturn)ordersDispatchingService.listAsGrid(jqPager, ordersDispatchingQueryDTO, q);
	  	    if(returnResult!=null){
		    	@SuppressWarnings("unchecked")
		    	List<OrdersDispatching> list=(List<OrdersDispatching>) returnResult.getRows();
		    	session.setAttribute("list", list);
		    }	
	  		return returnResult;
	  	}
	    
	    //货物配送记录信息详情页
	   	@RequestMapping(value = "/intoDetail.htm")
	   	private Object intoOrdersDispatchingDetailPage(String dispatchingId) {
	   	    ModelAndView mav = new ModelAndView("orders_mgr/ordersDispatching_mgr/ordersDispatching_detail");
	   	    if(StringUtils.isNotBlank(dispatchingId)){
	   	          mav.addObject("ordersDispatchingData", ordersDispatchingService.getOrdersDispatchingPro(dispatchingId));
	   	    }
	   	    return mav;
	   	}  
	    
	    //货物配送信息查询
	    @RequestMapping(value = "/checkNumb.json", method = RequestMethod.POST)
	    @ResponseBody
	    private Object checkOrdersDispatchingNumb(String belaidupId) {
	    	return ordersDispatchingService.checkOrdersDispatchingNumb(belaidupId);
	    }  
	    
	}
