package com.glacier.frame.entity.orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersOrder_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OrdersOrder_infoExample() {
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
        public Criteria andBelaidupDisplayLike(String value) {
            addCriterion("temp_belaidup.belaidup_prod_name like ", value, "belaidupDisplay");
            return (Criteria) this;
        }
        
        //扩展查询条件
        public Criteria andOrderCodeDisplayLike(String value) {
            addCriterion("temp_order.order_code like ", value, "orderCodeDisplay");
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

        public Criteria andOrderInfoIdIsNull() {
            addCriterion("temp_orders_order_info.order_info_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIsNotNull() {
            addCriterion("temp_orders_order_info.order_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdEqualTo(String value) {
            addCriterion("temp_orders_order_info.order_info_id =", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotEqualTo(String value) {
            addCriterion("temp_orders_order_info.order_info_id <>", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdGreaterThan(String value) {
            addCriterion("temp_orders_order_info.order_info_id >", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.order_info_id >=", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLessThan(String value) {
            addCriterion("temp_orders_order_info.order_info_id <", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.order_info_id <=", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLike(String value) {
            addCriterion("temp_orders_order_info.order_info_id like", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotLike(String value) {
            addCriterion("temp_orders_order_info.order_info_id not like", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIn(List<String> values) {
            addCriterion("temp_orders_order_info.order_info_id in", values, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotIn(List<String> values) {
            addCriterion("temp_orders_order_info.order_info_id not in", values, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.order_info_id between", value1, value2, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.order_info_id not between", value1, value2, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNull() {
            addCriterion("temp_orders_order_info.belaidup_id is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNotNull() {
            addCriterion("temp_orders_order_info.belaidup_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdEqualTo(String value) {
            addCriterion("temp_orders_order_info.belaidup_id =", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotEqualTo(String value) {
            addCriterion("temp_orders_order_info.belaidup_id <>", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThan(String value) {
            addCriterion("temp_orders_order_info.belaidup_id >", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.belaidup_id >=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThan(String value) {
            addCriterion("temp_orders_order_info.belaidup_id <", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.belaidup_id <=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLike(String value) {
            addCriterion("temp_orders_order_info.belaidup_id like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotLike(String value) {
            addCriterion("temp_orders_order_info.belaidup_id not like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIn(List<String> values) {
            addCriterion("temp_orders_order_info.belaidup_id in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotIn(List<String> values) {
            addCriterion("temp_orders_order_info.belaidup_id not in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.belaidup_id between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.belaidup_id not between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("temp_orders_order_info.order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("temp_orders_order_info.order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("temp_orders_order_info.order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("temp_orders_order_info.order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("temp_orders_order_info.order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("temp_orders_order_info.order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("temp_orders_order_info.order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("temp_orders_order_info.order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("temp_orders_order_info.order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("temp_orders_order_info.order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIsNull() {
            addCriterion("temp_orders_order_info.yes_or_no is null");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIsNotNull() {
            addCriterion("temp_orders_order_info.yes_or_no is not null");
            return (Criteria) this;
        }

        public Criteria andYesOrNoEqualTo(String value) {
            addCriterion("temp_orders_order_info.yes_or_no =", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotEqualTo(String value) {
            addCriterion("temp_orders_order_info.yes_or_no <>", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoGreaterThan(String value) {
            addCriterion("temp_orders_order_info.yes_or_no >", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.yes_or_no >=", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLessThan(String value) {
            addCriterion("temp_orders_order_info.yes_or_no <", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.yes_or_no <=", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLike(String value) {
            addCriterion("temp_orders_order_info.yes_or_no like", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotLike(String value) {
            addCriterion("temp_orders_order_info.yes_or_no not like", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIn(List<String> values) {
            addCriterion("temp_orders_order_info.yes_or_no in", values, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotIn(List<String> values) {
            addCriterion("temp_orders_order_info.yes_or_no not in", values, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.yes_or_no between", value1, value2, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.yes_or_no not between", value1, value2, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_orders_order_info.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_orders_order_info.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_orders_order_info.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_orders_order_info.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_orders_order_info.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_orders_order_info.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_orders_order_info.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_orders_order_info.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_orders_order_info.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_orders_order_info.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_orders_order_info.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_orders_order_info.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_orders_order_info.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_orders_order_info.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_orders_order_info.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_orders_order_info.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_orders_order_info.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_orders_order_info.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_orders_order_info.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_orders_order_info.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_orders_order_info.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_orders_order_info.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_orders_order_info.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_orders_order_info.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_orders_order_info.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_orders_order_info.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_orders_order_info.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_orders_order_info.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_orders_order_info.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_orders_order_info.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_orders_order_info.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_orders_order_info.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_orders_order_info.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_orders_order_info.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_orders_order_info.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_orders_order_info.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_orders_order_info.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_orders_order_info.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_orders_order_info.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_orders_order_info.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_orders_order_info.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_orders_order_info.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_orders_order_info.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_orders_order_info.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_orders_order_info.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_orders_order_info.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_orders_order_info.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_orders_order_info.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_orders_order_info.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_orders_order_info.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_orders_order_info.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_orders_order_info.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_orders_order_info.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_orders_order_info.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_orders_order_info.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_orders_order_info.update_time not between", value1, value2, "updateTime");
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