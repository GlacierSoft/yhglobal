package com.glacier.frame.entity.storehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseDamageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseDamageExample() {
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

        public Criteria andDamageIdIsNull() {
            addCriterion("temp_storehouse_damage.damage_id is null");
            return (Criteria) this;
        }

        public Criteria andDamageIdIsNotNull() {
            addCriterion("temp_storehouse_damage.damage_id is not null");
            return (Criteria) this;
        }

        public Criteria andDamageIdEqualTo(String value) {
            addCriterion("temp_storehouse_damage.damage_id =", value, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.damage_id <>", value, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.damage_id >", value, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.damage_id >=", value, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdLessThan(String value) {
            addCriterion("temp_storehouse_damage.damage_id <", value, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.damage_id <=", value, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdLike(String value) {
            addCriterion("temp_storehouse_damage.damage_id like", value, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdNotLike(String value) {
            addCriterion("temp_storehouse_damage.damage_id not like", value, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdIn(List<String> values) {
            addCriterion("temp_storehouse_damage.damage_id in", values, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.damage_id not in", values, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.damage_id between", value1, value2, "damageId");
            return (Criteria) this;
        }

        public Criteria andDamageIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.damage_id not between", value1, value2, "damageId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNull() {
            addCriterion("temp_storehouse_damage.belaidup_id is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNotNull() {
            addCriterion("temp_storehouse_damage.belaidup_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdEqualTo(String value) {
            addCriterion("temp_storehouse_damage.belaidup_id =", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.belaidup_id <>", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.belaidup_id >", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.belaidup_id >=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThan(String value) {
            addCriterion("temp_storehouse_damage.belaidup_id <", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.belaidup_id <=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLike(String value) {
            addCriterion("temp_storehouse_damage.belaidup_id like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotLike(String value) {
            addCriterion("temp_storehouse_damage.belaidup_id not like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIn(List<String> values) {
            addCriterion("temp_storehouse_damage.belaidup_id in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.belaidup_id not in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.belaidup_id between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.belaidup_id not between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_storehouse_damage.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_storehouse_damage.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_storehouse_damage.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_storehouse_damage.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_storehouse_damage.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_storehouse_damage.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_storehouse_damage.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIsNull() {
            addCriterion("temp_storehouse_damage.yes_or_no is null");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIsNotNull() {
            addCriterion("temp_storehouse_damage.yes_or_no is not null");
            return (Criteria) this;
        }

        public Criteria andYesOrNoEqualTo(String value) {
            addCriterion("temp_storehouse_damage.yes_or_no =", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.yes_or_no <>", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.yes_or_no >", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.yes_or_no >=", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLessThan(String value) {
            addCriterion("temp_storehouse_damage.yes_or_no <", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.yes_or_no <=", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLike(String value) {
            addCriterion("temp_storehouse_damage.yes_or_no like", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotLike(String value) {
            addCriterion("temp_storehouse_damage.yes_or_no not like", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIn(List<String> values) {
            addCriterion("temp_storehouse_damage.yes_or_no in", values, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.yes_or_no not in", values, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.yes_or_no between", value1, value2, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.yes_or_no not between", value1, value2, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("temp_storehouse_damage.audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("temp_storehouse_damage.audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("temp_storehouse_damage.audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("temp_storehouse_damage.audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("temp_storehouse_damage.audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("temp_storehouse_damage.audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("temp_storehouse_damage.audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_storehouse_damage.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_storehouse_damage.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_storehouse_damage.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_storehouse_damage.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_storehouse_damage.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_storehouse_damage.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_storehouse_damage.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("temp_storehouse_damage.audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("temp_storehouse_damage.audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("temp_storehouse_damage.audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("temp_storehouse_damage.audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("temp_storehouse_damage.audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("temp_storehouse_damage.audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("temp_storehouse_damage.audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_storehouse_damage.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_storehouse_damage.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_storehouse_damage.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_storehouse_damage.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_storehouse_damage.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_storehouse_damage.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_damage.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_damage.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_damage.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_damage.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_damage.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_damage.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_damage.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_damage.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_damage.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_damage.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_damage.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_damage.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_damage.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_damage.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_damage.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_damage.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_damage.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_damage.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_damage.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_damage.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_damage.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_damage.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_damage.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_damage.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_damage.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_damage.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_damage.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_damage.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_damage.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_damage.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_damage.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_damage.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_damage.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_damage.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_damage.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_damage.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_damage.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_damage.update_time not between", value1, value2, "updateTime");
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