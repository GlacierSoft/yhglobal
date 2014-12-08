package com.glacier.frame.entity.orders;

import java.math.BigDecimal;
import java.util.Date; 
import com.alibaba.fastjson.annotation.JSONField; 

public class OrdersOrderInfo {
    private String orderInfoId;

    private String belaidupId;

    private String orderId;

    private String yesOrNo;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    
    /**
     * 自定义字段，显示创建人真实名字
     */
    private String createrDisplay;
    
    private String updaterDisplay;
    
    private String belaidupDisplay;
    
    private String orderCodeDisplay;
    
    /**
     * 自定义字段，显示出货物的信息属性
     * @return
     */
    private String consignor;//发货人
    
    private String sendPhone;//发货人电话
    
    private String sendAddress;//发货地址
    
    private Integer number;//数量
    
    private String orderPhone;//收货人电话
    
    private Float belaidupWeight;//物品重量 
    
    private Float belaidupBulk;//体积
    
    private String belaidupRemark;//注意事项
    
    private String orderAddress;//收货地址 ---- 
    
    private String belaidupProdName;//货物名称
    
    private String orderConsignee;//收货人
    
    private String belaidupTerminu;//目的站
    
    private String belaidupStatus;//货物状态
     
    private BigDecimal belaidupUnitprice;//总费用 
      
     
	public void setBelaidupWeight(float belaidupWeight) {
		this.belaidupWeight = belaidupWeight;
	}
 
 
	public Integer getNumber() {
		return number;
	}
 
	public void setNumber(Integer number) {
		this.number = number;
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



	public void setBelaidupBulk(float belaidupBulk) {
		this.belaidupBulk = belaidupBulk;
	}

	public String getBelaidupRemark() {
		return belaidupRemark;
	}

	public void setBelaidupRemark(String belaidupRemark) {
		this.belaidupRemark = belaidupRemark;
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

	private String memberId;

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId;
    } 
        
	public String getBelaidupId() {
        return belaidupId;
    }

    public void setBelaidupId(String belaidupId) {
        this.belaidupId = belaidupId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getYesOrNo() {
        return yesOrNo;
    }

    public void setYesOrNo(String yesOrNo) {
        this.yesOrNo = yesOrNo;
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

	public String getBelaidupDisplay() {
		return belaidupDisplay;
	}

	public void setBelaidupDisplay(String belaidupDisplay) {
		this.belaidupDisplay = belaidupDisplay;
	}

	public String getOrderCodeDisplay() {
		return orderCodeDisplay;
	}

	public void setOrderCodeDisplay(String orderCodeDisplay) {
		this.orderCodeDisplay = orderCodeDisplay;
	}
	
	public String getBelaidupProdName() {
		return belaidupProdName;
	}

	public void setBelaidupProdName(String belaidupProdName) {
		this.belaidupProdName = belaidupProdName;
	}

	public String getOrderConsignee() {
		return orderConsignee;
	}

	public void setOrderConsignee(String orderConsignee) {
		this.orderConsignee = orderConsignee;
	}

	public String getBelaidupTerminu() {
		return belaidupTerminu;
	}

	public void setBelaidupTerminu(String belaidupTerminu) {
		this.belaidupTerminu = belaidupTerminu;
	}

	public String getBelaidupStatus() {
		return belaidupStatus;
	}

	public void setBelaidupStatus(String belaidupStatus) {
		this.belaidupStatus = belaidupStatus;
	}

	public BigDecimal getBelaidupUnitprice() {
		return belaidupUnitprice;
	}

	public void setBelaidupUnitprice(BigDecimal belaidupUnitprice) {
		this.belaidupUnitprice = belaidupUnitprice;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
        OrdersOrderInfo other = (OrdersOrderInfo) that;
        return (this.getOrderInfoId() == null ? other.getOrderInfoId() == null : this.getOrderInfoId().equals(other.getOrderInfoId()))
            && (this.getBelaidupId() == null ? other.getBelaidupId() == null : this.getBelaidupId().equals(other.getBelaidupId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getYesOrNo() == null ? other.getYesOrNo() == null : this.getYesOrNo().equals(other.getYesOrNo()))
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
        result = prime * result + ((getOrderInfoId() == null) ? 0 : getOrderInfoId().hashCode());
        result = prime * result + ((getBelaidupId() == null) ? 0 : getBelaidupId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getYesOrNo() == null) ? 0 : getYesOrNo().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}