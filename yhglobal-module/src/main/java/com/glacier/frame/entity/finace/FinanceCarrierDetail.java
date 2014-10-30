package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinanceCarrierDetail {
    private String detailId;

    private String carrierId;

    private String articleId;

    private BigDecimal detailIncome;

    private BigDecimal detailFreeze;

    private BigDecimal detailStart;

    private BigDecimal detailEnd;

    private BigDecimal removeFreeze;

    private String detailStatus;

    private BigDecimal detailMark;

    private BigDecimal detailReturn;

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
    
    private String carrierMemberDisplay;
    
    private String articleDisplay;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public BigDecimal getDetailIncome() {
        return detailIncome;
    }

    public void setDetailIncome(BigDecimal detailIncome) {
        this.detailIncome = detailIncome;
    }

    public BigDecimal getDetailFreeze() {
        return detailFreeze;
    }

    public void setDetailFreeze(BigDecimal detailFreeze) {
        this.detailFreeze = detailFreeze;
    }

    public BigDecimal getDetailStart() {
        return detailStart;
    }

    public void setDetailStart(BigDecimal detailStart) {
        this.detailStart = detailStart;
    }

    public BigDecimal getDetailEnd() {
        return detailEnd;
    }

    public void setDetailEnd(BigDecimal detailEnd) {
        this.detailEnd = detailEnd;
    }

    public BigDecimal getRemoveFreeze() {
        return removeFreeze;
    }

    public void setRemoveFreeze(BigDecimal removeFreeze) {
        this.removeFreeze = removeFreeze;
    }

    public String getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus;
    }

    public BigDecimal getDetailMark() {
        return detailMark;
    }

    public void setDetailMark(BigDecimal detailMark) {
        this.detailMark = detailMark;
    }

    public BigDecimal getDetailReturn() {
        return detailReturn;
    }

    public void setDetailReturn(BigDecimal detailReturn) {
        this.detailReturn = detailReturn;
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

	public String getCarrierMemberDisplay() {
		return carrierMemberDisplay;
	}

	public void setCarrierMemberDisplay(String carrierMemberDisplay) {
		this.carrierMemberDisplay = carrierMemberDisplay;
	}

	public String getArticleDisplay() {
		return articleDisplay;
	}

	public void setArticleDisplay(String articleDisplay) {
		this.articleDisplay = articleDisplay;
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
        FinanceCarrierDetail other = (FinanceCarrierDetail) that;
        return (this.getDetailId() == null ? other.getDetailId() == null : this.getDetailId().equals(other.getDetailId()))
            && (this.getCarrierId() == null ? other.getCarrierId() == null : this.getCarrierId().equals(other.getCarrierId()))
            && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getDetailIncome() == null ? other.getDetailIncome() == null : this.getDetailIncome().equals(other.getDetailIncome()))
            && (this.getDetailFreeze() == null ? other.getDetailFreeze() == null : this.getDetailFreeze().equals(other.getDetailFreeze()))
            && (this.getDetailStart() == null ? other.getDetailStart() == null : this.getDetailStart().equals(other.getDetailStart()))
            && (this.getDetailEnd() == null ? other.getDetailEnd() == null : this.getDetailEnd().equals(other.getDetailEnd()))
            && (this.getRemoveFreeze() == null ? other.getRemoveFreeze() == null : this.getRemoveFreeze().equals(other.getRemoveFreeze()))
            && (this.getDetailStatus() == null ? other.getDetailStatus() == null : this.getDetailStatus().equals(other.getDetailStatus()))
            && (this.getDetailMark() == null ? other.getDetailMark() == null : this.getDetailMark().equals(other.getDetailMark()))
            && (this.getDetailReturn() == null ? other.getDetailReturn() == null : this.getDetailReturn().equals(other.getDetailReturn()))
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
        result = prime * result + ((getDetailId() == null) ? 0 : getDetailId().hashCode());
        result = prime * result + ((getCarrierId() == null) ? 0 : getCarrierId().hashCode());
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getDetailIncome() == null) ? 0 : getDetailIncome().hashCode());
        result = prime * result + ((getDetailFreeze() == null) ? 0 : getDetailFreeze().hashCode());
        result = prime * result + ((getDetailStart() == null) ? 0 : getDetailStart().hashCode());
        result = prime * result + ((getDetailEnd() == null) ? 0 : getDetailEnd().hashCode());
        result = prime * result + ((getRemoveFreeze() == null) ? 0 : getRemoveFreeze().hashCode());
        result = prime * result + ((getDetailStatus() == null) ? 0 : getDetailStatus().hashCode());
        result = prime * result + ((getDetailMark() == null) ? 0 : getDetailMark().hashCode());
        result = prime * result + ((getDetailReturn() == null) ? 0 : getDetailReturn().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}