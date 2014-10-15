package com.glacier.frame.entity.storehouse;

import java.util.Date;

public class StorehouseStorage {
    private String storageId;

    private String storagetypeId;

    private String storageName;

    private String status;

    private String storageTypeId;

    private String yesOrNo;

    private Date buildDate;

    private Integer mustOverhaulNum;

    private Integer alreadyOverhaulNum;

    private Date nextOverhaulDate;

    private Float weightUpperBound;

    private Float bulkUpperBound;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public String getStoragetypeId() {
        return storagetypeId;
    }

    public void setStoragetypeId(String storagetypeId) {
        this.storagetypeId = storagetypeId;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStorageTypeId() {
        return storageTypeId;
    }

    public void setStorageTypeId(String storageTypeId) {
        this.storageTypeId = storageTypeId;
    }

    public String getYesOrNo() {
        return yesOrNo;
    }

    public void setYesOrNo(String yesOrNo) {
        this.yesOrNo = yesOrNo;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public Integer getMustOverhaulNum() {
        return mustOverhaulNum;
    }

    public void setMustOverhaulNum(Integer mustOverhaulNum) {
        this.mustOverhaulNum = mustOverhaulNum;
    }

    public Integer getAlreadyOverhaulNum() {
        return alreadyOverhaulNum;
    }

    public void setAlreadyOverhaulNum(Integer alreadyOverhaulNum) {
        this.alreadyOverhaulNum = alreadyOverhaulNum;
    }

    public Date getNextOverhaulDate() {
        return nextOverhaulDate;
    }

    public void setNextOverhaulDate(Date nextOverhaulDate) {
        this.nextOverhaulDate = nextOverhaulDate;
    }

    public Float getWeightUpperBound() {
        return weightUpperBound;
    }

    public void setWeightUpperBound(Float weightUpperBound) {
        this.weightUpperBound = weightUpperBound;
    }

    public Float getBulkUpperBound() {
        return bulkUpperBound;
    }

    public void setBulkUpperBound(Float bulkUpperBound) {
        this.bulkUpperBound = bulkUpperBound;
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
        StorehouseStorage other = (StorehouseStorage) that;
        return (this.getStorageId() == null ? other.getStorageId() == null : this.getStorageId().equals(other.getStorageId()))
            && (this.getStoragetypeId() == null ? other.getStoragetypeId() == null : this.getStoragetypeId().equals(other.getStoragetypeId()))
            && (this.getStorageName() == null ? other.getStorageName() == null : this.getStorageName().equals(other.getStorageName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStorageTypeId() == null ? other.getStorageTypeId() == null : this.getStorageTypeId().equals(other.getStorageTypeId()))
            && (this.getYesOrNo() == null ? other.getYesOrNo() == null : this.getYesOrNo().equals(other.getYesOrNo()))
            && (this.getBuildDate() == null ? other.getBuildDate() == null : this.getBuildDate().equals(other.getBuildDate()))
            && (this.getMustOverhaulNum() == null ? other.getMustOverhaulNum() == null : this.getMustOverhaulNum().equals(other.getMustOverhaulNum()))
            && (this.getAlreadyOverhaulNum() == null ? other.getAlreadyOverhaulNum() == null : this.getAlreadyOverhaulNum().equals(other.getAlreadyOverhaulNum()))
            && (this.getNextOverhaulDate() == null ? other.getNextOverhaulDate() == null : this.getNextOverhaulDate().equals(other.getNextOverhaulDate()))
            && (this.getWeightUpperBound() == null ? other.getWeightUpperBound() == null : this.getWeightUpperBound().equals(other.getWeightUpperBound()))
            && (this.getBulkUpperBound() == null ? other.getBulkUpperBound() == null : this.getBulkUpperBound().equals(other.getBulkUpperBound()))
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
        result = prime * result + ((getStorageId() == null) ? 0 : getStorageId().hashCode());
        result = prime * result + ((getStoragetypeId() == null) ? 0 : getStoragetypeId().hashCode());
        result = prime * result + ((getStorageName() == null) ? 0 : getStorageName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStorageTypeId() == null) ? 0 : getStorageTypeId().hashCode());
        result = prime * result + ((getYesOrNo() == null) ? 0 : getYesOrNo().hashCode());
        result = prime * result + ((getBuildDate() == null) ? 0 : getBuildDate().hashCode());
        result = prime * result + ((getMustOverhaulNum() == null) ? 0 : getMustOverhaulNum().hashCode());
        result = prime * result + ((getAlreadyOverhaulNum() == null) ? 0 : getAlreadyOverhaulNum().hashCode());
        result = prime * result + ((getNextOverhaulDate() == null) ? 0 : getNextOverhaulDate().hashCode());
        result = prime * result + ((getWeightUpperBound() == null) ? 0 : getWeightUpperBound().hashCode());
        result = prime * result + ((getBulkUpperBound() == null) ? 0 : getBulkUpperBound().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}