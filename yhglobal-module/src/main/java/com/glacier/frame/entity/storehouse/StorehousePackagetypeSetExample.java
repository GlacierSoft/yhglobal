package com.glacier.frame.entity.storehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehousePackagetypeSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehousePackagetypeSetExample() {
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

        public Criteria andPackagetypeIdIsNull() {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id is null");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdIsNotNull() {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id =", value, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id <>", value, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdGreaterThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id >", value, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id >=", value, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdLessThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id <", value, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id <=", value, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id like", value, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdNotLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id not like", value, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id in", values, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id not in", values, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id between", value1, value2, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_id not between", value1, value2, "packagetypeId");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameIsNull() {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name is null");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameIsNotNull() {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name =", value, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameNotEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name <>", value, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameGreaterThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name >", value, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name >=", value, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameLessThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name <", value, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name <=", value, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name like", value, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameNotLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name not like", value, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name in", values, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameNotIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name not in", values, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name between", value1, value2, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNameNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.packagetype_name not between", value1, value2, "packagetypeName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_storehouse_packagetype_set.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_storehouse_packagetype_set.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_storehouse_packagetype_set.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_storehouse_packagetype_set.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_packagetype_set.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_packagetype_set.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_packagetype_set.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_packagetype_set.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_packagetype_set.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_packagetype_set.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_packagetype_set.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_packagetype_set.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_packagetype_set.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_packagetype_set.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_packagetype_set.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_packagetype_set.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_packagetype_set.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_packagetype_set.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_packagetype_set.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_packagetype_set.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_packagetype_set.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_packagetype_set.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_packagetype_set.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_packagetype_set.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_packagetype_set.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_packagetype_set.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_packagetype_set.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_packagetype_set.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_packagetype_set.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_packagetype_set.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_packagetype_set.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_packagetype_set.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_packagetype_set.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_packagetype_set.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_packagetype_set.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_packagetype_set.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_packagetype_set.update_time not between", value1, value2, "updateTime");
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