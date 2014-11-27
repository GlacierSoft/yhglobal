package com.glacier.frame.dto.query.member;

import java.util.Date;

import com.glacier.frame.entity.member.ShipperMemberMessageNotice;
import com.glacier.frame.entity.member.ShipperMemberMessageNoticeExample.Criteria;

public class ShipperMemberMessageNoticeQueryDTO extends ShipperMemberMessageNotice  {
   
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
    
    public void setQueryCondition(Criteria queryCriteria) {
    	
    	if(this.getTitle()!=null){
    		queryCriteria.andTitleLike("%"+this.getTitle()+"%");
    	}
    	
    	if(this.getReceiver()!=null){
    		queryCriteria.andReceiverEqualTo(this.getReceiver());
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
