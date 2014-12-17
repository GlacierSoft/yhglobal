package com.glacier.frame.entity.member;

import java.math.BigDecimal;

public class ShipperMemberStatistics {
    private String statisticsId;

    private String memberId;

    private Integer countstatus;

    private BigDecimal mrechageadd;

    private BigDecimal receivemoney;

    private BigDecimal withdrawmoney;

    private BigDecimal withdrawreallymoney;

    private BigDecimal mrechargemark;

    private BigDecimal counttransportation;

    private BigDecimal countinsurance;

    private BigDecimal countgoods;

    public String getStatisticsId() {
        return statisticsId;
    }

    public void setStatisticsId(String statisticsId) {
        this.statisticsId = statisticsId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Integer getCountstatus() {
        return countstatus;
    }

    public void setCountstatus(Integer countstatus) {
        this.countstatus = countstatus;
    }

    public BigDecimal getMrechageadd() {
        return mrechageadd;
    }

    public void setMrechageadd(BigDecimal mrechageadd) {
        this.mrechageadd = mrechageadd;
    }

    public BigDecimal getReceivemoney() {
        return receivemoney;
    }

    public void setReceivemoney(BigDecimal receivemoney) {
        this.receivemoney = receivemoney;
    }

    public BigDecimal getWithdrawmoney() {
        return withdrawmoney;
    }

    public void setWithdrawmoney(BigDecimal withdrawmoney) {
        this.withdrawmoney = withdrawmoney;
    }

    public BigDecimal getWithdrawreallymoney() {
        return withdrawreallymoney;
    }

    public void setWithdrawreallymoney(BigDecimal withdrawreallymoney) {
        this.withdrawreallymoney = withdrawreallymoney;
    }

    public BigDecimal getMrechargemark() {
        return mrechargemark;
    }

    public void setMrechargemark(BigDecimal mrechargemark) {
        this.mrechargemark = mrechargemark;
    }

    public BigDecimal getCounttransportation() {
        return counttransportation;
    }

    public void setCounttransportation(BigDecimal counttransportation) {
        this.counttransportation = counttransportation;
    }

    public BigDecimal getCountinsurance() {
        return countinsurance;
    }

    public void setCountinsurance(BigDecimal countinsurance) {
        this.countinsurance = countinsurance;
    }

    public BigDecimal getCountgoods() {
        return countgoods;
    }

    public void setCountgoods(BigDecimal countgoods) {
        this.countgoods = countgoods;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ShipperMemberStatistics other = (ShipperMemberStatistics) that;
        return (this.getStatisticsId() == null ? other.getStatisticsId() == null : this.getStatisticsId().equals(other.getStatisticsId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getCountstatus() == null ? other.getCountstatus() == null : this.getCountstatus().equals(other.getCountstatus()))
            && (this.getMrechageadd() == null ? other.getMrechageadd() == null : this.getMrechageadd().equals(other.getMrechageadd()))
            && (this.getReceivemoney() == null ? other.getReceivemoney() == null : this.getReceivemoney().equals(other.getReceivemoney()))
            && (this.getWithdrawmoney() == null ? other.getWithdrawmoney() == null : this.getWithdrawmoney().equals(other.getWithdrawmoney()))
            && (this.getWithdrawreallymoney() == null ? other.getWithdrawreallymoney() == null : this.getWithdrawreallymoney().equals(other.getWithdrawreallymoney()))
            && (this.getMrechargemark() == null ? other.getMrechargemark() == null : this.getMrechargemark().equals(other.getMrechargemark()))
            && (this.getCounttransportation() == null ? other.getCounttransportation() == null : this.getCounttransportation().equals(other.getCounttransportation()))
            && (this.getCountinsurance() == null ? other.getCountinsurance() == null : this.getCountinsurance().equals(other.getCountinsurance()))
            && (this.getCountgoods() == null ? other.getCountgoods() == null : this.getCountgoods().equals(other.getCountgoods()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStatisticsId() == null) ? 0 : getStatisticsId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getCountstatus() == null) ? 0 : getCountstatus().hashCode());
        result = prime * result + ((getMrechageadd() == null) ? 0 : getMrechageadd().hashCode());
        result = prime * result + ((getReceivemoney() == null) ? 0 : getReceivemoney().hashCode());
        result = prime * result + ((getWithdrawmoney() == null) ? 0 : getWithdrawmoney().hashCode());
        result = prime * result + ((getWithdrawreallymoney() == null) ? 0 : getWithdrawreallymoney().hashCode());
        result = prime * result + ((getMrechargemark() == null) ? 0 : getMrechargemark().hashCode());
        result = prime * result + ((getCounttransportation() == null) ? 0 : getCounttransportation().hashCode());
        result = prime * result + ((getCountinsurance() == null) ? 0 : getCountinsurance().hashCode());
        result = prime * result + ((getCountgoods() == null) ? 0 : getCountgoods().hashCode());
        return result;
    }
}