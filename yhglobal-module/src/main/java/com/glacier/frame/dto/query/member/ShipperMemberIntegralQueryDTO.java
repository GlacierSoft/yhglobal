/*
 * @(#)MemberIntegralQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2014 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.member;

import java.util.Date; 
import org.apache.commons.lang3.builder.ReflectionToStringBuilder; 
import com.glacier.frame.entity.member.ShipperMemberIntegral; 
import com.glacier.frame.entity.member.ShipperMemberIntegralExample.Criteria;

/** 
 * @ClassName: ShipperMemberIntegralQueryDTO 
 * @Description: TODO(会员积分查询QueryDTO) 
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-14 上午9:27:54  
 */
public class ShipperMemberIntegralQueryDTO extends ShipperMemberIntegral{
	
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
   	if(null != this.getMemberName()){//会员真实名称Like查询
        queryCriteria.andMemberName("%" + this.getMemberName() + "%");
    }
   	 if(null != this.getIntegralTypeName()){//根据积分类型查询
        queryCriteria.andIntegralTypeNameEqualTo(this.getIntegralTypeName().toString());
   	 	}
   	 if(null != this.getChangeType()){//根据改变类型查询
        queryCriteria.andChangeTypeEqualTo(this.getChangeType().toString());
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
