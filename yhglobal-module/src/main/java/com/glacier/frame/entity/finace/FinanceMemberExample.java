package com.glacier.frame.entity.finace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceMemberExample() {
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
        
        public Criteria andMemberDisplayLike(String value) {
        	addCriterion("temp_shipper_member.member_name like",value,"memberDisplay");
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

        public Criteria andMrechageIdIsNull() {
            addCriterion("temp_finance_member.mrechage_id is null");
            return (Criteria) this;
        }

        public Criteria andMrechageIdIsNotNull() {
            addCriterion("temp_finance_member.mrechage_id is not null");
            return (Criteria) this;
        }

        public Criteria andMrechageIdEqualTo(String value) {
            addCriterion("temp_finance_member.mrechage_id =", value, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdNotEqualTo(String value) {
            addCriterion("temp_finance_member.mrechage_id <>", value, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdGreaterThan(String value) {
            addCriterion("temp_finance_member.mrechage_id >", value, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.mrechage_id >=", value, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdLessThan(String value) {
            addCriterion("temp_finance_member.mrechage_id <", value, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.mrechage_id <=", value, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdLike(String value) {
            addCriterion("temp_finance_member.mrechage_id like", value, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdNotLike(String value) {
            addCriterion("temp_finance_member.mrechage_id not like", value, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdIn(List<String> values) {
            addCriterion("temp_finance_member.mrechage_id in", values, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdNotIn(List<String> values) {
            addCriterion("temp_finance_member.mrechage_id not in", values, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member.mrechage_id between", value1, value2, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMrechageIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.mrechage_id not between", value1, value2, "mrechageId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_finance_member.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_finance_member.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_finance_member.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_member.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_member.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_finance_member.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_finance_member.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_finance_member.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_finance_member.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_member.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMrechageAddIsNull() {
            addCriterion("temp_finance_member.mrechage_add is null");
            return (Criteria) this;
        }

        public Criteria andMrechageAddIsNotNull() {
            addCriterion("temp_finance_member.mrechage_add is not null");
            return (Criteria) this;
        }

        public Criteria andMrechageAddEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_add =", value, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_add <>", value, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_add >", value, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_add >=", value, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddLessThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_add <", value, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_add <=", value, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrechage_add in", values, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrechage_add not in", values, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrechage_add between", value1, value2, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechageAddNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrechage_add not between", value1, value2, "mrechageAdd");
            return (Criteria) this;
        }

        public Criteria andMrechagePayIsNull() {
            addCriterion("temp_finance_member.mrechage_pay is null");
            return (Criteria) this;
        }

        public Criteria andMrechagePayIsNotNull() {
            addCriterion("temp_finance_member.mrechage_pay is not null");
            return (Criteria) this;
        }

        public Criteria andMrechagePayEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_pay =", value, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_pay <>", value, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_pay >", value, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_pay >=", value, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayLessThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_pay <", value, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_pay <=", value, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrechage_pay in", values, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrechage_pay not in", values, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrechage_pay between", value1, value2, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrechage_pay not between", value1, value2, "mrechagePay");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferIsNull() {
            addCriterion("temp_finance_member.mrechage_prefer is null");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferIsNotNull() {
            addCriterion("temp_finance_member.mrechage_prefer is not null");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_prefer =", value, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_prefer <>", value, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_prefer >", value, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_prefer >=", value, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferLessThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_prefer <", value, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_prefer <=", value, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrechage_prefer in", values, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrechage_prefer not in", values, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrechage_prefer between", value1, value2, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechagePreferNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrechage_prefer not between", value1, value2, "mrechagePrefer");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainIsNull() {
            addCriterion("temp_finance_member.mrechage_remain is null");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainIsNotNull() {
            addCriterion("temp_finance_member.mrechage_remain is not null");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_remain =", value, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_remain <>", value, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_remain >", value, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_remain >=", value, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainLessThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_remain <", value, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrechage_remain <=", value, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrechage_remain in", values, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrechage_remain not in", values, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrechage_remain between", value1, value2, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechageRemainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrechage_remain not between", value1, value2, "mrechageRemain");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkIsNull() {
            addCriterion("temp_finance_member.mrecharge_mark is null");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkIsNotNull() {
            addCriterion("temp_finance_member.mrecharge_mark is not null");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrecharge_mark =", value, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkNotEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrecharge_mark <>", value, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkGreaterThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrecharge_mark >", value, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrecharge_mark >=", value, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkLessThan(BigDecimal value) {
            addCriterion("temp_finance_member.mrecharge_mark <", value, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_finance_member.mrecharge_mark <=", value, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrecharge_mark in", values, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkNotIn(List<BigDecimal> values) {
            addCriterion("temp_finance_member.mrecharge_mark not in", values, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrecharge_mark between", value1, value2, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andMrechargeMarkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_finance_member.mrecharge_mark not between", value1, value2, "mrechargeMark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_member.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_member.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_member.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_member.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_member.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_member.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_member.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_member.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_member.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_member.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_member.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_member.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_member.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_member.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_member.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_member.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_member.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_member.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_member.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_member.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_member.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_member.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_member.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_member.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_member.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_member.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_member.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_member.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_member.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_member.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_member.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_member.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_member.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_member.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_member.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_member.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_member.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_member.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_member.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_member.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_member.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_member.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_member.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_member.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_member.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_member.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_member.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_member.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_member.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member.update_time not between", value1, value2, "updateTime");
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