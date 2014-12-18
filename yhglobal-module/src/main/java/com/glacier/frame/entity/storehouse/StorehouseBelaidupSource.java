package com.glacier.frame.entity.storehouse;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class StorehouseBelaidupSource {
    private String belaidupId;

    private String belaidupProdName;

    private String belaidupTypeId;

    private Float belaidupVolume;

    private Float belaidupWeight;

    private String originationStation;

    private String originationAddress;

    private String memberId;

    private String belaidupUrgent;

    private String membermobile;

    private String endStation;

    private String endAddress;

    private String receiveMobile;

    private String receivcStyle;

    private String showStyle;

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
    
    private String createrDisplay;
    
    private String updaterDisplay;
    
    private String shipperMemberDisplay;
    
    private String goodsTypeDisplay;
    
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

	public String getShipperMemberDisplay() {
		return shipperMemberDisplay;
	}

	public void setShipperMemberDisplay(String shipperMemberDisplay) {
		this.shipperMemberDisplay = shipperMemberDisplay;
	}

	public String getGoodsTypeDisplay() {
		return goodsTypeDisplay;
	}

	public void setGoodsTypeDisplay(String goodsTypeDisplay) {
		this.goodsTypeDisplay = goodsTypeDisplay;
	}

	public String getBelaidupId() {
        return belaidupId;
    }

    public void setBelaidupId(String belaidupId) {
        this.belaidupId = belaidupId;
    }

    public String getBelaidupProdName() {
        return belaidupProdName;
    }

    public void setBelaidupProdName(String belaidupProdName) {
        this.belaidupProdName = belaidupProdName;
    }

    public String getBelaidupTypeId() {
        return belaidupTypeId;
    }

    public void setBelaidupTypeId(String belaidupTypeId) {
        this.belaidupTypeId = belaidupTypeId;
    }

    public Float getBelaidupVolume() {
        return belaidupVolume;
    }

    public void setBelaidupVolume(Float belaidupVolume) {
        this.belaidupVolume = belaidupVolume;
    }

    public Float getBelaidupWeight() {
        return belaidupWeight;
    }

    public void setBelaidupWeight(Float belaidupWeight) {
        this.belaidupWeight = belaidupWeight;
    }

    public String getOriginationStation() {
        return originationStation;
    }

    public void setOriginationStation(String originationStation) {
        this.originationStation = originationStation;
    }

    public String getOriginationAddress() {
        return originationAddress;
    }

    public void setOriginationAddress(String originationAddress) {
        this.originationAddress = originationAddress;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getBelaidupUrgent() {
        return belaidupUrgent;
    }

    public void setBelaidupUrgent(String belaidupUrgent) {
        this.belaidupUrgent = belaidupUrgent;
    }

    public String getMembermobile() {
        return membermobile;
    }

    public void setMembermobile(String membermobile) {
        this.membermobile = membermobile;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public String getReceiveMobile() {
        return receiveMobile;
    }

    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile;
    }

    public String getReceivcStyle() {
        return receivcStyle;
    }

    public void setReceivcStyle(String receivcStyle) {
        this.receivcStyle = receivcStyle;
    }

    public String getShowStyle() {
        return showStyle;
    }

    public void setShowStyle(String showStyle) {
        this.showStyle = showStyle;
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
        StorehouseBelaidupSource other = (StorehouseBelaidupSource) that;
        return (this.getBelaidupId() == null ? other.getBelaidupId() == null : this.getBelaidupId().equals(other.getBelaidupId()))
            && (this.getBelaidupProdName() == null ? other.getBelaidupProdName() == null : this.getBelaidupProdName().equals(other.getBelaidupProdName()))
            && (this.getBelaidupTypeId() == null ? other.getBelaidupTypeId() == null : this.getBelaidupTypeId().equals(other.getBelaidupTypeId()))
            && (this.getBelaidupVolume() == null ? other.getBelaidupVolume() == null : this.getBelaidupVolume().equals(other.getBelaidupVolume()))
            && (this.getBelaidupWeight() == null ? other.getBelaidupWeight() == null : this.getBelaidupWeight().equals(other.getBelaidupWeight()))
            && (this.getOriginationStation() == null ? other.getOriginationStation() == null : this.getOriginationStation().equals(other.getOriginationStation()))
            && (this.getOriginationAddress() == null ? other.getOriginationAddress() == null : this.getOriginationAddress().equals(other.getOriginationAddress()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getBelaidupUrgent() == null ? other.getBelaidupUrgent() == null : this.getBelaidupUrgent().equals(other.getBelaidupUrgent()))
            && (this.getMembermobile() == null ? other.getMembermobile() == null : this.getMembermobile().equals(other.getMembermobile()))
            && (this.getEndStation() == null ? other.getEndStation() == null : this.getEndStation().equals(other.getEndStation()))
            && (this.getEndAddress() == null ? other.getEndAddress() == null : this.getEndAddress().equals(other.getEndAddress()))
            && (this.getReceiveMobile() == null ? other.getReceiveMobile() == null : this.getReceiveMobile().equals(other.getReceiveMobile()))
            && (this.getReceivcStyle() == null ? other.getReceivcStyle() == null : this.getReceivcStyle().equals(other.getReceivcStyle()))
            && (this.getShowStyle() == null ? other.getShowStyle() == null : this.getShowStyle().equals(other.getShowStyle()))
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
        result = prime * result + ((getBelaidupId() == null) ? 0 : getBelaidupId().hashCode());
        result = prime * result + ((getBelaidupProdName() == null) ? 0 : getBelaidupProdName().hashCode());
        result = prime * result + ((getBelaidupTypeId() == null) ? 0 : getBelaidupTypeId().hashCode());
        result = prime * result + ((getBelaidupVolume() == null) ? 0 : getBelaidupVolume().hashCode());
        result = prime * result + ((getBelaidupWeight() == null) ? 0 : getBelaidupWeight().hashCode());
        result = prime * result + ((getOriginationStation() == null) ? 0 : getOriginationStation().hashCode());
        result = prime * result + ((getOriginationAddress() == null) ? 0 : getOriginationAddress().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getBelaidupUrgent() == null) ? 0 : getBelaidupUrgent().hashCode());
        result = prime * result + ((getMembermobile() == null) ? 0 : getMembermobile().hashCode());
        result = prime * result + ((getEndStation() == null) ? 0 : getEndStation().hashCode());
        result = prime * result + ((getEndAddress() == null) ? 0 : getEndAddress().hashCode());
        result = prime * result + ((getReceiveMobile() == null) ? 0 : getReceiveMobile().hashCode());
        result = prime * result + ((getReceivcStyle() == null) ? 0 : getReceivcStyle().hashCode());
        result = prime * result + ((getShowStyle() == null) ? 0 : getShowStyle().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}