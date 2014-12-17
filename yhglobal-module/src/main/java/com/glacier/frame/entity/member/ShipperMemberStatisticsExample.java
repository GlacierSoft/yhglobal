package com.glacier.frame.entity.member;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShipperMemberStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ShipperMemberStatisticsExample() {
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

        public Criteria andStatisticsIdIsNull() {
            addCriterion("temp_shipper_member_statistics.statistics_id is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdIsNotNull() {
            addCriterion("temp_shipper_member_statistics.statistics_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdEqualTo(String value) {
            addCriterion("temp_shipper_member_statistics.statistics_id =", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotEqualTo(String value) {
            addCriterion("temp_shipper_member_statistics.statistics_id <>", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdGreaterThan(String value) {
            addCriterion("temp_shipper_member_statistics.statistics_id >", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_statistics.statistics_id >=", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLessThan(String value) {
            addCriterion("temp_shipper_member_statistics.statistics_id <", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_statistics.statistics_id <=", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLike(String value) {
            addCriterion("temp_shipper_member_statistics.statistics_id like", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotLike(String value) {
            addCriterion("temp_shipper_member_statistics.statistics_id not like", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdIn(List<String> values) {
            addCriterion("temp_shipper_member_statistics.statistics_id in", values, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotIn(List<String> values) {
            addCriterion("temp_shipper_member_statistics.statistics_id not in", values, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_statistics.statistics_id between", value1, value2, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_statistics.statistics_id not between", value1, value2, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_shipper_member_statistics.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_shipper_member_statistics.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_shipper_member_statistics.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_shipper_member_statistics.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_shipper_member_statistics.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_statistics.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_shipper_member_statistics.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_statistics.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_shipper_member_statistics.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_shipper_member_statistics.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_shipper_member_statistics.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_shipper_member_statistics.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_statistics.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_statistics.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCountstatusIsNull() {
            addCriterion("temp_shipper_member_statistics.countStatus is null");
            return (Criteria) this;
        }

        public Criteria andCountstatusIsNotNull() {
            addCriterion("temp_shipper_member_statistics.countStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCountstatusEqualTo(Integer value) {
            addCriterion("temp_shipper_member_statistics.countStatus =", value, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusNotEqualTo(Integer value) {
            addCriterion("temp_shipper_member_statistics.countStatus <>", value, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusGreaterThan(Integer value) {
            addCriterion("temp_shipper_member_statistics.countStatus >", value, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_shipper_member_statistics.countStatus >=", value, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusLessThan(Integer value) {
            addCriterion("temp_shipper_member_statistics.countStatus <", value, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusLessThanOrEqualTo(Integer value) {
            addCriterion("temp_shipper_member_statistics.countStatus <=", value, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusIn(List<Integer> values) {
            addCriterion("temp_shipper_member_statistics.countStatus in", values, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusNotIn(List<Integer> values) {
            addCriterion("temp_shipper_member_statistics.countStatus not in", values, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusBetween(Integer value1, Integer value2) {
            addCriterion("temp_shipper_member_statistics.countStatus between", value1, value2, "countstatus");
            return (Criteria) this;
        }

        public Criteria andCountstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_shipper_member_statistics.countStatus not between", value1, value2, "countstatus");
            return (Criteria) this;
        }

        public Criteria andMrechageaddIsNull() {
            addCriterion("temp_shipper_member_statistics.mrechageAdd is null");
            return (Criteria) this;
        }

        public Criteria andMrechageaddIsNotNull() {
            addCriterion("temp_shipper_member_statistics.mrechageAdd is not null");
            return (Criteria) this;
        }

        public Criteria andMrechageaddEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd =", value, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd <>", value, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd >", value, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd >=", value, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd <", value, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd <=", value, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd in", values, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd not in", values, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd between", value1, value2, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andMrechageaddNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.mrechageAdd not between", value1, value2, "mrechageadd");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyIsNull() {
            addCriterion("temp_shipper_member_statistics.receiveMoney is null");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyIsNotNull() {
            addCriterion("temp_shipper_member_statistics.receiveMoney is not null");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.receiveMoney =", value, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.receiveMoney <>", value, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.receiveMoney >", value, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.receiveMoney >=", value, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.receiveMoney <", value, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.receiveMoney <=", value, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.receiveMoney in", values, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.receiveMoney not in", values, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.receiveMoney between", value1, value2, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andReceivemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.receiveMoney not between", value1, value2, "receivemoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyIsNull() {
            addCriterion("temp_shipper_member_statistics.withdrawMoney is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyIsNotNull() {
            addCriterion("temp_shipper_member_statistics.withdrawMoney is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney =", value, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney <>", value, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney >", value, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney >=", value, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney <", value, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney <=", value, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney in", values, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney not in", values, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney between", value1, value2, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.withdrawMoney not between", value1, value2, "withdrawmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyIsNull() {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyIsNotNull() {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney =", value, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney <>", value, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney >", value, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney >=", value, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney <", value, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney <=", value, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney in", values, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney not in", values, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney between", value1, value2, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawreallymoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.withdrawReallyMoney not between", value1, value2, "withdrawreallymoney");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkIsNull() {
            addCriterion("temp_shipper_member_statistics.mrechargeMark is null");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkIsNotNull() {
            addCriterion("temp_shipper_member_statistics.mrechargeMark is not null");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark =", value, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark <>", value, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark >", value, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark >=", value, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark <", value, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark <=", value, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark in", values, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark not in", values, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark between", value1, value2, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andMrechargemarkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.mrechargeMark not between", value1, value2, "mrechargemark");
            return (Criteria) this;
        }

        public Criteria andCounttransportationIsNull() {
            addCriterion("temp_shipper_member_statistics.countTransportation is null");
            return (Criteria) this;
        }

        public Criteria andCounttransportationIsNotNull() {
            addCriterion("temp_shipper_member_statistics.countTransportation is not null");
            return (Criteria) this;
        }

        public Criteria andCounttransportationEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countTransportation =", value, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countTransportation <>", value, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countTransportation >", value, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countTransportation >=", value, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countTransportation <", value, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countTransportation <=", value, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.countTransportation in", values, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.countTransportation not in", values, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.countTransportation between", value1, value2, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCounttransportationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.countTransportation not between", value1, value2, "counttransportation");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceIsNull() {
            addCriterion("temp_shipper_member_statistics.countInsurance is null");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceIsNotNull() {
            addCriterion("temp_shipper_member_statistics.countInsurance is not null");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countInsurance =", value, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countInsurance <>", value, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countInsurance >", value, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countInsurance >=", value, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countInsurance <", value, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countInsurance <=", value, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.countInsurance in", values, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.countInsurance not in", values, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.countInsurance between", value1, value2, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountinsuranceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.countInsurance not between", value1, value2, "countinsurance");
            return (Criteria) this;
        }

        public Criteria andCountgoodsIsNull() {
            addCriterion("temp_shipper_member_statistics.countGoods is null");
            return (Criteria) this;
        }

        public Criteria andCountgoodsIsNotNull() {
            addCriterion("temp_shipper_member_statistics.countGoods is not null");
            return (Criteria) this;
        }

        public Criteria andCountgoodsEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countGoods =", value, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countGoods <>", value, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countGoods >", value, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countGoods >=", value, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countGoods <", value, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_statistics.countGoods <=", value, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.countGoods in", values, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_statistics.countGoods not in", values, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.countGoods between", value1, value2, "countgoods");
            return (Criteria) this;
        }

        public Criteria andCountgoodsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_statistics.countGoods not between", value1, value2, "countgoods");
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