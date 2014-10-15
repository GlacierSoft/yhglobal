package com.glacier.frame.entity.carrier;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class CarrierCarInformation {
    private String carId;

    /**
     * 自定义字段
     */
    private String carrierMemberRealName;
    
    private String auditorDisplay;
    
    private String createrDisplay;
    
    private String updaterDisplay;
    
    private String carrierMemberId;

    private Integer routeName;

    private String transportType;

    private String serviceType;

    private String plateNumber;

    private Integer carAge;

    private String carType;

    private Integer carLength;

    private String carLoad;

    private String carAttribution;

    private String carStatus;

    private String transportStatus;

    private String auditState;

    private String audit;

    private String auditOpinion;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String carImg;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarrierMemberId() {
        return carrierMemberId;
    }

    public String getCarrierMemberRealName() {
        return carrierMemberRealName;
    }

    public void setCarrierMemberRealName(String carrierMemberRealName) {
        this.carrierMemberRealName = carrierMemberRealName;
    }

    public String getAuditorDisplay() {
        return auditorDisplay;
    }

    public void setAuditorDisplay(String auditorDisplay) {
        this.auditorDisplay = auditorDisplay;
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

    public void setCarrierMemberId(String carrierMemberId) {
        this.carrierMemberId = carrierMemberId;
    }

    public Integer getRouteName() {
        return routeName;
    }

    public void setRouteName(Integer routeName) {
        this.routeName = routeName;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Integer getCarAge() {
        return carAge;
    }

    public void setCarAge(Integer carAge) {
        this.carAge = carAge;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getCarLength() {
        return carLength;
    }

    public void setCarLength(Integer carLength) {
        this.carLength = carLength;
    }

    public String getCarLoad() {
        return carLoad;
    }

    public void setCarLoad(String carLoad) {
        this.carLoad = carLoad;
    }

    public String getCarAttribution() {
        return carAttribution;
    }

    public void setCarAttribution(String carAttribution) {
        this.carAttribution = carAttribution;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public String getTransportStatus() {
        return transportStatus;
    }

    public void setTransportStatus(String transportStatus) {
        this.transportStatus = transportStatus;
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

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg;
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
        CarrierCarInformation other = (CarrierCarInformation) that;
        return (this.getCarId() == null ? other.getCarId() == null : this.getCarId().equals(other.getCarId()))
            && (this.getCarrierMemberId() == null ? other.getCarrierMemberId() == null : this.getCarrierMemberId().equals(other.getCarrierMemberId()))
            && (this.getRouteName() == null ? other.getRouteName() == null : this.getRouteName().equals(other.getRouteName()))
            && (this.getTransportType() == null ? other.getTransportType() == null : this.getTransportType().equals(other.getTransportType()))
            && (this.getServiceType() == null ? other.getServiceType() == null : this.getServiceType().equals(other.getServiceType()))
            && (this.getPlateNumber() == null ? other.getPlateNumber() == null : this.getPlateNumber().equals(other.getPlateNumber()))
            && (this.getCarAge() == null ? other.getCarAge() == null : this.getCarAge().equals(other.getCarAge()))
            && (this.getCarType() == null ? other.getCarType() == null : this.getCarType().equals(other.getCarType()))
            && (this.getCarLength() == null ? other.getCarLength() == null : this.getCarLength().equals(other.getCarLength()))
            && (this.getCarLoad() == null ? other.getCarLoad() == null : this.getCarLoad().equals(other.getCarLoad()))
            && (this.getCarAttribution() == null ? other.getCarAttribution() == null : this.getCarAttribution().equals(other.getCarAttribution()))
            && (this.getCarStatus() == null ? other.getCarStatus() == null : this.getCarStatus().equals(other.getCarStatus()))
            && (this.getTransportStatus() == null ? other.getTransportStatus() == null : this.getTransportStatus().equals(other.getTransportStatus()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAudit() == null ? other.getAudit() == null : this.getAudit().equals(other.getAudit()))
            && (this.getAuditOpinion() == null ? other.getAuditOpinion() == null : this.getAuditOpinion().equals(other.getAuditOpinion()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCarImg() == null ? other.getCarImg() == null : this.getCarImg().equals(other.getCarImg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarId() == null) ? 0 : getCarId().hashCode());
        result = prime * result + ((getCarrierMemberId() == null) ? 0 : getCarrierMemberId().hashCode());
        result = prime * result + ((getRouteName() == null) ? 0 : getRouteName().hashCode());
        result = prime * result + ((getTransportType() == null) ? 0 : getTransportType().hashCode());
        result = prime * result + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        result = prime * result + ((getPlateNumber() == null) ? 0 : getPlateNumber().hashCode());
        result = prime * result + ((getCarAge() == null) ? 0 : getCarAge().hashCode());
        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());
        result = prime * result + ((getCarLength() == null) ? 0 : getCarLength().hashCode());
        result = prime * result + ((getCarLoad() == null) ? 0 : getCarLoad().hashCode());
        result = prime * result + ((getCarAttribution() == null) ? 0 : getCarAttribution().hashCode());
        result = prime * result + ((getCarStatus() == null) ? 0 : getCarStatus().hashCode());
        result = prime * result + ((getTransportStatus() == null) ? 0 : getTransportStatus().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAudit() == null) ? 0 : getAudit().hashCode());
        result = prime * result + ((getAuditOpinion() == null) ? 0 : getAuditOpinion().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCarImg() == null) ? 0 : getCarImg().hashCode());
        return result;
    }
}