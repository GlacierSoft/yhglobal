/*
 * @(#)MemberQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.carrier;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder; 
import com.glacier.frame.entity.carrier.CarrierCarInformation;
import com.glacier.frame.entity.carrier.CarrierCarInformationExample.Criteria;

/**
 * @ClassName: CarrierMemberGradeQueryDTO 
 * @Description: TODO(会员等级查询DTO) 
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-9
 */
public class CarrierCarInformationQueryDTO extends CarrierCarInformation{
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
	 if(null != this.getCarrierMemberRealName() && StringUtils.isNotBlank(this.getCarrierMemberRealName())){//承运商名称
            queryCriteria.andCarrierMemberRealNamelike("%" + this.getCarrierMemberRealName() + "%");
     } 
   	 if(null != this.getPlateNumber() && StringUtils.isNotBlank(this.getPlateNumber())){//车牌号码Like查询
            queryCriteria.andPlateNumberLike("%" + this.getPlateNumber() + "%");
     }  
   	 if(null != this.getTransportType()){//运送类型查询
        queryCriteria.andTransportTypeEqualTo(this.getTransportType().toString());
   	 }
   	 if(null != this.getServiceType()){//状态服务类型查询
         queryCriteria.andServiceTypeEqualTo(this.getServiceType().toString());
     }
   	 if(null != this.getCarStatus()){//状态Enum查询
        queryCriteria.andCarStatusEqualTo(this.getCarStatus().toString());
   	 }
   	 if(null!=this.getTransportStatus())
   		queryCriteria.andTransportStatusEqualTo(this.getTransportStatus());
   	 
   	 
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
