package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinanceCarrier {
    private String carrierId;

    private String carrierMemberId;

    private BigDecimal carrierIncome;

    private BigDecimal carrierFreeze;

    private BigDecimal carrierDeduct;

    private BigDecimal carrierReturn;

    private BigDecimal carrierRecharge;

    private BigDecimal carrierWithdraw;

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
    
    private String carrierMemberDisplay;

    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    public String getCarrierMemberId() {
        return carrierMemberId;
    }

    public void setCarrierMemberId(String carrierMemberId) {
        this.carrierMemberId = carrierMemberId;
    }

    public BigDecimal getCarrierIncome() {
        return carrierIncome;
    }

    public void setCarrierIncome(BigDecimal carrierIncome) {
        this.carrierIncome = carrierIncome;
    }

    public BigDecimal getCarrierFreeze() {
        return carrierFreeze;
    }

    public void setCarrierFreeze(BigDecimal carrierFreeze) {
        this.carrierFreeze = carrierFreeze;
    }

    public BigDecimal getCarrierDeduct() {
        return carrierDeduct;
    }

    public void setCarrierDeduct(BigDecimal carrierDeduct) {
        this.carrierDeduct = carrierDeduct;
    }

    public BigDecimal getCarrierReturn() {
        return carrierReturn;
    }

    public void setCarrierReturn(BigDecimal carrierReturn) {
        this.carrierReturn = carrierReturn;
    }

    public BigDecimal getCarrierRecharge() {
        return carrierRecharge;
    }

    public void setCarrierRecharge(BigDecimal carrierRecharge) {
        this.carrierRecharge = carrierRecharge;
    }

    public BigDecimal getCarrierWithdraw() {
        return carrierWithdraw;
    }

    public void setCarrierWithdraw(BigDecimal carrierWithdraw) {
        this.carrierWithdraw = carrierWithdraw;
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

	public String getCarrierMemberDisplay() {
		return carrierMemberDisplay;
	}

	public void setCarrierMemberDisplay(String carrierMemberDisplay) {
		this.carrierMemberDisplay = carrierMemberDisplay;
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
        FinanceCarrier other = (FinanceCarrier) that;
        return (this.getCarrierId() == null ? other.getCarrierId() == null : this.getCarrierId().equals(other.getCarrierId()))
            && (this.getCarrierMemberId() == null ? other.getCarrierMemberId() == null : this.getCarrierMemberId().equals(other.getCarrierMemberId()))
            && (this.getCarrierIncome() == null ? other.getCarrierIncome() == null : this.getCarrierIncome().equals(other.getCarrierIncome()))
            && (this.getCarrierFreeze() == null ? other.getCarrierFreeze() == null : this.getCarrierFreeze().equals(other.getCarrierFreeze()))
            && (this.getCarrierDeduct() == null ? other.getCarrierDeduct() == null : this.getCarrierDeduct().equals(other.getCarrierDeduct()))
            && (this.getCarrierReturn() == null ? other.getCarrierReturn() == null : this.getCarrierReturn().equals(other.getCarrierReturn()))
            && (this.getCarrierRecharge() == null ? other.getCarrierRecharge() == null : this.getCarrierRecharge().equals(other.getCarrierRecharge()))
            && (this.getCarrierWithdraw() == null ? other.getCarrierWithdraw() == null : this.getCarrierWithdraw().equals(other.getCarrierWithdraw()))
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
        result = prime * result + ((getCarrierId() == null) ? 0 : getCarrierId().hashCode());
        result = prime * result + ((getCarrierMemberId() == null) ? 0 : getCarrierMemberId().hashCode());
        result = prime * result + ((getCarrierIncome() == null) ? 0 : getCarrierIncome().hashCode());
        result = prime * result + ((getCarrierFreeze() == null) ? 0 : getCarrierFreeze().hashCode());
        result = prime * result + ((getCarrierDeduct() == null) ? 0 : getCarrierDeduct().hashCode());
        result = prime * result + ((getCarrierReturn() == null) ? 0 : getCarrierReturn().hashCode());
        result = prime * result + ((getCarrierRecharge() == null) ? 0 : getCarrierRecharge().hashCode());
        result = prime * result + ((getCarrierWithdraw() == null) ? 0 : getCarrierWithdraw().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}