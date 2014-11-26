package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinaceMemberRecord {
    private String transactionMemberId;

    private String finaceMemberId;

    private String memberId;

    private String transactionTarget;

    private String transactionType;

    private BigDecimal earningMoney;

    private BigDecimal expendMoney;

    private BigDecimal usableMoney;

    private BigDecimal frozenMoney;

    private BigDecimal collectingMoney;

    private BigDecimal refundMoney;

    private BigDecimal amount;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    
    private String updaterDisplay;
    
    private String createrDisplay;
    
    private String memberDisplay;
    
    public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getUpdaterDisplay() {
		return updaterDisplay;
	}

	public void setUpdaterDisplay(String updaterDisplay) {
		this.updaterDisplay = updaterDisplay;
	}
    
	public String getCreaterDisplay() {
		return createrDisplay;
	}

	public void setCreaterDisplay(String createrDisplay) {
		this.createrDisplay = createrDisplay;
	}

	public String getTransactionMemberId() {
        return transactionMemberId;
    }

    public void setTransactionMemberId(String transactionMemberId) {
        this.transactionMemberId = transactionMemberId;
    }

    public String getFinaceMemberId() {
        return finaceMemberId;
    }

    public void setFinaceMemberId(String finaceMemberId) {
        this.finaceMemberId = finaceMemberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getTransactionTarget() {
        return transactionTarget;
    }

    public void setTransactionTarget(String transactionTarget) {
        this.transactionTarget = transactionTarget;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getEarningMoney() {
        return earningMoney;
    }

    public void setEarningMoney(BigDecimal earningMoney) {
        this.earningMoney = earningMoney;
    }

    public BigDecimal getExpendMoney() {
        return expendMoney;
    }

    public void setExpendMoney(BigDecimal expendMoney) {
        this.expendMoney = expendMoney;
    }

    public BigDecimal getUsableMoney() {
        return usableMoney;
    }

    public void setUsableMoney(BigDecimal usableMoney) {
        this.usableMoney = usableMoney;
    }

    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public BigDecimal getCollectingMoney() {
        return collectingMoney;
    }

    public void setCollectingMoney(BigDecimal collectingMoney) {
        this.collectingMoney = collectingMoney;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
        FinaceMemberRecord other = (FinaceMemberRecord) that;
        return (this.getTransactionMemberId() == null ? other.getTransactionMemberId() == null : this.getTransactionMemberId().equals(other.getTransactionMemberId()))
            && (this.getFinaceMemberId() == null ? other.getFinaceMemberId() == null : this.getFinaceMemberId().equals(other.getFinaceMemberId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getTransactionTarget() == null ? other.getTransactionTarget() == null : this.getTransactionTarget().equals(other.getTransactionTarget()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getEarningMoney() == null ? other.getEarningMoney() == null : this.getEarningMoney().equals(other.getEarningMoney()))
            && (this.getExpendMoney() == null ? other.getExpendMoney() == null : this.getExpendMoney().equals(other.getExpendMoney()))
            && (this.getUsableMoney() == null ? other.getUsableMoney() == null : this.getUsableMoney().equals(other.getUsableMoney()))
            && (this.getFrozenMoney() == null ? other.getFrozenMoney() == null : this.getFrozenMoney().equals(other.getFrozenMoney()))
            && (this.getCollectingMoney() == null ? other.getCollectingMoney() == null : this.getCollectingMoney().equals(other.getCollectingMoney()))
            && (this.getRefundMoney() == null ? other.getRefundMoney() == null : this.getRefundMoney().equals(other.getRefundMoney()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
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
        result = prime * result + ((getTransactionMemberId() == null) ? 0 : getTransactionMemberId().hashCode());
        result = prime * result + ((getFinaceMemberId() == null) ? 0 : getFinaceMemberId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getTransactionTarget() == null) ? 0 : getTransactionTarget().hashCode());
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getEarningMoney() == null) ? 0 : getEarningMoney().hashCode());
        result = prime * result + ((getExpendMoney() == null) ? 0 : getExpendMoney().hashCode());
        result = prime * result + ((getUsableMoney() == null) ? 0 : getUsableMoney().hashCode());
        result = prime * result + ((getFrozenMoney() == null) ? 0 : getFrozenMoney().hashCode());
        result = prime * result + ((getCollectingMoney() == null) ? 0 : getCollectingMoney().hashCode());
        result = prime * result + ((getRefundMoney() == null) ? 0 : getRefundMoney().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}