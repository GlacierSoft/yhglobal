package com.glacier.frame.entity.carrier;

import java.util.ArrayList;
import java.util.List;

public class CarrierIndividualityMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CarrierIndividualityMemberExample() {
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
            addCriterion("temp_carrier_individuality_member.carrier_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNotNull() {
            addCriterion("temp_carrier_individuality_member.carrier_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id =", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id <>", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThan(String value) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id >", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id >=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThan(String value) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id <", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id <=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLike(String value) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotLike(String value) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id not like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id not in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.carrier_member_id not between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("temp_carrier_individuality_member.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("temp_carrier_individuality_member.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("temp_carrier_individuality_member.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("temp_carrier_individuality_member.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("temp_carrier_individuality_member.sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("temp_carrier_individuality_member.sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIsNull() {
            addCriterion("temp_carrier_individuality_member.member_age is null");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIsNotNull() {
            addCriterion("temp_carrier_individuality_member.member_age is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAgeEqualTo(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_age =", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotEqualTo(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_age <>", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeGreaterThan(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_age >", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_age >=", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeLessThan(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_age <", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_age <=", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIn(List<Integer> values) {
            addCriterion("temp_carrier_individuality_member.member_age in", values, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotIn(List<Integer> values) {
            addCriterion("temp_carrier_individuality_member.member_age not in", values, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_individuality_member.member_age between", value1, value2, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_individuality_member.member_age not between", value1, value2, "memberAge");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("temp_carrier_individuality_member.home_phone is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("temp_carrier_individuality_member.home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.home_phone =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.home_phone <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("temp_carrier_individuality_member.home_phone >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.home_phone >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("temp_carrier_individuality_member.home_phone <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.home_phone <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("temp_carrier_individuality_member.home_phone like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("temp_carrier_individuality_member.home_phone not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.home_phone in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.home_phone not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.home_phone between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.home_phone not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("temp_carrier_individuality_member.card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("temp_carrier_individuality_member.card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("temp_carrier_individuality_member.card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("temp_carrier_individuality_member.card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("temp_carrier_individuality_member.card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("temp_carrier_individuality_member.card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIsNull() {
            addCriterion("temp_carrier_individuality_member.member_real_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIsNotNull() {
            addCriterion("temp_carrier_individuality_member.member_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.member_real_name =", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.member_real_name <>", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameGreaterThan(String value) {
            addCriterion("temp_carrier_individuality_member.member_real_name >", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.member_real_name >=", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLessThan(String value) {
            addCriterion("temp_carrier_individuality_member.member_real_name <", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.member_real_name <=", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLike(String value) {
            addCriterion("temp_carrier_individuality_member.member_real_name like", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotLike(String value) {
            addCriterion("temp_carrier_individuality_member.member_real_name not like", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.member_real_name in", values, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.member_real_name not in", values, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.member_real_name between", value1, value2, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.member_real_name not between", value1, value2, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNull() {
            addCriterion("temp_carrier_individuality_member.member_qq is null");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNotNull() {
            addCriterion("temp_carrier_individuality_member.member_qq is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQqEqualTo(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_qq =", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotEqualTo(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_qq <>", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThan(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_qq >", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_qq >=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThan(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_qq <", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_individuality_member.member_qq <=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqIn(List<Integer> values) {
            addCriterion("temp_carrier_individuality_member.member_qq in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotIn(List<Integer> values) {
            addCriterion("temp_carrier_individuality_member.member_qq not in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_individuality_member.member_qq between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_individuality_member.member_qq not between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNull() {
            addCriterion("temp_carrier_individuality_member.mobile_number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("temp_carrier_individuality_member.mobile_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.mobile_number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.mobile_number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("temp_carrier_individuality_member.mobile_number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.mobile_number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("temp_carrier_individuality_member.mobile_number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.mobile_number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("temp_carrier_individuality_member.mobile_number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("temp_carrier_individuality_member.mobile_number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.mobile_number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.mobile_number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.mobile_number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.mobile_number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNull() {
            addCriterion("temp_carrier_individuality_member.detailed_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNotNull() {
            addCriterion("temp_carrier_individuality_member.detailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.detailed_address =", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.detailed_address <>", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThan(String value) {
            addCriterion("temp_carrier_individuality_member.detailed_address >", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.detailed_address >=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThan(String value) {
            addCriterion("temp_carrier_individuality_member.detailed_address <", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_individuality_member.detailed_address <=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLike(String value) {
            addCriterion("temp_carrier_individuality_member.detailed_address like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotLike(String value) {
            addCriterion("temp_carrier_individuality_member.detailed_address not like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.detailed_address in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotIn(List<String> values) {
            addCriterion("temp_carrier_individuality_member.detailed_address not in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.detailed_address between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_individuality_member.detailed_address not between", value1, value2, "detailedAddress");
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