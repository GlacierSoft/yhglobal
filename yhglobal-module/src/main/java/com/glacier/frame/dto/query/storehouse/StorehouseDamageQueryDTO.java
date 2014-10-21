package com.glacier.frame.dto.query.storehouse;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.storehouse.StorehouseDamage;
import com.glacier.frame.entity.storehouse.StorehouseDamageExample.Criteria;


public class StorehouseDamageQueryDTO extends StorehouseDamage {

	private  Date damageStartTime;
	
	private  Date damageEndTime;
	
	public Date getDamageStartTime() {
		return damageStartTime;
	}

	public void setDamageStartTime(Date damageStartTime) {
		this.damageStartTime = damageStartTime;
	}

	public Date getDamageEndTime() {
		return damageEndTime;
	}

	public void setDamageEndTime(Date damageEndTime) {
		this.damageEndTime = damageEndTime;
	}

	public void setQueryCondition(Criteria queryCriteria, String q){
		
		if(null!=this.getBelaidupDisplay()){
			queryCriteria.andBelaidupDisplay("%"+this.getBelaidupDisplay()+"%");
		}
		
		if(null!=this.getAuditStatus()){
			queryCriteria.andAuditStatusEqualTo(this.getAuditStatus().toString());
		}
		if(null!=this.getYesOrNo()){
			queryCriteria.andYesOrNoEqualTo(this.getYesOrNo().toString());
		}
		
		
		if(null!=damageStartTime&&null!=damageEndTime){//创建时间段查询
	    	 queryCriteria.andCreateTimeBetween(damageStartTime, damageEndTime);
	      }else{
	    	 if(null != damageStartTime){
	              queryCriteria.andCreateTimeGreaterThanOrEqualTo(damageStartTime);
	          }
	          if(null != damageEndTime){
	              queryCriteria.andCreateTimeLessThanOrEqualTo(damageEndTime);
	          }
	     }    
	}
	 
	@Override
	public String toString() {
	    return ReflectionToStringBuilder.toString(this);
	} 
	 
}
