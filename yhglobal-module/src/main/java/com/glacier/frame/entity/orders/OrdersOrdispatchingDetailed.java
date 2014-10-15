package com.glacier.frame.entity.orders;

public class OrdersOrdispatchingDetailed {
    private String ordisdetailedId;

    private String orderId;

    private String dispatchingId;

    public String getOrdisdetailedId() {
        return ordisdetailedId;
    }

    public void setOrdisdetailedId(String ordisdetailedId) {
        this.ordisdetailedId = ordisdetailedId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDispatchingId() {
        return dispatchingId;
    }

    public void setDispatchingId(String dispatchingId) {
        this.dispatchingId = dispatchingId;
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
        OrdersOrdispatchingDetailed other = (OrdersOrdispatchingDetailed) that;
        return (this.getOrdisdetailedId() == null ? other.getOrdisdetailedId() == null : this.getOrdisdetailedId().equals(other.getOrdisdetailedId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getDispatchingId() == null ? other.getDispatchingId() == null : this.getDispatchingId().equals(other.getDispatchingId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdisdetailedId() == null) ? 0 : getOrdisdetailedId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getDispatchingId() == null) ? 0 : getDispatchingId().hashCode());
        return result;
    }
}