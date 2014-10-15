package com.glacier.frame.entity.carrier;

public class CarrierAmongRoute {
    private String amongId;

    private String routerId;

    private String carrierMemberId;

    public String getAmongId() {
        return amongId;
    }

    public void setAmongId(String amongId) {
        this.amongId = amongId;
    }

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public String getCarrierMemberId() {
        return carrierMemberId;
    }

    public void setCarrierMemberId(String carrierMemberId) {
        this.carrierMemberId = carrierMemberId;
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
        CarrierAmongRoute other = (CarrierAmongRoute) that;
        return (this.getAmongId() == null ? other.getAmongId() == null : this.getAmongId().equals(other.getAmongId()))
            && (this.getRouterId() == null ? other.getRouterId() == null : this.getRouterId().equals(other.getRouterId()))
            && (this.getCarrierMemberId() == null ? other.getCarrierMemberId() == null : this.getCarrierMemberId().equals(other.getCarrierMemberId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAmongId() == null) ? 0 : getAmongId().hashCode());
        result = prime * result + ((getRouterId() == null) ? 0 : getRouterId().hashCode());
        result = prime * result + ((getCarrierMemberId() == null) ? 0 : getCarrierMemberId().hashCode());
        return result;
    }
}