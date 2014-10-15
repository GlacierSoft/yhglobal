package com.glacier.frame.entity.carrier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrierDeliverGoodsAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CarrierDeliverGoodsAreaExample() {
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

        public Criteria andDeliverGoodsAreaIdIsNull() {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdIsNotNull() {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id =", value, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdNotEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id <>", value, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdGreaterThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id >", value, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id >=", value, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdLessThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id <", value, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id <=", value, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id like", value, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdNotLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id not like", value, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id in", values, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdNotIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id not in", values, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id between", value1, value2, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliverGoodsAreaIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_goods_area_id not between", value1, value2, "deliverGoodsAreaId");
            return (Criteria) this;
        }

        public Criteria andRouterIdIsNull() {
            addCriterion("temp_carrier_deliver_goods_area.router_id is null");
            return (Criteria) this;
        }

        public Criteria andRouterIdIsNotNull() {
            addCriterion("temp_carrier_deliver_goods_area.router_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouterIdEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.router_id =", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.router_id <>", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.router_id >", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.router_id >=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.router_id <", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.router_id <=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.router_id like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.router_id not like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.router_id in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.router_id not in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.router_id between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.router_id not between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andDeliverNameIsNull() {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliverNameIsNotNull() {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverNameEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name =", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameNotEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name <>", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameGreaterThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name >", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name >=", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameLessThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name <", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name <=", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name like", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameNotLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name not like", value, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name in", values, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameNotIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name not in", values, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name between", value1, value2, "deliverName");
            return (Criteria) this;
        }

        public Criteria andDeliverNameNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.deliver_name not between", value1, value2, "deliverName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("temp_carrier_deliver_goods_area.price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("temp_carrier_deliver_goods_area.price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_deliver_goods_area.price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_deliver_goods_area.price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_carrier_deliver_goods_area.price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_deliver_goods_area.price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("temp_carrier_deliver_goods_area.price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_deliver_goods_area.price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_deliver_goods_area.price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_deliver_goods_area.price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_deliver_goods_area.price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_deliver_goods_area.price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("temp_carrier_deliver_goods_area.address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("temp_carrier_deliver_goods_area.address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("temp_carrier_deliver_goods_area.telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("temp_carrier_deliver_goods_area.telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_carrier_deliver_goods_area.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_carrier_deliver_goods_area.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_carrier_deliver_goods_area.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_deliver_goods_area.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_carrier_deliver_goods_area.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_carrier_deliver_goods_area.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_deliver_goods_area.remark not between", value1, value2, "remark");
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