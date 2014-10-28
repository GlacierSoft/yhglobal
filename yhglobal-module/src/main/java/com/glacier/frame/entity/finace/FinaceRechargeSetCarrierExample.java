package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinaceRechargeSetCarrierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinaceRechargeSetCarrierExample() {
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

        public Criteria andRechargeSetIdIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id =", value, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id <>", value, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id >", value, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id >=", value, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id <", value, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id <=", value, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id like", value, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id not like", value, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id in", values, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id not in", values, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id between", value1, value2, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetIdNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_set_id not between", value1, value2, "rechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeNameIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name is null");
            return (Criteria) this;
        }

        public Criteria andRechargeNameIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeNameEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name =", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name <>", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name >", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name >=", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name <", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name <=", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name like", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name not like", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name in", values, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name not in", values, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name between", value1, value2, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_name not between", value1, value2, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type =", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type <>", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type >", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type >=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type <", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type <=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type not like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type not in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_type not between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate is null");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeRateEqualTo(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate =", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotEqualTo(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate <>", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateGreaterThan(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate >", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate >=", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateLessThan(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate <", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate <=", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIn(List<BigDecimal> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate in", values, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotIn(List<BigDecimal> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate not in", values, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate between", value1, value2, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_rate not between", value1, value2, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_recharge_set_carrier.recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeWayIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.fee_way is null");
            return (Criteria) this;
        }

        public Criteria andFeeWayIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.fee_way is not null");
            return (Criteria) this;
        }

        public Criteria andFeeWayEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way =", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way <>", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way >", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way >=", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way <", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way <=", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way like", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way not like", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way in", values, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way not in", values, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way between", value1, value2, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.fee_way not between", value1, value2, "feeWay");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id not like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finace_recharge_set_carrier.audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finace_recharge_set_carrier.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finace_recharge_set_carrier.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finace_recharge_set_carrier.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finace_recharge_set_carrier.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finace_recharge_set_carrier.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_recharge_set_carrier.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finace_recharge_set_carrier.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finace_recharge_set_carrier.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finace_recharge_set_carrier.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finace_recharge_set_carrier.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finace_recharge_set_carrier.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finace_recharge_set_carrier.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finace_recharge_set_carrier.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finace_recharge_set_carrier.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finace_recharge_set_carrier.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finace_recharge_set_carrier.update_time not between", value1, value2, "updateTime");
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