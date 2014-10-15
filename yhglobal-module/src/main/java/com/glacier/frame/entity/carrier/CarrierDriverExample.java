package com.glacier.frame.entity.carrier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarrierDriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CarrierDriverExample() {
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

        public Criteria andDriverIdIsNull() {
            addCriterion("temp_carrier_driver.driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("temp_carrier_driver.driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("temp_carrier_driver.driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("temp_carrier_driver.driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("temp_carrier_driver.driver_id like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("temp_carrier_driver.driver_id not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNull() {
            addCriterion("temp_carrier_driver.carrier_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIsNotNull() {
            addCriterion("temp_carrier_driver.carrier_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdEqualTo(String value) {
            addCriterion("temp_carrier_driver.carrier_member_id =", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.carrier_member_id <>", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThan(String value) {
            addCriterion("temp_carrier_driver.carrier_member_id >", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.carrier_member_id >=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThan(String value) {
            addCriterion("temp_carrier_driver.carrier_member_id <", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.carrier_member_id <=", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdLike(String value) {
            addCriterion("temp_carrier_driver.carrier_member_id like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotLike(String value) {
            addCriterion("temp_carrier_driver.carrier_member_id not like", value, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdIn(List<String> values) {
            addCriterion("temp_carrier_driver.carrier_member_id in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.carrier_member_id not in", values, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.carrier_member_id between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andCarrierMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.carrier_member_id not between", value1, value2, "carrierMemberId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdIsNull() {
            addCriterion("temp_carrier_driver.driver_carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdIsNotNull() {
            addCriterion("temp_carrier_driver.driver_carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_carrier_id =", value, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_carrier_id <>", value, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdGreaterThan(String value) {
            addCriterion("temp_carrier_driver.driver_carrier_id >", value, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_carrier_id >=", value, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdLessThan(String value) {
            addCriterion("temp_carrier_driver.driver_carrier_id <", value, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_carrier_id <=", value, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdLike(String value) {
            addCriterion("temp_carrier_driver.driver_carrier_id like", value, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdNotLike(String value) {
            addCriterion("temp_carrier_driver.driver_carrier_id not like", value, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_carrier_id in", values, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_carrier_id not in", values, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_carrier_id between", value1, value2, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverCarrierIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_carrier_id not between", value1, value2, "driverCarrierId");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("temp_carrier_driver.driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("temp_carrier_driver.driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("temp_carrier_driver.driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("temp_carrier_driver.driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("temp_carrier_driver.driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("temp_carrier_driver.driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("temp_carrier_driver.age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("temp_carrier_driver.age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("temp_carrier_driver.age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("temp_carrier_driver.age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("temp_carrier_driver.age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("temp_carrier_driver.age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_driver.age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_driver.age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIsNull() {
            addCriterion("temp_carrier_driver.driver_age is null");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIsNotNull() {
            addCriterion("temp_carrier_driver.driver_age is not null");
            return (Criteria) this;
        }

        public Criteria andDriverAgeEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.driver_age =", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.driver_age <>", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeGreaterThan(Integer value) {
            addCriterion("temp_carrier_driver.driver_age >", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.driver_age >=", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeLessThan(Integer value) {
            addCriterion("temp_carrier_driver.driver_age <", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.driver_age <=", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIn(List<Integer> values) {
            addCriterion("temp_carrier_driver.driver_age in", values, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotIn(List<Integer> values) {
            addCriterion("temp_carrier_driver.driver_age not in", values, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_driver.driver_age between", value1, value2, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_driver.driver_age not between", value1, value2, "driverAge");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("temp_carrier_driver.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("temp_carrier_driver.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("temp_carrier_driver.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("temp_carrier_driver.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("temp_carrier_driver.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("temp_carrier_driver.sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("temp_carrier_driver.sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("temp_carrier_driver.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdIsNull() {
            addCriterion("temp_carrier_driver.driver_license_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdIsNotNull() {
            addCriterion("temp_carrier_driver.driver_license_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.driver_license_id =", value, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdNotEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.driver_license_id <>", value, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdGreaterThan(Integer value) {
            addCriterion("temp_carrier_driver.driver_license_id >", value, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.driver_license_id >=", value, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdLessThan(Integer value) {
            addCriterion("temp_carrier_driver.driver_license_id <", value, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_driver.driver_license_id <=", value, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdIn(List<Integer> values) {
            addCriterion("temp_carrier_driver.driver_license_id in", values, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdNotIn(List<Integer> values) {
            addCriterion("temp_carrier_driver.driver_license_id not in", values, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_driver.driver_license_id between", value1, value2, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_driver.driver_license_id not between", value1, value2, "driverLicenseId");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeIsNull() {
            addCriterion("temp_carrier_driver.driver_license_time is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeIsNotNull() {
            addCriterion("temp_carrier_driver.driver_license_time is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeEqualTo(Date value) {
            addCriterion("temp_carrier_driver.driver_license_time =", value, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_driver.driver_license_time <>", value, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_driver.driver_license_time >", value, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_driver.driver_license_time >=", value, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeLessThan(Date value) {
            addCriterion("temp_carrier_driver.driver_license_time <", value, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_driver.driver_license_time <=", value, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeIn(List<Date> values) {
            addCriterion("temp_carrier_driver.driver_license_time in", values, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_driver.driver_license_time not in", values, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_driver.driver_license_time between", value1, value2, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_driver.driver_license_time not between", value1, value2, "driverLicenseTime");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("temp_carrier_driver.phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("temp_carrier_driver.phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("temp_carrier_driver.phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("temp_carrier_driver.phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("temp_carrier_driver.phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("temp_carrier_driver.phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("temp_carrier_driver.phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("temp_carrier_driver.phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("temp_carrier_driver.address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("temp_carrier_driver.address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("temp_carrier_driver.address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("temp_carrier_driver.address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("temp_carrier_driver.address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("temp_carrier_driver.address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("temp_carrier_driver.address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("temp_carrier_driver.address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("temp_carrier_driver.card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("temp_carrier_driver.card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("temp_carrier_driver.card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("temp_carrier_driver.card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("temp_carrier_driver.card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("temp_carrier_driver.card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("temp_carrier_driver.card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("temp_carrier_driver.card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoIsNull() {
            addCriterion("temp_carrier_driver.driver_photo is null");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoIsNotNull() {
            addCriterion("temp_carrier_driver.driver_photo is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_photo =", value, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_photo <>", value, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoGreaterThan(String value) {
            addCriterion("temp_carrier_driver.driver_photo >", value, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_photo >=", value, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoLessThan(String value) {
            addCriterion("temp_carrier_driver.driver_photo <", value, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_photo <=", value, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoLike(String value) {
            addCriterion("temp_carrier_driver.driver_photo like", value, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoNotLike(String value) {
            addCriterion("temp_carrier_driver.driver_photo not like", value, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_photo in", values, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_photo not in", values, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_photo between", value1, value2, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andDriverPhotoNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_photo not between", value1, value2, "driverPhoto");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_carrier_driver.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_carrier_driver.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_carrier_driver.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_carrier_driver.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_carrier_driver.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_carrier_driver.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_carrier_driver.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_carrier_driver.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDriverStatusIsNull() {
            addCriterion("temp_carrier_driver.driver_status is null");
            return (Criteria) this;
        }

        public Criteria andDriverStatusIsNotNull() {
            addCriterion("temp_carrier_driver.driver_status is not null");
            return (Criteria) this;
        }

        public Criteria andDriverStatusEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_status =", value, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_status <>", value, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusGreaterThan(String value) {
            addCriterion("temp_carrier_driver.driver_status >", value, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_status >=", value, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusLessThan(String value) {
            addCriterion("temp_carrier_driver.driver_status <", value, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.driver_status <=", value, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusLike(String value) {
            addCriterion("temp_carrier_driver.driver_status like", value, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusNotLike(String value) {
            addCriterion("temp_carrier_driver.driver_status not like", value, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_status in", values, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.driver_status not in", values, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_status between", value1, value2, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andDriverStatusNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.driver_status not between", value1, value2, "driverStatus");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("temp_carrier_driver.email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("temp_carrier_driver.email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("temp_carrier_driver.email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("temp_carrier_driver.email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("temp_carrier_driver.email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("temp_carrier_driver.email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("temp_carrier_driver.email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("temp_carrier_driver.email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_carrier_driver.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_carrier_driver.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_carrier_driver.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_carrier_driver.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_carrier_driver.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_carrier_driver.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_carrier_driver.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("temp_carrier_driver.audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("temp_carrier_driver.audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(String value) {
            addCriterion("temp_carrier_driver.audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(String value) {
            addCriterion("temp_carrier_driver.audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLike(String value) {
            addCriterion("temp_carrier_driver.audit like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotLike(String value) {
            addCriterion("temp_carrier_driver.audit not like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<String> values) {
            addCriterion("temp_carrier_driver.audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("temp_carrier_driver.audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("temp_carrier_driver.audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("temp_carrier_driver.audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("temp_carrier_driver.audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("temp_carrier_driver.audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("temp_carrier_driver.audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("temp_carrier_driver.audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("temp_carrier_driver.audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("temp_carrier_driver.audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("temp_carrier_driver.audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_driver.audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_driver.audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_driver.audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("temp_carrier_driver.audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_driver.audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("temp_carrier_driver.audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_driver.audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_driver.audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_driver.audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_carrier_driver.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_carrier_driver.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_carrier_driver.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_carrier_driver.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_carrier_driver.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_carrier_driver.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_carrier_driver.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_carrier_driver.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_carrier_driver.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_carrier_driver.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_carrier_driver.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_carrier_driver.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_carrier_driver.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_carrier_driver.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_carrier_driver.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_carrier_driver.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_carrier_driver.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_carrier_driver.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_driver.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_driver.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_driver.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_driver.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_carrier_driver.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_driver.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_driver.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_driver.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_driver.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_driver.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_carrier_driver.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_carrier_driver.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_carrier_driver.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_carrier_driver.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_carrier_driver.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_carrier_driver.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_driver.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_carrier_driver.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_carrier_driver.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_carrier_driver.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_carrier_driver.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_driver.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_carrier_driver.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_carrier_driver.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_driver.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_driver.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_driver.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_driver.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_carrier_driver.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_driver.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_driver.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_driver.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_driver.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_driver.update_time not between", value1, value2, "updateTime");
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