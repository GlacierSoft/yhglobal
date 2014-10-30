package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinaceWithdrawMember {
    private String withdrawId;

    private String withdrawCode;

    private String withdrawSetId;

    private BigDecimal withdrawMoney;

    private BigDecimal chargeMoney;

    private BigDecimal withdrawReallyMoney;

    private String memberId;

    private String auditor;

    private String auditState;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    private String auditOpinion;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    
    
    private String feeWay;
    private String withdrawName;
    private String createrDisplay;
    private String updaterDisplay;
    private String memberDisplay;
    private String auditorDisplay;
    
   

    public String getFeeWay() {
		return feeWay;
	}

	public void setFeeWay(String feeWay) {
		this.feeWay = feeWay;
	}

	public String getWithdrawName() {
		return withdrawName;
	}

	public void setWithdrawName(String withdrawName) {
		this.withdrawName = withdrawName;
	}

	public String getCreaterDisplay() {
		return createrDisplay;
	}

	public void setCreaterDisplay(String createrDisplay) {
		this.createrDisplay = createrDisplay;
	}

	public String getUpdaterDisplay() {
		return updaterDisplay;
	}

	public void setUpdaterDisplay(String updaterDisplay) {
		this.updaterDisplay = updaterDisplay;
	}

	public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getAuditorDisplay() {
		return auditorDisplay;
	}

	public void setAuditorDisplay(String auditorDisplay) {
		this.auditorDisplay = auditorDisplay;
	}

	public String getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId;
    }

    public String getWithdrawCode() {
        return withdrawCode;
    }

    public void setWithdrawCode(String withdrawCode) {
        this.withdrawCode = withdrawCode;
    }

    public String getWithdrawSetId() {
        return withdrawSetId;
    }

    public void setWithdrawSetId(String withdrawSetId) {
        this.withdrawSetId = withdrawSetId;
    }

    public BigDecimal getWithdrawMoney() {
        return withdrawMoney;
    }

    public void setWithdrawMoney(BigDecimal withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    public BigDecimal getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(BigDecimal chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public BigDecimal getWithdrawReallyMoney() {
        return withdrawReallyMoney;
    }

    public void setWithdrawReallyMoney(BigDecimal withdrawReallyMoney) {
        this.withdrawReallyMoney = withdrawReallyMoney;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
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
        FinaceWithdrawMember other = (FinaceWithdrawMember) that;
        return (this.getWithdrawId() == null ? other.getWithdrawId() == null : this.getWithdrawId().equals(other.getWithdrawId()))
            && (this.getWithdrawCode() == null ? other.getWithdrawCode() == null : this.getWithdrawCode().equals(other.getWithdrawCode()))
            && (this.getWithdrawSetId() == null ? other.getWithdrawSetId() == null : this.getWithdrawSetId().equals(other.getWithdrawSetId()))
            && (this.getWithdrawMoney() == null ? other.getWithdrawMoney() == null : this.getWithdrawMoney().equals(other.getWithdrawMoney()))
            && (this.getChargeMoney() == null ? other.getChargeMoney() == null : this.getChargeMoney().equals(other.getChargeMoney()))
            && (this.getWithdrawReallyMoney() == null ? other.getWithdrawReallyMoney() == null : this.getWithdrawReallyMoney().equals(other.getWithdrawReallyMoney()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuditOpinion() == null ? other.getAuditOpinion() == null : this.getAuditOpinion().equals(other.getAuditOpinion()))
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
        result = prime * result + ((getWithdrawId() == null) ? 0 : getWithdrawId().hashCode());
        result = prime * result + ((getWithdrawCode() == null) ? 0 : getWithdrawCode().hashCode());
        result = prime * result + ((getWithdrawSetId() == null) ? 0 : getWithdrawSetId().hashCode());
        result = prime * result + ((getWithdrawMoney() == null) ? 0 : getWithdrawMoney().hashCode());
        result = prime * result + ((getChargeMoney() == null) ? 0 : getChargeMoney().hashCode());
        result = prime * result + ((getWithdrawReallyMoney() == null) ? 0 : getWithdrawReallyMoney().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditOpinion() == null) ? 0 : getAuditOpinion().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}