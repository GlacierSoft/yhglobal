package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShipperEnterpriseMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ShipperEnterpriseMemberExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_shipper_enterprise_member.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_shipper_enterprise_member.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andDeputyIsNull() {
            addCriterion("temp_shipper_enterprise_member.deputy is null");
            return (Criteria) this;
        }

        public Criteria andDeputyIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.deputy is not null");
            return (Criteria) this;
        }

        public Criteria andDeputyEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.deputy =", value, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.deputy <>", value, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.deputy >", value, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.deputy >=", value, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.deputy <", value, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.deputy <=", value, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyLike(String value) {
            addCriterion("temp_shipper_enterprise_member.deputy like", value, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.deputy not like", value, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.deputy in", values, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.deputy not in", values, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.deputy between", value1, value2, "deputy");
            return (Criteria) this;
        }

        public Criteria andDeputyNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.deputy not between", value1, value2, "deputy");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("temp_shipper_enterprise_member.area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("temp_shipper_enterprise_member.area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNull() {
            addCriterion("temp_shipper_enterprise_member.detailed_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.detailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.detailed_address =", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.detailed_address <>", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.detailed_address >", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.detailed_address >=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.detailed_address <", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.detailed_address <=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLike(String value) {
            addCriterion("temp_shipper_enterprise_member.detailed_address like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.detailed_address not like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.detailed_address in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.detailed_address not in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.detailed_address between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.detailed_address not between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("temp_shipper_enterprise_member.property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("temp_shipper_enterprise_member.property like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.property not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type =", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type <>", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type >", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type >=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type <", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type <=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type not like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type not in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_type not between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("temp_shipper_enterprise_member.trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLike(String value) {
            addCriterion("temp_shipper_enterprise_member.trade like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.trade not like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIsNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone =", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone <>", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone >", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone >=", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone <", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone <=", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone like", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone not like", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone in", values, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone not in", values, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone between", value1, value2, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_phone not between", value1, value2, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgIsNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_img is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_img is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img =", value, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img <>", value, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img >", value, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img >=", value, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img <", value, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img <=", value, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img like", value, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img not like", value, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img in", values, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img not in", values, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img between", value1, value2, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseImgNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_img not between", value1, value2, "enterpriseImg");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoIsNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo =", value, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo <>", value, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo >", value, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo >=", value, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo <", value, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo <=", value, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo like", value, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo not like", value, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo in", values, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo not in", values, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo between", value1, value2, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogoNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_logo not between", value1, value2, "enterpriseLogo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxIsNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax =", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax <>", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax >", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax >=", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax <", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax <=", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax like", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax not like", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax in", values, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax not in", values, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax between", value1, value2, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_fax not between", value1, value2, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryIsNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary =", value, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary <>", value, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary >", value, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary >=", value, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary <", value, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary <=", value, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary like", value, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary not like", value, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary in", values, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary not in", values, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary between", value1, value2, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSummaryNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.enterprise_summary not between", value1, value2, "enterpriseSummary");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNull() {
            addCriterion("temp_shipper_enterprise_member.auth_state is null");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.auth_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStateEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_state =", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_state <>", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_state >", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_state >=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_state <", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_state <=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLike(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_state like", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_state not like", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.auth_state in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.auth_state not in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.auth_state between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.auth_state not between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthIsNull() {
            addCriterion("temp_shipper_enterprise_member.auth is null");
            return (Criteria) this;
        }

        public Criteria andAuthIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.auth is not null");
            return (Criteria) this;
        }

        public Criteria andAuthEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth =", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth <>", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.auth >", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth >=", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.auth <", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth <=", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthLike(String value) {
            addCriterion("temp_shipper_enterprise_member.auth like", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.auth not like", value, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.auth in", values, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.auth not in", values, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.auth between", value1, value2, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.auth not between", value1, value2, "auth");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNull() {
            addCriterion("temp_shipper_enterprise_member.auth_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeEqualTo(Date value) {
            addCriterion("temp_shipper_enterprise_member.auth_time =", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotEqualTo(Date value) {
            addCriterion("temp_shipper_enterprise_member.auth_time <>", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThan(Date value) {
            addCriterion("temp_shipper_enterprise_member.auth_time >", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_enterprise_member.auth_time >=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThan(Date value) {
            addCriterion("temp_shipper_enterprise_member.auth_time <", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_enterprise_member.auth_time <=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIn(List<Date> values) {
            addCriterion("temp_shipper_enterprise_member.auth_time in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotIn(List<Date> values) {
            addCriterion("temp_shipper_enterprise_member.auth_time not in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_enterprise_member.auth_time between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_enterprise_member.auth_time not between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkIsNull() {
            addCriterion("temp_shipper_enterprise_member.auth_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkIsNotNull() {
            addCriterion("temp_shipper_enterprise_member.auth_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_remark =", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkNotEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_remark <>", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkGreaterThan(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_remark >", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_remark >=", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkLessThan(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_remark <", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_remark <=", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkLike(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_remark like", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkNotLike(String value) {
            addCriterion("temp_shipper_enterprise_member.auth_remark not like", value, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.auth_remark in", values, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkNotIn(List<String> values) {
            addCriterion("temp_shipper_enterprise_member.auth_remark not in", values, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.auth_remark between", value1, value2, "authRemark");
            return (Criteria) this;
        }

        public Criteria andAuthRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_enterprise_member.auth_remark not between", value1, value2, "authRemark");
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