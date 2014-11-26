package com.glacier.frame.dto.query.finace;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.glacier.frame.entity.finace.FinaceMemberRecord;
import com.glacier.frame.entity.finace.FinaceMemberRecordExample.Criteria;



public class FinaceMemberRecordQueryDTO extends FinaceMemberRecord {

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
    
    public void setQueryCondition(Criteria queryCriteria,String memberId) {
    	
    	if(memberId!=null&&StringUtils.isNotBlank(memberId)){
    		queryCriteria.andMemberIdEqualTo(memberId);
    	 }
    	
    	if(this.getTransactionType()!=null){
    		queryCriteria.andTransactionTypeLike("%"+this.getTransactionType()+"%");
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
    
}
