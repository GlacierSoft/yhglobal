package com.glacier.frame.dto.query.carrier;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.carrier.CarrierDriver;
import com.glacier.frame.entity.carrier.CarrierDriverExample.Criteria;


public class CarrierDriverQueryDTO extends  CarrierDriver {
	private Date createStartTime;

    private Date createEndTime;
    
	public Date getCreateStartTime() {
		return createStartTime;
	}

	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
	}

	public Date getCreateEndTime() {
		return createEndTime;
	}

	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

	public void setQueryCondition(Criteria queryCriteria, String q){
	    if(this.getStatus()!=null) 
	    	queryCriteria.andStatusEqualTo(this.getStatus().toString());
	    if(this.getDriverStatus()!=null)
	    	 queryCriteria.andDriverStatusEqualTo(this.getDriverStatus().toString());
	    if(this.getAuditState()!=null)
	        queryCriteria.andAuditStateEqualTo(this.getAuditState().toString());
	    if(this.getCarrierMemberId()!=null)
	    	queryCriteria.andCarrierMemberIdEqualTo(this.getCarrierMemberId()); 
	    if(this.getDriverName()!=null)
	    	queryCriteria.andDriverNameLike(this.getDriverName());  
	    if(null != createStartTime && null != createEndTime){//创建时间段查询
	           queryCriteria.andCreateTimeBetween(createStartTime, createEndTime); 
	     }else{
	          if(null != createStartTime){
	              queryCriteria.andCreateTimeGreaterThanOrEqualTo(createStartTime);
	          }
	          if(null != createEndTime){
	              queryCriteria.andCreateTimeLessThanOrEqualTo(createEndTime);
	          }
	           
	       }
	}
	
	@Override
	public String toString() {
	   return ReflectionToStringBuilder.toString(this);
	} 
}
