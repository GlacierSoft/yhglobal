package com.glacier.frame.dto.query.storehouse;

import java.util.Date;

import com.glacier.frame.entity.storehouse.StorehouseBelaidupSource;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupSourceExample.Criteria;

public class StorehouseBelaidupSourceQueryDTO extends StorehouseBelaidupSource  {
       
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
     if(this.getMemberId()!=null){
          queryCriteria.andMemberIdEqualTo(this.getMemberId());
        }
     
     if(this.getBelaidupProdName()!=null){
    	 queryCriteria.andBelaidupProdNameLike("%"+this.getBelaidupProdName()+"%");
     }
     
     
     if(this.getShowStyle()!=null){
    	 queryCriteria.andShowStyleEqualTo(this.getShowStyle());
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
     
     if(null!=this.getBelaidupUrgent()){
          queryCriteria.andBelaidupUrgentEqualTo(this.getBelaidupUrgent().toString()); 	 
     }
   }
}
