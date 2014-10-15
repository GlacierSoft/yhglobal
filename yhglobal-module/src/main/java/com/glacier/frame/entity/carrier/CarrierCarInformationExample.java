package com.glacier.frame.entity.carrier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarrierCarInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CarrierCarInformationExample() {
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

        //扩展查询条件
        public Criteria andCarrierMemberRealNamelike(String value) {
            addCriterion("temp_carrier_member.member_name like", value, "getCarrierMemberRealName");
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

        public Criteria andCarIdIsNull() {
            addCriterion("temp_carrier_car_information.car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("temp_carrier_car_information.car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("temp_carrier_car_information.car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("temp_carrier_car_information.car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("temp_carrier_car_information.car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNull() {
            addCriterion("temp_carrier_car_information.carrier_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNotNull() {
            addCriterion("temp_carrier_car_information.carrier_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdEqualTo(String value) {
            addCriterion("temp_carrier_car_information.carrier_member_id =", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.carrier_member_id <>", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.carrier_member_id >", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.carrier_member_id >=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThan(String value) {
            addCriterion("temp_carrier_car_information.carrier_member_id <", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.carrier_member_id <=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLike(String value) {
            addCriterion("temp_carrier_car_information.carrier_member_id like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotLike(String value) {
            addCriterion("temp_carrier_car_information.carrier_member_id not like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIn(List<String> values) {
            addCriterion("temp_carrier_car_information.carrier_member_id in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.carrier_member_id not in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.carrier_member_id between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.carrier_member_id not between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNull() {
            addCriterion("temp_carrier_car_information.route_name is null");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNotNull() {
            addCriterion("temp_carrier_car_information.route_name is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNameEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.route_name =", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.route_name <>", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThan(Integer value) {
            addCriterion("temp_carrier_car_information.route_name >", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.route_name >=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThan(Integer value) {
            addCriterion("temp_carrier_car_information.route_name <", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.route_name <=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameIn(List<Integer> values) {
            addCriterion("temp_carrier_car_information.route_name in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotIn(List<Integer> values) {
            addCriterion("temp_carrier_car_information.route_name not in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_car_information.route_name between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_car_information.route_name not between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("temp_carrier_car_information.transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("temp_carrier_car_information.transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(String value) {
            addCriterion("temp_carrier_car_information.transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(String value) {
            addCriterion("temp_carrier_car_information.transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLike(String value) {
            addCriterion("temp_carrier_car_information.transport_type like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotLike(String value) {
            addCriterion("temp_carrier_car_information.transport_type not like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<String> values) {
            addCriterion("temp_carrier_car_information.transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("temp_carrier_car_information.service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("temp_carrier_car_information.service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("temp_carrier_car_information.service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("temp_carrier_car_information.service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("temp_carrier_car_information.service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("temp_carrier_car_information.service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("temp_carrier_car_information.service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("temp_carrier_car_information.plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("temp_carrier_car_information.plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("temp_carrier_car_information.plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("temp_carrier_car_information.plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("temp_carrier_car_information.plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("temp_carrier_car_information.plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("temp_carrier_car_information.plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.plate_number not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andCarAgeIsNull() {
            addCriterion("temp_carrier_car_information.car_age is null");
            return (Criteria) this;
        }

        public Criteria andCarAgeIsNotNull() {
            addCriterion("temp_carrier_car_information.car_age is not null");
            return (Criteria) this;
        }

        public Criteria andCarAgeEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.car_age =", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.car_age <>", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeGreaterThan(Integer value) {
            addCriterion("temp_carrier_car_information.car_age >", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.car_age >=", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeLessThan(Integer value) {
            addCriterion("temp_carrier_car_information.car_age <", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.car_age <=", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeIn(List<Integer> values) {
            addCriterion("temp_carrier_car_information.car_age in", values, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotIn(List<Integer> values) {
            addCriterion("temp_carrier_car_information.car_age not in", values, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_car_information.car_age between", value1, value2, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_car_information.car_age not between", value1, value2, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("temp_carrier_car_information.car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("temp_carrier_car_information.car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("temp_carrier_car_information.car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("temp_carrier_car_information.car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("temp_carrier_car_information.car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarLengthIsNull() {
            addCriterion("temp_carrier_car_information.car_length is null");
            return (Criteria) this;
        }

        public Criteria andCarLengthIsNotNull() {
            addCriterion("temp_carrier_car_information.car_length is not null");
            return (Criteria) this;
        }

        public Criteria andCarLengthEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.car_length =", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.car_length <>", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthGreaterThan(Integer value) {
            addCriterion("temp_carrier_car_information.car_length >", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.car_length >=", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthLessThan(Integer value) {
            addCriterion("temp_carrier_car_information.car_length <", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_car_information.car_length <=", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthIn(List<Integer> values) {
            addCriterion("temp_carrier_car_information.car_length in", values, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotIn(List<Integer> values) {
            addCriterion("temp_carrier_car_information.car_length not in", values, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_car_information.car_length between", value1, value2, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_car_information.car_length not between", value1, value2, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLoadIsNull() {
            addCriterion("temp_carrier_car_information.car_load is null");
            return (Criteria) this;
        }

        public Criteria andCarLoadIsNotNull() {
            addCriterion("temp_carrier_car_information.car_load is not null");
            return (Criteria) this;
        }

        public Criteria andCarLoadEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_load =", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_load <>", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.car_load >", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_load >=", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadLessThan(String value) {
            addCriterion("temp_carrier_car_information.car_load <", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_load <=", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadLike(String value) {
            addCriterion("temp_carrier_car_information.car_load like", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotLike(String value) {
            addCriterion("temp_carrier_car_information.car_load not like", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_load in", values, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_load not in", values, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_load between", value1, value2, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_load not between", value1, value2, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarAttributionIsNull() {
            addCriterion("temp_carrier_car_information.car_attribution is null");
            return (Criteria) this;
        }

        public Criteria andCarAttributionIsNotNull() {
            addCriterion("temp_carrier_car_information.car_attribution is not null");
            return (Criteria) this;
        }

        public Criteria andCarAttributionEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_attribution =", value, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_attribution <>", value, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.car_attribution >", value, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_attribution >=", value, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionLessThan(String value) {
            addCriterion("temp_carrier_car_information.car_attribution <", value, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_attribution <=", value, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionLike(String value) {
            addCriterion("temp_carrier_car_information.car_attribution like", value, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionNotLike(String value) {
            addCriterion("temp_carrier_car_information.car_attribution not like", value, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_attribution in", values, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_attribution not in", values, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_attribution between", value1, value2, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarAttributionNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_attribution not between", value1, value2, "carAttribution");
            return (Criteria) this;
        }

        public Criteria andCarStatusIsNull() {
            addCriterion("temp_carrier_car_information.car_status is null");
            return (Criteria) this;
        }

        public Criteria andCarStatusIsNotNull() {
            addCriterion("temp_carrier_car_information.car_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarStatusEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_status =", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_status <>", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.car_status >", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_status >=", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusLessThan(String value) {
            addCriterion("temp_carrier_car_information.car_status <", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.car_status <=", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusLike(String value) {
            addCriterion("temp_carrier_car_information.car_status like", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotLike(String value) {
            addCriterion("temp_carrier_car_information.car_status not like", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_status in", values, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.car_status not in", values, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_status between", value1, value2, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.car_status not between", value1, value2, "carStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusIsNull() {
            addCriterion("temp_carrier_car_information.transport_status is null");
            return (Criteria) this;
        }

        public Criteria andTransportStatusIsNotNull() {
            addCriterion("temp_carrier_car_information.transport_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransportStatusEqualTo(String value) {
            addCriterion("temp_carrier_car_information.transport_status =", value, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.transport_status <>", value, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.transport_status >", value, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.transport_status >=", value, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusLessThan(String value) {
            addCriterion("temp_carrier_car_information.transport_status <", value, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.transport_status <=", value, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusLike(String value) {
            addCriterion("temp_carrier_car_information.transport_status like", value, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusNotLike(String value) {
            addCriterion("temp_carrier_car_information.transport_status not like", value, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusIn(List<String> values) {
            addCriterion("temp_carrier_car_information.transport_status in", values, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.transport_status not in", values, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.transport_status between", value1, value2, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andTransportStatusNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.transport_status not between", value1, value2, "transportStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_carrier_car_information.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_carrier_car_information.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_carrier_car_information.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_carrier_car_information.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_carrier_car_information.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_carrier_car_information.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("temp_carrier_car_information.audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("temp_carrier_car_information.audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(String value) {
            addCriterion("temp_carrier_car_information.audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLike(String value) {
            addCriterion("temp_carrier_car_information.audit like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotLike(String value) {
            addCriterion("temp_carrier_car_information.audit not like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<String> values) {
            addCriterion("temp_carrier_car_information.audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("temp_carrier_car_information.audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("temp_carrier_car_information.audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("temp_carrier_car_information.audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("temp_carrier_car_information.audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("temp_carrier_car_information.audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("temp_carrier_car_information.audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("temp_carrier_car_information.audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("temp_carrier_car_information.audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_car_information.audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("temp_carrier_car_information.audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("temp_carrier_car_information.audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_car_information.audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_car_information.audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_car_information.audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_carrier_car_information.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_carrier_car_information.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_carrier_car_information.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_carrier_car_information.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_carrier_car_information.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_carrier_car_information.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_carrier_car_information.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_carrier_car_information.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_carrier_car_information.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_carrier_car_information.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_carrier_car_information.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_carrier_car_information.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_carrier_car_information.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_carrier_car_information.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_carrier_car_information.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_carrier_car_information.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_car_information.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_carrier_car_information.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_car_information.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_car_information.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_car_information.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_car_information.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_carrier_car_information.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_carrier_car_information.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_carrier_car_information.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_carrier_car_information.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_carrier_car_information.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_carrier_car_information.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_car_information.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_carrier_car_information.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_carrier_car_information.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_carrier_car_information.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_carrier_car_information.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_car_information.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_carrier_car_information.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_carrier_car_information.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_car_information.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_carrier_car_information.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_car_information.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_car_information.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_car_information.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_car_information.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_car_information.update_time not between", value1, value2, "updateTime");
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