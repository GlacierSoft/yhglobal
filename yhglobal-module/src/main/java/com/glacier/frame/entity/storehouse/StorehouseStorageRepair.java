package com.glacier.frame.entity.storehouse;

import java.util.Date;

public class StorehouseStorageRepair {
    private String repairId;

    private String repairTitle;

    private String remark;

    private String storageId;

    private String repairStauts;

    private String repairGrade;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getRepairId() {
        return repairId;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId;
    }

    public String getRepairTitle() {
        return repairTitle;
    }

    public void setRepairTitle(String repairTitle) {
        this.repairTitle = repairTitle;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public String getRepairStauts() {
        return repairStauts;
    }

    public void setRepairStauts(String repairStauts) {
        this.repairStauts = repairStauts;
    }

    public String getRepairGrade() {
        return repairGrade;
    }

    public void setRepairGrade(String repairGrade) {
        this.repairGrade = repairGrade;
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
        StorehouseStorageRepair other = (StorehouseStorageRepair) that;
        return (this.getRepairId() == null ? other.getRepairId() == null : this.getRepairId().equals(other.getRepairId()))
            && (this.getRepairTitle() == null ? other.getRepairTitle() == null : this.getRepairTitle().equals(other.getRepairTitle()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStorageId() == null ? other.getStorageId() == null : this.getStorageId().equals(other.getStorageId()))
            && (this.getRepairStauts() == null ? other.getRepairStauts() == null : this.getRepairStauts().equals(other.getRepairStauts()))
            && (this.getRepairGrade() == null ? other.getRepairGrade() == null : this.getRepairGrade().equals(other.getRepairGrade()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRepairId() == null) ? 0 : getRepairId().hashCode());
        result = prime * result + ((getRepairTitle() == null) ? 0 : getRepairTitle().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStorageId() == null) ? 0 : getStorageId().hashCode());
        result = prime * result + ((getRepairStauts() == null) ? 0 : getRepairStauts().hashCode());
        result = prime * result + ((getRepairGrade() == null) ? 0 : getRepairGrade().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}