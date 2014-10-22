/**
 * @Title: OrdersTrackingService.java 
 * @Package com.glacier.frame.service.orders 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-22 下午1:50:28 
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
package com.glacier.frame.service.orders;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.orders.OrdersTrackingMapper;
import com.glacier.frame.dto.query.orders.OrdersTrackingQueryDTO;
import com.glacier.frame.entity.orders.OrdersTracking;
import com.glacier.frame.entity.orders.OrdersTrackingExample;
import com.glacier.frame.entity.orders.OrdersTrackingExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: OrdersTrackingService 
 * @Description: 货物跟踪记录信息
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-22 下午1:50:28
 */

@Service
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)

public class OrdersTrackingService {
   
	@Autowired
	private OrdersTrackingMapper ordersTrackingMapper;
	 
	
	 /**
	    * 
	    * @Title: listAsGrid 
	    * @Description: TODO(获取货物跟踪记录信息) 
	    * @param  @param jqPager，storehouseStorageGoodsrunQueryDTO，q
	    * @param  @return 设定文件返回类型 
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
	public Object listAsGrid(JqPager jqPager, OrdersTrackingQueryDTO ordersTrackingQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    OrdersTrackingExample ordersTrackingExample = new OrdersTrackingExample();
	    Criteria queryCriteria = ordersTrackingExample.createCriteria();
	    ordersTrackingQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	ordersTrackingExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	ordersTrackingExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	ordersTrackingExample.setOrderByClause(jqPager.getOrderBy("temp_orders_tracking_"));
	    }
	    List<OrdersTracking>   ordersTrackings = ordersTrackingMapper.selectByExample(ordersTrackingExample); // 查询所有广告列表
	    int total = ordersTrackingMapper.countByExample(ordersTrackingExample); // 查询总页数
	    returnResult.setRows(ordersTrackings);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	/**
	    * 
	    * @Title: getOrdersTrackingPro 
	    * @Description: 获取货物配送记录对象
	    * @param  @param dispatchingId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
	 public Object getOrdersTrackingPro(String trackingId) {
		 OrdersTracking ordersTracking = ordersTrackingMapper.selectByPrimaryKey(trackingId);
			return ordersTracking;
	 }
}
