package com.glacier.frame.entity.storehouse;

import java.util.Date;

public class StorehousePackCode {
    private String packCodeId;

    private String packagetypeId;

    private String belaidupId;

    private String packBarCode;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getPackCodeId() {
        return packCodeId;
    }

    public void setPackCodeId(String packCodeId) {
        this.packCodeId = packCodeId;
    }

    public String getPackagetypeId() {
        return packagetypeId;
    }

    public void setPackagetypeId(String packagetypeId) {
        this.packagetypeId = packagetypeId;
    }

    public String getBelaidupId() {
        return belaidupId;
    }

    public void setBelaidupId(String belaidupId) {
        this.belaidupId = belaidupId;
    }

    public String getPackBarCode() {
        return packBarCode;
    }

    public void setPackBarCode(String packBarCode) {
        this.packBarCode = packBarCode;
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
        StorehousePackCode other = (StorehousePackCode) that;
        return (this.getPackCodeId() == null ? other.getPackCodeId() == null : this.getPackCodeId().equals(other.getPackCodeId()))
            && (this.getPackagetypeId() == null ? other.getPackagetypeId() == null : this.getPackagetypeId().equals(other.getPackagetypeId()))
            && (this.getBelaidupId() == null ? other.getBelaidupId() == null : this.getBelaidupId().equals(other.getBelaidupId()))
            && (this.getPackBarCode() == null ? other.getPackBarCode() == null : this.getPackBarCode().equals(other.getPackBarCode()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPackCodeId() == null) ? 0 : getPackCodeId().hashCode());
        result = prime * result + ((getPackagetypeId() == null) ? 0 : getPackagetypeId().hashCode());
        result = prime * result + ((getBelaidupId() == null) ? 0 : getBelaidupId().hashCode());
        result = prime * result + ((getPackBarCode() == null) ? 0 : getPackBarCode().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}