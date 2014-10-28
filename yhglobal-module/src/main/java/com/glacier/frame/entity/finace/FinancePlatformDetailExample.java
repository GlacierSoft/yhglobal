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

        public Criteria andArticleIdIsNull() {
            addCriterion("temp_finance_platform_detail.article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("temp_finance_platform_detail.article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(String value) {
            addCriterion("temp_finance_platform_detail.article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLike(String value) {
            addCriterion("temp_finance_platform_detail.article_id like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotLike(String value) {
            addCriterion("temp_finance_platform_detail.article_id not like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("temp_finance_platform_detail.carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("temp_finance_platform_detail.carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(String value) {
            addCriterion("temp_finance_platform_detail.carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(String value) {
            addCriterion("temp_finance_platform_detail.carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_detail.carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(String value) {
            addCriterion("temp_finance_platform_detail.carrier_id like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(String value) {
            addCriterion("temp_finance_platform_detail.carrier_id not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<String> values) {
            addCriterion("temp_finance_platform_detail.carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_detail.carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeIsNull() {
            addCriterion("temp_finance_platform_detail.detail_income is null");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeIsNotNull() {
            addCriterion("temp_finance_platform_detail.detail_income is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_income =", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_income <>", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_income >", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_income >=", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeLessThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_income <", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_income <=", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_income in", values, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_income not in", values, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_income between", value1, value2, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_income not between", value1, value2, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailPayforIsNull() {
            addCriterion("temp_finance_platform_detail.detail_payfor is null");
            return (Criteria) this;
        }

        public Criteria andDetailPayforIsNotNull() {
            addCriterion("temp_finance_platform_detail.detail_payfor is not null");
            return (Criteria) this;
        }

        public Criteria andDetailPayforEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_payfor =", value, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_payfor <>", value, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_payfor >", value, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_payfor >=", value, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforLessThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_payfor <", value, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_payfor <=", value, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_payfor in", values, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_payfor not in", values, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_payfor between", value1, value2, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayforNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_payfor not between", value1, value2, "detailPayfor");
            return (Criteria) this;
        }

        public Criteria andDetailPayIsNull() {
            addCriterion("temp_finance_platform_detail.detail_pay is null");
            return (Criteria) this;
        }

        public Criteria andDetailPayIsNotNull() {
            addCriterion("temp_finance_platform_detail.detail_pay is not null");
            return (Criteria) this;
        }

        public Criteria andDetailPayEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_pay =", value, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_pay <>", value, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_pay >", value, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_pay >=", value, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayLessThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_pay <", value, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_pay <=", value, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_pay in", values, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_pay not in", values, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_pay between", value1, value2, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_pay not between", value1, value2, "detailPay");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveIsNull() {
            addCriterion("temp_finance_platform_detail.detail_leave is null");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveIsNotNull() {
            addCriterion("temp_finance_platform_detail.detail_leave is not null");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_leave =", value, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_leave <>", value, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_leave >", value, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_leave >=", value, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveLessThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_leave <", value, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_leave <=", value, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_leave in", values, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_leave not in", values, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_leave between", value1, value2, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailLeaveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_leave not between", value1, value2, "detailLeave");
            return (Criteria) this;
        }

        public Criteria andDetailMarkIsNull() {
            addCriterion("temp_finance_platform_detail.detail_mark is null");
            return (Criteria) this;
        }

        public Criteria andDetailMarkIsNotNull() {
            addCriterion("temp_finance_platform_detail.detail_mark is not null");
            return (Criteria) this;
        }

        public Criteria andDetailMarkEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_mark =", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_mark <>", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_mark >", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_mark >=", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkLessThan(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_mark <", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_platform_detail.detail_mark <=", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_mark in", values, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_platform_detail.detail_mark not in", values, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_mark between", value1, value2, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_platform_detail.detail_mark not between", value1, value2, "detailMark");
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