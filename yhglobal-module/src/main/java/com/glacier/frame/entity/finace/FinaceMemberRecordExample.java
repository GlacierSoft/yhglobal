package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinaceMemberRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinaceMemberRecordExample() {
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
        
        public Criteria andMemberDisplayLike(String value) {
        	addCriterion("temp_shipper_member.member_name like",value,"memberDisplay");
            return (Criteria) this;
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

        public Criteria andTransactionMemberIdIsNull() {
            addCriterion("temp_finance_member_record.transaction_member_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdIsNotNull() {
            addCriterion("temp_finance_member_record.transaction_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_member_id =", value, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_member_id <>", value, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_member_record.transaction_member_id >", value, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_member_id >=", value, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdLessThan(String value) {
            addCriterion("temp_finance_member_record.transaction_member_id <", value, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_member_id <=", value, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdLike(String value) {
            addCriterion("temp_finance_member_record.transaction_member_id like", value, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdNotLike(String value) {
            addCriterion("temp_finance_member_record.transaction_member_id not like", value, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdIn(List<String> values) {
            addCriterion("temp_finance_member_record.transaction_member_id in", values, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_member_record.transaction_member_id not in", values, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.transaction_member_id between", value1, value2, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andTransactionMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.transaction_member_id not between", value1, value2, "transactionMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdIsNull() {
            addCriterion("temp_finance_member_record.finace_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdIsNotNull() {
            addCriterion("temp_finance_member_record.finace_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdEqualTo(String value) {
            addCriterion("temp_finance_member_record.finace_member_id =", value, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_member_record.finace_member_id <>", value, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_member_record.finace_member_id >", value, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.finace_member_id >=", value, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdLessThan(String value) {
            addCriterion("temp_finance_member_record.finace_member_id <", value, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.finace_member_id <=", value, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdLike(String value) {
            addCriterion("temp_finance_member_record.finace_member_id like", value, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdNotLike(String value) {
            addCriterion("temp_finance_member_record.finace_member_id not like", value, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdIn(List<String> values) {
            addCriterion("temp_finance_member_record.finace_member_id in", values, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_member_record.finace_member_id not in", values, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.finace_member_id between", value1, value2, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andFinaceMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.finace_member_id not between", value1, value2, "finaceMemberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_finance_member_record.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_finance_member_record.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_finance_member_record.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_member_record.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_member_record.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_finance_member_record.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_finance_member_record.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_finance_member_record.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_finance_member_record.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_member_record.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetIsNull() {
            addCriterion("temp_finance_member_record.transaction_target is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetIsNotNull() {
            addCriterion("temp_finance_member_record.transaction_target is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_target =", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetNotEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_target <>", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetGreaterThan(String value) {
            addCriterion("temp_finance_member_record.transaction_target >", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_target >=", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetLessThan(String value) {
            addCriterion("temp_finance_member_record.transaction_target <", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_target <=", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetLike(String value) {
            addCriterion("temp_finance_member_record.transaction_target like", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetNotLike(String value) {
            addCriterion("temp_finance_member_record.transaction_target not like", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetIn(List<String> values) {
            addCriterion("temp_finance_member_record.transaction_target in", values, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetNotIn(List<String> values) {
            addCriterion("temp_finance_member_record.transaction_target not in", values, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.transaction_target between", value1, value2, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.transaction_target not between", value1, value2, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNull() {
            addCriterion("temp_finance_member_record.transaction_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("temp_finance_member_record.transaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_type =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_type <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(String value) {
            addCriterion("temp_finance_member_record.transaction_type >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_type >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(String value) {
            addCriterion("temp_finance_member_record.transaction_type <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.transaction_type <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLike(String value) {
            addCriterion("temp_finance_member_record.transaction_type like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotLike(String value) {
            addCriterion("temp_finance_member_record.transaction_type not like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<String> values) {
            addCriterion("temp_finance_member_record.transaction_type in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<String> values) {
            addCriterion("temp_finance_member_record.transaction_type not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.transaction_type between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.transaction_type not between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyIsNull() {
            addCriterion("temp_finance_member_record.earning_money is null");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyIsNotNull() {
            addCriterion("temp_finance_member_record.earning_money is not null");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.earning_money =", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.earning_money <>", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.earning_money >", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.earning_money >=", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.earning_money <", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.earning_money <=", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.earning_money in", values, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.earning_money not in", values, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.earning_money between", value1, value2, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.earning_money not between", value1, value2, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyIsNull() {
            addCriterion("temp_finance_member_record.expend_money is null");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyIsNotNull() {
            addCriterion("temp_finance_member_record.expend_money is not null");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.expend_money =", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.expend_money <>", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.expend_money >", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.expend_money >=", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.expend_money <", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.expend_money <=", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.expend_money in", values, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.expend_money not in", values, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.expend_money between", value1, value2, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.expend_money not between", value1, value2, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyIsNull() {
            addCriterion("temp_finance_member_record.usable_money is null");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyIsNotNull() {
            addCriterion("temp_finance_member_record.usable_money is not null");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.usable_money =", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.usable_money <>", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.usable_money >", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.usable_money >=", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.usable_money <", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.usable_money <=", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.usable_money in", values, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.usable_money not in", values, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.usable_money between", value1, value2, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.usable_money not between", value1, value2, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIsNull() {
            addCriterion("temp_finance_member_record.frozen_money is null");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIsNotNull() {
            addCriterion("temp_finance_member_record.frozen_money is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.frozen_money =", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.frozen_money <>", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.frozen_money >", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.frozen_money >=", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.frozen_money <", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.frozen_money <=", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.frozen_money in", values, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.frozen_money not in", values, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.frozen_money between", value1, value2, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.frozen_money not between", value1, value2, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyIsNull() {
            addCriterion("temp_finance_member_record.collecting_money is null");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyIsNotNull() {
            addCriterion("temp_finance_member_record.collecting_money is not null");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.collecting_money =", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.collecting_money <>", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.collecting_money >", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.collecting_money >=", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.collecting_money <", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.collecting_money <=", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.collecting_money in", values, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.collecting_money not in", values, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.collecting_money between", value1, value2, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.collecting_money not between", value1, value2, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNull() {
            addCriterion("temp_finance_member_record.refund_money is null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNotNull() {
            addCriterion("temp_finance_member_record.refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.refund_money =", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.refund_money <>", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.refund_money >", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.refund_money >=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.refund_money <", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.refund_money <=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.refund_money in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.refund_money not in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.refund_money between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.refund_money not between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("temp_finance_member_record.amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("temp_finance_member_record.amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_record.amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_record.amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_record.amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_record.amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_member_record.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_member_record.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_member_record.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_member_record.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_member_record.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_member_record.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_member_record.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_member_record.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_member_record.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_member_record.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_member_record.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_member_record.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_member_record.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_member_record.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_member_record.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_member_record.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_member_record.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_member_record.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_member_record.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_member_record.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_member_record.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_member_record.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_member_record.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_member_record.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_member_record.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member_record.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_member_record.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member_record.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_member_record.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_member_record.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member_record.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member_record.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_member_record.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_member_record.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_member_record.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_member_record.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_member_record.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_member_record.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_record.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_member_record.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_member_record.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_member_record.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_member_record.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_record.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_member_record.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_member_record.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_member_record.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_member_record.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_member_record.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member_record.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_member_record.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member_record.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_member_record.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_member_record.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member_record.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member_record.update_time not between", value1, value2, "updateTime");
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