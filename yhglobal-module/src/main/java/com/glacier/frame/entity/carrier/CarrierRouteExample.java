package com.glacier.frame.entity.carrier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarrierRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CarrierRouteExample() {
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

        public Criteria andRouterIdIsNull() {
            addCriterion("temp_carrier_route.router_id is null");
            return (Criteria) this;
        }

        public Criteria andRouterIdIsNotNull() {
            addCriterion("temp_carrier_route.router_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouterIdEqualTo(String value) {
            addCriterion("temp_carrier_route.router_id =", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotEqualTo(String value) {
            addCriterion("temp_carrier_route.router_id <>", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThan(String value) {
            addCriterion("temp_carrier_route.router_id >", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.router_id >=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThan(String value) {
            addCriterion("temp_carrier_route.router_id <", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.router_id <=", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdLike(String value) {
            addCriterion("temp_carrier_route.router_id like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotLike(String value) {
            addCriterion("temp_carrier_route.router_id not like", value, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdIn(List<String> values) {
            addCriterion("temp_carrier_route.router_id in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotIn(List<String> values) {
            addCriterion("temp_carrier_route.router_id not in", values, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.router_id between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouterIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.router_id not between", value1, value2, "routerId");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNull() {
            addCriterion("temp_carrier_route.route_name is null");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNotNull() {
            addCriterion("temp_carrier_route.route_name is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNameEqualTo(String value) {
            addCriterion("temp_carrier_route.route_name =", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotEqualTo(String value) {
            addCriterion("temp_carrier_route.route_name <>", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThan(String value) {
            addCriterion("temp_carrier_route.route_name >", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_name >=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThan(String value) {
            addCriterion("temp_carrier_route.route_name <", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_name <=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLike(String value) {
            addCriterion("temp_carrier_route.route_name like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotLike(String value) {
            addCriterion("temp_carrier_route.route_name not like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameIn(List<String> values) {
            addCriterion("temp_carrier_route.route_name in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotIn(List<String> values) {
            addCriterion("temp_carrier_route.route_name not in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_name between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_name not between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteOriginIsNull() {
            addCriterion("temp_carrier_route.route_origin is null");
            return (Criteria) this;
        }

        public Criteria andRouteOriginIsNotNull() {
            addCriterion("temp_carrier_route.route_origin is not null");
            return (Criteria) this;
        }

        public Criteria andRouteOriginEqualTo(String value) {
            addCriterion("temp_carrier_route.route_origin =", value, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginNotEqualTo(String value) {
            addCriterion("temp_carrier_route.route_origin <>", value, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginGreaterThan(String value) {
            addCriterion("temp_carrier_route.route_origin >", value, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_origin >=", value, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginLessThan(String value) {
            addCriterion("temp_carrier_route.route_origin <", value, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_origin <=", value, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginLike(String value) {
            addCriterion("temp_carrier_route.route_origin like", value, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginNotLike(String value) {
            addCriterion("temp_carrier_route.route_origin not like", value, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginIn(List<String> values) {
            addCriterion("temp_carrier_route.route_origin in", values, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginNotIn(List<String> values) {
            addCriterion("temp_carrier_route.route_origin not in", values, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_origin between", value1, value2, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteOriginNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_origin not between", value1, value2, "routeOrigin");
            return (Criteria) this;
        }

        public Criteria andRouteStopIsNull() {
            addCriterion("temp_carrier_route.route_stop is null");
            return (Criteria) this;
        }

        public Criteria andRouteStopIsNotNull() {
            addCriterion("temp_carrier_route.route_stop is not null");
            return (Criteria) this;
        }

        public Criteria andRouteStopEqualTo(String value) {
            addCriterion("temp_carrier_route.route_stop =", value, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopNotEqualTo(String value) {
            addCriterion("temp_carrier_route.route_stop <>", value, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopGreaterThan(String value) {
            addCriterion("temp_carrier_route.route_stop >", value, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_stop >=", value, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopLessThan(String value) {
            addCriterion("temp_carrier_route.route_stop <", value, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_stop <=", value, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopLike(String value) {
            addCriterion("temp_carrier_route.route_stop like", value, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopNotLike(String value) {
            addCriterion("temp_carrier_route.route_stop not like", value, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopIn(List<String> values) {
            addCriterion("temp_carrier_route.route_stop in", values, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopNotIn(List<String> values) {
            addCriterion("temp_carrier_route.route_stop not in", values, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_stop between", value1, value2, "routeStop");
            return (Criteria) this;
        }

        public Criteria andRouteStopNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_stop not between", value1, value2, "routeStop");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("temp_carrier_route.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("temp_carrier_route.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("temp_carrier_route.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("temp_carrier_route.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("temp_carrier_route.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("temp_carrier_route.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("temp_carrier_route.type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("temp_carrier_route.type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("temp_carrier_route.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("temp_carrier_route.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeIsNull() {
            addCriterion("temp_carrier_route.route_bytime is null");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeIsNotNull() {
            addCriterion("temp_carrier_route.route_bytime is not null");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeEqualTo(String value) {
            addCriterion("temp_carrier_route.route_bytime =", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeNotEqualTo(String value) {
            addCriterion("temp_carrier_route.route_bytime <>", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeGreaterThan(String value) {
            addCriterion("temp_carrier_route.route_bytime >", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_bytime >=", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeLessThan(String value) {
            addCriterion("temp_carrier_route.route_bytime <", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_bytime <=", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeLike(String value) {
            addCriterion("temp_carrier_route.route_bytime like", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeNotLike(String value) {
            addCriterion("temp_carrier_route.route_bytime not like", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeIn(List<String> values) {
            addCriterion("temp_carrier_route.route_bytime in", values, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeNotIn(List<String> values) {
            addCriterion("temp_carrier_route.route_bytime not in", values, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_bytime between", value1, value2, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_bytime not between", value1, value2, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRoutePriceIsNull() {
            addCriterion("temp_carrier_route.route_price is null");
            return (Criteria) this;
        }

        public Criteria andRoutePriceIsNotNull() {
            addCriterion("temp_carrier_route.route_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoutePriceEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.route_price =", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.route_price <>", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceGreaterThan(BigDecimal value) {
            addCriterion("temp_carrier_route.route_price >", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.route_price >=", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceLessThan(BigDecimal value) {
            addCriterion("temp_carrier_route.route_price <", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.route_price <=", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.route_price in", values, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.route_price not in", values, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.route_price between", value1, value2, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.route_price not between", value1, value2, "routePrice");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_carrier_route.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_carrier_route.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_carrier_route.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_carrier_route.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_carrier_route.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_carrier_route.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_carrier_route.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_carrier_route.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_carrier_route.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_carrier_route.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("temp_carrier_route.audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("temp_carrier_route.audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(String value) {
            addCriterion("temp_carrier_route.audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(String value) {
            addCriterion("temp_carrier_route.audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(String value) {
            addCriterion("temp_carrier_route.audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(String value) {
            addCriterion("temp_carrier_route.audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLike(String value) {
            addCriterion("temp_carrier_route.audit like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotLike(String value) {
            addCriterion("temp_carrier_route.audit not like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<String> values) {
            addCriterion("temp_carrier_route.audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<String> values) {
            addCriterion("temp_carrier_route.audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("temp_carrier_route.audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("temp_carrier_route.audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("temp_carrier_route.audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("temp_carrier_route.audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("temp_carrier_route.audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("temp_carrier_route.audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("temp_carrier_route.audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("temp_carrier_route.audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("temp_carrier_route.audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("temp_carrier_route.audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("temp_carrier_route.audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("temp_carrier_route.audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("temp_carrier_route.audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_route.audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_route.audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("temp_carrier_route.audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("temp_carrier_route.audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_route.audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_carrier_route.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_carrier_route.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_carrier_route.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_carrier_route.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_carrier_route.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_carrier_route.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_carrier_route.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_carrier_route.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_carrier_route.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_carrier_route.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_carrier_route.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_carrier_route.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_carrier_route.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_carrier_route.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_carrier_route.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_carrier_route.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_carrier_route.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_carrier_route.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_carrier_route.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_carrier_route.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_carrier_route.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_carrier_route.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_route.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_route.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_route.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_carrier_route.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_route.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_route.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_carrier_route.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_carrier_route.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_carrier_route.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_carrier_route.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_carrier_route.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_carrier_route.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_carrier_route.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_carrier_route.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_carrier_route.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_carrier_route.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_carrier_route.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_carrier_route.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_route.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_route.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_route.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_carrier_route.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_route.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_route.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.update_time not between", value1, value2, "updateTime");
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