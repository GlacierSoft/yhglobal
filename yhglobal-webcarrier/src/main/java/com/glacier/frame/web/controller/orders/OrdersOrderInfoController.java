package com.glacier.frame.web.controller.orders;
 
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.orders.OrdersOrderInfoQueryDTO;
import com.glacier.frame.service.orders.OrdersOrderInfoService;
import com.glacier.frame.service.storehouse.StorehouseBelaidupService;

/*** 
 * @ClassName:  OrdersOrder_infoController
 * @Description: TODO(订单详情controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Controller
@RequestMapping(value = "/order_info")
public class OrdersOrderInfoController extends AbstractController{

	@Autowired
	private StorehouseBelaidupService belaidupService;
	
	@Autowired
	private OrdersOrderInfoService orderInfoService;
	
	// 进入订单详情信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("orders_mgr/ordersorder_info_mgr/order_info");
        return mav;
    } 
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, OrdersOrderInfoQueryDTO orderSetQueryDTO,HttpSession httpSession) {
        String orderid=httpSession.getAttribute("orderId").toString();
        orderSetQueryDTO.setOrderId(orderid);
    	return orderInfoService.listAsGrid(jqPager, orderSetQueryDTO);
    }
      
    // 进入订单详情信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberOrderDetailPage(String orderInfoId) { 
    	ModelAndView mav = new ModelAndView("orders_mgr/ordersorder_info_mgr/order_info_detail");
        if(StringUtils.isNotBlank(orderInfoId)){
            mav.addObject("order_infoDate", orderInfoService.getOrderInfo(orderInfoId));
        }
	    return mav;
    }
     
    // 进入货物信息Detail信息页面
    @RequestMapping(value = "/detail.htm")
    private Object intoMemberGradeDetailPage(String belaidupId) { 
    	ModelAndView mav = new ModelAndView("orders_mgr/ordersorder_mgr/belaidup_detail");
        if(StringUtils.isNotBlank(belaidupId)){
            mav.addObject("belaidupDate", belaidupService.getBelaidup(belaidupId));
        }
	    return mav;
    }
    
}
