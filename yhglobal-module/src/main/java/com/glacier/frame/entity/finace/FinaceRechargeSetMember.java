package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinaceRechargeSetMember {
    private String rechargeSetId;

    private String rechargeSetName;

    private String rechargeSetType;

    private BigDecimal rechargeRate;

    private BigDecimal rechargeMoney;

    private String feeWay;

    private String memberGradeid;

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
    
    /**
     * 自定义字段
     */
    private String createrDisplay;
    
    private String updaterDisplay;
    
    private String gradeDisplay;
    
    private String auditorDisplay;
    
    
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

	public String getGradeDisplay() {
		return gradeDisplay;
	}

	public void setGradeDisplay(String gradeDisplay) {
		this.gradeDisplay = gradeDisplay;
	}

	public String getAuditorDisplay() {
		return auditorDisplay;
	}

	public void setAuditorDisplay(String auditorDisplay) {
		this.auditorDisplay = auditorDisplay;
	}

	public String getRechargeSetId() {
        return rechargeSetId;
    }

    public void setRechargeSetId(String rechargeSetId) {
        this.rechargeSetId = rechargeSetId;
    }

    public String getRechargeSetName() {
        return rechargeSetName;
    }

    public void setRechargeSetName(String rechargeSetName) {
        this.rechargeSetName = rechargeSetName;
    }

    public String getRechargeSetType() {
        return rechargeSetType;
    }

    public void setRechargeSetType(String rechargeSetType) {
        this.rechargeSetType = rechargeSetType;
    }

    public BigDecimal getRechargeRate() {
        return rechargeRate;
    }

    public void setRechargeRate(BigDecimal rechargeRate) {
        this.rechargeRate = rechargeRate;
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public String getFeeWay() {
        return feeWay;
    }

    public void setFeeWay(String feeWay) {
        this.feeWay = feeWay;
    }

    public String getMemberGradeid() {
        return memberGradeid;
    }

    public void setMemberGradeid(String memberGradeid) {
        this.memberGradeid = memberGradeid;
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
        FinaceRechargeSetMember other = (FinaceRechargeSetMember) that;
        return (this.getRechargeSetId() == null ? other.getRechargeSetId() == null : this.getRechargeSetId().equals(other.getRechargeSetId()))
            && (this.getRechargeSetName() == null ? other.getRechargeSetName() == null : this.getRechargeSetName().equals(other.getRechargeSetName()))
            && (this.getRechargeSetType() == null ? other.getRechargeSetType() == null : this.getRechargeSetType().equals(other.getRechargeSetType()))
            && (this.getRechargeRate() == null ? other.getRechargeRate() == null : this.getRechargeRate().equals(other.getRechargeRate()))
            && (this.getRechargeMoney() == null ? other.getRechargeMoney() == null : this.getRechargeMoney().equals(other.getRechargeMoney()))
            && (this.getFeeWay() == null ? other.getFeeWay() == null : this.getFeeWay().equals(other.getFeeWay()))
            && (this.getMemberGradeid() == null ? other.getMemberGradeid() == null : this.getMemberGradeid().equals(other.getMemberGradeid()))
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
        result = prime * result + ((getRechargeSetId() == null) ? 0 : getRechargeSetId().hashCode());
        result = prime * result + ((getRechargeSetName() == null) ? 0 : getRechargeSetName().hashCode());
        result = prime * result + ((getRechargeSetType() == null) ? 0 : getRechargeSetType().hashCode());
        result = prime * result + ((getRechargeRate() == null) ? 0 : getRechargeRate().hashCode());
        result = prime * result + ((getRechargeMoney() == null) ? 0 : getRechargeMoney().hashCode());
        result = prime * result + ((getFeeWay() == null) ? 0 : getFeeWay().hashCode());
        result = prime * result + ((getMemberGradeid() == null) ? 0 : getMemberGradeid().hashCode());
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