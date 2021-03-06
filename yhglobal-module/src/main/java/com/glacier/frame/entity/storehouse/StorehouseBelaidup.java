package com.glacier.frame.entity.storehouse;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class StorehouseBelaidup {
    private String belaidupId;

    private String belaidupProdName;

    private String memberId;

    private BigDecimal belaidupUnitprice;

    private String goodstypeId;

    private String yesOrNo;

    private Float belaidupWeight;

    private Float belaidupBulk;

    private BigDecimal repertoryPrice;

    private BigDecimal stockPrice;

    private BigDecimal packPrice;

    private BigDecimal freightPrice;

    private String belaidupInitiatin;

    private String belaidupTerminu;

    private String replenishment;

    private String orderConsignee;

    private String orderPhone;

    private String orderAddress;

    private String belaidupStatus;

    private String sortingStauts;

    private String stauts;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date belaidupReturnTime;

    private BigDecimal belaidupReturnPoundage;

    private String belaidupBarCode;

    private String routerId;

    private String storehouseId;

    private String consignor;

    private String sendPhone;

    private String sendAddress;

    private String sendSite;

    private String orderSite;

    private Integer number;

    private String modeOfPayment;

    private BigDecimal premium;

    private BigDecimal floorPrice;

    private Float shorteslength;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;
    
    /**
     * 自定义字段
     */
    private String createrDisplay;
    
    private String updaterDisplay;
    
    private String shipperMemberDisplay;
    
    private String goodsTypeDisplay;
    
    private String storageDisplay;
    
    private String packageDisplay;
    
    private String packageCode;
     
    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date updateTime;
     
    //运输费
    private Float transportationCost;
    
    //保险费
    private Float insuranceCost;
    
    //费用合计
    private Float totalCost;
     
    
    public Float getTransportationCost() {
		return transportationCost;
	}

	public void setTransportationCost(Float transportationCost) {
		this.transportationCost = transportationCost;
	}

	public Float getInsuranceCost() {
		return insuranceCost;
	}

	public void setInsuranceCost(Float insuranceCost) {
		this.insuranceCost = insuranceCost;
	}

	public Float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Float totalCost) {
		this.totalCost = totalCost;
	}

	//临时字段，存放改物品订单的增值服务
    private StorehouseAddedService addedService; 

    public StorehouseAddedService getAddedService() {
		return addedService;
	}

	public void setAddedService(StorehouseAddedService addedService) {
		this.addedService = addedService;
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

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getBelaidupUnitprice() {
        return belaidupUnitprice;
    }

    public void setBelaidupUnitprice(BigDecimal belaidupUnitprice) {
        this.belaidupUnitprice = belaidupUnitprice;
    }

    public String getGoodstypeId() {
        return goodstypeId;
    }

    public void setGoodstypeId(String goodstypeId) {
        this.goodstypeId = goodstypeId;
    }

    public String getYesOrNo() {
        return yesOrNo;
    }

    public void setYesOrNo(String yesOrNo) {
        this.yesOrNo = yesOrNo;
    }

    public Float getBelaidupWeight() {
        return belaidupWeight;
    }

    public void setBelaidupWeight(Float belaidupWeight) {
        this.belaidupWeight = belaidupWeight;
    }

    public Float getBelaidupBulk() {
        return belaidupBulk;
    }

    public void setBelaidupBulk(Float belaidupBulk) {
        this.belaidupBulk = belaidupBulk;
    }

    public BigDecimal getRepertoryPrice() {
        return repertoryPrice;
    }

    public void setRepertoryPrice(BigDecimal repertoryPrice) {
        this.repertoryPrice = repertoryPrice;
    }

    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    public BigDecimal getPackPrice() {
        return packPrice;
    }

    public void setPackPrice(BigDecimal packPrice) {
        this.packPrice = packPrice;
    }

    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    public String getBelaidupInitiatin() {
        return belaidupInitiatin;
    }

    public void setBelaidupInitiatin(String belaidupInitiatin) {
        this.belaidupInitiatin = belaidupInitiatin;
    }

    public String getBelaidupTerminu() {
        return belaidupTerminu;
    }

    public void setBelaidupTerminu(String belaidupTerminu) {
        this.belaidupTerminu = belaidupTerminu;
    }

    public String getReplenishment() {
        return replenishment;
    }

    public void setReplenishment(String replenishment) {
        this.replenishment = replenishment;
    }

    public String getOrderConsignee() {
        return orderConsignee;
    }

    public void setOrderConsignee(String orderConsignee) {
        this.orderConsignee = orderConsignee;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getBelaidupStatus() {
        return belaidupStatus;
    }

    public void setBelaidupStatus(String belaidupStatus) {
        this.belaidupStatus = belaidupStatus;
    }

    public String getSortingStauts() {
        return sortingStauts;
    }

    public void setSortingStauts(String sortingStauts) {
        this.sortingStauts = sortingStauts;
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts;
    }

    public Date getBelaidupReturnTime() {
        return belaidupReturnTime;
    }

    public void setBelaidupReturnTime(Date belaidupReturnTime) {
        this.belaidupReturnTime = belaidupReturnTime;
    }

    public BigDecimal getBelaidupReturnPoundage() {
        return belaidupReturnPoundage;
    }

    public void setBelaidupReturnPoundage(BigDecimal belaidupReturnPoundage) {
        this.belaidupReturnPoundage = belaidupReturnPoundage;
    }

    public String getBelaidupBarCode() {
        return belaidupBarCode;
    }

    public void setBelaidupBarCode(String belaidupBarCode) {
        this.belaidupBarCode = belaidupBarCode;
    }

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public String getStorehouseId() {
        return storehouseId;
    }

    public void setStorehouseId(String storehouseId) {
        this.storehouseId = storehouseId;
    }

    public String getConsignor() {
        return consignor;
    }

    public void setConsignor(String consignor) {
        this.consignor = consignor;
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public String getSendSite() {
        return sendSite;
    }

    public void setSendSite(String sendSite) {
        this.sendSite = sendSite;
    }

    public String getOrderSite() {
        return orderSite;
    }

    public void setOrderSite(String orderSite) {
        this.orderSite = orderSite;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(BigDecimal floorPrice) {
        this.floorPrice = floorPrice;
    }

    public Float getShorteslength() {
        return shorteslength;
    }

    public void setShorteslength(Float shorteslength) {
        this.shorteslength = shorteslength;
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

	public String getStorageDisplay() {
		return storageDisplay;
	}

	public void setStorageDisplay(String storageDisplay) {
		this.storageDisplay = storageDisplay;
	}

	public String getPackageDisplay() {
		return packageDisplay;
	}

	public void setPackageDisplay(String packageDisplay) {
		this.packageDisplay = packageDisplay;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
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
        StorehouseBelaidup other = (StorehouseBelaidup) that;
        return (this.getBelaidupId() == null ? other.getBelaidupId() == null : this.getBelaidupId().equals(other.getBelaidupId()))
            && (this.getBelaidupProdName() == null ? other.getBelaidupProdName() == null : this.getBelaidupProdName().equals(other.getBelaidupProdName()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getBelaidupUnitprice() == null ? other.getBelaidupUnitprice() == null : this.getBelaidupUnitprice().equals(other.getBelaidupUnitprice()))
            && (this.getGoodstypeId() == null ? other.getGoodstypeId() == null : this.getGoodstypeId().equals(other.getGoodstypeId()))
            && (this.getYesOrNo() == null ? other.getYesOrNo() == null : this.getYesOrNo().equals(other.getYesOrNo()))
            && (this.getBelaidupWeight() == null ? other.getBelaidupWeight() == null : this.getBelaidupWeight().equals(other.getBelaidupWeight()))
            && (this.getBelaidupBulk() == null ? other.getBelaidupBulk() == null : this.getBelaidupBulk().equals(other.getBelaidupBulk()))
            && (this.getRepertoryPrice() == null ? other.getRepertoryPrice() == null : this.getRepertoryPrice().equals(other.getRepertoryPrice()))
            && (this.getStockPrice() == null ? other.getStockPrice() == null : this.getStockPrice().equals(other.getStockPrice()))
            && (this.getPackPrice() == null ? other.getPackPrice() == null : this.getPackPrice().equals(other.getPackPrice()))
            && (this.getFreightPrice() == null ? other.getFreightPrice() == null : this.getFreightPrice().equals(other.getFreightPrice()))
            && (this.getBelaidupInitiatin() == null ? other.getBelaidupInitiatin() == null : this.getBelaidupInitiatin().equals(other.getBelaidupInitiatin()))
            && (this.getBelaidupTerminu() == null ? other.getBelaidupTerminu() == null : this.getBelaidupTerminu().equals(other.getBelaidupTerminu()))
            && (this.getReplenishment() == null ? other.getReplenishment() == null : this.getReplenishment().equals(other.getReplenishment()))
            && (this.getOrderConsignee() == null ? other.getOrderConsignee() == null : this.getOrderConsignee().equals(other.getOrderConsignee()))
            && (this.getOrderPhone() == null ? other.getOrderPhone() == null : this.getOrderPhone().equals(other.getOrderPhone()))
            && (this.getOrderAddress() == null ? other.getOrderAddress() == null : this.getOrderAddress().equals(other.getOrderAddress()))
            && (this.getBelaidupStatus() == null ? other.getBelaidupStatus() == null : this.getBelaidupStatus().equals(other.getBelaidupStatus()))
            && (this.getSortingStauts() == null ? other.getSortingStauts() == null : this.getSortingStauts().equals(other.getSortingStauts()))
            && (this.getStauts() == null ? other.getStauts() == null : this.getStauts().equals(other.getStauts()))
            && (this.getBelaidupReturnTime() == null ? other.getBelaidupReturnTime() == null : this.getBelaidupReturnTime().equals(other.getBelaidupReturnTime()))
            && (this.getBelaidupReturnPoundage() == null ? other.getBelaidupReturnPoundage() == null : this.getBelaidupReturnPoundage().equals(other.getBelaidupReturnPoundage()))
            && (this.getBelaidupBarCode() == null ? other.getBelaidupBarCode() == null : this.getBelaidupBarCode().equals(other.getBelaidupBarCode()))
            && (this.getRouterId() == null ? other.getRouterId() == null : this.getRouterId().equals(other.getRouterId()))
            && (this.getStorehouseId() == null ? other.getStorehouseId() == null : this.getStorehouseId().equals(other.getStorehouseId()))
            && (this.getConsignor() == null ? other.getConsignor() == null : this.getConsignor().equals(other.getConsignor()))
            && (this.getSendPhone() == null ? other.getSendPhone() == null : this.getSendPhone().equals(other.getSendPhone()))
            && (this.getSendAddress() == null ? other.getSendAddress() == null : this.getSendAddress().equals(other.getSendAddress()))
            && (this.getSendSite() == null ? other.getSendSite() == null : this.getSendSite().equals(other.getSendSite()))
            && (this.getOrderSite() == null ? other.getOrderSite() == null : this.getOrderSite().equals(other.getOrderSite()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getModeOfPayment() == null ? other.getModeOfPayment() == null : this.getModeOfPayment().equals(other.getModeOfPayment()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getFloorPrice() == null ? other.getFloorPrice() == null : this.getFloorPrice().equals(other.getFloorPrice()))
            && (this.getShorteslength() == null ? other.getShorteslength() == null : this.getShorteslength().equals(other.getShorteslength()))
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
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getBelaidupUnitprice() == null) ? 0 : getBelaidupUnitprice().hashCode());
        result = prime * result + ((getGoodstypeId() == null) ? 0 : getGoodstypeId().hashCode());
        result = prime * result + ((getYesOrNo() == null) ? 0 : getYesOrNo().hashCode());
        result = prime * result + ((getBelaidupWeight() == null) ? 0 : getBelaidupWeight().hashCode());
        result = prime * result + ((getBelaidupBulk() == null) ? 0 : getBelaidupBulk().hashCode());
        result = prime * result + ((getRepertoryPrice() == null) ? 0 : getRepertoryPrice().hashCode());
        result = prime * result + ((getStockPrice() == null) ? 0 : getStockPrice().hashCode());
        result = prime * result + ((getPackPrice() == null) ? 0 : getPackPrice().hashCode());
        result = prime * result + ((getFreightPrice() == null) ? 0 : getFreightPrice().hashCode());
        result = prime * result + ((getBelaidupInitiatin() == null) ? 0 : getBelaidupInitiatin().hashCode());
        result = prime * result + ((getBelaidupTerminu() == null) ? 0 : getBelaidupTerminu().hashCode());
        result = prime * result + ((getReplenishment() == null) ? 0 : getReplenishment().hashCode());
        result = prime * result + ((getOrderConsignee() == null) ? 0 : getOrderConsignee().hashCode());
        result = prime * result + ((getOrderPhone() == null) ? 0 : getOrderPhone().hashCode());
        result = prime * result + ((getOrderAddress() == null) ? 0 : getOrderAddress().hashCode());
        result = prime * result + ((getBelaidupStatus() == null) ? 0 : getBelaidupStatus().hashCode());
        result = prime * result + ((getSortingStauts() == null) ? 0 : getSortingStauts().hashCode());
        result = prime * result + ((getStauts() == null) ? 0 : getStauts().hashCode());
        result = prime * result + ((getBelaidupReturnTime() == null) ? 0 : getBelaidupReturnTime().hashCode());
        result = prime * result + ((getBelaidupReturnPoundage() == null) ? 0 : getBelaidupReturnPoundage().hashCode());
        result = prime * result + ((getBelaidupBarCode() == null) ? 0 : getBelaidupBarCode().hashCode());
        result = prime * result + ((getRouterId() == null) ? 0 : getRouterId().hashCode());
        result = prime * result + ((getStorehouseId() == null) ? 0 : getStorehouseId().hashCode());
        result = prime * result + ((getConsignor() == null) ? 0 : getConsignor().hashCode());
        result = prime * result + ((getSendPhone() == null) ? 0 : getSendPhone().hashCode());
        result = prime * result + ((getSendAddress() == null) ? 0 : getSendAddress().hashCode());
        result = prime * result + ((getSendSite() == null) ? 0 : getSendSite().hashCode());
        result = prime * result + ((getOrderSite() == null) ? 0 : getOrderSite().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getModeOfPayment() == null) ? 0 : getModeOfPayment().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getFloorPrice() == null) ? 0 : getFloorPrice().hashCode());
        result = prime * result + ((getShorteslength() == null) ? 0 : getShorteslength().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}