package com.glacier.frame.entity.storehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseStorageGoodsrunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseStorageGoodsrunExample() {
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

        public Criteria andGoodsrunIdIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id =", value, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id <>", value, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id >", value, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id >=", value, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdLessThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id <", value, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id <=", value, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id like", value, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdNotLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id not like", value, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id in", values, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id not in", values, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id between", value1, value2, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_id not between", value1, value2, "goodsrunId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id =", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id <>", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id >", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id >=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id <", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id <=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id not like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id not in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.belaidup_id not between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num =", value, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumNotEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num <>", value, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumGreaterThan(Integer value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num >", value, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num >=", value, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumLessThan(Integer value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num <", value, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num <=", value, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumIn(List<Integer> values) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num in", values, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumNotIn(List<Integer> values) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num not in", values, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num between", value1, value2, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_num not between", value1, value2, "goodsrunNum");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status =", value, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status <>", value, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status >", value, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status >=", value, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusLessThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status <", value, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status <=", value, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status like", value, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusNotLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status not like", value, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status in", values, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status not in", values, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status between", value1, value2, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsrunStatusNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_status not between", value1, value2, "goodsrunStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date is null");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date =", value, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date <>", value, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date >", value, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date >=", value, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateLessThan(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date <", value, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date <=", value, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date in", values, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date not in", values, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date between", value1, value2, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andGoodsrunDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_goodsrun.goodsrun_date not between", value1, value2, "goodsrunDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_goodsrun.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_storage_goodsrun.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_goodsrun.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_goodsrun.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_storage_goodsrun.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_storage_goodsrun.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_goodsrun.update_time not between", value1, value2, "updateTime");
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