package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceCarrierDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceCarrierDetailExample() {
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

        public Criteria andCarrierMemberDisplayLike(String value) {
            addCriterion("temp_carrier.member_name like", value, "carrierMemberDisplay");
            return (Criteria) this;
        }
        
        public Criteria andArticleDisplayLike(String value) {
            addCriterion("temp_belaidup.belaidup_prod_name like", value, "articleDisplay");
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
            addCriterion("temp_finance_carrier_detail.detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("temp_finance_carrier_detail.detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("temp_finance_carrier_detail.detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("temp_finance_carrier_detail.detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("temp_finance_carrier_detail.detail_id like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("temp_finance_carrier_detail.detail_id not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("temp_finance_carrier_detail.carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("temp_finance_carrier_detail.carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(String value) {
            addCriterion("temp_finance_carrier_detail.carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(String value) {
            addCriterion("temp_finance_carrier_detail.carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(String value) {
            addCriterion("temp_finance_carrier_detail.carrier_id like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(String value) {
            addCriterion("temp_finance_carrier_detail.carrier_id not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("temp_finance_carrier_detail.article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("temp_finance_carrier_detail.article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(String value) {
            addCriterion("temp_finance_carrier_detail.article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(String value) {
            addCriterion("temp_finance_carrier_detail.article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLike(String value) {
            addCriterion("temp_finance_carrier_detail.article_id like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotLike(String value) {
            addCriterion("temp_finance_carrier_detail.article_id not like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeIsNull() {
            addCriterion("temp_finance_carrier_detail.detail_income is null");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeIsNotNull() {
            addCriterion("temp_finance_carrier_detail.detail_income is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_income =", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_income <>", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_income >", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_income >=", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_income <", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_income <=", value, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_income in", values, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_income not in", values, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_income between", value1, value2, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_income not between", value1, value2, "detailIncome");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeIsNull() {
            addCriterion("temp_finance_carrier_detail.detail_freeze is null");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeIsNotNull() {
            addCriterion("temp_finance_carrier_detail.detail_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_freeze =", value, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_freeze <>", value, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_freeze >", value, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_freeze >=", value, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_freeze <", value, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_freeze <=", value, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_freeze in", values, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_freeze not in", values, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_freeze between", value1, value2, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailFreezeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_freeze not between", value1, value2, "detailFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailStartIsNull() {
            addCriterion("temp_finance_carrier_detail.detail_start is null");
            return (Criteria) this;
        }

        public Criteria andDetailStartIsNotNull() {
            addCriterion("temp_finance_carrier_detail.detail_start is not null");
            return (Criteria) this;
        }

        public Criteria andDetailStartEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_start =", value, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_start <>", value, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_start >", value, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_start >=", value, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_start <", value, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_start <=", value, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_start in", values, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_start not in", values, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_start between", value1, value2, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailStartNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_start not between", value1, value2, "detailStart");
            return (Criteria) this;
        }

        public Criteria andDetailEndIsNull() {
            addCriterion("temp_finance_carrier_detail.detail_end is null");
            return (Criteria) this;
        }

        public Criteria andDetailEndIsNotNull() {
            addCriterion("temp_finance_carrier_detail.detail_end is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEndEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_end =", value, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_end <>", value, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_end >", value, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_end >=", value, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_end <", value, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_end <=", value, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_end in", values, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_end not in", values, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_end between", value1, value2, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andDetailEndNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_end not between", value1, value2, "detailEnd");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeIsNull() {
            addCriterion("temp_finance_carrier_detail.remove_freeze is null");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeIsNotNull() {
            addCriterion("temp_finance_carrier_detail.remove_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.remove_freeze =", value, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.remove_freeze <>", value, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.remove_freeze >", value, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.remove_freeze >=", value, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.remove_freeze <", value, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.remove_freeze <=", value, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.remove_freeze in", values, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.remove_freeze not in", values, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.remove_freeze between", value1, value2, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andRemoveFreezeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.remove_freeze not between", value1, value2, "removeFreeze");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIsNull() {
            addCriterion("temp_finance_carrier_detail.detail_status is null");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIsNotNull() {
            addCriterion("temp_finance_carrier_detail.detail_status is not null");
            return (Criteria) this;
        }

        public Criteria andDetailStatusEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.detail_status =", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.detail_status <>", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusGreaterThan(String value) {
            addCriterion("temp_finance_carrier_detail.detail_status >", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.detail_status >=", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLessThan(String value) {
            addCriterion("temp_finance_carrier_detail.detail_status <", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.detail_status <=", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLike(String value) {
            addCriterion("temp_finance_carrier_detail.detail_status like", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotLike(String value) {
            addCriterion("temp_finance_carrier_detail.detail_status not like", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.detail_status in", values, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.detail_status not in", values, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.detail_status between", value1, value2, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.detail_status not between", value1, value2, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailMarkIsNull() {
            addCriterion("temp_finance_carrier_detail.detail_mark is null");
            return (Criteria) this;
        }

        public Criteria andDetailMarkIsNotNull() {
            addCriterion("temp_finance_carrier_detail.detail_mark is not null");
            return (Criteria) this;
        }

        public Criteria andDetailMarkEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_mark =", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_mark <>", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_mark >", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_mark >=", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_mark <", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_mark <=", value, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_mark in", values, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_mark not in", values, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_mark between", value1, value2, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailMarkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_mark not between", value1, value2, "detailMark");
            return (Criteria) this;
        }

        public Criteria andDetailReturnIsNull() {
            addCriterion("temp_finance_carrier_detail.detail_return is null");
            return (Criteria) this;
        }

        public Criteria andDetailReturnIsNotNull() {
            addCriterion("temp_finance_carrier_detail.detail_return is not null");
            return (Criteria) this;
        }

        public Criteria andDetailReturnEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_return =", value, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_return <>", value, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_return >", value, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_return >=", value, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnLessThan(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_return <", value, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_carrier_detail.detail_return <=", value, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_return in", values, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_carrier_detail.detail_return not in", values, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_return between", value1, value2, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andDetailReturnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_carrier_detail.detail_return not between", value1, value2, "detailReturn");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_carrier_detail.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_carrier_detail.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_carrier_detail.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_carrier_detail.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_carrier_detail.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_carrier_detail.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_carrier_detail.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_carrier_detail.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_carrier_detail.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_carrier_detail.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_carrier_detail.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_carrier_detail.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_carrier_detail.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_carrier_detail.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_carrier_detail.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_carrier_detail.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_carrier_detail.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_carrier_detail.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_carrier_detail.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_carrier_detail.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_carrier_detail.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_carrier_detail.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_carrier_detail.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_carrier_detail.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_carrier_detail.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_carrier_detail.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_carrier_detail.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_carrier_detail.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_carrier_detail.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_carrier_detail.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_carrier_detail.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_carrier_detail.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_carrier_detail.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_carrier_detail.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_carrier_detail.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_carrier_detail.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_carrier_detail.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_carrier_detail.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_carrier_detail.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_carrier_detail.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_carrier_detail.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_carrier_detail.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_carrier_detail.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_carrier_detail.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_carrier_detail.update_time not between", value1, value2, "updateTime");
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