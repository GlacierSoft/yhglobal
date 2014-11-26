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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.orders.OrdersDispatchingMapper;
import com.glacier.frame.dao.orders.OrdersOrderInfoMapper;
import com.glacier.frame.dao.orders.OrdersOrderMapper;
import com.glacier.frame.dao.orders.OrdersOrdispatchingDetailedMapper;
import com.glacier.frame.dto.query.orders.OrdersDispatchingQueryDTO;
import com.glacier.frame.entity.orders.OrdersDispatching;
import com.glacier.frame.entity.orders.OrdersDispatchingExample;
import com.glacier.frame.entity.orders.OrdersDispatchingExample.Criteria;
import com.glacier.frame.entity.orders.OrdersOrder;
import com.glacier.frame.entity.orders.OrdersOrderInfo;
import com.glacier.frame.entity.orders.OrdersOrderInfoExample;
import com.glacier.frame.entity.orders.OrdersOrdispatchingDetailed;
import com.glacier.frame.entity.orders.OrdersOrdispatchingDetailedExample;
import com.glacier.frame.entity.system.User;
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
	
	@Autowired
	private OrdersOrderInfoMapper ordersOrderInfoMapper;
	
	@Autowired
	private OrdersOrdispatchingDetailedMapper ordersOrdispatchingDetailedMapper;
	
	@Autowired
	private OrdersOrderMapper ordersOrderMapper;
	 
	
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
	 

	 /**
	    * @Title: checkOrdersDispatchingNumb 
	    * @Description: 货物配送记录信息查询
	    * @param  @param belaidupId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p> 
	  */
	 @Transactional(readOnly = false)
	 public Object checkOrdersDispatchingNumb(String belaidupId){
		 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		 OrdersOrderInfoExample ordersOrder_infoExample= new OrdersOrderInfoExample();
		 ordersOrder_infoExample.createCriteria().andBelaidupIdEqualTo(belaidupId);
		 List<OrdersOrderInfo> ordersOrder_info=ordersOrderInfoMapper.selectByExample(ordersOrder_infoExample);
		 String id=ordersOrder_info.get(0).getOrderId();
		 OrdersOrdispatchingDetailedExample ordersOrdispatchingDetailedExample=new OrdersOrdispatchingDetailedExample();
		 ordersOrdispatchingDetailedExample.createCriteria().andOrderIdEqualTo(id);
		 int numb=ordersOrdispatchingDetailedMapper.countByExample(ordersOrdispatchingDetailedExample);
		 if(numb<=0)
			 returnResult.setSuccess(true);
		 else
			 returnResult.setSuccess(false);
		 return returnResult;
	 }
	 
	 /**
	     * @Title: addContractManager 
	     * @Description: TODO(添加配送记录信息) 
	     * @param @param memberContractType
	     * @param @return    设定文件 
	     * @return Object    返回类型 
	     * @throws
	     */ 
	    @Transactional(readOnly = false)
	    public Object addDispatching(OrdersDispatching ordersDispatching,OrdersOrdispatchingDetailed ordersOrdispatchingDetailed) {
	        Subject pricipalSubject = SecurityUtils.getSubject();
	        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
	        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	        int numb=0;
	        int numb_two=0;
	        
	        OrdersOrder ordersOrder=ordersOrderMapper.selectByPrimaryKey(ordersOrdispatchingDetailed.getOrderId());
	        ordersOrder.setDistributeStatus("hasdistribute");
	        ordersOrderMapper.updateByPrimaryKeySelective(ordersOrder);
	        
	        SimpleDateFormat sf=new SimpleDateFormat("dd_hh_ss");
	        ordersDispatching.setDispatchingId(RandomGUID.getRandomGUID());
	        ordersDispatching.setDispatchingCode("ST_"+sf.format(new Date()));
	        ordersDispatching.setDispatchingSignfor("notsigned");
	        ordersDispatching.setDispatchingStatus("waitdistribution");
	        ordersDispatching.setStatus("enable");
	        ordersDispatching.setDispatchTime(new Date());
	        ordersDispatching.setArriveTime(new Date());
	        ordersDispatching.setCreater(pricipalUser.getUserId());
	        ordersDispatching.setCreateTime(new Date());
	        ordersDispatching.setUpdater(pricipalUser.getUserId());
	        ordersDispatching.setUpdateTime(new Date());
	        numb=ordersDispatchingMapper.insert(ordersDispatching);
	        if(numb>0){
	        	ordersOrdispatchingDetailed.setOrdisdetailedId(RandomGUID.getRandomGUID());
	        	ordersOrdispatchingDetailed.setDispatchingId(ordersDispatching.getDispatchingId());
	            numb_two=ordersOrdispatchingDetailedMapper.insert(ordersOrdispatchingDetailed);
	        }
	        if(numb>0&&numb_two>0){
	        	returnResult.setSuccess(true);
	        	returnResult.setMsg("配送成功!");
	        }else{
	        	returnResult.setSuccess(false);
	        	returnResult.setMsg("配送失败!");
	        }
	           
	        
	        return returnResult;
	    }
}
