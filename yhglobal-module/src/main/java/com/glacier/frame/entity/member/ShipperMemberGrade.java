package com.glacier.frame.entity.member;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ShipperMemberGrade {
    private String gradeId;

    private String gradeName;

    private Integer scopeStart;

    private Integer scopeStop;

    private String gradeImg;

    private String gradeGps;

    private String gradeEmail;

    private String gradeMobile;

    private String gradeFirst;

    private BigDecimal gradeDiscount;

    private String gradeCashpayment;

    private String gradeDestination;

    private String gradeMonthly;

    private String status;

    private String remark;

    /**
     * 自定义字段
     */
    private String createrDisplay;
    
    private String updaterDisplay;
    
    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getScopeStart() {
        return scopeStart;
    }

    public void setScopeStart(Integer scopeStart) {
        this.scopeStart = scopeStart;
    }

    public Integer getScopeStop() {
        return scopeStop;
    }

    public void setScopeStop(Integer scopeStop) {
        this.scopeStop = scopeStop;
    }

    public String getGradeImg() {
        return gradeImg;
    }

    public void setGradeImg(String gradeImg) {
        this.gradeImg = gradeImg;
    }

    public String getGradeGps() {
        return gradeGps;
    }

    public void setGradeGps(String gradeGps) {
        this.gradeGps = gradeGps;
    }

    public String getGradeEmail() {
        return gradeEmail;
    }

    public void setGradeEmail(String gradeEmail) {
        this.gradeEmail = gradeEmail;
    }

    public String getGradeMobile() {
        return gradeMobile;
    }

    public void setGradeMobile(String gradeMobile) {
        this.gradeMobile = gradeMobile;
    }

    public String getGradeFirst() {
        return gradeFirst;
    }

    public void setGradeFirst(String gradeFirst) {
        this.gradeFirst = gradeFirst;
    }

    public BigDecimal getGradeDiscount() {
        return gradeDiscount;
    }

    public void setGradeDiscount(BigDecimal gradeDiscount) {
        this.gradeDiscount = gradeDiscount;
    }

    public String getGradeCashpayment() {
        return gradeCashpayment;
    }

    public void setGradeCashpayment(String gradeCashpayment) {
        this.gradeCashpayment = gradeCashpayment;
    }

    public String getGradeDestination() {
        return gradeDestination;
    }

    public void setGradeDestination(String gradeDestination) {
        this.gradeDestination = gradeDestination;
    }

    public String getGradeMonthly() {
        return gradeMonthly;
    }

    public void setGradeMonthly(String gradeMonthly) {
        this.gradeMonthly = gradeMonthly;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        ShipperMemberGrade other = (ShipperMemberGrade) that;
        return (this.getGradeId() == null ? other.getGradeId() == null : this.getGradeId().equals(other.getGradeId()))
            && (this.getGradeName() == null ? other.getGradeName() == null : this.getGradeName().equals(other.getGradeName()))
            && (this.getScopeStart() == null ? other.getScopeStart() == null : this.getScopeStart().equals(other.getScopeStart()))
            && (this.getScopeStop() == null ? other.getScopeStop() == null : this.getScopeStop().equals(other.getScopeStop()))
            && (this.getGradeImg() == null ? other.getGradeImg() == null : this.getGradeImg().equals(other.getGradeImg()))
            && (this.getGradeGps() == null ? other.getGradeGps() == null : this.getGradeGps().equals(other.getGradeGps()))
            && (this.getGradeEmail() == null ? other.getGradeEmail() == null : this.getGradeEmail().equals(other.getGradeEmail()))
            && (this.getGradeMobile() == null ? other.getGradeMobile() == null : this.getGradeMobile().equals(other.getGradeMobile()))
            && (this.getGradeFirst() == null ? other.getGradeFirst() == null : this.getGradeFirst().equals(other.getGradeFirst()))
            && (this.getGradeDiscount() == null ? other.getGradeDiscount() == null : this.getGradeDiscount().equals(other.getGradeDiscount()))
            && (this.getGradeCashpayment() == null ? other.getGradeCashpayment() == null : this.getGradeCashpayment().equals(other.getGradeCashpayment()))
            && (this.getGradeDestination() == null ? other.getGradeDestination() == null : this.getGradeDestination().equals(other.getGradeDestination()))
            && (this.getGradeMonthly() == null ? other.getGradeMonthly() == null : this.getGradeMonthly().equals(other.getGradeMonthly()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
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
        result = prime * result + ((getGradeId() == null) ? 0 : getGradeId().hashCode());
        result = prime * result + ((getGradeName() == null) ? 0 : getGradeName().hashCode());
        result = prime * result + ((getScopeStart() == null) ? 0 : getScopeStart().hashCode());
        result = prime * result + ((getScopeStop() == null) ? 0 : getScopeStop().hashCode());
        result = prime * result + ((getGradeImg() == null) ? 0 : getGradeImg().hashCode());
        result = prime * result + ((getGradeGps() == null) ? 0 : getGradeGps().hashCode());
        result = prime * result + ((getGradeEmail() == null) ? 0 : getGradeEmail().hashCode());
        result = prime * result + ((getGradeMobile() == null) ? 0 : getGradeMobile().hashCode());
        result = prime * result + ((getGradeFirst() == null) ? 0 : getGradeFirst().hashCode());
        result = prime * result + ((getGradeDiscount() == null) ? 0 : getGradeDiscount().hashCode());
        result = prime * result + ((getGradeCashpayment() == null) ? 0 : getGradeCashpayment().hashCode());
        result = prime * result + ((getGradeDestination() == null) ? 0 : getGradeDestination().hashCode());
        result = prime * result + ((getGradeMonthly() == null) ? 0 : getGradeMonthly().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}