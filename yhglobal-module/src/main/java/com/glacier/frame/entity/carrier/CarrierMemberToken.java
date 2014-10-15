package com.glacier.frame.entity.carrier;

public class CarrierMemberToken {
    private String carrierMemberId;

    private String memberName;

    private String password;

    private String salt;

    private String tradersPassword;

    private String tradersSalt;

    public String getCarrierMemberId() {
        return carrierMemberId;
    }

    public void setCarrierMemberId(String carrierMemberId) {
        this.carrierMemberId = carrierMemberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getTradersPassword() {
        return tradersPassword;
    }

    public void setTradersPassword(String tradersPassword) {
        this.tradersPassword = tradersPassword;
    }

    public String getTradersSalt() {
        return tradersSalt;
    }

    public void setTradersSalt(String tradersSalt) {
        this.tradersSalt = tradersSalt;
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
        CarrierMemberToken other = (CarrierMemberToken) that;
        return (this.getCarrierMemberId() == null ? other.getCarrierMemberId() == null : this.getCarrierMemberId().equals(other.getCarrierMemberId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getTradersPassword() == null ? other.getTradersPassword() == null : this.getTradersPassword().equals(other.getTradersPassword()))
            && (this.getTradersSalt() == null ? other.getTradersSalt() == null : this.getTradersSalt().equals(other.getTradersSalt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarrierMemberId() == null) ? 0 : getCarrierMemberId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getTradersPassword() == null) ? 0 : getTradersPassword().hashCode());
        result = prime * result + ((getTradersSalt() == null) ? 0 : getTradersSalt().hashCode());
        return result;
    }
}