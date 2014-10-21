/*
 * @(#)StorehouseStorageQueryDTO.java
 * @author ting.wu
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.storehouse;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder; 

import com.glacier.frame.entity.storehouse.StorehouseStorage;
import com.glacier.frame.entity.storehouse.StorehouseStorageExample.Criteria;

/**
 * @ClassName: StorehouseStorageQueryDTO 
 * @Description: TODO(仓库查询DTO) 
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-16
 */
public class StorehouseStorageQueryDTO extends StorehouseStorage{
	private Date createStartTime;

    private Date createEndTime;
    
    private Date lastStartLoginTime;
    
    private Date lastEndLoginTime;
    
    private String loginStartCount;
    
    private String loginEndCount;
    

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
    
    public Date getLastStartLoginTime() {
		return lastStartLoginTime;
	}

	public void setLastStartLoginTime(Date lastStartLoginTime) {
		this.lastStartLoginTime = lastStartLoginTime;
	}

	public Date getLastEndLoginTime() {
		return lastEndLoginTime;
	}

	public void setLastEndLoginTime(Date lastEndLoginTime) {
		this.lastEndLoginTime = lastEndLoginTime;
	}

   public String getLoginStartCount() {
		return loginStartCount;
	}

	public void setLoginStartCount(String loginStartCount) {
		this.loginStartCount = loginStartCount;
	}

	public String getLoginEndCount() {
		return loginEndCount;
	}

	public void setLoginEndCount(String loginEndCount) {
		this.loginEndCount = loginEndCount;
	}

	public void setQueryCondition(Criteria queryCriteria){
	   if(null != this.getStorageName() && StringUtils.isNotBlank(this.getStorageName())){//负责人名称Like查询
	        queryCriteria.andStorageNameLike("%" + this.getStorageName() + "%");
	   }  
   	   if(null != this.getUserDisplay() && StringUtils.isNotBlank(this.getUserDisplay())){//负责人名称Like查询
	        queryCriteria.andUserDisplayLike("%" + this.getUserDisplay() + "%");
	   }  
	   if(null != this.getStorageTyperDisplay() && StringUtils.isNotBlank(this.getStorageTyperDisplay())){//仓库类型名称Like查询
	        queryCriteria.andStorageTypeLike("%" + this.getStorageTyperDisplay() + "%");
	   }
	   if(null != this.getStatus()){//状态Enum查询
	        queryCriteria.andStatusEqualTo(this.getStatus().toString());
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