package com.glacier.frame.entity.member;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShipperMemberGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ShipperMemberGradeExample() {
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

        public Criteria andGradeIdIsNull() {
            addCriterion("temp_shipper_member_grade.grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_id like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_id not like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("temp_shipper_member_grade.grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andScopeStartIsNull() {
            addCriterion("temp_shipper_member_grade.scope_start is null");
            return (Criteria) this;
        }

        public Criteria andScopeStartIsNotNull() {
            addCriterion("temp_shipper_member_grade.scope_start is not null");
            return (Criteria) this;
        }

        public Criteria andScopeStartEqualTo(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_start =", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartNotEqualTo(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_start <>", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartGreaterThan(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_start >", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_start >=", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartLessThan(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_start <", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartLessThanOrEqualTo(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_start <=", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartIn(List<Integer> values) {
            addCriterion("temp_shipper_member_grade.scope_start in", values, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartNotIn(List<Integer> values) {
            addCriterion("temp_shipper_member_grade.scope_start not in", values, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartBetween(Integer value1, Integer value2) {
            addCriterion("temp_shipper_member_grade.scope_start between", value1, value2, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_shipper_member_grade.scope_start not between", value1, value2, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStopIsNull() {
            addCriterion("temp_shipper_member_grade.scope_stop is null");
            return (Criteria) this;
        }

        public Criteria andScopeStopIsNotNull() {
            addCriterion("temp_shipper_member_grade.scope_stop is not null");
            return (Criteria) this;
        }

        public Criteria andScopeStopEqualTo(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_stop =", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopNotEqualTo(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_stop <>", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopGreaterThan(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_stop >", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_stop >=", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopLessThan(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_stop <", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopLessThanOrEqualTo(Integer value) {
            addCriterion("temp_shipper_member_grade.scope_stop <=", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopIn(List<Integer> values) {
            addCriterion("temp_shipper_member_grade.scope_stop in", values, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopNotIn(List<Integer> values) {
            addCriterion("temp_shipper_member_grade.scope_stop not in", values, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopBetween(Integer value1, Integer value2) {
            addCriterion("temp_shipper_member_grade.scope_stop between", value1, value2, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_shipper_member_grade.scope_stop not between", value1, value2, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andGradeImgIsNull() {
            addCriterion("temp_shipper_member_grade.grade_img is null");
            return (Criteria) this;
        }

        public Criteria andGradeImgIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_img is not null");
            return (Criteria) this;
        }

        public Criteria andGradeImgEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_img =", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_img <>", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_img >", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_img >=", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_img <", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_img <=", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_img like", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_img not like", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_img in", values, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_img not in", values, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_img between", value1, value2, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_img not between", value1, value2, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeGpsIsNull() {
            addCriterion("temp_shipper_member_grade.grade_GPS is null");
            return (Criteria) this;
        }

        public Criteria andGradeGpsIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_GPS is not null");
            return (Criteria) this;
        }

        public Criteria andGradeGpsEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_GPS =", value, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_GPS <>", value, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_GPS >", value, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_GPS >=", value, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_GPS <", value, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_GPS <=", value, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_GPS like", value, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_GPS not like", value, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_GPS in", values, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_GPS not in", values, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_GPS between", value1, value2, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeGpsNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_GPS not between", value1, value2, "gradeGps");
            return (Criteria) this;
        }

        public Criteria andGradeEmailIsNull() {
            addCriterion("temp_shipper_member_grade.grade_email is null");
            return (Criteria) this;
        }

        public Criteria andGradeEmailIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_email is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEmailEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_email =", value, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_email <>", value, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_email >", value, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_email >=", value, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_email <", value, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_email <=", value, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_email like", value, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_email not like", value, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_email in", values, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_email not in", values, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_email between", value1, value2, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeEmailNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_email not between", value1, value2, "gradeEmail");
            return (Criteria) this;
        }

        public Criteria andGradeMobileIsNull() {
            addCriterion("temp_shipper_member_grade.grade_mobile is null");
            return (Criteria) this;
        }

        public Criteria andGradeMobileIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andGradeMobileEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_mobile =", value, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_mobile <>", value, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_mobile >", value, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_mobile >=", value, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_mobile <", value, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_mobile <=", value, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_mobile like", value, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_mobile not like", value, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_mobile in", values, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_mobile not in", values, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_mobile between", value1, value2, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeMobileNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_mobile not between", value1, value2, "gradeMobile");
            return (Criteria) this;
        }

        public Criteria andGradeFirstIsNull() {
            addCriterion("temp_shipper_member_grade.grade_first is null");
            return (Criteria) this;
        }

        public Criteria andGradeFirstIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_first is not null");
            return (Criteria) this;
        }

        public Criteria andGradeFirstEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_first =", value, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_first <>", value, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_first >", value, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_first >=", value, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_first <", value, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_first <=", value, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_first like", value, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_first not like", value, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_first in", values, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_first not in", values, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_first between", value1, value2, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeFirstNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_first not between", value1, value2, "gradeFirst");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountIsNull() {
            addCriterion("temp_shipper_member_grade.grade_discount is null");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_discount is not null");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_grade.grade_discount =", value, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountNotEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_grade.grade_discount <>", value, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountGreaterThan(BigDecimal value) {
            addCriterion("temp_shipper_member_grade.grade_discount >", value, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_grade.grade_discount >=", value, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountLessThan(BigDecimal value) {
            addCriterion("temp_shipper_member_grade.grade_discount <", value, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_shipper_member_grade.grade_discount <=", value, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_grade.grade_discount in", values, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountNotIn(List<BigDecimal> values) {
            addCriterion("temp_shipper_member_grade.grade_discount not in", values, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_grade.grade_discount between", value1, value2, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_shipper_member_grade.grade_discount not between", value1, value2, "gradeDiscount");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentIsNull() {
            addCriterion("temp_shipper_member_grade.grade_cashpayment is null");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_cashpayment is not null");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment =", value, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment <>", value, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment >", value, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment >=", value, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment <", value, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment <=", value, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment like", value, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment not like", value, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment in", values, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment not in", values, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment between", value1, value2, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeCashpaymentNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_cashpayment not between", value1, value2, "gradeCashpayment");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationIsNull() {
            addCriterion("temp_shipper_member_grade.grade_destination is null");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_destination is not null");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_destination =", value, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_destination <>", value, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_destination >", value, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_destination >=", value, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_destination <", value, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_destination <=", value, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_destination like", value, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_destination not like", value, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_destination in", values, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_destination not in", values, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_destination between", value1, value2, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeDestinationNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_destination not between", value1, value2, "gradeDestination");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyIsNull() {
            addCriterion("temp_shipper_member_grade.grade_monthly is null");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyIsNotNull() {
            addCriterion("temp_shipper_member_grade.grade_monthly is not null");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_monthly =", value, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_monthly <>", value, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_monthly >", value, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_monthly >=", value, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyLessThan(String value) {
            addCriterion("temp_shipper_member_grade.grade_monthly <", value, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.grade_monthly <=", value, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_monthly like", value, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyNotLike(String value) {
            addCriterion("temp_shipper_member_grade.grade_monthly not like", value, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_monthly in", values, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.grade_monthly not in", values, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_monthly between", value1, value2, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andGradeMonthlyNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.grade_monthly not between", value1, value2, "gradeMonthly");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_shipper_member_grade.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_shipper_member_grade.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_shipper_member_grade.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_shipper_member_grade.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_shipper_member_grade.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_shipper_member_grade.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_shipper_member_grade.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_shipper_member_grade.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_shipper_member_grade.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_shipper_member_grade.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_shipper_member_grade.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_shipper_member_grade.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_shipper_member_grade.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_shipper_member_grade.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_shipper_member_grade.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_shipper_member_grade.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_shipper_member_grade.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_shipper_member_grade.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_shipper_member_grade.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_shipper_member_grade.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_grade.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_shipper_member_grade.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_grade.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_shipper_member_grade.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_shipper_member_grade.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_grade.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_grade.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_shipper_member_grade.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_shipper_member_grade.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_shipper_member_grade.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_shipper_member_grade.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_grade.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_shipper_member_grade.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_shipper_member_grade.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_shipper_member_grade.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_grade.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_shipper_member_grade.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_shipper_member_grade.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_shipper_member_grade.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_shipper_member_grade.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_shipper_member_grade.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_grade.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_shipper_member_grade.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_grade.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_shipper_member_grade.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_shipper_member_grade.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_grade.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_grade.update_time not between", value1, value2, "updateTime");
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