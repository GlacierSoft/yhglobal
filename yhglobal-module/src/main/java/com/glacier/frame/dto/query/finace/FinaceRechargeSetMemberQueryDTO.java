package com.glacier.frame.dto.query.finace;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.finace.FinaceRechargeSetMember;
import com.glacier.frame.entity.finace.FinaceRechargeSetMemberExample.Criteria;

public class FinaceRechargeSetMemberQueryDTO extends FinaceRechargeSetMember{

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
      	 if(null != this.getRechargeSetName() && StringUtils.isNotBlank(this.getRechargeSetName())){//充值名称Like查询
             queryCriteria.andRechargeSetNameLike("%" + this.getRechargeSetName() + "%");
         }  
    	if(null != this.getRechargeSetType()){//充值类型查询
         queryCriteria.andRechargeSetTypeEqualTo(this.getRechargeSetType().toString());
    	 	}
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
