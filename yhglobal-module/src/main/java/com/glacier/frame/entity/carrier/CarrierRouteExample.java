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

		 //自定承运商名称查询方法
        public Criteria andCarrierDisplayLike(String value) {
        	addCriterion(" temp_carrier_member.member_name like ",value," carrierDisplay ");
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

        public Criteria andStatusIsNull() {
            addCriterion("temp_carrier_route.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_carrier_route.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_carrier_route.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_carrier_route.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_carrier_route.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_carrier_route.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_carrier_route.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_carrier_route.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_carrier_route.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_carrier_route.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.status not between", value1, value2, "status");
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

        public Criteria andOriginAddressIsNull() {
            addCriterion("temp_carrier_route.origin_address is null");
            return (Criteria) this;
        }

        public Criteria andOriginAddressIsNotNull() {
            addCriterion("temp_carrier_route.origin_address is not null");
            return (Criteria) this;
        }

        public Criteria andOriginAddressEqualTo(String value) {
            addCriterion("temp_carrier_route.origin_address =", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressNotEqualTo(String value) {
            addCriterion("temp_carrier_route.origin_address <>", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressGreaterThan(String value) {
            addCriterion("temp_carrier_route.origin_address >", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.origin_address >=", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressLessThan(String value) {
            addCriterion("temp_carrier_route.origin_address <", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.origin_address <=", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressLike(String value) {
            addCriterion("temp_carrier_route.origin_address like", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressNotLike(String value) {
            addCriterion("temp_carrier_route.origin_address not like", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressIn(List<String> values) {
            addCriterion("temp_carrier_route.origin_address in", values, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressNotIn(List<String> values) {
            addCriterion("temp_carrier_route.origin_address not in", values, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.origin_address between", value1, value2, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.origin_address not between", value1, value2, "originAddress");
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

        public Criteria andStopAddressIsNull() {
            addCriterion("temp_carrier_route.stop_address is null");
            return (Criteria) this;
        }

        public Criteria andStopAddressIsNotNull() {
            addCriterion("temp_carrier_route.stop_address is not null");
            return (Criteria) this;
        }

        public Criteria andStopAddressEqualTo(String value) {
            addCriterion("temp_carrier_route.stop_address =", value, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressNotEqualTo(String value) {
            addCriterion("temp_carrier_route.stop_address <>", value, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressGreaterThan(String value) {
            addCriterion("temp_carrier_route.stop_address >", value, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.stop_address >=", value, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressLessThan(String value) {
            addCriterion("temp_carrier_route.stop_address <", value, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.stop_address <=", value, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressLike(String value) {
            addCriterion("temp_carrier_route.stop_address like", value, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressNotLike(String value) {
            addCriterion("temp_carrier_route.stop_address not like", value, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressIn(List<String> values) {
            addCriterion("temp_carrier_route.stop_address in", values, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressNotIn(List<String> values) {
            addCriterion("temp_carrier_route.stop_address not in", values, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.stop_address between", value1, value2, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andStopAddressNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.stop_address not between", value1, value2, "stopAddress");
            return (Criteria) this;
        }

        public Criteria andRouteTypeIsNull() {
            addCriterion("temp_carrier_route.route_type is null");
            return (Criteria) this;
        }

        public Criteria andRouteTypeIsNotNull() {
            addCriterion("temp_carrier_route.route_type is not null");
            return (Criteria) this;
        }

        public Criteria andRouteTypeEqualTo(String value) {
            addCriterion("temp_carrier_route.route_type =", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeNotEqualTo(String value) {
            addCriterion("temp_carrier_route.route_type <>", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeGreaterThan(String value) {
            addCriterion("temp_carrier_route.route_type >", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_type >=", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeLessThan(String value) {
            addCriterion("temp_carrier_route.route_type <", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_type <=", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeLike(String value) {
            addCriterion("temp_carrier_route.route_type like", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeNotLike(String value) {
            addCriterion("temp_carrier_route.route_type not like", value, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeIn(List<String> values) {
            addCriterion("temp_carrier_route.route_type in", values, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeNotIn(List<String> values) {
            addCriterion("temp_carrier_route.route_type not in", values, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_type between", value1, value2, "routeType");
            return (Criteria) this;
        }

        public Criteria andRouteTypeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_type not between", value1, value2, "routeType");
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

        public Criteria andRouteBytimeEqualTo(Integer value) {
            addCriterion("temp_carrier_route.route_bytime =", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeNotEqualTo(Integer value) {
            addCriterion("temp_carrier_route.route_bytime <>", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeGreaterThan(Integer value) {
            addCriterion("temp_carrier_route.route_bytime >", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_route.route_bytime >=", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeLessThan(Integer value) {
            addCriterion("temp_carrier_route.route_bytime <", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_route.route_bytime <=", value, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeIn(List<Integer> values) {
            addCriterion("temp_carrier_route.route_bytime in", values, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeNotIn(List<Integer> values) {
            addCriterion("temp_carrier_route.route_bytime not in", values, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_route.route_bytime between", value1, value2, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteBytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_route.route_bytime not between", value1, value2, "routeBytime");
            return (Criteria) this;
        }

        public Criteria andRouteNumberIsNull() {
            addCriterion("temp_carrier_route.route_number is null");
            return (Criteria) this;
        }

        public Criteria andRouteNumberIsNotNull() {
            addCriterion("temp_carrier_route.route_number is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNumberEqualTo(String value) {
            addCriterion("temp_carrier_route.route_number =", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotEqualTo(String value) {
            addCriterion("temp_carrier_route.route_number <>", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberGreaterThan(String value) {
            addCriterion("temp_carrier_route.route_number >", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_number >=", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberLessThan(String value) {
            addCriterion("temp_carrier_route.route_number <", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.route_number <=", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberLike(String value) {
            addCriterion("temp_carrier_route.route_number like", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotLike(String value) {
            addCriterion("temp_carrier_route.route_number not like", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberIn(List<String> values) {
            addCriterion("temp_carrier_route.route_number in", values, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotIn(List<String> values) {
            addCriterion("temp_carrier_route.route_number not in", values, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_number between", value1, value2, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.route_number not between", value1, value2, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andStartofTimeIsNull() {
            addCriterion("temp_carrier_route.startof_time is null");
            return (Criteria) this;
        }

        public Criteria andStartofTimeIsNotNull() {
            addCriterion("temp_carrier_route.startof_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartofTimeEqualTo(Date value) {
            addCriterion("temp_carrier_route.startof_time =", value, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_route.startof_time <>", value, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_route.startof_time >", value, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.startof_time >=", value, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeLessThan(Date value) {
            addCriterion("temp_carrier_route.startof_time <", value, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.startof_time <=", value, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeIn(List<Date> values) {
            addCriterion("temp_carrier_route.startof_time in", values, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_route.startof_time not in", values, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.startof_time between", value1, value2, "startofTime");
            return (Criteria) this;
        }

        public Criteria andStartofTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.startof_time not between", value1, value2, "startofTime");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionIsNull() {
            addCriterion("temp_carrier_route.available_position is null");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionIsNotNull() {
            addCriterion("temp_carrier_route.available_position is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionEqualTo(Float value) {
            addCriterion("temp_carrier_route.available_position =", value, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionNotEqualTo(Float value) {
            addCriterion("temp_carrier_route.available_position <>", value, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionGreaterThan(Float value) {
            addCriterion("temp_carrier_route.available_position >", value, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_carrier_route.available_position >=", value, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionLessThan(Float value) {
            addCriterion("temp_carrier_route.available_position <", value, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionLessThanOrEqualTo(Float value) {
            addCriterion("temp_carrier_route.available_position <=", value, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionIn(List<Float> values) {
            addCriterion("temp_carrier_route.available_position in", values, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionNotIn(List<Float> values) {
            addCriterion("temp_carrier_route.available_position not in", values, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionBetween(Float value1, Float value2) {
            addCriterion("temp_carrier_route.available_position between", value1, value2, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andAvailablePositionNotBetween(Float value1, Float value2) {
            addCriterion("temp_carrier_route.available_position not between", value1, value2, "availablePosition");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIsNull() {
            addCriterion("temp_carrier_route.box_type is null");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIsNotNull() {
            addCriterion("temp_carrier_route.box_type is not null");
            return (Criteria) this;
        }

        public Criteria andBoxTypeEqualTo(String value) {
            addCriterion("temp_carrier_route.box_type =", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotEqualTo(String value) {
            addCriterion("temp_carrier_route.box_type <>", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeGreaterThan(String value) {
            addCriterion("temp_carrier_route.box_type >", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.box_type >=", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeLessThan(String value) {
            addCriterion("temp_carrier_route.box_type <", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.box_type <=", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeLike(String value) {
            addCriterion("temp_carrier_route.box_type like", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotLike(String value) {
            addCriterion("temp_carrier_route.box_type not like", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIn(List<String> values) {
            addCriterion("temp_carrier_route.box_type in", values, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotIn(List<String> values) {
            addCriterion("temp_carrier_route.box_type not in", values, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.box_type between", value1, value2, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.box_type not between", value1, value2, "boxType");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeIsNull() {
            addCriterion("temp_carrier_route.cease_take_delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeIsNotNull() {
            addCriterion("temp_carrier_route.cease_take_delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeEqualTo(Date value) {
            addCriterion("temp_carrier_route.cease_take_delivery_time =", value, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_route.cease_take_delivery_time <>", value, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_route.cease_take_delivery_time >", value, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.cease_take_delivery_time >=", value, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeLessThan(Date value) {
            addCriterion("temp_carrier_route.cease_take_delivery_time <", value, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_route.cease_take_delivery_time <=", value, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeIn(List<Date> values) {
            addCriterion("temp_carrier_route.cease_take_delivery_time in", values, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_route.cease_take_delivery_time not in", values, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.cease_take_delivery_time between", value1, value2, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andCeaseTakeDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_route.cease_take_delivery_time not between", value1, value2, "ceaseTakeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andStartingPriceIsNull() {
            addCriterion("temp_carrier_route.starting_price is null");
            return (Criteria) this;
        }

        public Criteria andStartingPriceIsNotNull() {
            addCriterion("temp_carrier_route.starting_price is not null");
            return (Criteria) this;
        }

        public Criteria andStartingPriceEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.starting_price =", value, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.starting_price <>", value, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_carrier_route.starting_price >", value, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.starting_price >=", value, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceLessThan(BigDecimal value) {
            addCriterion("temp_carrier_route.starting_price <", value, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.starting_price <=", value, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.starting_price in", values, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.starting_price not in", values, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.starting_price between", value1, value2, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andStartingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.starting_price not between", value1, value2, "startingPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceIsNull() {
            addCriterion("temp_carrier_route.weight_goods_price is null");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceIsNotNull() {
            addCriterion("temp_carrier_route.weight_goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.weight_goods_price =", value, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.weight_goods_price <>", value, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_carrier_route.weight_goods_price >", value, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.weight_goods_price >=", value, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceLessThan(BigDecimal value) {
            addCriterion("temp_carrier_route.weight_goods_price <", value, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.weight_goods_price <=", value, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.weight_goods_price in", values, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.weight_goods_price not in", values, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.weight_goods_price between", value1, value2, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andWeightGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.weight_goods_price not between", value1, value2, "weightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceIsNull() {
            addCriterion("temp_carrier_route.light_goods_price is null");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceIsNotNull() {
            addCriterion("temp_carrier_route.light_goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.light_goods_price =", value, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.light_goods_price <>", value, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_carrier_route.light_goods_price >", value, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.light_goods_price >=", value, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceLessThan(BigDecimal value) {
            addCriterion("temp_carrier_route.light_goods_price <", value, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.light_goods_price <=", value, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.light_goods_price in", values, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.light_goods_price not in", values, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.light_goods_price between", value1, value2, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andLightGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.light_goods_price not between", value1, value2, "lightGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeIsNull() {
            addCriterion("temp_carrier_route.extract_goods_time is null");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeIsNotNull() {
            addCriterion("temp_carrier_route.extract_goods_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeEqualTo(String value) {
            addCriterion("temp_carrier_route.extract_goods_time =", value, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeNotEqualTo(String value) {
            addCriterion("temp_carrier_route.extract_goods_time <>", value, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeGreaterThan(String value) {
            addCriterion("temp_carrier_route.extract_goods_time >", value, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.extract_goods_time >=", value, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeLessThan(String value) {
            addCriterion("temp_carrier_route.extract_goods_time <", value, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.extract_goods_time <=", value, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeLike(String value) {
            addCriterion("temp_carrier_route.extract_goods_time like", value, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeNotLike(String value) {
            addCriterion("temp_carrier_route.extract_goods_time not like", value, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeIn(List<String> values) {
            addCriterion("temp_carrier_route.extract_goods_time in", values, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeNotIn(List<String> values) {
            addCriterion("temp_carrier_route.extract_goods_time not in", values, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.extract_goods_time between", value1, value2, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExtractGoodsTimeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.extract_goods_time not between", value1, value2, "extractGoodsTime");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNull() {
            addCriterion("temp_carrier_route.premium is null");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNotNull() {
            addCriterion("temp_carrier_route.premium is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.premium =", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.premium <>", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThan(BigDecimal value) {
            addCriterion("temp_carrier_route.premium >", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.premium >=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThan(BigDecimal value) {
            addCriterion("temp_carrier_route.premium <", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_carrier_route.premium <=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.premium in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotIn(List<BigDecimal> values) {
            addCriterion("temp_carrier_route.premium not in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.premium between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_carrier_route.premium not between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("temp_carrier_route.telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("temp_carrier_route.telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("temp_carrier_route.telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("temp_carrier_route.telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("temp_carrier_route.telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("temp_carrier_route.telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("temp_carrier_route.telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("temp_carrier_route.telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("temp_carrier_route.telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("temp_carrier_route.telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("temp_carrier_route.mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("temp_carrier_route.mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(String value) {
            addCriterion("temp_carrier_route.mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(String value) {
            addCriterion("temp_carrier_route.mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(String value) {
            addCriterion("temp_carrier_route.mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(String value) {
            addCriterion("temp_carrier_route.mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_route.mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLike(String value) {
            addCriterion("temp_carrier_route.mileage like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotLike(String value) {
            addCriterion("temp_carrier_route.mileage not like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<String> values) {
            addCriterion("temp_carrier_route.mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<String> values) {
            addCriterion("temp_carrier_route.mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_route.mileage not between", value1, value2, "mileage");
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