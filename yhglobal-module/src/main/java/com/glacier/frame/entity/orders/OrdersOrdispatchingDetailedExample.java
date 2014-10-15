package com.glacier.frame.entity.orders;

import java.util.ArrayList;
import java.util.List;

public class OrdersOrdispatchingDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OrdersOrdispatchingDetailedExample() {
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

        public Criteria andOrdisdetailedIdIsNull() {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdIsNotNull() {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id =", value, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdNotEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id <>", value, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdGreaterThan(String value) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id >", value, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id >=", value, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdLessThan(String value) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id <", value, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id <=", value, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdLike(String value) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id like", value, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdNotLike(String value) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id not like", value, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdIn(List<String> values) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id in", values, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdNotIn(List<String> values) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id not in", values, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdBetween(String value1, String value2) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id between", value1, value2, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrdisdetailedIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_ordispatching_detailed.ordisdetailed_id not between", value1, value2, "ordisdetailedId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("temp_orders_ordispatching_detailed.order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("temp_orders_ordispatching_detailed.order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("temp_orders_ordispatching_detailed.order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("temp_orders_ordispatching_detailed.order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("temp_orders_ordispatching_detailed.order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("temp_orders_ordispatching_detailed.order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("temp_orders_ordispatching_detailed.order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("temp_orders_ordispatching_detailed.order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("temp_orders_ordispatching_detailed.order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_ordispatching_detailed.order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdIsNull() {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdIsNotNull() {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id =", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdNotEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id <>", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdGreaterThan(String value) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id >", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id >=", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdLessThan(String value) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id <", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id <=", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdLike(String value) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id like", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdNotLike(String value) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id not like", value, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdIn(List<String> values) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id in", values, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdNotIn(List<String> values) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id not in", values, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdBetween(String value1, String value2) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id between", value1, value2, "dispatchingId");
            return (Criteria) this;
        }

        public Criteria andDispatchingIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_ordispatching_detailed.dispatching_id not between", value1, value2, "dispatchingId");
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