/**
 * @Title: OrdersDispatchingController.java 
 * @Package com.glacier.frame.web.controller.orders 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-22 下午1:46:55 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-22
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.orders;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.orders.OrdersDispatchingQueryDTO;
import com.glacier.frame.entity.orders.OrdersDispatching;
import com.glacier.frame.service.orders.OrdersDispatchingService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: OrdersDispatchingController 
 * @Description: 货物配送记录信息控制层
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-22 下午1:46:55
 */
@Controller
@RequestMapping(value="ordersDispatching")
public class OrdersDispatchingController {
   
	@Autowired
	private OrdersDispatchingService  ordersDispatchingService;
	  
	//进入货物配送记录展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("orders_mgr/ordersDispatching_mgr/ordersDispatching");
        return mav;
    }
    
   //获取表格结构的所有货物配送记录信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
  	@ResponseBody
  	private Object listActionAsGridByMenuId(JqPager jqPager, OrdersDispatchingQueryDTO ordersDispatchingQueryDTO, String q,HttpSession session) {
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
   	
    //修改货物流动启用或禁用状态
    @RequestMapping(value = "/audit.json")
    @ResponseBody
    private Object auditStorehouseStorageGoodsrun(String dispatchingId) {
        return ordersDispatchingService.changeOrdersDispatchingStatus(dispatchingId);
    }
    
    //货物损坏信息查询
    @RequestMapping(value = "/checkNumb.json", method = RequestMethod.POST)
    @ResponseBody
    private Object checkOrdersDispatchingNumb(String belaidupId) {
    	return ordersDispatchingService.checkOrdersDispatchingNumb(belaidupId);
    }
   	
    
}
