package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

public class FinancePlatformDetail {
    private String detailId;

    private String articleId;

    private String carrierId;

    private BigDecimal detailIncome;

    private BigDecimal detailPayfor;

    private BigDecimal detailPay;

    private BigDecimal detailLeave;

    private BigDecimal detailMark;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    public BigDecimal getDetailIncome() {
        return detailIncome;
    }

    public void setDetailIncome(BigDecimal detailIncome) {
        this.detailIncome = detailIncome;
    }

    public BigDecimal getDetailPayfor() {
        return detailPayfor;
    }

    public void setDetailPayfor(BigDecimal detailPayfor) {
        this.detailPayfor = detailPayfor;
    }

    public BigDecimal getDetailPay() {
        return detailPay;
    }

    public void setDetailPay(BigDecimal detailPay) {
        this.detailPay = detailPay;
    }

    public BigDecimal getDetailLeave() {
        return detailLeave;
    }

    public void setDetailLeave(BigDecimal detailLeave) {
        this.detailLeave = detailLeave;
    }

    public BigDecimal getDetailMark() {
        return detailMark;
    }

    public void setDetailMark(BigDecimal detailMark) {
        this.detailMark = detailMark;
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
        FinancePlatformDetail other = (FinancePlatformDetail) that;
        return (this.getDetailId() == null ? other.getDetailId() == null : this.getDetailId().equals(other.getDetailId()))
            && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getCarrierId() == null ? other.getCarrierId() == null : this.getCarrierId().equals(other.getCarrierId()))
            && (this.getDetailIncome() == null ? other.getDetailIncome() == null : this.getDetailIncome().equals(other.getDetailIncome()))
            && (this.getDetailPayfor() == null ? other.getDetailPayfor() == null : this.getDetailPayfor().equals(other.getDetailPayfor()))
            && (this.getDetailPay() == null ? other.getDetailPay() == null : this.getDetailPay().equals(other.getDetailPay()))
            && (this.getDetailLeave() == null ? other.getDetailLeave() == null : this.getDetailLeave().equals(other.getDetailLeave()))
            && (this.getDetailMark() == null ? other.getDetailMark() == null : this.getDetailMark().equals(other.getDetailMark()))
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
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getCarrierId() == null) ? 0 : getCarrierId().hashCode());
        result = prime * result + ((getDetailIncome() == null) ? 0 : getDetailIncome().hashCode());
        result = prime * result + ((getDetailPayfor() == null) ? 0 : getDetailPayfor().hashCode());
        result = prime * result + ((getDetailPay() == null) ? 0 : getDetailPay().hashCode());
        result = prime * result + ((getDetailLeave() == null) ? 0 : getDetailLeave().hashCode());
        result = prime * result + ((getDetailMark() == null) ? 0 : getDetailMark().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}