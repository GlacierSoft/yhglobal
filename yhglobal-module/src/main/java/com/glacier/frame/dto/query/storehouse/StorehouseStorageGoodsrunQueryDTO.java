package com.glacier.frame.dto.query.storehouse;


import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrun;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrunExample.Criteria;

public class StorehouseStorageGoodsrunQueryDTO  extends StorehouseStorageGoodsrun {
	
	private Date goodsRunStartTime;
	
	private Date goodsRunEndTime;
	
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



	public void setQueryCondition(Criteria queryCriteria, String q){
		
		
		if(null!=this.getBelaidupDisplay()){
			queryCriteria.andBelaidupDisplay("%"+this.getBelaidupDisplay()+"%");
		}
		
		if(null != this.getStatus()){//状态Enum查询
			queryCriteria.andStatusEqualTo(this.getStatus().toString());
	   	}
		
	    
		if(null!=goodsRunStartTime&&null!=goodsRunEndTime){//创建时间段查询
	    	 queryCriteria.andGoodsrunDateBetween(goodsRunStartTime, goodsRunEndTime);
	      }else{
	    	 if(null != goodsRunStartTime){
	              queryCriteria.andGoodsrunDateGreaterThanOrEqualTo(goodsRunStartTime);
	          }
	          if(null != goodsRunEndTime){
	              queryCriteria.andGoodsrunDateLessThanOrEqualTo(goodsRunEndTime);
	          }
	     }
		
	}
	
	@Override
	public String toString() {
	    return ReflectionToStringBuilder.toString(this);
	} 
	
}
