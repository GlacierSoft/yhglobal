package com.glacier.frame.entity.orders;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class OrdersDispatching {
    private String dispatchingId;

    private String dispatchingCode;

    private String carrierId;

    private BigDecimal dispatchingGoodsDeposit;

    private String dispatchingStatus;

    private String driverId;

    private String dispatchingSignfor;

    private String carId;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date dispatchTime;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date arriveTime;

    private String status;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    
    
    
    /**
     *自定义拓展阶段 
     */
    
    private String carrierDisplay;
    
    private String driverDisplay;
    
    private String createrDisplay;
    
    private String updaterDisplay;
    
    private String carDisplay;
    
    public String getCarDisplay() {
		return carDisplay;
	}

	public void setCarDisplay(String carDisplay) {
		this.carDisplay = carDisplay;
	}

	public String getCarrierDisplay() {
		return carrierDisplay;
	}

	public void setCarrierDisplay(String carrierDisplay) {
		this.carrierDisplay = carrierDisplay;
	}

	public String getDriverDisplay() {
		return driverDisplay;
	}

	public void setDriverDisplay(String driverDisplay) {
		this.driverDisplay = driverDisplay;
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

	public String getDispatchingId() {
        return dispatchingId;
    }

    public void setDispatchingId(String dispatchingId) {
        this.dispatchingId = dispatchingId;
    }

    public String getDispatchingCode() {
        return dispatchingCode;
    }

    public void setDispatchingCode(String dispatchingCode) {
        this.dispatchingCode = dispatchingCode;
    }

    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    public BigDecimal getDispatchingGoodsDeposit() {
        return dispatchingGoodsDeposit;
    }

    public void setDispatchingGoodsDeposit(BigDecimal dispatchingGoodsDeposit) {
        this.dispatchingGoodsDeposit = dispatchingGoodsDeposit;
    }

    public String getDispatchingStatus() {
        return dispatchingStatus;
    }

    public void setDispatchingStatus(String dispatchingStatus) {
        this.dispatchingStatus = dispatchingStatus;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDispatchingSignfor() {
        return dispatchingSignfor;
    }

    public void setDispatchingSignfor(String dispatchingSignfor) {
        this.dispatchingSignfor = dispatchingSignfor;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        OrdersDispatching other = (OrdersDispatching) that;
        return (this.getDispatchingId() == null ? other.getDispatchingId() == null : this.getDispatchingId().equals(other.getDispatchingId()))
            && (this.getDispatchingCode() == null ? other.getDispatchingCode() == null : this.getDispatchingCode().equals(other.getDispatchingCode()))
            && (this.getCarrierId() == null ? other.getCarrierId() == null : this.getCarrierId().equals(other.getCarrierId()))
            && (this.getDispatchingGoodsDeposit() == null ? other.getDispatchingGoodsDeposit() == null : this.getDispatchingGoodsDeposit().equals(other.getDispatchingGoodsDeposit()))
            && (this.getDispatchingStatus() == null ? other.getDispatchingStatus() == null : this.getDispatchingStatus().equals(other.getDispatchingStatus()))
            && (this.getDriverId() == null ? other.getDriverId() == null : this.getDriverId().equals(other.getDriverId()))
            && (this.getDispatchingSignfor() == null ? other.getDispatchingSignfor() == null : this.getDispatchingSignfor().equals(other.getDispatchingSignfor()))
            && (this.getCarId() == null ? other.getCarId() == null : this.getCarId().equals(other.getCarId()))
            && (this.getDispatchTime() == null ? other.getDispatchTime() == null : this.getDispatchTime().equals(other.getDispatchTime()))
            && (this.getArriveTime() == null ? other.getArriveTime() == null : this.getArriveTime().equals(other.getArriveTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDispatchingId() == null) ? 0 : getDispatchingId().hashCode());
        result = prime * result + ((getDispatchingCode() == null) ? 0 : getDispatchingCode().hashCode());
        result = prime * result + ((getCarrierId() == null) ? 0 : getCarrierId().hashCode());
        result = prime * result + ((getDispatchingGoodsDeposit() == null) ? 0 : getDispatchingGoodsDeposit().hashCode());
        result = prime * result + ((getDispatchingStatus() == null) ? 0 : getDispatchingStatus().hashCode());
        result = prime * result + ((getDriverId() == null) ? 0 : getDriverId().hashCode());
        result = prime * result + ((getDispatchingSignfor() == null) ? 0 : getDispatchingSignfor().hashCode());
        result = prime * result + ((getCarId() == null) ? 0 : getCarId().hashCode());
        result = prime * result + ((getDispatchTime() == null) ? 0 : getDispatchTime().hashCode());
        result = prime * result + ((getArriveTime() == null) ? 0 : getArriveTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}