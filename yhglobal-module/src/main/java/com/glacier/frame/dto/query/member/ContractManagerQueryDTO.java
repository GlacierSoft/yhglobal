package com.glacier.frame.dto.query.member;

import java.util.Date;

import com.glacier.frame.entity.member.MemberContractType;
import com.glacier.frame.entity.member.MemberContractTypeExample.Criteria;

public class ContractManagerQueryDTO extends MemberContractType {
   
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
    
    
    public void setQueryCondition(Criteria queryCriteria, String q) {
    	
    	if(this.getContractTypeName()!=null)
    		 queryCriteria.andContractTypeNameLike("%"+this.getContractTypeName()+"%");
    	
    	if(this.getStatus()!=null)
    		queryCriteria.andStatusEqualTo(this.getStatus().toString());
    		
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
