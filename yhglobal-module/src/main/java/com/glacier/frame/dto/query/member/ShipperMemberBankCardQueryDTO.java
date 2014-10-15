package com.glacier.frame.dto.query.member;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.member.ShipperMemberBankCard;
import com.glacier.frame.entity.member.ShipperMemberBankCardExample.Criteria;


public class ShipperMemberBankCardQueryDTO extends ShipperMemberBankCard {
	
	private Date bankCardStartTime;
	
	private Date bankCardEndTime;

	public Date getBankCardStartTime() {
		return bankCardStartTime;
	}

	public void setBankCardStartTime(Date bankCardStartTime) {
		this.bankCardStartTime = bankCardStartTime;
	}

	public Date getBankCardEndTime() {
		return bankCardEndTime;
	}

	public void setBankCardEndTime(Date bankCardEndTime) {
		this.bankCardEndTime = bankCardEndTime;
	}
	
	public void setQueryCondition(Criteria queryCriteria, String q){
		 if(null!=this.getMemberDisplay()){
			 queryCriteria.andMemberDisplay("%"+this.getMemberDisplay()+"%");
		 }
		
		
		 if(null != this.getCardName() && StringUtils.isNotBlank(this.getCardName())){//会员名称Like查询
	            queryCriteria.andCardNameLike("%" + this.getCardName() + "%");
	      }
		 
		 if(null != this.getCardNumber() && StringUtils.isNotBlank(this.getCardNumber())){//会员名称Like查询
	            queryCriteria.andCardNumberLike("%" + this.getCardNumber() + "%");
	      } 
		 
		 if(null != bankCardStartTime && null != bankCardEndTime){//创建时间段查询
	           queryCriteria.andCreateTimeBetween(bankCardStartTime, bankCardEndTime); 
	     }else{
	          if(null != bankCardStartTime){
	              queryCriteria.andCreateTimeGreaterThanOrEqualTo(bankCardStartTime);
	          }
	          if(null != bankCardEndTime){
	              queryCriteria.andCreateTimeLessThanOrEqualTo(bankCardEndTime);
	          } 
	       }
	}
	
	@Override
	   public String toString() {
	       return ReflectionToStringBuilder.toString(this);
	   } 
	
}
