package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinaceRechargeCarrier {
    private String rechargeId;

    private String rechargeCode;

    private String rechargeSetId;

    private BigDecimal rechargeMoney;

    private BigDecimal saveMoney;

    private BigDecimal chargeMoney;

    private BigDecimal returnMoney;

    private BigDecimal receiveMoney;

    private String carrierId;

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
    
    private String rechargeSetDisplay;
    
    private String auditorDisplay;
    
    private String carrierDisplay;

    public String getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    public String getRechargeCode() {
        return rechargeCode;
    }

    public void setRechargeCode(String rechargeCode) {
        this.rechargeCode = rechargeCode;
    }

    public String getRechargeSetId() {
        return rechargeSetId;
    }

    public void setRechargeSetId(String rechargeSetId) {
        this.rechargeSetId = rechargeSetId;
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public BigDecimal getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(BigDecimal saveMoney) {
        this.saveMoney = saveMoney;
    }

    public BigDecimal getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(BigDecimal chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public BigDecimal getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(BigDecimal returnMoney) {
        this.returnMoney = returnMoney;
    }

    public BigDecimal getReceiveMoney() {
        return receiveMoney;
    }

    public void setReceiveMoney(BigDecimal receiveMoney) {
        this.receiveMoney = receiveMoney;
    }

    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
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

	public String getRechargeSetDisplay() {
		return rechargeSetDisplay;
	}

	public void setRechargeSetDisplay(String rechargeSetDisplay) {
		this.rechargeSetDisplay = rechargeSetDisplay;
	}

	public String getAuditorDisplay() {
		return auditorDisplay;
	}

	public void setAuditorDisplay(String auditorDisplay) {
		this.auditorDisplay = auditorDisplay;
	}

	public String getCarrierDisplay() {
		return carrierDisplay;
	}

	public void setCarrierDisplay(String carrierDisplay) {
		this.carrierDisplay = carrierDisplay;
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
        FinaceRechargeCarrier other = (FinaceRechargeCarrier) that;
        return (this.getRechargeId() == null ? other.getRechargeId() == null : this.getRechargeId().equals(other.getRechargeId()))
            && (this.getRechargeCode() == null ? other.getRechargeCode() == null : this.getRechargeCode().equals(other.getRechargeCode()))
            && (this.getRechargeSetId() == null ? other.getRechargeSetId() == null : this.getRechargeSetId().equals(other.getRechargeSetId()))
            && (this.getRechargeMoney() == null ? other.getRechargeMoney() == null : this.getRechargeMoney().equals(other.getRechargeMoney()))
            && (this.getSaveMoney() == null ? other.getSaveMoney() == null : this.getSaveMoney().equals(other.getSaveMoney()))
            && (this.getChargeMoney() == null ? other.getChargeMoney() == null : this.getChargeMoney().equals(other.getChargeMoney()))
            && (this.getReturnMoney() == null ? other.getReturnMoney() == null : this.getReturnMoney().equals(other.getReturnMoney()))
            && (this.getReceiveMoney() == null ? other.getReceiveMoney() == null : this.getReceiveMoney().equals(other.getReceiveMoney()))
            && (this.getCarrierId() == null ? other.getCarrierId() == null : this.getCarrierId().equals(other.getCarrierId()))
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
        result = prime * result + ((getRechargeId() == null) ? 0 : getRechargeId().hashCode());
        result = prime * result + ((getRechargeCode() == null) ? 0 : getRechargeCode().hashCode());
        result = prime * result + ((getRechargeSetId() == null) ? 0 : getRechargeSetId().hashCode());
        result = prime * result + ((getRechargeMoney() == null) ? 0 : getRechargeMoney().hashCode());
        result = prime * result + ((getSaveMoney() == null) ? 0 : getSaveMoney().hashCode());
        result = prime * result + ((getChargeMoney() == null) ? 0 : getChargeMoney().hashCode());
        result = prime * result + ((getReturnMoney() == null) ? 0 : getReturnMoney().hashCode());
        result = prime * result + ((getReceiveMoney() == null) ? 0 : getReceiveMoney().hashCode());
        result = prime * result + ((getCarrierId() == null) ? 0 : getCarrierId().hashCode());
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