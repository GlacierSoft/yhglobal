package com.glacier.frame.entity.carrier;

import java.math.BigDecimal;

public class CarrierMemberStatistics {

	private String memberId;
	
	private String memberName;
	
	private BigDecimal income;
	
	private BigDecimal retruns;
	
	private BigDecimal recharge;
	
	private BigDecimal withdarw;
	
	private int driverCount;
	
	private int carCount;
	
	private int dispatchingCount;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public BigDecimal getIncome() {
		return income;
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public BigDecimal getRetruns() {
		return retruns;
	}

	public void setRetruns(BigDecimal retruns) {
		this.retruns = retruns;
	}

	public BigDecimal getRecharge() {
		return recharge;
	}

	public void setRecharge(BigDecimal recharge) {
		this.recharge = recharge;
	}

	public BigDecimal getWithdarw() {
		return withdarw;
	}

	public void setWithdarw(BigDecimal withdarw) {
		this.withdarw = withdarw;
	}

	public int getDriverCount() {
		return driverCount;
	}

	public void setDriverCount(int driverCount) {
		this.driverCount = driverCount;
	}

	public int getCarCount() {
		return carCount;
	}

	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}

	public int getDispatchingCount() {
		return dispatchingCount;
	}

	public void setDispatchingCount(int dispatchingCount) {
		this.dispatchingCount = dispatchingCount;
	}
	
	
}
