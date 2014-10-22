package com.glacier.frame.dto.query.orders;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.orders.OrdersTracking;
import com.glacier.frame.entity.orders.OrdersTrackingExample.Criteria;



public class OrdersTrackingQueryDTO extends  OrdersTracking{
    
	
	private Date goodsRunStartTime;
	
	private Date goodsRunEndTime;
	
	public void setQueryCondition(Criteria queryCriteria, String q){
     
		 if(null!=this.getStatus())
			  queryCriteria.andStatusEqualTo(this.getStatus().toString());
		 
		 
		 if(null!=this.getDispatchingDisplay()){
			 queryCriteria.andDispatchingDisplay("%"+this.getDispatchingDisplay()+"%");
		 }
		  
		if(null!=goodsRunStartTime&&null!=goodsRunEndTime){//创建时间段查询
	    	 queryCriteria.andCreateTimeBetween(goodsRunStartTime, goodsRunEndTime);
	    }else{
	    	 if(null != goodsRunStartTime){
	              queryCriteria.andCreateTimeGreaterThanOrEqualTo(goodsRunStartTime);
	          }
	          if(null != goodsRunEndTime){
	              queryCriteria.andCreateTimeLessThanOrEqualTo(goodsRunEndTime);
	          }
	     }
		
	}	
	
	@Override
	public String toString() {
	    return ReflectionToStringBuilder.toString(this);
	} 
}
