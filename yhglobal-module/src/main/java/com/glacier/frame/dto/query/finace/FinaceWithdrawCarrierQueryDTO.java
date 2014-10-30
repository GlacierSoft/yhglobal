/*
 * @(#)FinaceWithdrawSetCarrierDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.finace;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder; 

import com.glacier.frame.entity.finace.FinaceWithdrawCarrier;
import com.glacier.frame.entity.finace.FinaceWithdrawCarrierExample.Criteria;

/**
 * @ClassName: FinaceWithdrawCarrierQueryDTO 
 * @Description: TODO(承运商提现信息记录查询DTO) 
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
public class FinaceWithdrawCarrierQueryDTO extends FinaceWithdrawCarrier{
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
   	 if(null != this.getWithdrawCode() && StringUtils.isNotBlank(this.getWithdrawCode())){//充值名称Like查询
            queryCriteria.andWithdrawCodeLike("%" + this.getWithdrawCode() + "%");
        }  
   	 if(null != this.getWithdrawSetDisplay() && StringUtils.isNotBlank(this.getWithdrawSetDisplay())){//充值名称Like查询
        queryCriteria.andWithdrawSetDisplayLike("%" + this.getWithdrawSetDisplay() + "%");
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
