package com.glacier.frame.entity.storehouse;

import java.util.Date;

public class StorehouseReturnApplications {
    private String returnId;

    private String returnTitle;

    private String belaidupId;

    private String memberId;

    private String status;

    private String remark;

    private String auditStatus;

    private String auditor;

    private String auditOpinion;

    private Date auditDate;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getReturnTitle() {
        return returnTitle;
    }

    public void setReturnTitle(String returnTitle) {
        this.returnTitle = returnTitle;
    }

    public String getBelaidupId() {
        return belaidupId;
    }

    public void setBelaidupId(String belaidupId) {
        this.belaidupId = belaidupId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
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
        StorehouseReturnApplications other = (StorehouseReturnApplications) that;
        return (this.getReturnId() == null ? other.getReturnId() == null : this.getReturnId().equals(other.getReturnId()))
            && (this.getReturnTitle() == null ? other.getReturnTitle() == null : this.getReturnTitle().equals(other.getReturnTitle()))
            && (this.getBelaidupId() == null ? other.getBelaidupId() == null : this.getBelaidupId().equals(other.getBelaidupId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAuditStatus() == null ? other.getAuditStatus() == null : this.getAuditStatus().equals(other.getAuditStatus()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditOpinion() == null ? other.getAuditOpinion() == null : this.getAuditOpinion().equals(other.getAuditOpinion()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReturnId() == null) ? 0 : getReturnId().hashCode());
        result = prime * result + ((getReturnTitle() == null) ? 0 : getReturnTitle().hashCode());
        result = prime * result + ((getBelaidupId() == null) ? 0 : getBelaidupId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAuditStatus() == null) ? 0 : getAuditStatus().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditOpinion() == null) ? 0 : getAuditOpinion().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}