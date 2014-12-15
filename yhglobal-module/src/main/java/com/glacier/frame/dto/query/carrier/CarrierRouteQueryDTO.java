/**
 * @Title: CarrierRouteQueryDTO.java 
 * @Package com.glacier.frame.dto.query.carrier 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2014-10-17 下午3:07:44 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-17
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.dto.query.carrier; 

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.carrier.CarrierRoute; 
import com.glacier.frame.entity.carrier.CarrierRouteExample.Criteria;

/**
 * @ClassName:  CarrierRouteQueryDTO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-17  下午3:07:44
 */
public class CarrierRouteQueryDTO extends CarrierRoute{
  
	public void setQueryCondition(Criteria queryCriteria){
		 
	//班线审核状态
	if(null!=this.getAuditState()&& StringUtils.isNotBlank(this.getAuditState())){
		 queryCriteria.andAuditStateEqualTo(this.getAuditState());
	}
		
     //班线编号
   	 if(null != this.getRouteNumber() && StringUtils.isNotBlank(this.getRouteNumber())){
            queryCriteria.andRouteNumberLike("%" + this.getRouteNumber() + "%");
        }  
   	 
     //班线名称
   	 if(null != this.getRouteName() && StringUtils.isNotBlank(this.getRouteName())){
            queryCriteria.andRouteNameLike("%" + this.getRouteName() + "%");
        } 
   	 
     //班线起点
   	 if(null != this.getRouteOrigin() && StringUtils.isNotBlank(this.getRouteOrigin())){
            queryCriteria.andRouteOriginLike("%" + this.getRouteOrigin() + "%");
        } 
   	 
     //班线终点
   	 if(null != this.getRouteStop() && StringUtils.isNotBlank(this.getRouteStop())){
            queryCriteria.andRouteStopLike("%" + this.getRouteStop() + "%");
        } 
   	 //班线类型
   	 if(null != this.getRouteType() && StringUtils.isNotBlank(this.getRouteType())){
            queryCriteria.andRouteTypeEqualTo(this.getRouteType());
        } 
   	   
    //承运商名称
  	 if(null != this.getCarrierDisplay() && StringUtils.isNotBlank(this.getCarrierDisplay())){
           queryCriteria.andCarrierDisplayLike("%" +this.getCarrierDisplay() +"%");
       }
   	 if(null != this.getStatus()){//状态Enum查询
        queryCriteria.andStatusEqualTo(this.getStatus().toString());
     	} 

	 if(null != this.getRouteType()){//状态Enum查询
	        queryCriteria.andRouteTypeEqualTo(this.getRouteType().toString());
	    }  
	  }
	
	    
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   } 
    
}
