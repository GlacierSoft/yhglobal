package com.glacier.frame.dto.query.carrier;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.carrier.CarrierDriver;
import com.glacier.frame.entity.carrier.CarrierDriverExample.Criteria;


public class CarrierDriverQueryDTO extends  CarrierDriver {
    
	public void setQueryCondition(Criteria queryCriteria, String q){
	    if(this.getStatus()!=null) 
	    	queryCriteria.andStatusEqualTo(this.getStatus().toString());
	    if(this.getDriverStatus()!=null)
	    	 queryCriteria.andDriverStatusEqualTo(this.getDriverStatus().toString());
	    if(this.getAuditState()!=null)
	        queryCriteria.andAuditStateEqualTo(this.getAuditState().toString());
	  if(this.getCarrierMemberId()!=null)
	    	queryCriteria.andCarrierMemberIdEqualTo(this.getCarrierMemberId());
       
	}
	
	@Override
	public String toString() {
	   return ReflectionToStringBuilder.toString(this);
	} 
}
