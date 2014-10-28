package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

public class FinanceMember {
    private String mrechageId;

    private String memberId;

    private BigDecimal mrechageAdd;

    private BigDecimal mrechagePay;

    private BigDecimal mrechagePrefer;

    private BigDecimal mrechageRemain;

    private BigDecimal mrechargeMark;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getMrechageId() {
        return mrechageId;
    }

    public void setMrechageId(String mrechageId) {
        this.mrechageId = mrechageId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getMrechageAdd() {
        return mrechageAdd;
    }

    public void setMrechageAdd(BigDecimal mrechageAdd) {
        this.mrechageAdd = mrechageAdd;
    }

    public BigDecimal getMrechagePay() {
        return mrechagePay;
    }

    public void setMrechagePay(BigDecimal mrechagePay) {
        this.mrechagePay = mrechagePay;
    }

    public BigDecimal getMrechagePrefer() {
        return mrechagePrefer;
    }

    public void setMrechagePrefer(BigDecimal mrechagePrefer) {
        this.mrechagePrefer = mrechagePrefer;
    }

    public BigDecimal getMrechageRemain() {
        return mrechageRemain;
    }

    public void setMrechageRemain(BigDecimal mrechageRemain) {
        this.mrechageRemain = mrechageRemain;
    }

    public BigDecimal getMrechargeMark() {
        return mrechargeMark;
    }

    public void setMrechargeMark(BigDecimal mrechargeMark) {
        this.mrechargeMark = mrechargeMark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        FinanceMember other = (FinanceMember) that;
        return (this.getMrechageId() == null ? other.getMrechageId() == null : this.getMrechageId().equals(other.getMrechageId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMrechageAdd() == null ? other.getMrechageAdd() == null : this.getMrechageAdd().equals(other.getMrechageAdd()))
            && (this.getMrechagePay() == null ? other.getMrechagePay() == null : this.getMrechagePay().equals(other.getMrechagePay()))
            && (this.getMrechagePrefer() == null ? other.getMrechagePrefer() == null : this.getMrechagePrefer().equals(other.getMrechagePrefer()))
            && (this.getMrechageRemain() == null ? other.getMrechageRemain() == null : this.getMrechageRemain().equals(other.getMrechageRemain()))
            && (this.getMrechargeMark() == null ? other.getMrechargeMark() == null : this.getMrechargeMark().equals(other.getMrechargeMark()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMrechageId() == null) ? 0 : getMrechageId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMrechageAdd() == null) ? 0 : getMrechageAdd().hashCode());
        result = prime * result + ((getMrechagePay() == null) ? 0 : getMrechagePay().hashCode());
        result = prime * result + ((getMrechagePrefer() == null) ? 0 : getMrechagePrefer().hashCode());
        result = prime * result + ((getMrechageRemain() == null) ? 0 : getMrechageRemain().hashCode());
        result = prime * result + ((getMrechargeMark() == null) ? 0 : getMrechargeMark().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}