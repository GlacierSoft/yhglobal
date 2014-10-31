/*
 * @(#)FinPlatformDetailQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2014 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.finace; 
import java.util.Date;  
import org.apache.commons.lang3.builder.ReflectionToStringBuilder; 
import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.frame.entity.finace.FinancePlatformDetail; 
import com.glacier.frame.entity.finace.FinancePlatformDetailExample.Criteria;
 
/**
 * @ClassName: FinPlatformDetailQueryDTO
 * @Description: TODO(FinPlatformDetailQueryDTO) 
 * @author songjundong
 * @email 985776597@qq.com
 * @date 2014-10-31 上午10:16:58
 */
public class FinPlatformDetailQueryDTO extends FinancePlatformDetail{
	
    @JSONField(format="yyyy-MM-dd")
	private Date createStartTime;

    @JSONField(format="yyyy-MM-dd")
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
    
    public void setQueryConditions(Criteria queryCriteria){

    	if(null != this.getPlatformName()){//根据平台名称
	        queryCriteria.andPlatformNameLike("%" + this.getPlatformName() + "%");
	    }
    	
    	
    	if(null != this.getTradeTarget()){//根据记录交易对象
	        queryCriteria.andTradeTargetLike("%" + this.getTradeTarget() + "%");
	    }
    	
    	if(null != this.getTradeType()){//根据记录明细类型查找
	        queryCriteria.andTradeTypeLike("%" + this.getTradeType() + "%");
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

