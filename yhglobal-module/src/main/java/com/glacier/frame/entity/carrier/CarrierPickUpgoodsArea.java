package com.glacier.frame.entity.carrier;

import java.math.BigDecimal;

public class CarrierPickUpgoodsArea {
    private String pickUpGoodsAreaId;

    private String routerId;

    private String deliverName;

    private BigDecimal price;

    private String address;

    private String telephone;
    
    private String latitude;

    private String longitude;

    private String shopHours;

    private String serviceContent;

    private String remark;

    public String getPickUpGoodsAreaId() {
        return pickUpGoodsAreaId;
    }

    public void setPickUpGoodsAreaId(String pickUpGoodsAreaId) {
        this.pickUpGoodsAreaId = pickUpGoodsAreaId;
    }

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public String getDeliverName() {
        return deliverName;
    }

    public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getShopHours() {
		return shopHours;
	}

	public void setShopHours(String shopHours) {
		this.shopHours = shopHours;
	}

	public String getServiceContent() {
		return serviceContent;
	}

	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	public void setDeliverName(String deliverName) {
        this.deliverName = deliverName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        CarrierPickUpgoodsArea other = (CarrierPickUpgoodsArea) that;
        return (this.getPickUpGoodsAreaId() == null ? other.getPickUpGoodsAreaId() == null : this.getPickUpGoodsAreaId().equals(other.getPickUpGoodsAreaId()))
            && (this.getRouterId() == null ? other.getRouterId() == null : this.getRouterId().equals(other.getRouterId()))
            && (this.getDeliverName() == null ? other.getDeliverName() == null : this.getDeliverName().equals(other.getDeliverName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPickUpGoodsAreaId() == null) ? 0 : getPickUpGoodsAreaId().hashCode());
        result = prime * result + ((getRouterId() == null) ? 0 : getRouterId().hashCode());
        result = prime * result + ((getDeliverName() == null) ? 0 : getDeliverName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}