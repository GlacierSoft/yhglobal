package com.glacier.frame.entity.carrier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarrierMemberGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CarrierMemberGradeExample() {
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
            addCriterion("temp_carrier_member_grade.grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("temp_carrier_member_grade.grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(String value) {
            addCriterion("temp_carrier_member_grade.grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(String value) {
            addCriterion("temp_carrier_member_grade.grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLike(String value) {
            addCriterion("temp_carrier_member_grade.grade_id like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotLike(String value) {
            addCriterion("temp_carrier_member_grade.grade_id not like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("temp_carrier_member_grade.grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("temp_carrier_member_grade.grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("temp_carrier_member_grade.grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("temp_carrier_member_grade.grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("temp_carrier_member_grade.grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("temp_carrier_member_grade.grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andScopeStartIsNull() {
            addCriterion("temp_carrier_member_grade.scope_start is null");
            return (Criteria) this;
        }

        public Criteria andScopeStartIsNotNull() {
            addCriterion("temp_carrier_member_grade.scope_start is not null");
            return (Criteria) this;
        }

        public Criteria andScopeStartEqualTo(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_start =", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartNotEqualTo(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_start <>", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartGreaterThan(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_start >", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_start >=", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartLessThan(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_start <", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_start <=", value, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartIn(List<Integer> values) {
            addCriterion("temp_carrier_member_grade.scope_start in", values, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartNotIn(List<Integer> values) {
            addCriterion("temp_carrier_member_grade.scope_start not in", values, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member_grade.scope_start between", value1, value2, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStartNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member_grade.scope_start not between", value1, value2, "scopeStart");
            return (Criteria) this;
        }

        public Criteria andScopeStopIsNull() {
            addCriterion("temp_carrier_member_grade.scope_stop is null");
            return (Criteria) this;
        }

        public Criteria andScopeStopIsNotNull() {
            addCriterion("temp_carrier_member_grade.scope_stop is not null");
            return (Criteria) this;
        }

        public Criteria andScopeStopEqualTo(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_stop =", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopNotEqualTo(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_stop <>", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopGreaterThan(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_stop >", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_stop >=", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopLessThan(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_stop <", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopLessThanOrEqualTo(Integer value) {
            addCriterion("temp_carrier_member_grade.scope_stop <=", value, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopIn(List<Integer> values) {
            addCriterion("temp_carrier_member_grade.scope_stop in", values, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopNotIn(List<Integer> values) {
            addCriterion("temp_carrier_member_grade.scope_stop not in", values, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member_grade.scope_stop between", value1, value2, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andScopeStopNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_carrier_member_grade.scope_stop not between", value1, value2, "scopeStop");
            return (Criteria) this;
        }

        public Criteria andGradeImgIsNull() {
            addCriterion("temp_carrier_member_grade.grade_img is null");
            return (Criteria) this;
        }

        public Criteria andGradeImgIsNotNull() {
            addCriterion("temp_carrier_member_grade.grade_img is not null");
            return (Criteria) this;
        }

        public Criteria andGradeImgEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_img =", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgNotEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_img <>", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgGreaterThan(String value) {
            addCriterion("temp_carrier_member_grade.grade_img >", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_img >=", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgLessThan(String value) {
            addCriterion("temp_carrier_member_grade.grade_img <", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.grade_img <=", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgLike(String value) {
            addCriterion("temp_carrier_member_grade.grade_img like", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgNotLike(String value) {
            addCriterion("temp_carrier_member_grade.grade_img not like", value, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.grade_img in", values, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgNotIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.grade_img not in", values, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.grade_img between", value1, value2, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andGradeImgNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.grade_img not between", value1, value2, "gradeImg");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_carrier_member_grade.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_carrier_member_grade.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_carrier_member_grade.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_carrier_member_grade.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_carrier_member_grade.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_carrier_member_grade.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_carrier_member_grade.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_carrier_member_grade.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_carrier_member_grade.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_carrier_member_grade.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_carrier_member_grade.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_carrier_member_grade.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_carrier_member_grade.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_carrier_member_grade.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_carrier_member_grade.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_carrier_member_grade.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_carrier_member_grade.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_carrier_member_grade.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_carrier_member_grade.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_carrier_member_grade.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_member_grade.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_member_grade.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_member_grade.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member_grade.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_carrier_member_grade.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member_grade.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_member_grade.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_member_grade.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member_grade.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member_grade.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_carrier_member_grade.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_carrier_member_grade.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_carrier_member_grade.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_carrier_member_grade.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_carrier_member_grade.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_carrier_member_grade.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_carrier_member_grade.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_carrier_member_grade.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_carrier_member_grade.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_carrier_member_grade.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_carrier_member_grade.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_carrier_member_grade.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_carrier_member_grade.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_carrier_member_grade.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member_grade.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_carrier_member_grade.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_carrier_member_grade.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_carrier_member_grade.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_carrier_member_grade.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member_grade.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_carrier_member_grade.update_time not between", value1, value2, "updateTime");
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