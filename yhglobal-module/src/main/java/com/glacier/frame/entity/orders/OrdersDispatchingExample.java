package com.glacier.frame.entity.orders;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersDispatchingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OrdersDispatchingExample() {
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

        public Criteria andDispatchingIdIsNull() {
            addCriterion("temp_orders_dispatching.dispatching_id is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdIsNotNull() {
            addCriterion("temp_orders_dispatching.dispatching_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_id =", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_id <>", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.dispatching_id >", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_id >=", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdLessThan(String value) {
            addCriterion("temp_orders_dispatching.dispatching_id <", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_id <=", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdLike(String value) {
            addCriterion("temp_orders_dispatching.dispatching_id like", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdNotLike(String value) {
            addCriterion("temp_orders_dispatching.dispatching_id not like", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdIn(List<String> values) {
            addCriterion("temp_orders_dispatching.dispatching_id in", values, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.dispatching_id not in", values, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.dispatching_id between", value1, value2, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.dispatching_id not between", value1, value2, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeIsNull() {
            addCriterion("temp_orders_dispatching.dispatching_code is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeIsNotNull() {
            addCriterion("temp_orders_dispatching.dispatching_code is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_code =", value, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_code <>", value, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.dispatching_code >", value, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_code >=", value, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeLessThan(String value) {
            addCriterion("temp_orders_dispatching.dispatching_code <", value, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_code <=", value, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeLike(String value) {
            addCriterion("temp_orders_dispatching.dispatching_code like", value, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeNotLike(String value) {
            addCriterion("temp_orders_dispatching.dispatching_code not like", value, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeIn(List<String> values) {
            addCriterion("temp_orders_dispatching.dispatching_code in", values, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.dispatching_code not in", values, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.dispatching_code between", value1, value2, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andDispatchingCodeNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.dispatching_code not between", value1, value2, "dispatchingCode");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("temp_orders_dispatching.carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("temp_orders_dispatching.carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(String value) {
            addCriterion("temp_orders_dispatching.carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(String value) {
            addCriterion("temp_orders_dispatching.carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(String value) {
            addCriterion("temp_orders_dispatching.carrier_id like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(String value) {
            addCriterion("temp_orders_dispatching.carrier_id not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<String> values) {
            addCriterion("temp_orders_dispatching.carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositIsNull() {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositIsNotNull() {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositEqualTo(BigDecimal value) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit =", value, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositNotEqualTo(BigDecimal value) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit <>", value, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositGreaterThan(BigDecimal value) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit >", value, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit >=", value, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositLessThan(BigDecimal value) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit <", value, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit <=", value, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositIn(List<BigDecimal> values) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit in", values, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositNotIn(List<BigDecimal> values) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit not in", values, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit between", value1, value2, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingGoodsDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_orders_dispatching.dispatching_goods_deposit not between", value1, value2, "dispatchingGoodsDeposit");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusIsNull() {
            addCriterion("temp_orders_dispatching.dispatching_status is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusIsNotNull() {
            addCriterion("temp_orders_dispatching.dispatching_status is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_status =", value, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_status <>", value, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.dispatching_status >", value, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_status >=", value, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusLessThan(String value) {
            addCriterion("temp_orders_dispatching.dispatching_status <", value, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_status <=", value, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusLike(String value) {
            addCriterion("temp_orders_dispatching.dispatching_status like", value, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusNotLike(String value) {
            addCriterion("temp_orders_dispatching.dispatching_status not like", value, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusIn(List<String> values) {
            addCriterion("temp_orders_dispatching.dispatching_status in", values, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.dispatching_status not in", values, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.dispatching_status between", value1, value2, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchingStatusNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.dispatching_status not between", value1, value2, "dispatchingStatus");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("temp_orders_dispatching.driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("temp_orders_dispatching.driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("temp_orders_dispatching.driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("temp_orders_dispatching.driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("temp_orders_dispatching.driver_id like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("temp_orders_dispatching.driver_id not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("temp_orders_dispatching.driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforIsNull() {
            addCriterion("temp_orders_dispatching.dispatching_signfor is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforIsNotNull() {
            addCriterion("temp_orders_dispatching.dispatching_signfor is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_signfor =", value, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_signfor <>", value, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.dispatching_signfor >", value, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_signfor >=", value, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforLessThan(String value) {
            addCriterion("temp_orders_dispatching.dispatching_signfor <", value, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.dispatching_signfor <=", value, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforLike(String value) {
            addCriterion("temp_orders_dispatching.dispatching_signfor like", value, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforNotLike(String value) {
            addCriterion("temp_orders_dispatching.dispatching_signfor not like", value, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforIn(List<String> values) {
            addCriterion("temp_orders_dispatching.dispatching_signfor in", values, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.dispatching_signfor not in", values, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.dispatching_signfor between", value1, value2, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andDispatchingSignforNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.dispatching_signfor not between", value1, value2, "dispatchingSignfor");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("temp_orders_dispatching.car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("temp_orders_dispatching.car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("temp_orders_dispatching.car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("temp_orders_dispatching.car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("temp_orders_dispatching.car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("temp_orders_dispatching.car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("temp_orders_dispatching.car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIsNull() {
            addCriterion("temp_orders_dispatching.dispatch_time is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIsNotNull() {
            addCriterion("temp_orders_dispatching.dispatch_time is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.dispatch_time =", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.dispatch_time <>", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThan(Date value) {
            addCriterion("temp_orders_dispatching.dispatch_time >", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.dispatch_time >=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThan(Date value) {
            addCriterion("temp_orders_dispatching.dispatch_time <", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.dispatch_time <=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIn(List<Date> values) {
            addCriterion("temp_orders_dispatching.dispatch_time in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotIn(List<Date> values) {
            addCriterion("temp_orders_dispatching.dispatch_time not in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeBetween(Date value1, Date value2) {
            addCriterion("temp_orders_dispatching.dispatch_time between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_orders_dispatching.dispatch_time not between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("temp_orders_dispatching.arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("temp_orders_dispatching.arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(Date value) {
            addCriterion("temp_orders_dispatching.arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(Date value) {
            addCriterion("temp_orders_dispatching.arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<Date> values) {
            addCriterion("temp_orders_dispatching.arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<Date> values) {
            addCriterion("temp_orders_dispatching.arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(Date value1, Date value2) {
            addCriterion("temp_orders_dispatching.arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_orders_dispatching.arrive_time not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_orders_dispatching.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_orders_dispatching.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_orders_dispatching.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_orders_dispatching.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_orders_dispatching.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_orders_dispatching.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_orders_dispatching.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_orders_dispatching.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_orders_dispatching.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_orders_dispatching.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_orders_dispatching.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_orders_dispatching.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_orders_dispatching.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_orders_dispatching.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_orders_dispatching.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_orders_dispatching.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_orders_dispatching.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_orders_dispatching.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_orders_dispatching.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_orders_dispatching.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_orders_dispatching.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_orders_dispatching.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_orders_dispatching.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_orders_dispatching.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_orders_dispatching.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_orders_dispatching.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_orders_dispatching.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_orders_dispatching.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_dispatching.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_orders_dispatching.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_orders_dispatching.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_orders_dispatching.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_orders_dispatching.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_orders_dispatching.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_orders_dispatching.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_orders_dispatching.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_orders_dispatching.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_orders_dispatching.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_orders_dispatching.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_orders_dispatching.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_orders_dispatching.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_orders_dispatching.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_orders_dispatching.update_time not between", value1, value2, "updateTime");
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