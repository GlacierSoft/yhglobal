package com.glacier.frame.web.controller.orders;
 
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.dto.query.orders.OrdersOrder_infoQueryDTO;
import com.glacier.frame.service.orders.OrdersOrder_infoService;

/*** 
 * @ClassName:  OrdersOrder_infoController
 * @Description: TODO(订单详情controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Controller
@RequestMapping(value = "/order_info")
public class OrdersOrder_infoController extends AbstractController{

	@Autowired
	private OrdersOrder_infoService order_infoService;
	
	// 进入订单详情信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("orders_mgr/ordersorder_info_mgr/order_info");
        return mav;
    } 
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, OrdersOrder_infoQueryDTO orderSetQueryDTO) {
        return order_infoService.listAsGrid(jqPager, orderSetQueryDTO);
    }
      
    // 进入订单详情信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberOrderDetailPage(String orderInfoId) { 
    	ModelAndView mav = new ModelAndView("orders_mgr/ordersorder_info_mgr/order_info_detail");
        if(StringUtils.isNotBlank(orderInfoId)){
            mav.addObject("order_infoDate", order_infoService.getOrder_info(orderInfoId));
        }
	    return mav;
    }
    
    
    
    
}
