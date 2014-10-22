package com.glacier.frame.dto.query.orders;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.orders.OrdersDispatching;
import com.glacier.frame.entity.orders.OrdersDispatchingExample.Criteria;

public class OrdersDispatchingQueryDTO extends  OrdersDispatching {
	
	//发车时间
	private Date  goodsRunStartTime;
	
	private Date goodsRunEndTime;
	
	//到站时间
	private Date arriveStartTime;
	
	private Date arriveEndTime;
	
	
	
	
	
	
   public Date getGoodsRunStartTime() {
		return goodsRunStartTime;
	}

	public void setGoodsRunStartTime(Date goodsRunStartTime) {
		this.goodsRunStartTime = goodsRunStartTime;
	}

	public Date getGoodsRunEndTime() {
		return goodsRunEndTime;
	}

	public void setGoodsRunEndTime(Date goodsRunEndTime) {
		this.goodsRunEndTime = goodsRunEndTime;
	}

	public Date getArriveStartTime() {
		return arriveStartTime;
	}

	public void setArriveStartTime(Date arriveStartTime) {
		this.arriveStartTime = arriveStartTime;
	}

	public Date getArriveEndTime() {
		return arriveEndTime;
	}

	public void setArriveEndTime(Date arriveEndTime) {
		this.arriveEndTime = arriveEndTime;
	}

public void setQueryCondition(Criteria queryCriteria, String q){
	   
	   if(null!=this.getCarrierDisplay()){
			queryCriteria.andCarrierDisplay("%"+this.getCarrierDisplay()+"%");
		}
		
		if(null != this.getDispatchingStatus()){//状态Enum查询
			queryCriteria.andDispatchingStatusEqualTo(this.getDispatchingStatus().toString());
	   	}
		
		if(null != this.getDispatchingSignfor()){//状态Enum查询
			queryCriteria.andDispatchingSignforEqualTo(this.getDispatchingSignfor().toString());
	   	}
	    
		if(null!=goodsRunStartTime&&null!=goodsRunEndTime){//创建时间段查询
	    	 queryCriteria.andDispatchTimeBetween(goodsRunStartTime, goodsRunEndTime);
	    }else{
	    	 if(null != goodsRunStartTime){
	              queryCriteria.andDispatchTimeGreaterThanOrEqualTo(goodsRunStartTime);
	          }
	          if(null != goodsRunEndTime){
	              queryCriteria.andDispatchTimeLessThanOrEqualTo(goodsRunEndTime);
	          }
	     }
		
		if(null!=arriveStartTime&&null!=arriveEndTime){//创建时间段查询
	    	 queryCriteria.andArriveTimeBetween(arriveStartTime, arriveEndTime);
	    }else{
	   	    if(null != arriveStartTime){
	             queryCriteria.andArriveTimeGreaterThanOrEqualTo(arriveStartTime);
	         }
	         if(null != arriveEndTime){
	             queryCriteria.andArriveTimeLessThanOrEqualTo(arriveEndTime);
	         }
	     }
	     
	}
   
   @Override
	public String toString() {
	    return ReflectionToStringBuilder.toString(this);
	} 
}
