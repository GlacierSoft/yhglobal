package com.glacier.frame.entity.website;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class WebsiteFeedback {
    private String webFdbId;

    private String webFdbTheme;

    private String webFdbStatus;

    private String webFdbPhone;

    private String webFdbName;

    private String webFdbEmail;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String webFdbContent;
    
    /**
     * 自定义字段
     */
    private String createrDisplay;
    
    private String updaterDisplay;

    public String getWebFdbId() {
        return webFdbId;
    }

    public void setWebFdbId(String webFdbId) {
        this.webFdbId = webFdbId;
    }

    public String getWebFdbTheme() {
        return webFdbTheme;
    }

    public void setWebFdbTheme(String webFdbTheme) {
        this.webFdbTheme = webFdbTheme;
    }

    public String getWebFdbStatus() {
        return webFdbStatus;
    }

    public void setWebFdbStatus(String webFdbStatus) {
        this.webFdbStatus = webFdbStatus;
    }

    public String getWebFdbPhone() {
        return webFdbPhone;
    }

    public void setWebFdbPhone(String webFdbPhone) {
        this.webFdbPhone = webFdbPhone;
    }

    public String getWebFdbName() {
        return webFdbName;
    }

    public void setWebFdbName(String webFdbName) {
        this.webFdbName = webFdbName;
    }

    public String getWebFdbEmail() {
        return webFdbEmail;
    }

    public void setWebFdbEmail(String webFdbEmail) {
        this.webFdbEmail = webFdbEmail;
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

    public String getWebFdbContent() {
        return webFdbContent;
    }

    public void setWebFdbContent(String webFdbContent) {
        this.webFdbContent = webFdbContent;
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
        WebsiteFeedback other = (WebsiteFeedback) that;
        return (this.getWebFdbId() == null ? other.getWebFdbId() == null : this.getWebFdbId().equals(other.getWebFdbId()))
            && (this.getWebFdbTheme() == null ? other.getWebFdbTheme() == null : this.getWebFdbTheme().equals(other.getWebFdbTheme()))
            && (this.getWebFdbStatus() == null ? other.getWebFdbStatus() == null : this.getWebFdbStatus().equals(other.getWebFdbStatus()))
            && (this.getWebFdbPhone() == null ? other.getWebFdbPhone() == null : this.getWebFdbPhone().equals(other.getWebFdbPhone()))
            && (this.getWebFdbName() == null ? other.getWebFdbName() == null : this.getWebFdbName().equals(other.getWebFdbName()))
            && (this.getWebFdbEmail() == null ? other.getWebFdbEmail() == null : this.getWebFdbEmail().equals(other.getWebFdbEmail()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getWebFdbContent() == null ? other.getWebFdbContent() == null : this.getWebFdbContent().equals(other.getWebFdbContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebFdbId() == null) ? 0 : getWebFdbId().hashCode());
        result = prime * result + ((getWebFdbTheme() == null) ? 0 : getWebFdbTheme().hashCode());
        result = prime * result + ((getWebFdbStatus() == null) ? 0 : getWebFdbStatus().hashCode());
        result = prime * result + ((getWebFdbPhone() == null) ? 0 : getWebFdbPhone().hashCode());
        result = prime * result + ((getWebFdbName() == null) ? 0 : getWebFdbName().hashCode());
        result = prime * result + ((getWebFdbEmail() == null) ? 0 : getWebFdbEmail().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWebFdbContent() == null) ? 0 : getWebFdbContent().hashCode());
        return result;
    }
}