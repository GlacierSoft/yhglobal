/**
 * @Title: OrdersDispatchingService.java 
 * @Package com.glacier.frame.service.orders 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-22 下午1:49:44 
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


import com.glacier.frame.dao.orders.OrdersDispatchingMapper;
import com.glacier.frame.dto.query.orders.OrdersDispatchingQueryDTO;
import com.glacier.frame.entity.orders.OrdersDispatching;
import com.glacier.frame.entity.orders.OrdersDispatchingExample;
import com.glacier.frame.entity.orders.OrdersDispatchingExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: OrdersDispatchingService 
 * @Description:货物配送记录业务层
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-22 下午1:49:44
 */

@Service
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)

public class OrdersDispatchingService {
   
	@Autowired
	private OrdersDispatchingMapper ordersDispatchingMapper;
	 
	
	 /**
	    * 
	    * @Title: listAsGrid 
	    * @Description: TODO(获取货物配送记录信息) 
	    * @param  @param jqPager，ordersDispatchingQueryDTO，q
	    * @param  @return 设定文件返回类型 
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
	public Object listAsGrid(JqPager jqPager, OrdersDispatchingQueryDTO ordersDispatchingQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    OrdersDispatchingExample ordersDispatchingExample = new OrdersDispatchingExample();
	    Criteria queryCriteria = ordersDispatchingExample.createCriteria();
	    ordersDispatchingQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	ordersDispatchingExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	ordersDispatchingExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	ordersDispatchingExample.setOrderByClause(jqPager.getOrderBy("temp_orders_dispatching_"));
	    }
	    List<OrdersDispatching>   ordersDispatchings = ordersDispatchingMapper.selectByExample(ordersDispatchingExample); // 查询所有广告列表
	    int total = ordersDispatchingMapper.countByExample(ordersDispatchingExample); // 查询总页数
	    returnResult.setRows(ordersDispatchings);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	/**
	    * 
	    * @Title: getStorehouseStorageGoodsrunPro 
	    * @Description: 获取货物配送记录对象
	    * @param  @param dispatchingId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
	 public Object getOrdersDispatchingPro(String dispatchingId) {
			OrdersDispatching ordersDispatching = ordersDispatchingMapper.selectByPrimaryKey(dispatchingId);
			return ordersDispatching;
	 }
	 
	 /**
	    * @Title: changeOrdersDispatchingStatus 
	    * @Description: 启用/禁用货物配送记录信息
	    * @param  @param dispatchingId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p> 
	  */
	 @Transactional(readOnly = false)
	 public Object changeOrdersDispatchingStatus(String dispatchingId){
		    JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		    OrdersDispatching ordersDispatching = ordersDispatchingMapper.selectByPrimaryKey(dispatchingId);
	    	String str="";
	    	if(ordersDispatching.getStatus().equals("enable")){
	    		ordersDispatching.setStatus("disable");
	    		str="禁用";
	    	}else{
	    		ordersDispatching.setStatus("enable");
	    		str="启用";
	    	}
	    	int count=ordersDispatchingMapper.updateByPrimaryKeySelective(ordersDispatching);
	    	if(count==1){
	    		returnResult.setSuccess(true);
	    		returnResult.setMsg("【"+ordersDispatching.getCarrierDisplay()+"】配送记录信息"+str+"操作成功!");
	    	}else{
	    	   returnResult.setSuccess(true);
	   		   returnResult.setMsg("发生未知错误,【"+ordersDispatching.getCarrierDisplay()+"】配送记录信息"+str+"操作失败!");
	    	}
	    	return returnResult;
	 }
}
