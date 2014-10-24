package com.glacier.frame.entity.carrier;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Pattern;

import com.alibaba.fastjson.annotation.JSONField;

public class CarrierRoute {
    private String routerId;
     
    private String routeName;

    private String status;

    private String routeOrigin;

    private String routeStop;

    private String routeType;
  
    private Integer routeBytime;

    private String routeNumber;

    @JSONField(format="HH:mm")
    private Date startofTime;

    private Float availablePosition;

    private String boxType;

    @JSONField(format="HH:mm")
    private Date ceaseTakeDeliveryTime;

    private BigDecimal startingPrice;

    private BigDecimal weightGoodsPrice;

    private BigDecimal lightGoodsPrice;

    private String extractGoodsTime;

    private BigDecimal premium;
   
    @Pattern(regexp = "(^(\\d{3,4}-)?\\d{7,8})$|(13[0-9]{9})", message = "{Route.telephone.illegal}")
    private String telephone;

    private String mileage;

    private String auditState;

    private String audit;

    private String auditOpinion;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditTime;
    
    private String originAddress; 

    private String stopAddress;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    
    //自定义字段承运商
    private String carrierDisplay;
    
    //创建人
    private String createrDisplay;
    
    //更新人
    private String updaterDisplay;
    
    //审核人
    private String auditDisplay; 
    
    //发车时间，临时字段 
    @Pattern(regexp = "^(20|21|22|23|[0-1]?\\d):[0-5]?\\d$", message = "{Route.outTime.illegal}")
    private String  outTime;
    
    //截止收货时间，临时字段
    @Pattern(regexp = "^(20|21|22|23|[0-1]?\\d):[0-5]?\\d$", message = "{Route.intTime.illegal}")
    private String intTime;

    
    public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}

	public String getStopAddress() {
		return stopAddress;
	}

	public void setStopAddress(String stopAddress) {
		this.stopAddress = stopAddress;
	}

	public String getIntTime() {
		return intTime;
	}

	public void setIntTime(String intTime) {
		this.intTime = intTime;
	}

	public String getCarrierDisplay() {
		return carrierDisplay;
	}

	public void setCarrierDisplay(String carrierDisplay) {
		this.carrierDisplay = carrierDisplay;
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

	public String getAuditDisplay() {
		return auditDisplay;
	}

	public void setAuditDisplay(String auditDisplay) {
		this.auditDisplay = auditDisplay;
	}

	public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRouteOrigin() {
        return routeOrigin;
    }

    public void setRouteOrigin(String routeOrigin) {
        this.routeOrigin = routeOrigin;
    }

    public String getRouteStop() {
        return routeStop;
    }

    public void setRouteStop(String routeStop) {
        this.routeStop = routeStop;
    }

    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public Integer getRouteBytime() {
        return routeBytime;
    }

    public void setRouteBytime(Integer routeBytime) {
        this.routeBytime = routeBytime;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public Date getStartofTime() {
        return startofTime;
    }

    public void setStartofTime(Date startofTime) {
        this.startofTime = startofTime;
    }

    public Float getAvailablePosition() {
        return availablePosition;
    }

    public void setAvailablePosition(Float availablePosition) {
        this.availablePosition = availablePosition;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public Date getCeaseTakeDeliveryTime() {
        return ceaseTakeDeliveryTime;
    }

    public void setCeaseTakeDeliveryTime(Date ceaseTakeDeliveryTime) {
        this.ceaseTakeDeliveryTime = ceaseTakeDeliveryTime;
    }

    public BigDecimal getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(BigDecimal startingPrice) {
        this.startingPrice = startingPrice;
    }

    public BigDecimal getWeightGoodsPrice() {
        return weightGoodsPrice;
    }

    public void setWeightGoodsPrice(BigDecimal weightGoodsPrice) {
        this.weightGoodsPrice = weightGoodsPrice;
    }

    public BigDecimal getLightGoodsPrice() {
        return lightGoodsPrice;
    }

    public void setLightGoodsPrice(BigDecimal lightGoodsPrice) {
        this.lightGoodsPrice = lightGoodsPrice;
    }

    public String getExtractGoodsTime() {
        return extractGoodsTime;
    }

    public void setExtractGoodsTime(String extractGoodsTime) {
        this.extractGoodsTime = extractGoodsTime;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
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
        CarrierRoute other = (CarrierRoute) that;
        return (this.getRouterId() == null ? other.getRouterId() == null : this.getRouterId().equals(other.getRouterId()))
            && (this.getRouteName() == null ? other.getRouteName() == null : this.getRouteName().equals(other.getRouteName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRouteOrigin() == null ? other.getRouteOrigin() == null : this.getRouteOrigin().equals(other.getRouteOrigin()))
            && (this.getRouteStop() == null ? other.getRouteStop() == null : this.getRouteStop().equals(other.getRouteStop()))
            && (this.getRouteType() == null ? other.getRouteType() == null : this.getRouteType().equals(other.getRouteType()))
            && (this.getRouteBytime() == null ? other.getRouteBytime() == null : this.getRouteBytime().equals(other.getRouteBytime()))
            && (this.getRouteNumber() == null ? other.getRouteNumber() == null : this.getRouteNumber().equals(other.getRouteNumber()))
            && (this.getStartofTime() == null ? other.getStartofTime() == null : this.getStartofTime().equals(other.getStartofTime()))
            && (this.getAvailablePosition() == null ? other.getAvailablePosition() == null : this.getAvailablePosition().equals(other.getAvailablePosition()))
            && (this.getBoxType() == null ? other.getBoxType() == null : this.getBoxType().equals(other.getBoxType()))
            && (this.getCeaseTakeDeliveryTime() == null ? other.getCeaseTakeDeliveryTime() == null : this.getCeaseTakeDeliveryTime().equals(other.getCeaseTakeDeliveryTime()))
            && (this.getStartingPrice() == null ? other.getStartingPrice() == null : this.getStartingPrice().equals(other.getStartingPrice()))
            && (this.getWeightGoodsPrice() == null ? other.getWeightGoodsPrice() == null : this.getWeightGoodsPrice().equals(other.getWeightGoodsPrice()))
            && (this.getLightGoodsPrice() == null ? other.getLightGoodsPrice() == null : this.getLightGoodsPrice().equals(other.getLightGoodsPrice()))
            && (this.getExtractGoodsTime() == null ? other.getExtractGoodsTime() == null : this.getExtractGoodsTime().equals(other.getExtractGoodsTime()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getMileage() == null ? other.getMileage() == null : this.getMileage().equals(other.getMileage()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAudit() == null ? other.getAudit() == null : this.getAudit().equals(other.getAudit()))
            && (this.getAuditOpinion() == null ? other.getAuditOpinion() == null : this.getAuditOpinion().equals(other.getAuditOpinion()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
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
        result = prime * result + ((getRouterId() == null) ? 0 : getRouterId().hashCode());
        result = prime * result + ((getRouteName() == null) ? 0 : getRouteName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRouteOrigin() == null) ? 0 : getRouteOrigin().hashCode());
        result = prime * result + ((getRouteStop() == null) ? 0 : getRouteStop().hashCode());
        result = prime * result + ((getRouteType() == null) ? 0 : getRouteType().hashCode());
        result = prime * result + ((getRouteBytime() == null) ? 0 : getRouteBytime().hashCode());
        result = prime * result + ((getRouteNumber() == null) ? 0 : getRouteNumber().hashCode());
        result = prime * result + ((getStartofTime() == null) ? 0 : getStartofTime().hashCode());
        result = prime * result + ((getAvailablePosition() == null) ? 0 : getAvailablePosition().hashCode());
        result = prime * result + ((getBoxType() == null) ? 0 : getBoxType().hashCode());
        result = prime * result + ((getCeaseTakeDeliveryTime() == null) ? 0 : getCeaseTakeDeliveryTime().hashCode());
        result = prime * result + ((getStartingPrice() == null) ? 0 : getStartingPrice().hashCode());
        result = prime * result + ((getWeightGoodsPrice() == null) ? 0 : getWeightGoodsPrice().hashCode());
        result = prime * result + ((getLightGoodsPrice() == null) ? 0 : getLightGoodsPrice().hashCode());
        result = prime * result + ((getExtractGoodsTime() == null) ? 0 : getExtractGoodsTime().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getMileage() == null) ? 0 : getMileage().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAudit() == null) ? 0 : getAudit().hashCode());
        result = prime * result + ((getAuditOpinion() == null) ? 0 : getAuditOpinion().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}