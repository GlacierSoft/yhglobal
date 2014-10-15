package com.glacier.frame.entity.carrier;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class CarrierContractRecord {
    private String contractRecordId;

    private String deliverId;

    private String carrierMemberId;

    private String platformId;

    private String contractType;

    private String status;

    private String contractContent;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date enableTime;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date disableTime;

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
    
    private String dispatchDisplay;
    
    private String carrierDisplay;
    
    private String platformDisplay;
    
    private String contractTypeDisplay;
    
    private String createrDisplay;
    
    private String updaterDisplay;
    
    public String getDispatchDisplay() {
		return dispatchDisplay;
	}

	public void setDispatchDisplay(String dispatchDisplay) {
		this.dispatchDisplay = dispatchDisplay;
	}

	public String getCarrierDisplay() {
		return carrierDisplay;
	}

	public void setCarrierDisplay(String carrierDisplay) {
		this.carrierDisplay = carrierDisplay;
	}

	public String getPlatformDisplay() {
		return platformDisplay;
	}

	public void setPlatformDisplay(String platformDisplay) {
		this.platformDisplay = platformDisplay;
	}

	public String getContractTypeDisplay() {
		return contractTypeDisplay;
	}

	public void setContractTypeDisplay(String contractTypeDisplay) {
		this.contractTypeDisplay = contractTypeDisplay;
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

	public String getContractRecordId() {
        return contractRecordId;
    }

    public void setContractRecordId(String contractRecordId) {
        this.contractRecordId = contractRecordId;
    }

    public String getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(String deliverId) {
        this.deliverId = deliverId;
    }

    public String getCarrierMemberId() {
        return carrierMemberId;
    }

    public void setCarrierMemberId(String carrierMemberId) {
        this.carrierMemberId = carrierMemberId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContractContent() {
        return contractContent;
    }

    public void setContractContent(String contractContent) {
        this.contractContent = contractContent;
    }

    public Date getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    public Date getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(Date disableTime) {
        this.disableTime = disableTime;
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
        CarrierContractRecord other = (CarrierContractRecord) that;
        return (this.getContractRecordId() == null ? other.getContractRecordId() == null : this.getContractRecordId().equals(other.getContractRecordId()))
            && (this.getDeliverId() == null ? other.getDeliverId() == null : this.getDeliverId().equals(other.getDeliverId()))
            && (this.getCarrierMemberId() == null ? other.getCarrierMemberId() == null : this.getCarrierMemberId().equals(other.getCarrierMemberId()))
            && (this.getPlatformId() == null ? other.getPlatformId() == null : this.getPlatformId().equals(other.getPlatformId()))
            && (this.getContractType() == null ? other.getContractType() == null : this.getContractType().equals(other.getContractType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getContractContent() == null ? other.getContractContent() == null : this.getContractContent().equals(other.getContractContent()))
            && (this.getEnableTime() == null ? other.getEnableTime() == null : this.getEnableTime().equals(other.getEnableTime()))
            && (this.getDisableTime() == null ? other.getDisableTime() == null : this.getDisableTime().equals(other.getDisableTime()))
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
        result = prime * result + ((getContractRecordId() == null) ? 0 : getContractRecordId().hashCode());
        result = prime * result + ((getDeliverId() == null) ? 0 : getDeliverId().hashCode());
        result = prime * result + ((getCarrierMemberId() == null) ? 0 : getCarrierMemberId().hashCode());
        result = prime * result + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        result = prime * result + ((getContractType() == null) ? 0 : getContractType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getContractContent() == null) ? 0 : getContractContent().hashCode());
        result = prime * result + ((getEnableTime() == null) ? 0 : getEnableTime().hashCode());
        result = prime * result + ((getDisableTime() == null) ? 0 : getDisableTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}