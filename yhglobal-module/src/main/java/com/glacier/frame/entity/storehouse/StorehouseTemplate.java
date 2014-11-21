package com.glacier.frame.entity.storehouse;

import java.util.Date;

public class StorehouseTemplate {
    private String templateid;

    private String templatename;

    private String receivingarea;

    private String receivingaddress;

    private String receivingphone;

    private String deliveryarea;

    private String deliveryaddress2;

    private String tradingphone;

    private String tradingcellphone;

    private String goodstypeid;

    private String belaidupprodname;

    private Float belaidupweight;

    private Float belaidupbulk;

    private Integer belaidupnumber;

    private String cartypeid;

    private String serviceType;

    private Integer lengthstart;

    private Integer lengthstop;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private String memberid;

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    public String getReceivingarea() {
        return receivingarea;
    }

    public void setReceivingarea(String receivingarea) {
        this.receivingarea = receivingarea;
    }

    public String getReceivingaddress() {
        return receivingaddress;
    }

    public void setReceivingaddress(String receivingaddress) {
        this.receivingaddress = receivingaddress;
    }

    public String getReceivingphone() {
        return receivingphone;
    }

    public void setReceivingphone(String receivingphone) {
        this.receivingphone = receivingphone;
    }

    public String getDeliveryarea() {
        return deliveryarea;
    }

    public void setDeliveryarea(String deliveryarea) {
        this.deliveryarea = deliveryarea;
    }

    public String getDeliveryaddress2() {
        return deliveryaddress2;
    }

    public void setDeliveryaddress2(String deliveryaddress2) {
        this.deliveryaddress2 = deliveryaddress2;
    }

    public String getTradingphone() {
        return tradingphone;
    }

    public void setTradingphone(String tradingphone) {
        this.tradingphone = tradingphone;
    }

    public String getTradingcellphone() {
        return tradingcellphone;
    }

    public void setTradingcellphone(String tradingcellphone) {
        this.tradingcellphone = tradingcellphone;
    }

    public String getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(String goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    public String getBelaidupprodname() {
        return belaidupprodname;
    }

    public void setBelaidupprodname(String belaidupprodname) {
        this.belaidupprodname = belaidupprodname;
    }

    public Float getBelaidupweight() {
        return belaidupweight;
    }

    public void setBelaidupweight(Float belaidupweight) {
        this.belaidupweight = belaidupweight;
    }

    public Float getBelaidupbulk() {
        return belaidupbulk;
    }

    public void setBelaidupbulk(Float belaidupbulk) {
        this.belaidupbulk = belaidupbulk;
    }

    public Integer getBelaidupnumber() {
        return belaidupnumber;
    }

    public void setBelaidupnumber(Integer belaidupnumber) {
        this.belaidupnumber = belaidupnumber;
    }

    public String getCartypeid() {
        return cartypeid;
    }

    public void setCartypeid(String cartypeid) {
        this.cartypeid = cartypeid;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getLengthstart() {
        return lengthstart;
    }

    public void setLengthstart(Integer lengthstart) {
        this.lengthstart = lengthstart;
    }

    public Integer getLengthstop() {
        return lengthstop;
    }

    public void setLengthstop(Integer lengthstop) {
        this.lengthstop = lengthstop;
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

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
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
        StorehouseTemplate other = (StorehouseTemplate) that;
        return (this.getTemplateid() == null ? other.getTemplateid() == null : this.getTemplateid().equals(other.getTemplateid()))
            && (this.getTemplatename() == null ? other.getTemplatename() == null : this.getTemplatename().equals(other.getTemplatename()))
            && (this.getReceivingarea() == null ? other.getReceivingarea() == null : this.getReceivingarea().equals(other.getReceivingarea()))
            && (this.getReceivingaddress() == null ? other.getReceivingaddress() == null : this.getReceivingaddress().equals(other.getReceivingaddress()))
            && (this.getReceivingphone() == null ? other.getReceivingphone() == null : this.getReceivingphone().equals(other.getReceivingphone()))
            && (this.getDeliveryarea() == null ? other.getDeliveryarea() == null : this.getDeliveryarea().equals(other.getDeliveryarea()))
            && (this.getDeliveryaddress2() == null ? other.getDeliveryaddress2() == null : this.getDeliveryaddress2().equals(other.getDeliveryaddress2()))
            && (this.getTradingphone() == null ? other.getTradingphone() == null : this.getTradingphone().equals(other.getTradingphone()))
            && (this.getTradingcellphone() == null ? other.getTradingcellphone() == null : this.getTradingcellphone().equals(other.getTradingcellphone()))
            && (this.getGoodstypeid() == null ? other.getGoodstypeid() == null : this.getGoodstypeid().equals(other.getGoodstypeid()))
            && (this.getBelaidupprodname() == null ? other.getBelaidupprodname() == null : this.getBelaidupprodname().equals(other.getBelaidupprodname()))
            && (this.getBelaidupweight() == null ? other.getBelaidupweight() == null : this.getBelaidupweight().equals(other.getBelaidupweight()))
            && (this.getBelaidupbulk() == null ? other.getBelaidupbulk() == null : this.getBelaidupbulk().equals(other.getBelaidupbulk()))
            && (this.getBelaidupnumber() == null ? other.getBelaidupnumber() == null : this.getBelaidupnumber().equals(other.getBelaidupnumber()))
            && (this.getCartypeid() == null ? other.getCartypeid() == null : this.getCartypeid().equals(other.getCartypeid()))
            && (this.getServiceType() == null ? other.getServiceType() == null : this.getServiceType().equals(other.getServiceType()))
            && (this.getLengthstart() == null ? other.getLengthstart() == null : this.getLengthstart().equals(other.getLengthstart()))
            && (this.getLengthstop() == null ? other.getLengthstop() == null : this.getLengthstop().equals(other.getLengthstop()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTemplateid() == null) ? 0 : getTemplateid().hashCode());
        result = prime * result + ((getTemplatename() == null) ? 0 : getTemplatename().hashCode());
        result = prime * result + ((getReceivingarea() == null) ? 0 : getReceivingarea().hashCode());
        result = prime * result + ((getReceivingaddress() == null) ? 0 : getReceivingaddress().hashCode());
        result = prime * result + ((getReceivingphone() == null) ? 0 : getReceivingphone().hashCode());
        result = prime * result + ((getDeliveryarea() == null) ? 0 : getDeliveryarea().hashCode());
        result = prime * result + ((getDeliveryaddress2() == null) ? 0 : getDeliveryaddress2().hashCode());
        result = prime * result + ((getTradingphone() == null) ? 0 : getTradingphone().hashCode());
        result = prime * result + ((getTradingcellphone() == null) ? 0 : getTradingcellphone().hashCode());
        result = prime * result + ((getGoodstypeid() == null) ? 0 : getGoodstypeid().hashCode());
        result = prime * result + ((getBelaidupprodname() == null) ? 0 : getBelaidupprodname().hashCode());
        result = prime * result + ((getBelaidupweight() == null) ? 0 : getBelaidupweight().hashCode());
        result = prime * result + ((getBelaidupbulk() == null) ? 0 : getBelaidupbulk().hashCode());
        result = prime * result + ((getBelaidupnumber() == null) ? 0 : getBelaidupnumber().hashCode());
        result = prime * result + ((getCartypeid() == null) ? 0 : getCartypeid().hashCode());
        result = prime * result + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        result = prime * result + ((getLengthstart() == null) ? 0 : getLengthstart().hashCode());
        result = prime * result + ((getLengthstop() == null) ? 0 : getLengthstop().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        return result;
    }
}