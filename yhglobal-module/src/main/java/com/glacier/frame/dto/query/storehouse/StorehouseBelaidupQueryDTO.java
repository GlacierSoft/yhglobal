/*
 * @(#)StorehouseBelaidupDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.storehouse;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder; 
import com.glacier.frame.entity.storehouse.StorehouseBelaidupExample.Criteria;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;

/**
 * @ClassName: StorehouseBelaidupQueryDTO 
 * @Description: TODO(货物查询DTO) 
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
public class StorehouseBelaidupQueryDTO extends StorehouseBelaidup{
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
   	 if(null != this.getBelaidupBarCode() && StringUtils.isNotBlank(this.getBelaidupBarCode())){//货物条形码Like查询
            queryCriteria.andBelaidupBarCodeLike("%" + this.getBelaidupBarCode() + "%");
        }  
   	if(null != this.getPackageDisplay() && StringUtils.isNotBlank(this.getPackageDisplay())){//货物条形码Like查询
        queryCriteria.andPackageDisplayLike("%" + this.getPackageDisplay() + "%");
   		}  
   	if(null != this.getYesOrNo()){//加急配送查询
        queryCriteria.andYesOrNoEqualTo(this.getYesOrNo().toString());
   	 	}
   	if(null != this.getBelaidupStatus()){//货物状态查询
        queryCriteria.andBelaidupStatusEqualTo(this.getBelaidupStatus().toString());
   	 	}
   	if(null != this.getSortingStauts()){//分拣状态查询
        queryCriteria.andSortingStautsEqualTo(this.getSortingStauts().toString());
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
