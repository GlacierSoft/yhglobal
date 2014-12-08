package com.glacier.frame.web.controller.orders;
 
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.orders.OrdersOrderQueryDTO;
import com.glacier.frame.service.orders.OrdersOrderService;

/*** 
 * @ClassName:  OrdersOrderController
 * @Description: TODO(订单controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Controller
@RequestMapping(value = "/order")
public class OrdersOrderController extends AbstractController{

	@Autowired
	private OrdersOrderService orderSetService;
	
	// 进入订单信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("orders_mgr/ordersorder_mgr/order");
        return mav;
    } 
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, OrdersOrderQueryDTO orderSetQueryDTO) {
        return orderSetService.listAsGrid(jqPager, orderSetQueryDTO);
    }
      
    // 进入订单信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberOrderDetailPage(String orderId,HttpSession httpSession) { 
    	ModelAndView mav = new ModelAndView("orders_mgr/ordersorder_mgr/order_detail");
        if(StringUtils.isNotBlank(orderId)){
        	httpSession.setAttribute("orderId", orderId); 
        }
	    return mav;
    }
    // 进入订单信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoOrderFormPnews(String orderId) {
        ModelAndView mav = new ModelAndView("orders_mgr/ordersorder_mgr/order_form");
        if(StringUtils.isNotBlank(orderId)){
            mav.addObject("orderDate", orderSetService.getOrder(orderId));
        }
        return mav;
    }
    
    //批量删除订单信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    public Object addOrder(@RequestParam List<String> belaidupIds,@RequestParam List<String> belaidupName) {
    	return orderSetService.addOrder(belaidupIds, belaidupName);
    }
    
    //批量删除订单信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delOrder(@RequestParam List<String> orderIds,@RequestParam List<String> orderName) {
    	return orderSetService.delOrder(orderIds, orderName);
    }
    
    
    // 进入订单分配页面
    @RequestMapping(value = "/intoDispatching.htm")
    private Object intoDispatching(String orderId) {
        ModelAndView mav = new ModelAndView("orders_mgr/ordersDispatching_mgr/ordersDispatching_form");
        if(StringUtils.isNotBlank(orderId)){
            mav.addObject("orderDate", orderSetService.getOrder(orderId));
        }
        return mav;
    }
}
