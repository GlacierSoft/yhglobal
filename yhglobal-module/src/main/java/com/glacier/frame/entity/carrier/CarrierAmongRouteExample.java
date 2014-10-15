package com.glacier.frame.entity.carrier;

import java.util.ArrayList;
import java.util.List;

public class CarrierAmongRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CarrierAmongRouteExample() {
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

        public Criteria andAmongIdIsNull() {
            addCriterion("temp_carrier_among_route.among_id is null");
            return (Criteria) this;
        }

        public Criteria andAmongIdIsNotNull() {
            addCriterion("temp_carrier_among_route.among_id is not null");
            return (Criteria) this;
        }

        public Criteria andAmongIdEqualTo(String value) {
            addCriterion("temp_carrier_among_route.among_id =", value, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdNotEqualTo(String value) {
            addCriterion("temp_carrier_among_route.among_id <>", value, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdGreaterThan(String value) {
            addCriterion("temp_carrier_among_route.among_id >", value, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_among_route.among_id >=", value, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdLessThan(String value) {
            addCriterion("temp_carrier_among_route.among_id <", value, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_among_route.among_id <=", value, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdLike(String value) {
            addCriterion("temp_carrier_among_route.among_id like", value, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdNotLike(String value) {
            addCriterion("temp_carrier_among_route.among_id not like", value, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdIn(List<String> values) {
            addCriterion("temp_carrier_among_route.among_id in", values, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdNotIn(List<String> values) {
            addCriterion("temp_carrier_among_route.among_id not in", values, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_among_route.among_id between", value1, value2, "amongId");
            return (Criteria) this;
        }

        public Criteria andAmongIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_among_route.among_id not between", value1, value2, "amongId");
            return (Criteria) this;
        }

        public Criteria andRouterIdIsNull() {
            addCriterion("temp_carrier_among_route.router_id is null");
            return (Criteria) this;
        }

        public Criteria andRouterIdIsNotNull() {
            addCriterion("temp_carrier_among_route.router_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouterIdEqualTo(String value) {
            addCriterion("temp_carrier_among_route.router_id =", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotEqualTo(String value) {
            addCriterion("temp_carrier_among_route.router_id <>", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThan(String value) {
            addCriterion("temp_carrier_among_route.router_id >", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_among_route.router_id >=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThan(String value) {
            addCriterion("temp_carrier_among_route.router_id <", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_among_route.router_id <=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLike(String value) {
            addCriterion("temp_carrier_among_route.router_id like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotLike(String value) {
            addCriterion("temp_carrier_among_route.router_id not like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdIn(List<String> values) {
            addCriterion("temp_carrier_among_route.router_id in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotIn(List<String> values) {
            addCriterion("temp_carrier_among_route.router_id not in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_among_route.router_id between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_among_route.router_id not between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNull() {
            addCriterion("temp_carrier_among_route.carrier_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNotNull() {
            addCriterion("temp_carrier_among_route.carrier_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdEqualTo(String value) {
            addCriterion("temp_carrier_among_route.carrier_member_id =", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotEqualTo(String value) {
            addCriterion("temp_carrier_among_route.carrier_member_id <>", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThan(String value) {
            addCriterion("temp_carrier_among_route.carrier_member_id >", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_among_route.carrier_member_id >=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThan(String value) {
            addCriterion("temp_carrier_among_route.carrier_member_id <", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_among_route.carrier_member_id <=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLike(String value) {
            addCriterion("temp_carrier_among_route.carrier_member_id like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotLike(String value) {
            addCriterion("temp_carrier_among_route.carrier_member_id not like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIn(List<String> values) {
            addCriterion("temp_carrier_among_route.carrier_member_id in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotIn(List<String> values) {
            addCriterion("temp_carrier_among_route.carrier_member_id not in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_among_route.carrier_member_id between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_among_route.carrier_member_id not between", value1, value2, "carrierMemberId");
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