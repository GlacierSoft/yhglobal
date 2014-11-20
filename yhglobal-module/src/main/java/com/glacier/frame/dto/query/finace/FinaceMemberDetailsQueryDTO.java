package com.glacier.frame.dto.query.finace;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.glacier.frame.entity.finace.FinanceMemberDetail;
import com.glacier.frame.entity.finace.FinanceMemberDetailExample.Criteria;


public class FinaceMemberDetailsQueryDTO  extends FinanceMemberDetail {

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
    	if(null!=this.getMemberDisplay())
    		 queryCriteria.andMemberDisplayLike("%"+this.getMemberDisplay()+"%");
    	
    	if(null!=this.getBelaidupDisplay())
    		 queryCriteria.andBelaidupDisplayLike("%"+this.getBelaidupDisplay()+"%");
    	
    	if(null!=memberId&&StringUtils.isNotBlank(memberId)){//根据所属会员ID进行查找
    		queryCriteria.andMemberIdEqualTo(memberId);
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
