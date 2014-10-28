package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceMemberDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceMemberDetailExample() {
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

        public Criteria andMdetailIdIsNull() {
            addCriterion("temp_finance_member_detail.mdetail_id is null");
            return (Criteria) this;
        }

        public Criteria andMdetailIdIsNotNull() {
            addCriterion("temp_finance_member_detail.mdetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andMdetailIdEqualTo(String value) {
            addCriterion("temp_finance_member_detail.mdetail_id =", value, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdNotEqualTo(String value) {
            addCriterion("temp_finance_member_detail.mdetail_id <>", value, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdGreaterThan(String value) {
            addCriterion("temp_finance_member_detail.mdetail_id >", value, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.mdetail_id >=", value, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdLessThan(String value) {
            addCriterion("temp_finance_member_detail.mdetail_id <", value, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.mdetail_id <=", value, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdLike(String value) {
            addCriterion("temp_finance_member_detail.mdetail_id like", value, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdNotLike(String value) {
            addCriterion("temp_finance_member_detail.mdetail_id not like", value, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdIn(List<String> values) {
            addCriterion("temp_finance_member_detail.mdetail_id in", values, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdNotIn(List<String> values) {
            addCriterion("temp_finance_member_detail.mdetail_id not in", values, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.mdetail_id between", value1, value2, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andMdetailIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.mdetail_id not between", value1, value2, "mdetailId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("temp_finance_member_detail.article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("temp_finance_member_detail.article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(String value) {
            addCriterion("temp_finance_member_detail.article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(String value) {
            addCriterion("temp_finance_member_detail.article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(String value) {
            addCriterion("temp_finance_member_detail.article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(String value) {
            addCriterion("temp_finance_member_detail.article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLike(String value) {
            addCriterion("temp_finance_member_detail.article_id like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotLike(String value) {
            addCriterion("temp_finance_member_detail.article_id not like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<String> values) {
            addCriterion("temp_finance_member_detail.article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<String> values) {
            addCriterion("temp_finance_member_detail.article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeIsNull() {
            addCriterion("temp_finance_member_detail.mdetail_type is null");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeIsNotNull() {
            addCriterion("temp_finance_member_detail.mdetail_type is not null");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeEqualTo(String value) {
            addCriterion("temp_finance_member_detail.mdetail_type =", value, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeNotEqualTo(String value) {
            addCriterion("temp_finance_member_detail.mdetail_type <>", value, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeGreaterThan(String value) {
            addCriterion("temp_finance_member_detail.mdetail_type >", value, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.mdetail_type >=", value, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeLessThan(String value) {
            addCriterion("temp_finance_member_detail.mdetail_type <", value, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.mdetail_type <=", value, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeLike(String value) {
            addCriterion("temp_finance_member_detail.mdetail_type like", value, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeNotLike(String value) {
            addCriterion("temp_finance_member_detail.mdetail_type not like", value, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeIn(List<String> values) {
            addCriterion("temp_finance_member_detail.mdetail_type in", values, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeNotIn(List<String> values) {
            addCriterion("temp_finance_member_detail.mdetail_type not in", values, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.mdetail_type between", value1, value2, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMdetailTypeNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.mdetail_type not between", value1, value2, "mdetailType");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_finance_member_detail.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_finance_member_detail.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_finance_member_detail.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_member_detail.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_member_detail.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_finance_member_detail.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_finance_member_detail.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_finance_member_detail.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_finance_member_detail.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_member_detail.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforIsNull() {
            addCriterion("temp_finance_member_detail.mdetaill_payfor is null");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforIsNotNull() {
            addCriterion("temp_finance_member_detail.mdetaill_payfor is not null");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor =", value, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor <>", value, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor >", value, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor >=", value, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor <", value, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor <=", value, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor in", values, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor not in", values, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor between", value1, value2, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetaillPayforNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_detail.mdetaill_payfor not between", value1, value2, "mdetaillPayfor");
            return (Criteria) this;
        }

        public Criteria andMdetailPayIsNull() {
            addCriterion("temp_finance_member_detail.mdetail_pay is null");
            return (Criteria) this;
        }

        public Criteria andMdetailPayIsNotNull() {
            addCriterion("temp_finance_member_detail.mdetail_pay is not null");
            return (Criteria) this;
        }

        public Criteria andMdetailPayEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetail_pay =", value, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetail_pay <>", value, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetail_pay >", value, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetail_pay >=", value, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayLessThan(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetail_pay <", value, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member_detail.mdetail_pay <=", value, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_detail.mdetail_pay in", values, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member_detail.mdetail_pay not in", values, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_detail.mdetail_pay between", value1, value2, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andMdetailPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member_detail.mdetail_pay not between", value1, value2, "mdetailPay");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_member_detail.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_member_detail.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_member_detail.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_member_detail.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_member_detail.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_member_detail.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_member_detail.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_member_detail.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_member_detail.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_member_detail.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_member_detail.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_member_detail.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_member_detail.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_member_detail.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_member_detail.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_member_detail.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_member_detail.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_member_detail.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_member_detail.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_member_detail.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_member_detail.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_member_detail.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_member_detail.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_member_detail.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_member_detail.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member_detail.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_member_detail.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member_detail.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_member_detail.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_member_detail.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member_detail.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member_detail.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_member_detail.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_member_detail.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_member_detail.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_member_detail.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_member_detail.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_member_detail.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member_detail.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_member_detail.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_member_detail.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_member_detail.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_member_detail.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member_detail.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_member_detail.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_member_detail.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_member_detail.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_member_detail.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_member_detail.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member_detail.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_member_detail.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member_detail.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_member_detail.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_member_detail.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member_detail.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member_detail.update_time not between", value1, value2, "updateTime");
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