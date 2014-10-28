package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.Date;

public class FinanceMemberDetail {
    private String mdetailId;

    private String articleId;

    private String mdetailType;

    private String memberId;

    private BigDecimal mdetaillPayfor;

    private BigDecimal mdetailPay;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getMdetailId() {
        return mdetailId;
    }

    public void setMdetailId(String mdetailId) {
        this.mdetailId = mdetailId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getMdetailType() {
        return mdetailType;
    }

    public void setMdetailType(String mdetailType) {
        this.mdetailType = mdetailType;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getMdetaillPayfor() {
        return mdetaillPayfor;
    }

    public void setMdetaillPayfor(BigDecimal mdetaillPayfor) {
        this.mdetaillPayfor = mdetaillPayfor;
    }

    public BigDecimal getMdetailPay() {
        return mdetailPay;
    }

    public void setMdetailPay(BigDecimal mdetailPay) {
        this.mdetailPay = mdetailPay;
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
        FinanceMemberDetail other = (FinanceMemberDetail) that;
        return (this.getMdetailId() == null ? other.getMdetailId() == null : this.getMdetailId().equals(other.getMdetailId()))
            && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getMdetailType() == null ? other.getMdetailType() == null : this.getMdetailType().equals(other.getMdetailType()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMdetaillPayfor() == null ? other.getMdetaillPayfor() == null : this.getMdetaillPayfor().equals(other.getMdetaillPayfor()))
            && (this.getMdetailPay() == null ? other.getMdetailPay() == null : this.getMdetailPay().equals(other.getMdetailPay()))
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
        result = prime * result + ((getMdetailId() == null) ? 0 : getMdetailId().hashCode());
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getMdetailType() == null) ? 0 : getMdetailType().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMdetaillPayfor() == null) ? 0 : getMdetaillPayfor().hashCode());
        result = prime * result + ((getMdetailPay() == null) ? 0 : getMdetailPay().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}