package com.glacier.frame.entity.storehouse;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class StorehouseStorageGoodsrun {
    private String goodsrunId;

    private String belaidupId;

    private Integer goodsrunNum;

    private String goodsrunStatus;

    private String status;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date goodsrunDate;

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
    
    private String updaterDisplay;
    
    private String createrDisplay;
    
    private String belaidupDisplay;
    
    public String getUpdaterDisplay() {
		return updaterDisplay;
	}

	public void setUpdaterDisplay(String updaterDisplay) {
		this.updaterDisplay = updaterDisplay;
	}

	public String getCreaterDisplay() {
		return createrDisplay;
	}

	public void setCreaterDisplay(String createrDisplay) {
		this.createrDisplay = createrDisplay;
	}

	public String getBelaidupDisplay() {
		return belaidupDisplay;
	}

	public void setBelaidupDisplay(String belaidupDisplay) {
		this.belaidupDisplay = belaidupDisplay;
	}

public String getGoodsrunId() {
        return goodsrunId;
    }

    public void setGoodsrunId(String goodsrunId) {
        this.goodsrunId = goodsrunId;
    }

    public String getBelaidupId() {
        return belaidupId;
    }

    public void setBelaidupId(String belaidupId) {
        this.belaidupId = belaidupId;
    }

    public Integer getGoodsrunNum() {
        return goodsrunNum;
    }

    public void setGoodsrunNum(Integer goodsrunNum) {
        this.goodsrunNum = goodsrunNum;
    }

    public String getGoodsrunStatus() {
        return goodsrunStatus;
    }

    public void setGoodsrunStatus(String goodsrunStatus) {
        this.goodsrunStatus = goodsrunStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getGoodsrunDate() {
        return goodsrunDate;
    }

    public void setGoodsrunDate(Date goodsrunDate) {
        this.goodsrunDate = goodsrunDate;
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
        StorehouseStorageGoodsrun other = (StorehouseStorageGoodsrun) that;
        return (this.getGoodsrunId() == null ? other.getGoodsrunId() == null : this.getGoodsrunId().equals(other.getGoodsrunId()))
            && (this.getBelaidupId() == null ? other.getBelaidupId() == null : this.getBelaidupId().equals(other.getBelaidupId()))
            && (this.getGoodsrunNum() == null ? other.getGoodsrunNum() == null : this.getGoodsrunNum().equals(other.getGoodsrunNum()))
            && (this.getGoodsrunStatus() == null ? other.getGoodsrunStatus() == null : this.getGoodsrunStatus().equals(other.getGoodsrunStatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGoodsrunDate() == null ? other.getGoodsrunDate() == null : this.getGoodsrunDate().equals(other.getGoodsrunDate()))
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
        result = prime * result + ((getGoodsrunId() == null) ? 0 : getGoodsrunId().hashCode());
        result = prime * result + ((getBelaidupId() == null) ? 0 : getBelaidupId().hashCode());
        result = prime * result + ((getGoodsrunNum() == null) ? 0 : getGoodsrunNum().hashCode());
        result = prime * result + ((getGoodsrunStatus() == null) ? 0 : getGoodsrunStatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGoodsrunDate() == null) ? 0 : getGoodsrunDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}