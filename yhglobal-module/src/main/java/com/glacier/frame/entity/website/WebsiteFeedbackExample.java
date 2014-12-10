package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteFeedbackExample() {
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

        public Criteria andWebFdbIdIsNull() {
            addCriterion("temp_website_feedback.web_fdb_id is null");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdIsNotNull() {
            addCriterion("temp_website_feedback.web_fdb_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_id =", value, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdNotEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_id <>", value, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdGreaterThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_id >", value, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_id >=", value, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdLessThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_id <", value, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_id <=", value, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_id like", value, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdNotLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_id not like", value, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_id in", values, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdNotIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_id not in", values, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_id between", value1, value2, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_id not between", value1, value2, "webFdbId");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeIsNull() {
            addCriterion("temp_website_feedback.web_fdb_theme is null");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeIsNotNull() {
            addCriterion("temp_website_feedback.web_fdb_theme is not null");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_theme =", value, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeNotEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_theme <>", value, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeGreaterThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_theme >", value, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_theme >=", value, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeLessThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_theme <", value, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_theme <=", value, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_theme like", value, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeNotLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_theme not like", value, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_theme in", values, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeNotIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_theme not in", values, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_theme between", value1, value2, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbThemeNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_theme not between", value1, value2, "webFdbTheme");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusIsNull() {
            addCriterion("temp_website_feedback.web_fdb_status is null");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusIsNotNull() {
            addCriterion("temp_website_feedback.web_fdb_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_status =", value, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusNotEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_status <>", value, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusGreaterThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_status >", value, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_status >=", value, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusLessThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_status <", value, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_status <=", value, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_status like", value, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusNotLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_status not like", value, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_status in", values, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusNotIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_status not in", values, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_status between", value1, value2, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_status not between", value1, value2, "webFdbStatus");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneIsNull() {
            addCriterion("temp_website_feedback.web_fdb_phone is null");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneIsNotNull() {
            addCriterion("temp_website_feedback.web_fdb_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_phone =", value, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneNotEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_phone <>", value, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneGreaterThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_phone >", value, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_phone >=", value, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneLessThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_phone <", value, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_phone <=", value, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_phone like", value, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneNotLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_phone not like", value, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_phone in", values, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneNotIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_phone not in", values, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_phone between", value1, value2, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_phone not between", value1, value2, "webFdbPhone");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameIsNull() {
            addCriterion("temp_website_feedback.web_fdb_name is null");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameIsNotNull() {
            addCriterion("temp_website_feedback.web_fdb_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_name =", value, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameNotEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_name <>", value, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameGreaterThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_name >", value, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_name >=", value, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameLessThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_name <", value, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_name <=", value, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_name like", value, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameNotLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_name not like", value, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_name in", values, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameNotIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_name not in", values, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_name between", value1, value2, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbNameNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_name not between", value1, value2, "webFdbName");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailIsNull() {
            addCriterion("temp_website_feedback.web_fdb_email is null");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailIsNotNull() {
            addCriterion("temp_website_feedback.web_fdb_email is not null");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_email =", value, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailNotEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_email <>", value, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailGreaterThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_email >", value, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_email >=", value, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailLessThan(String value) {
            addCriterion("temp_website_feedback.web_fdb_email <", value, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.web_fdb_email <=", value, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_email like", value, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailNotLike(String value) {
            addCriterion("temp_website_feedback.web_fdb_email not like", value, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_email in", values, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailNotIn(List<String> values) {
            addCriterion("temp_website_feedback.web_fdb_email not in", values, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_email between", value1, value2, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andWebFdbEmailNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.web_fdb_email not between", value1, value2, "webFdbEmail");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_feedback.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_feedback.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_feedback.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_feedback.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_feedback.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_feedback.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_feedback.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_feedback.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_feedback.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_feedback.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_feedback.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_feedback.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_feedback.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_feedback.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_feedback.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_feedback.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_feedback.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_feedback.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_feedback.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_feedback.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_feedback.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_feedback.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_feedback.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_feedback.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_feedback.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_feedback.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_feedback.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_feedback.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_feedback.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_feedback.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_feedback.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_feedback.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_feedback.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_feedback.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_feedback.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_feedback.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_feedback.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_feedback.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_feedback.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_feedback.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_feedback.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_feedback.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_feedback.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_feedback.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_feedback.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_feedback.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_feedback.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_feedback.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_feedback.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_feedback.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_feedback.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_feedback.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_feedback.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_feedback.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_feedback.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_feedback.update_time not between", value1, value2, "updateTime");
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