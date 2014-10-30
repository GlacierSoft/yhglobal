package com.glacier.frame.dto.query.finace;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.finace.FinaceWithdrawSetMember;
import com.glacier.frame.entity.finace.FinaceWithdrawSetMemberExample.Criteria;


public class FinaceWithdrawSetMemberQueryDTO  extends FinaceWithdrawSetMember{
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
   
   public void setQueryCondition(Criteria queryCriteria){
	   
	   if(null!=this.getWithdrawName())
		    queryCriteria.andWithdrawNameLike("%"+this.getWithdrawName()+"%");
	   
	   if(null!=this.getFeeWay())
		   queryCriteria.andFeeWayEqualTo(this.getFeeWay().toString());
	   
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
