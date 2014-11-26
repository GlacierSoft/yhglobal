/**
 * @Title: OrdersOrder_infoService.java 
 * @Package com.glacier.global.service.OrdersOrder_info
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-14
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.orders; 
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.orders.OrdersOrderInfoMapper;
import com.glacier.frame.dto.query.orders.OrdersOrderInfoQueryDTO;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.orders.OrderQuery;
import com.glacier.frame.entity.orders.OrdersOrderInfo;
import com.glacier.frame.entity.orders.OrdersOrderInfoExample;
import com.glacier.frame.entity.orders.OrdersOrderInfoExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
/*** 
 * @ClassName:  OrdersOrder_infoService
 * @Description: TODO(订单详情表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class OrdersOrder_infoService {

	@Autowired
	private OrdersOrderInfoMapper orderInfoMapper;
	
	/**
     * @Title: listAsOrderGrid 
     * @Description: TODO(获取登陆用户的所有订单货物信息) 
     * @param @param pager,p
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	public Object listAsOrderGrid(int p,String codeNumber){
		Subject pricipalSubject = SecurityUtils.getSubject();
    	ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
    	JqGridReturn returnResult = new JqGridReturn();
		return returnResult;
	}
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有订单详情信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, OrdersOrderInfoQueryDTO orderQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        OrdersOrderInfoExample orderExample = new OrdersOrderInfoExample(); 
        Criteria queryCriteria = orderExample.createCriteria();
        orderQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	orderExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	orderExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	orderExample.setOrderByClause(jqPager.getOrderBy("temp_orders_order_info_"));
        }
        List<OrdersOrderInfo> orderTypeList = orderInfoMapper.selectByExample(orderExample); // 查询所有会员列表
        int total = orderInfoMapper.countByExample(orderExample); // 查询总页数
        returnResult.setRows(orderTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getOrder_info 
	 * @Description: TODO(根据订单详情Id获取订单详情信息) 
	 * @param @param orderId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getOrder_info(String orderId) {
    	OrdersOrderInfo order_info = orderInfoMapper.selectByPrimaryKey(orderId);
        return order_info;
    }
    
}
