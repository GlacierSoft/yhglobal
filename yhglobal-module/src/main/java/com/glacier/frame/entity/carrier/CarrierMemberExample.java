package com.glacier.frame.entity.carrier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarrierMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CarrierMemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCarrierMemberIdIsNull() {
            addCriterion("temp_carrier_member.carrier_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNotNull() {
            addCriterion("temp_carrier_member.carrier_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdEqualTo(String value) {
            addCriterion("temp_carrier_member.carrier_member_id =", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotEqualTo(String value) {
            addCriterion("temp_carrier_member.carrier_member_id <>", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThan(String value) {
            addCriterion("temp_carrier_member.carrier_member_id >", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.carrier_member_id >=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThan(String value) {
            addCriterion("temp_carrier_member.carrier_member_id <", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.carrier_member_id <=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLike(String value) {
            addCriterion("temp_carrier_member.carrier_member_id like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotLike(String value) {
            addCriterion("temp_carrier_member.carrier_member_id not like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIn(List<String> values) {
            addCriterion("temp_carrier_member.carrier_member_id in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotIn(List<String> values) {
            addCriterion("temp_carrier_member.carrier_member_id not in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.carrier_member_id between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.carrier_member_id not between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("temp_carrier_member.member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("temp_carrier_member.member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("temp_carrier_member.member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("temp_carrier_member.member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("temp_carrier_member.member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("temp_carrier_member.member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("temp_carrier_member.member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("temp_carrier_member.member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("temp_carrier_member.member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("temp_carrier_member.member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNull() {
            addCriterion("temp_carrier_member.member_password is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNotNull() {
            addCriterion("temp_carrier_member.member_password is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordEqualTo(String value) {
            addCriterion("temp_carrier_member.member_password =", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotEqualTo(String value) {
            addCriterion("temp_carrier_member.member_password <>", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThan(String value) {
            addCriterion("temp_carrier_member.member_password >", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.member_password >=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThan(String value) {
            addCriterion("temp_carrier_member.member_password <", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.member_password <=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLike(String value) {
            addCriterion("temp_carrier_member.member_password like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotLike(String value) {
            addCriterion("temp_carrier_member.member_password not like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIn(List<String> values) {
            addCriterion("temp_carrier_member.member_password in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotIn(List<String> values) {
            addCriterion("temp_carrier_member.member_password not in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.member_password between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.member_password not between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordIsNull() {
            addCriterion("temp_carrier_member.traders_password is null");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordIsNotNull() {
            addCriterion("temp_carrier_member.traders_password is not null");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordEqualTo(String value) {
            addCriterion("temp_carrier_member.traders_password =", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordNotEqualTo(String value) {
            addCriterion("temp_carrier_member.traders_password <>", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordGreaterThan(String value) {
            addCriterion("temp_carrier_member.traders_password >", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.traders_password >=", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordLessThan(String value) {
            addCriterion("temp_carrier_member.traders_password <", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.traders_password <=", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordLike(String value) {
            addCriterion("temp_carrier_member.traders_password like", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordNotLike(String value) {
            addCriterion("temp_carrier_member.traders_password not like", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordIn(List<String> values) {
            addCriterion("temp_carrier_member.traders_password in", values, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordNotIn(List<String> values) {
            addCriterion("temp_carrier_member.traders_password not in", values, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.traders_password between", value1, value2, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.traders_password not between", value1, value2, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNull() {
            addCriterion("temp_carrier_member.live_address is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNotNull() {
            addCriterion("temp_carrier_member.live_address is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressEqualTo(String value) {
            addCriterion("temp_carrier_member.live_address =", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotEqualTo(String value) {
            addCriterion("temp_carrier_member.live_address <>", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThan(String value) {
            addCriterion("temp_carrier_member.live_address >", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.live_address >=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThan(String value) {
            addCriterion("temp_carrier_member.live_address <", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.live_address <=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLike(String value) {
            addCriterion("temp_carrier_member.live_address like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotLike(String value) {
            addCriterion("temp_carrier_member.live_address not like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIn(List<String> values) {
            addCriterion("temp_carrier_member.live_address in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotIn(List<String> values) {
            addCriterion("temp_carrier_member.live_address not in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.live_address between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.live_address not between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIsNull() {
            addCriterion("temp_carrier_member.member_photo is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIsNotNull() {
            addCriterion("temp_carrier_member.member_photo is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoEqualTo(String value) {
            addCriterion("temp_carrier_member.member_photo =", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotEqualTo(String value) {
            addCriterion("temp_carrier_member.member_photo <>", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoGreaterThan(String value) {
            addCriterion("temp_carrier_member.member_photo >", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.member_photo >=", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLessThan(String value) {
            addCriterion("temp_carrier_member.member_photo <", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.member_photo <=", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLike(String value) {
            addCriterion("temp_carrier_member.member_photo like", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotLike(String value) {
            addCriterion("temp_carrier_member.member_photo not like", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIn(List<String> values) {
            addCriterion("temp_carrier_member.member_photo in", values, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotIn(List<String> values) {
            addCriterion("temp_carrier_member.member_photo not in", values, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.member_photo between", value1, value2, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.member_photo not between", value1, value2, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNull() {
            addCriterion("temp_carrier_member.registration_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNotNull() {
            addCriterion("temp_carrier_member.registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeEqualTo(Date value) {
            addCriterion("temp_carrier_member.registration_time =", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_member.registration_time <>", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_member.registration_time >", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.registration_time >=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThan(Date value) {
            addCriterion("temp_carrier_member.registration_time <", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.registration_time <=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIn(List<Date> values) {
            addCriterion("temp_carrier_member.registration_time in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_member.registration_time not in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.registration_time between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.registration_time not between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("temp_carrier_member.last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("temp_carrier_member.last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("temp_carrier_member.last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_member.last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_member.last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("temp_carrier_member.last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("temp_carrier_member.last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_member.last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("temp_carrier_member.email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("temp_carrier_member.email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("temp_carrier_member.email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("temp_carrier_member.email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("temp_carrier_member.email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("temp_carrier_member.email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("temp_carrier_member.email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("temp_carrier_member.email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("temp_carrier_member.email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("temp_carrier_member.email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("temp_carrier_member.member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("temp_carrier_member.member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("temp_carrier_member.member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("temp_carrier_member.member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("temp_carrier_member.member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("temp_carrier_member.member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("temp_carrier_member.member_type like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("temp_carrier_member.member_type not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("temp_carrier_member.member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("temp_carrier_member.member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_carrier_member.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_carrier_member.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_carrier_member.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_carrier_member.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_carrier_member.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_carrier_member.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_carrier_member.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_carrier_member.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_carrier_member.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_carrier_member.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("temp_carrier_member.login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("temp_carrier_member.login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("temp_carrier_member.login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("temp_carrier_member.login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("temp_carrier_member.login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member.login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("temp_carrier_member.login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member.login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("temp_carrier_member.login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("temp_carrier_member.login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member.login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member.login_count not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressIsNull() {
            addCriterion("temp_carrier_member.last_login_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressIsNotNull() {
            addCriterion("temp_carrier_member.last_login_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressEqualTo(String value) {
            addCriterion("temp_carrier_member.last_login_ip_address =", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressNotEqualTo(String value) {
            addCriterion("temp_carrier_member.last_login_ip_address <>", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressGreaterThan(String value) {
            addCriterion("temp_carrier_member.last_login_ip_address >", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.last_login_ip_address >=", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressLessThan(String value) {
            addCriterion("temp_carrier_member.last_login_ip_address <", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.last_login_ip_address <=", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressLike(String value) {
            addCriterion("temp_carrier_member.last_login_ip_address like", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressNotLike(String value) {
            addCriterion("temp_carrier_member.last_login_ip_address not like", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressIn(List<String> values) {
            addCriterion("temp_carrier_member.last_login_ip_address in", values, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressNotIn(List<String> values) {
            addCriterion("temp_carrier_member.last_login_ip_address not in", values, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.last_login_ip_address between", value1, value2, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.last_login_ip_address not between", value1, value2, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNull() {
            addCriterion("temp_carrier_member.credit_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("temp_carrier_member.credit_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_member.credit_limit =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_member.credit_limit <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(BigDecimal value) {
            addCriterion("temp_carrier_member.credit_limit >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_member.credit_limit >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(BigDecimal value) {
            addCriterion("temp_carrier_member.credit_limit <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_member.credit_limit <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_member.credit_limit in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_member.credit_limit not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_member.credit_limit between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_member.credit_limit not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessIsNull() {
            addCriterion("temp_carrier_member.creditworthiness is null");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessIsNotNull() {
            addCriterion("temp_carrier_member.creditworthiness is not null");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessEqualTo(Integer value) {
            addCriterion("temp_carrier_member.creditworthiness =", value, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessNotEqualTo(Integer value) {
            addCriterion("temp_carrier_member.creditworthiness <>", value, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessGreaterThan(Integer value) {
            addCriterion("temp_carrier_member.creditworthiness >", value, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member.creditworthiness >=", value, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessLessThan(Integer value) {
            addCriterion("temp_carrier_member.creditworthiness <", value, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member.creditworthiness <=", value, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessIn(List<Integer> values) {
            addCriterion("temp_carrier_member.creditworthiness in", values, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessNotIn(List<Integer> values) {
            addCriterion("temp_carrier_member.creditworthiness not in", values, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member.creditworthiness between", value1, value2, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member.creditworthiness not between", value1, value2, "creditworthiness");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyIsNull() {
            addCriterion("temp_carrier_member.surplus_monney is null");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyIsNotNull() {
            addCriterion("temp_carrier_member.surplus_monney is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_member.surplus_monney =", value, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_member.surplus_monney <>", value, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyGreaterThan(BigDecimal value) {
            addCriterion("temp_carrier_member.surplus_monney >", value, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_member.surplus_monney >=", value, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyLessThan(BigDecimal value) {
            addCriterion("temp_carrier_member.surplus_monney <", value, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_member.surplus_monney <=", value, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_member.surplus_monney in", values, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_member.surplus_monney not in", values, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_member.surplus_monney between", value1, value2, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andSurplusMonneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_member.surplus_monney not between", value1, value2, "surplusMonney");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessIsNull() {
            addCriterion("temp_carrier_member.deliver_success is null");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessIsNotNull() {
            addCriterion("temp_carrier_member.deliver_success is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessEqualTo(Integer value) {
            addCriterion("temp_carrier_member.deliver_success =", value, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessNotEqualTo(Integer value) {
            addCriterion("temp_carrier_member.deliver_success <>", value, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessGreaterThan(Integer value) {
            addCriterion("temp_carrier_member.deliver_success >", value, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member.deliver_success >=", value, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessLessThan(Integer value) {
            addCriterion("temp_carrier_member.deliver_success <", value, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member.deliver_success <=", value, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessIn(List<Integer> values) {
            addCriterion("temp_carrier_member.deliver_success in", values, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessNotIn(List<Integer> values) {
            addCriterion("temp_carrier_member.deliver_success not in", values, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member.deliver_success between", value1, value2, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member.deliver_success not between", value1, value2, "deliverSuccess");
            return (Criteria) this;
        }

        public Criteria andDeliverFailIsNull() {
            addCriterion("temp_carrier_member.deliver_fail is null");
            return (Criteria) this;
        }

        public Criteria andDeliverFailIsNotNull() {
            addCriterion("temp_carrier_member.deliver_fail is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverFailEqualTo(Integer value) {
            addCriterion("temp_carrier_member.deliver_fail =", value, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailNotEqualTo(Integer value) {
            addCriterion("temp_carrier_member.deliver_fail <>", value, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailGreaterThan(Integer value) {
            addCriterion("temp_carrier_member.deliver_fail >", value, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member.deliver_fail >=", value, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailLessThan(Integer value) {
            addCriterion("temp_carrier_member.deliver_fail <", value, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member.deliver_fail <=", value, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailIn(List<Integer> values) {
            addCriterion("temp_carrier_member.deliver_fail in", values, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailNotIn(List<Integer> values) {
            addCriterion("temp_carrier_member.deliver_fail not in", values, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member.deliver_fail between", value1, value2, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andDeliverFailNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member.deliver_fail not between", value1, value2, "deliverFail");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_carrier_member.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_carrier_member.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_carrier_member.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_carrier_member.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_carrier_member.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_carrier_member.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_carrier_member.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_carrier_member.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_carrier_member.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_carrier_member.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("temp_carrier_member.audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("temp_carrier_member.audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(String value) {
            addCriterion("temp_carrier_member.audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(String value) {
            addCriterion("temp_carrier_member.audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(String value) {
            addCriterion("temp_carrier_member.audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(String value) {
            addCriterion("temp_carrier_member.audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLike(String value) {
            addCriterion("temp_carrier_member.audit like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotLike(String value) {
            addCriterion("temp_carrier_member.audit not like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<String> values) {
            addCriterion("temp_carrier_member.audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<String> values) {
            addCriterion("temp_carrier_member.audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("temp_carrier_member.audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("temp_carrier_member.audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("temp_carrier_member.audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("temp_carrier_member.audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("temp_carrier_member.audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("temp_carrier_member.audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("temp_carrier_member.audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("temp_carrier_member.audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("temp_carrier_member.audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("temp_carrier_member.audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("temp_carrier_member.audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("temp_carrier_member.audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("temp_carrier_member.audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_member.audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_member.audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("temp_carrier_member.audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("temp_carrier_member.audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_member.audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_carrier_member.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_carrier_member.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_carrier_member.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_carrier_member.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_carrier_member.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_carrier_member.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_carrier_member.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_carrier_member.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_carrier_member.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_carrier_member.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_carrier_member.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_carrier_member.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_carrier_member.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_carrier_member.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_carrier_member.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_carrier_member.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_carrier_member.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_carrier_member.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_carrier_member.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_carrier_member.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_carrier_member.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_carrier_member.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_member.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_member.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_member.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_carrier_member.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_member.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_member.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_carrier_member.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_carrier_member.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_carrier_member.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_carrier_member.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_carrier_member.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_carrier_member.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_carrier_member.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_carrier_member.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_carrier_member.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_carrier_member.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_carrier_member.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_carrier_member.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_member.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_member.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_member.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_carrier_member.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_member.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_member.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}