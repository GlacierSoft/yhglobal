package com.glacier.frame.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ShipperMemberIntegral {
    private String shipperMemberIntegralId;

    private String memberId;

    private String integralTypeId;

    private String changeType;

    private Integer changeValue;

    private String remark;

    private String creater;

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
	
	//自定义字段
    private String memberName; 
    
    //积分类型
    private String integralTypeName; 
	
	//创建人
    private String createrDisplay;
    
    //更新人
    private String updaterDisplay;

    public String getShipperMemberIntegralId() {
        return shipperMemberIntegralId;
    }

    public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getIntegralTypeName() {
		return integralTypeName;
	}

	public void setIntegralTypeName(String integralTypeName) {
		this.integralTypeName = integralTypeName;
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

	public void setShipperMemberIntegralId(String shipperMemberIntegralId) {
        this.shipperMemberIntegralId = shipperMemberIntegralId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getIntegralTypeId() {
        return integralTypeId;
    }

    public void setIntegralTypeId(String integralTypeId) {
        this.integralTypeId = integralTypeId;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getChangeValue() {
        return changeValue;
    }

    public void setChangeValue(Integer changeValue) {
        this.changeValue = changeValue;
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
        ShipperMemberIntegral other = (ShipperMemberIntegral) that;
        return (this.getShipperMemberIntegralId() == null ? other.getShipperMemberIntegralId() == null : this.getShipperMemberIntegralId().equals(other.getShipperMemberIntegralId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getIntegralTypeId() == null ? other.getIntegralTypeId() == null : this.getIntegralTypeId().equals(other.getIntegralTypeId()))
            && (this.getChangeType() == null ? other.getChangeType() == null : this.getChangeType().equals(other.getChangeType()))
            && (this.getChangeValue() == null ? other.getChangeValue() == null : this.getChangeValue().equals(other.getChangeValue()))
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
        result = prime * result + ((getShipperMemberIntegralId() == null) ? 0 : getShipperMemberIntegralId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getIntegralTypeId() == null) ? 0 : getIntegralTypeId().hashCode());
        result = prime * result + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        result = prime * result + ((getChangeValue() == null) ? 0 : getChangeValue().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}