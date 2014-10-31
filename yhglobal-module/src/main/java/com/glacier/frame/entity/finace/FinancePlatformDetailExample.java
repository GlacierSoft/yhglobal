package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancePlatformDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinancePlatformDetailExample() {
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
        
        //自定义查询方法
        public Criteria andPlatformNameLike(String value) {
            addCriterion("temp_finance_platform.platform_name like", value, "platformName");
            return (Criteria) this;
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

        public Criteria andDetailIdIsNull() {
            addCriterion("temp_finance_platform_detail.detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("temp_finance_platform_detail.detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("temp_finance_platform_detail.detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("temp_finance_platform_detail.detail_id like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("temp_finance_platform_detail.detail_id not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("temp_finance_platform_detail.platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("temp_finance_platform_detail.platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(String value) {
            addCriterion("temp_finance_platform_detail.platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLike(String value) {
            addCriterion("temp_finance_platform_detail.platform_id like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotLike(String value) {
            addCriterion("temp_finance_platform_detail.platform_id not like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andTradeTargetIsNull() {
            addCriterion("temp_finance_platform_detail.trade_target is null");
            return (Criteria) this;
        }

        public Criteria andTradeTargetIsNotNull() {
            addCriterion("temp_finance_platform_detail.trade_target is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTargetEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.trade_target =", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.trade_target <>", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.trade_target >", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.trade_target >=", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetLessThan(String value) {
            addCriterion("temp_finance_platform_detail.trade_target <", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.trade_target <=", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetLike(String value) {
            addCriterion("temp_finance_platform_detail.trade_target like", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetNotLike(String value) {
            addCriterion("temp_finance_platform_detail.trade_target not like", value, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.trade_target in", values, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.trade_target not in", values, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.trade_target between", value1, value2, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTargetNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.trade_target not between", value1, value2, "tradeTarget");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("temp_finance_platform_detail.trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("temp_finance_platform_detail.trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("temp_finance_platform_detail.trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("temp_finance_platform_detail.trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("temp_finance_platform_detail.trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeEarnIsNull() {
            addCriterion("temp_finance_platform_detail.trade_earn is null");
            return (Criteria) this;
        }

        public Criteria andTradeEarnIsNotNull() {
            addCriterion("temp_finance_platform_detail.trade_earn is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEarnEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_earn =", value, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_earn <>", value, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_earn >", value, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_earn >=", value, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnLessThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_earn <", value, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_earn <=", value, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.trade_earn in", values, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.trade_earn not in", values, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.trade_earn between", value1, value2, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeEarnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.trade_earn not between", value1, value2, "tradeEarn");
            return (Criteria) this;
        }

        public Criteria andTradeSpendIsNull() {
            addCriterion("temp_finance_platform_detail.trade_spend is null");
            return (Criteria) this;
        }

        public Criteria andTradeSpendIsNotNull() {
            addCriterion("temp_finance_platform_detail.trade_spend is not null");
            return (Criteria) this;
        }

        public Criteria andTradeSpendEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_spend =", value, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_spend <>", value, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_spend >", value, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_spend >=", value, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendLessThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_spend <", value, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_spend <=", value, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.trade_spend in", values, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.trade_spend not in", values, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.trade_spend between", value1, value2, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeSpendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.trade_spend not between", value1, value2, "tradeSpend");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("temp_finance_platform_detail.trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("temp_finance_platform_detail.trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_platform_detail.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_platform_detail.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_platform_detail.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_platform_detail.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_platform_detail.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_platform_detail.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_platform_detail.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_platform_detail.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_platform_detail.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_platform_detail.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_platform_detail.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_platform_detail.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_platform_detail.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_platform_detail.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_platform_detail.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform_detail.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_platform_detail.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform_detail.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_platform_detail.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_platform_detail.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform_detail.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform_detail.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_platform_detail.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_platform_detail.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_platform_detail.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_platform_detail.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_platform_detail.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_platform_detail.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_platform_detail.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_platform_detail.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_platform_detail.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_platform_detail.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform_detail.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_platform_detail.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform_detail.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_platform_detail.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_platform_detail.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform_detail.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform_detail.update_time not between", value1, value2, "updateTime");
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