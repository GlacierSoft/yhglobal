package com.glacier.frame.entity.storehouse;

import java.math.BigDecimal;

public class StorehouseAddedService {
    private String addedServiceId;

    private String belaidupId;

    private String doorDelivery;

    private String message;

    private BigDecimal fuelBills;

    private String deliveryVisit;

    private String signReceipt;

    private String signReceiptType;

    private BigDecimal signReceiptCost;

    private BigDecimal flatCost;

    private String urgentDelivery;

    private String insurance;

    private BigDecimal insuranceCost;

    private BigDecimal transportationCost;

    private BigDecimal goodsCost;

    private BigDecimal totalCost;

    public String getAddedServiceId() {
        return addedServiceId;
    }

    public void setAddedServiceId(String addedServiceId) {
        this.addedServiceId = addedServiceId;
    }

    public String getBelaidupId() {
        return belaidupId;
    }

    public void setBelaidupId(String belaidupId) {
        this.belaidupId = belaidupId;
    }

    public String getDoorDelivery() {
        return doorDelivery;
    }

    public void setDoorDelivery(String doorDelivery) {
        this.doorDelivery = doorDelivery;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getFuelBills() {
        return fuelBills;
    }

    public void setFuelBills(BigDecimal fuelBills) {
        this.fuelBills = fuelBills;
    }

    public String getDeliveryVisit() {
        return deliveryVisit;
    }

    public void setDeliveryVisit(String deliveryVisit) {
        this.deliveryVisit = deliveryVisit;
    }

    public String getSignReceipt() {
        return signReceipt;
    }

    public void setSignReceipt(String signReceipt) {
        this.signReceipt = signReceipt;
    }

    public String getSignReceiptType() {
        return signReceiptType;
    }

    public void setSignReceiptType(String signReceiptType) {
        this.signReceiptType = signReceiptType;
    }

    public BigDecimal getSignReceiptCost() {
        return signReceiptCost;
    }

    public void setSignReceiptCost(BigDecimal signReceiptCost) {
        this.signReceiptCost = signReceiptCost;
    }

    public BigDecimal getFlatCost() {
        return flatCost;
    }

    public void setFlatCost(BigDecimal flatCost) {
        this.flatCost = flatCost;
    }

    public String getUrgentDelivery() {
        return urgentDelivery;
    }

    public void setUrgentDelivery(String urgentDelivery) {
        this.urgentDelivery = urgentDelivery;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(BigDecimal insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public BigDecimal getTransportationCost() {
        return transportationCost;
    }

    public void setTransportationCost(BigDecimal transportationCost) {
        this.transportationCost = transportationCost;
    }

    public BigDecimal getGoodsCost() {
        return goodsCost;
    }

    public void setGoodsCost(BigDecimal goodsCost) {
        this.goodsCost = goodsCost;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
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
        StorehouseAddedService other = (StorehouseAddedService) that;
        return (this.getAddedServiceId() == null ? other.getAddedServiceId() == null : this.getAddedServiceId().equals(other.getAddedServiceId()))
            && (this.getBelaidupId() == null ? other.getBelaidupId() == null : this.getBelaidupId().equals(other.getBelaidupId()))
            && (this.getDoorDelivery() == null ? other.getDoorDelivery() == null : this.getDoorDelivery().equals(other.getDoorDelivery()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getFuelBills() == null ? other.getFuelBills() == null : this.getFuelBills().equals(other.getFuelBills()))
            && (this.getDeliveryVisit() == null ? other.getDeliveryVisit() == null : this.getDeliveryVisit().equals(other.getDeliveryVisit()))
            && (this.getSignReceipt() == null ? other.getSignReceipt() == null : this.getSignReceipt().equals(other.getSignReceipt()))
            && (this.getSignReceiptType() == null ? other.getSignReceiptType() == null : this.getSignReceiptType().equals(other.getSignReceiptType()))
            && (this.getSignReceiptCost() == null ? other.getSignReceiptCost() == null : this.getSignReceiptCost().equals(other.getSignReceiptCost()))
            && (this.getFlatCost() == null ? other.getFlatCost() == null : this.getFlatCost().equals(other.getFlatCost()))
            && (this.getUrgentDelivery() == null ? other.getUrgentDelivery() == null : this.getUrgentDelivery().equals(other.getUrgentDelivery()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getInsuranceCost() == null ? other.getInsuranceCost() == null : this.getInsuranceCost().equals(other.getInsuranceCost()))
            && (this.getTransportationCost() == null ? other.getTransportationCost() == null : this.getTransportationCost().equals(other.getTransportationCost()))
            && (this.getGoodsCost() == null ? other.getGoodsCost() == null : this.getGoodsCost().equals(other.getGoodsCost()))
            && (this.getTotalCost() == null ? other.getTotalCost() == null : this.getTotalCost().equals(other.getTotalCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddedServiceId() == null) ? 0 : getAddedServiceId().hashCode());
        result = prime * result + ((getBelaidupId() == null) ? 0 : getBelaidupId().hashCode());
        result = prime * result + ((getDoorDelivery() == null) ? 0 : getDoorDelivery().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getFuelBills() == null) ? 0 : getFuelBills().hashCode());
        result = prime * result + ((getDeliveryVisit() == null) ? 0 : getDeliveryVisit().hashCode());
        result = prime * result + ((getSignReceipt() == null) ? 0 : getSignReceipt().hashCode());
        result = prime * result + ((getSignReceiptType() == null) ? 0 : getSignReceiptType().hashCode());
        result = prime * result + ((getSignReceiptCost() == null) ? 0 : getSignReceiptCost().hashCode());
        result = prime * result + ((getFlatCost() == null) ? 0 : getFlatCost().hashCode());
        result = prime * result + ((getUrgentDelivery() == null) ? 0 : getUrgentDelivery().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getInsuranceCost() == null) ? 0 : getInsuranceCost().hashCode());
        result = prime * result + ((getTransportationCost() == null) ? 0 : getTransportationCost().hashCode());
        result = prime * result + ((getGoodsCost() == null) ? 0 : getGoodsCost().hashCode());
        result = prime * result + ((getTotalCost() == null) ? 0 : getTotalCost().hashCode());
        return result;
    }
}