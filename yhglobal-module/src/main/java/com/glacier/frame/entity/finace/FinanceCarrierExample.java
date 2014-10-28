package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceCarrierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceCarrierExample() {
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

        public Criteria andCarrierIdIsNull() {
            addCriterion("temp_finance_carrier.carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("temp_finance_carrier.carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(String value) {
            addCriterion("temp_finance_carrier.carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(String value) {
            addCriterion("temp_finance_carrier.carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(String value) {
            addCriterion("temp_finance_carrier.carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(String value) {
            addCriterion("temp_finance_carrier.carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(String value) {
            addCriterion("temp_finance_carrier.carrier_id like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(String value) {
            addCriterion("temp_finance_carrier.carrier_id not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<String> values) {
            addCriterion("temp_finance_carrier.carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<String> values) {
            addCriterion("temp_finance_carrier.carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNull() {
            addCriterion("temp_finance_carrier.carrier_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNotNull() {
            addCriterion("temp_finance_carrier.carrier_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdEqualTo(String value) {
            addCriterion("temp_finance_carrier.carrier_member_id =", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_carrier.carrier_member_id <>", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_carrier.carrier_member_id >", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.carrier_member_id >=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThan(String value) {
            addCriterion("temp_finance_carrier.carrier_member_id <", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.carrier_member_id <=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLike(String value) {
            addCriterion("temp_finance_carrier.carrier_member_id like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotLike(String value) {
            addCriterion("temp_finance_carrier.carrier_member_id not like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIn(List<String> values) {
            addCriterion("temp_finance_carrier.carrier_member_id in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_carrier.carrier_member_id not in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.carrier_member_id between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.carrier_member_id not between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeIsNull() {
            addCriterion("temp_finance_carrier.carrier_income is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeIsNotNull() {
            addCriterion("temp_finance_carrier.carrier_income is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_income =", value, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_income <>", value, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_income >", value, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_income >=", value, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_income <", value, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_income <=", value, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_income in", values, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_income not in", values, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_income between", value1, value2, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_income not between", value1, value2, "carrierIncome");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeIsNull() {
            addCriterion("temp_finance_carrier.carrier_freeze is null");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeIsNotNull() {
            addCriterion("temp_finance_carrier.carrier_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_freeze =", value, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_freeze <>", value, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_freeze >", value, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_freeze >=", value, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_freeze <", value, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_freeze <=", value, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_freeze in", values, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_freeze not in", values, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_freeze between", value1, value2, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierFreezeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_freeze not between", value1, value2, "carrierFreeze");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductIsNull() {
            addCriterion("temp_finance_carrier.carrier_deduct is null");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductIsNotNull() {
            addCriterion("temp_finance_carrier.carrier_deduct is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_deduct =", value, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_deduct <>", value, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_deduct >", value, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_deduct >=", value, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_deduct <", value, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_deduct <=", value, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_deduct in", values, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_deduct not in", values, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_deduct between", value1, value2, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierDeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_deduct not between", value1, value2, "carrierDeduct");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnIsNull() {
            addCriterion("temp_finance_carrier.carrier_return is null");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnIsNotNull() {
            addCriterion("temp_finance_carrier.carrier_return is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_return =", value, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_return <>", value, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_return >", value, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_return >=", value, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_return <", value, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_return <=", value, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_return in", values, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_return not in", values, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_return between", value1, value2, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierReturnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_return not between", value1, value2, "carrierReturn");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeIsNull() {
            addCriterion("temp_finance_carrier.carrier_recharge is null");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeIsNotNull() {
            addCriterion("temp_finance_carrier.carrier_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_recharge =", value, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_recharge <>", value, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_recharge >", value, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_recharge >=", value, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_recharge <", value, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_recharge <=", value, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_recharge in", values, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_recharge not in", values, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_recharge between", value1, value2, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierRechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_recharge not between", value1, value2, "carrierRecharge");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawIsNull() {
            addCriterion("temp_finance_carrier.carrier_withdraw is null");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawIsNotNull() {
            addCriterion("temp_finance_carrier.carrier_withdraw is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_withdraw =", value, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_withdraw <>", value, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_withdraw >", value, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_withdraw >=", value, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_withdraw <", value, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier.carrier_withdraw <=", value, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_withdraw in", values, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier.carrier_withdraw not in", values, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_withdraw between", value1, value2, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andCarrierWithdrawNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier.carrier_withdraw not between", value1, value2, "carrierWithdraw");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_carrier.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_carrier.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_carrier.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_carrier.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_carrier.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_carrier.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_carrier.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_carrier.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_carrier.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_carrier.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_carrier.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_carrier.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_carrier.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_carrier.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_carrier.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_carrier.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_carrier.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_carrier.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_carrier.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_carrier.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_carrier.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_carrier.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_carrier.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_carrier.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_carrier.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_carrier.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_carrier.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_carrier.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_carrier.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_carrier.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_carrier.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_carrier.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_carrier.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_carrier.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_carrier.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_carrier.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_carrier.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_carrier.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_carrier.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_carrier.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_carrier.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_carrier.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_carrier.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_carrier.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_carrier.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_carrier.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_carrier.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_carrier.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_carrier.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_carrier.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_carrier.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_carrier.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_carrier.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_carrier.update_time not between", value1, value2, "updateTime");
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