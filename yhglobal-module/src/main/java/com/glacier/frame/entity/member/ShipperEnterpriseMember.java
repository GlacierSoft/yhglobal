package com.glacier.frame.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ShipperEnterpriseMember {
    private String memberId;

    private String enterpriseName;

    private String deputy;

    private String area;

    private String detailedAddress;

    private String property;

    private String enterpriseType;

    private String trade;

    private String enterprisePhone;

    private String enterpriseImg;

    private String enterpriseLogo;

    private String enterpriseFax;

    private String enterpriseSummary;

    private String authState;

    private String auth;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date authTime;

    private String authRemark;
    
    //自定义字段审核人
    private String auditDisplay;
      
    public String getAuditDisplay() {
		return auditDisplay;
	}

	public void setAuditDisplay(String auditDisplay) {
		this.auditDisplay = auditDisplay;
	}

	public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getDeputy() {
        return deputy;
    }

    public void setDeputy(String deputy) {
        this.deputy = deputy;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public String getEnterpriseImg() {
        return enterpriseImg;
    }

    public void setEnterpriseImg(String enterpriseImg) {
        this.enterpriseImg = enterpriseImg;
    }

    public String getEnterpriseLogo() {
        return enterpriseLogo;
    }

    public void setEnterpriseLogo(String enterpriseLogo) {
        this.enterpriseLogo = enterpriseLogo;
    }

    public String getEnterpriseFax() {
        return enterpriseFax;
    }

    public void setEnterpriseFax(String enterpriseFax) {
        this.enterpriseFax = enterpriseFax;
    }

    public String getEnterpriseSummary() {
        return enterpriseSummary;
    }

    public void setEnterpriseSummary(String enterpriseSummary) {
        this.enterpriseSummary = enterpriseSummary;
    }

    public String getAuthState() {
        return authState;
    }

    public void setAuthState(String authState) {
        this.authState = authState;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    public String getAuthRemark() {
        return authRemark;
    }

    public void setAuthRemark(String authRemark) {
        this.authRemark = authRemark;
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
        ShipperEnterpriseMember other = (ShipperEnterpriseMember) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getEnterpriseName() == null ? other.getEnterpriseName() == null : this.getEnterpriseName().equals(other.getEnterpriseName()))
            && (this.getDeputy() == null ? other.getDeputy() == null : this.getDeputy().equals(other.getDeputy()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getDetailedAddress() == null ? other.getDetailedAddress() == null : this.getDetailedAddress().equals(other.getDetailedAddress()))
            && (this.getProperty() == null ? other.getProperty() == null : this.getProperty().equals(other.getProperty()))
            && (this.getEnterpriseType() == null ? other.getEnterpriseType() == null : this.getEnterpriseType().equals(other.getEnterpriseType()))
            && (this.getTrade() == null ? other.getTrade() == null : this.getTrade().equals(other.getTrade()))
            && (this.getEnterprisePhone() == null ? other.getEnterprisePhone() == null : this.getEnterprisePhone().equals(other.getEnterprisePhone()))
            && (this.getEnterpriseImg() == null ? other.getEnterpriseImg() == null : this.getEnterpriseImg().equals(other.getEnterpriseImg()))
            && (this.getEnterpriseLogo() == null ? other.getEnterpriseLogo() == null : this.getEnterpriseLogo().equals(other.getEnterpriseLogo()))
            && (this.getEnterpriseFax() == null ? other.getEnterpriseFax() == null : this.getEnterpriseFax().equals(other.getEnterpriseFax()))
            && (this.getEnterpriseSummary() == null ? other.getEnterpriseSummary() == null : this.getEnterpriseSummary().equals(other.getEnterpriseSummary()))
            && (this.getAuthState() == null ? other.getAuthState() == null : this.getAuthState().equals(other.getAuthState()))
            && (this.getAuth() == null ? other.getAuth() == null : this.getAuth().equals(other.getAuth()))
            && (this.getAuthTime() == null ? other.getAuthTime() == null : this.getAuthTime().equals(other.getAuthTime()))
            && (this.getAuthRemark() == null ? other.getAuthRemark() == null : this.getAuthRemark().equals(other.getAuthRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getEnterpriseName() == null) ? 0 : getEnterpriseName().hashCode());
        result = prime * result + ((getDeputy() == null) ? 0 : getDeputy().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getDetailedAddress() == null) ? 0 : getDetailedAddress().hashCode());
        result = prime * result + ((getProperty() == null) ? 0 : getProperty().hashCode());
        result = prime * result + ((getEnterpriseType() == null) ? 0 : getEnterpriseType().hashCode());
        result = prime * result + ((getTrade() == null) ? 0 : getTrade().hashCode());
        result = prime * result + ((getEnterprisePhone() == null) ? 0 : getEnterprisePhone().hashCode());
        result = prime * result + ((getEnterpriseImg() == null) ? 0 : getEnterpriseImg().hashCode());
        result = prime * result + ((getEnterpriseLogo() == null) ? 0 : getEnterpriseLogo().hashCode());
        result = prime * result + ((getEnterpriseFax() == null) ? 0 : getEnterpriseFax().hashCode());
        result = prime * result + ((getEnterpriseSummary() == null) ? 0 : getEnterpriseSummary().hashCode());
        result = prime * result + ((getAuthState() == null) ? 0 : getAuthState().hashCode());
        result = prime * result + ((getAuth() == null) ? 0 : getAuth().hashCode());
        result = prime * result + ((getAuthTime() == null) ? 0 : getAuthTime().hashCode());
        result = prime * result + ((getAuthRemark() == null) ? 0 : getAuthRemark().hashCode());
        return result;
    }
}