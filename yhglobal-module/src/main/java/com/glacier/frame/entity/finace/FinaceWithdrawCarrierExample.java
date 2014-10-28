package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinaceWithdrawCarrierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinaceWithdrawCarrierExample() {
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

        public Criteria andWithdrawIdIsNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id =", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id <>", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id >", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id >=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id <", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id <=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id like", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id not like", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id not in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_id not between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeIsNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code =", value, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code <>", value, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code >", value, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code >=", value, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code <", value, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code <=", value, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code like", value, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code not like", value, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code in", values, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code not in", values, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code between", value1, value2, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawCodeNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_code not between", value1, value2, "withdrawCode");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIsNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money =", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money <>", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money >", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money >=", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money <", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money <=", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money in", values, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money not in", values, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_money not between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdIsNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id =", value, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id <>", value, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id >", value, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id >=", value, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id <", value, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id <=", value, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id like", value, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id not like", value, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id in", values, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id not in", values, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id between", value1, value2, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andWithdrawSetIdNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_set_id not between", value1, value2, "withdrawSetId");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIsNull() {
            addCriterion("temp_finace_withdraw_carrier.charge_money is null");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.charge_money is not null");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.charge_money =", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.charge_money <>", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.charge_money >", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.charge_money >=", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.charge_money <", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.charge_money <=", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finace_withdraw_carrier.charge_money in", values, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finace_withdraw_carrier.charge_money not in", values, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_withdraw_carrier.charge_money between", value1, value2, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_withdraw_carrier.charge_money not between", value1, value2, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyIsNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money =", value, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money <>", value, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money >", value, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money >=", value, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money <", value, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money <=", value, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money in", values, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money not in", values, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money between", value1, value2, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawReallyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finace_withdraw_carrier.withdraw_really_money not between", value1, value2, "withdrawReallyMoney");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("temp_finace_withdraw_carrier.carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_finace_withdraw_carrier.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_finace_withdraw_carrier.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("temp_finace_withdraw_carrier.audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("temp_finace_withdraw_carrier.audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("temp_finace_withdraw_carrier.audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("temp_finace_withdraw_carrier.audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("temp_finace_withdraw_carrier.audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finace_withdraw_carrier.audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finace_withdraw_carrier.audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finace_withdraw_carrier.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finace_withdraw_carrier.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finace_withdraw_carrier.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finace_withdraw_carrier.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finace_withdraw_carrier.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finace_withdraw_carrier.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finace_withdraw_carrier.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finace_withdraw_carrier.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finace_withdraw_carrier.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finace_withdraw_carrier.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finace_withdraw_carrier.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finace_withdraw_carrier.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finace_withdraw_carrier.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finace_withdraw_carrier.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finace_withdraw_carrier.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finace_withdraw_carrier.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finace_withdraw_carrier.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finace_withdraw_carrier.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finace_withdraw_carrier.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finace_withdraw_carrier.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finace_withdraw_carrier.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finace_withdraw_carrier.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finace_withdraw_carrier.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finace_withdraw_carrier.update_time not between", value1, value2, "updateTime");
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