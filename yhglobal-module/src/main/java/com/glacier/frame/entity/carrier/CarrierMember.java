package com.glacier.frame.entity.carrier;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @ClassName:  CarrierMember
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-11  下午2:13:05
 */
public class CarrierMember {
    private String carrierMemberId;

    private String memberName;

    private String memberPassword;

    private String tradersPassword;

    private String liveAddress;

    private String memberPhoto;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date registrationTime;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    private String email;

    private String memberType;

    private String status;

    private Integer loginCount;

    private String lastLoginIpAddress;

    private BigDecimal creditLimit;

    private Integer creditworthiness;

    private BigDecimal surplusMonney;

    private Integer deliverSuccess;

    private Integer deliverFail;

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

    /**
     * 自定义字段，显示创建人真实名字
     */
    private String createrDisplay;
    
    /**
     * 自定义字段，显示更新人的真实名字
     */
    private String updaterDisplay;
    
    /**
     * 自定义字段，显示审核人的真实名字
     */
    private String auditDisplay;
     
    public String getAuditDisplay() {
		return auditDisplay;
	}

	public void setAuditDisplay(String auditDisplay) {
		this.auditDisplay = auditDisplay;
	}

	public String getCarrierMemberId() {
        return carrierMemberId;
    }

    public void setCarrierMemberId(String carrierMemberId) {
        this.carrierMemberId = carrierMemberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

	public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getTradersPassword() {
        return tradersPassword;
    }

    public void setTradersPassword(String tradersPassword) {
        this.tradersPassword = tradersPassword;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getMemberPhoto() {
        return memberPhoto;
    }

    public void setMemberPhoto(String memberPhoto) {
        this.memberPhoto = memberPhoto;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public String getLastLoginIpAddress() {
        return lastLoginIpAddress;
    }

    public void setLastLoginIpAddress(String lastLoginIpAddress) {
        this.lastLoginIpAddress = lastLoginIpAddress;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Integer getCreditworthiness() {
        return creditworthiness;
    }

    public void setCreditworthiness(Integer creditworthiness) {
        this.creditworthiness = creditworthiness;
    }

    public BigDecimal getSurplusMonney() {
        return surplusMonney;
    }

    public void setSurplusMonney(BigDecimal surplusMonney) {
        this.surplusMonney = surplusMonney;
    }

    public Integer getDeliverSuccess() {
        return deliverSuccess;
    }

    public void setDeliverSuccess(Integer deliverSuccess) {
        this.deliverSuccess = deliverSuccess;
    }

    public Integer getDeliverFail() {
        return deliverFail;
    }

    public void setDeliverFail(Integer deliverFail) {
        this.deliverFail = deliverFail;
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
        CarrierMember other = (CarrierMember) that;
        return (this.getCarrierMemberId() == null ? other.getCarrierMemberId() == null : this.getCarrierMemberId().equals(other.getCarrierMemberId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getMemberPassword() == null ? other.getMemberPassword() == null : this.getMemberPassword().equals(other.getMemberPassword()))
            && (this.getTradersPassword() == null ? other.getTradersPassword() == null : this.getTradersPassword().equals(other.getTradersPassword()))
            && (this.getLiveAddress() == null ? other.getLiveAddress() == null : this.getLiveAddress().equals(other.getLiveAddress()))
            && (this.getMemberPhoto() == null ? other.getMemberPhoto() == null : this.getMemberPhoto().equals(other.getMemberPhoto()))
            && (this.getRegistrationTime() == null ? other.getRegistrationTime() == null : this.getRegistrationTime().equals(other.getRegistrationTime()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMemberType() == null ? other.getMemberType() == null : this.getMemberType().equals(other.getMemberType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLoginCount() == null ? other.getLoginCount() == null : this.getLoginCount().equals(other.getLoginCount()))
            && (this.getLastLoginIpAddress() == null ? other.getLastLoginIpAddress() == null : this.getLastLoginIpAddress().equals(other.getLastLoginIpAddress()))
            && (this.getCreditLimit() == null ? other.getCreditLimit() == null : this.getCreditLimit().equals(other.getCreditLimit()))
            && (this.getCreditworthiness() == null ? other.getCreditworthiness() == null : this.getCreditworthiness().equals(other.getCreditworthiness()))
            && (this.getSurplusMonney() == null ? other.getSurplusMonney() == null : this.getSurplusMonney().equals(other.getSurplusMonney()))
            && (this.getDeliverSuccess() == null ? other.getDeliverSuccess() == null : this.getDeliverSuccess().equals(other.getDeliverSuccess()))
            && (this.getDeliverFail() == null ? other.getDeliverFail() == null : this.getDeliverFail().equals(other.getDeliverFail()))
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
        result = prime * result + ((getCarrierMemberId() == null) ? 0 : getCarrierMemberId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getMemberPassword() == null) ? 0 : getMemberPassword().hashCode());
        result = prime * result + ((getTradersPassword() == null) ? 0 : getTradersPassword().hashCode());
        result = prime * result + ((getLiveAddress() == null) ? 0 : getLiveAddress().hashCode());
        result = prime * result + ((getMemberPhoto() == null) ? 0 : getMemberPhoto().hashCode());
        result = prime * result + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLoginCount() == null) ? 0 : getLoginCount().hashCode());
        result = prime * result + ((getLastLoginIpAddress() == null) ? 0 : getLastLoginIpAddress().hashCode());
        result = prime * result + ((getCreditLimit() == null) ? 0 : getCreditLimit().hashCode());
        result = prime * result + ((getCreditworthiness() == null) ? 0 : getCreditworthiness().hashCode());
        result = prime * result + ((getSurplusMonney() == null) ? 0 : getSurplusMonney().hashCode());
        result = prime * result + ((getDeliverSuccess() == null) ? 0 : getDeliverSuccess().hashCode());
        result = prime * result + ((getDeliverFail() == null) ? 0 : getDeliverFail().hashCode());
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