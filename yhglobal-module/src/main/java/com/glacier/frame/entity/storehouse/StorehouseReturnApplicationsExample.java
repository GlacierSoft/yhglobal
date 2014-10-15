package com.glacier.frame.entity.storehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseReturnApplicationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseReturnApplicationsExample() {
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

        public Criteria andReturnIdIsNull() {
            addCriterion("temp_storehouse_return_applications.return_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnIdIsNotNull() {
            addCriterion("temp_storehouse_return_applications.return_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnIdEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.return_id =", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.return_id <>", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.return_id >", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.return_id >=", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.return_id <", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.return_id <=", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLike(String value) {
            addCriterion("temp_storehouse_return_applications.return_id like", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.return_id not like", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.return_id in", values, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.return_id not in", values, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.return_id between", value1, value2, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.return_id not between", value1, value2, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnTitleIsNull() {
            addCriterion("temp_storehouse_return_applications.return_title is null");
            return (Criteria) this;
        }

        public Criteria andReturnTitleIsNotNull() {
            addCriterion("temp_storehouse_return_applications.return_title is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTitleEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.return_title =", value, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.return_title <>", value, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.return_title >", value, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.return_title >=", value, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.return_title <", value, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.return_title <=", value, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleLike(String value) {
            addCriterion("temp_storehouse_return_applications.return_title like", value, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.return_title not like", value, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.return_title in", values, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.return_title not in", values, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.return_title between", value1, value2, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andReturnTitleNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.return_title not between", value1, value2, "returnTitle");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNull() {
            addCriterion("temp_storehouse_return_applications.belaidup_id is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNotNull() {
            addCriterion("temp_storehouse_return_applications.belaidup_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.belaidup_id =", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.belaidup_id <>", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.belaidup_id >", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.belaidup_id >=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.belaidup_id <", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.belaidup_id <=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLike(String value) {
            addCriterion("temp_storehouse_return_applications.belaidup_id like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.belaidup_id not like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.belaidup_id in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.belaidup_id not in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.belaidup_id between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.belaidup_id not between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_storehouse_return_applications.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_storehouse_return_applications.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_storehouse_return_applications.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_storehouse_return_applications.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_storehouse_return_applications.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_storehouse_return_applications.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_storehouse_return_applications.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_storehouse_return_applications.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_storehouse_return_applications.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("temp_storehouse_return_applications.audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("temp_storehouse_return_applications.audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("temp_storehouse_return_applications.audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_storehouse_return_applications.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_storehouse_return_applications.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_storehouse_return_applications.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("temp_storehouse_return_applications.audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("temp_storehouse_return_applications.audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("temp_storehouse_return_applications.audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_storehouse_return_applications.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_storehouse_return_applications.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_storehouse_return_applications.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_storehouse_return_applications.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_storehouse_return_applications.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_storehouse_return_applications.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_return_applications.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_return_applications.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_return_applications.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_return_applications.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_return_applications.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_return_applications.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_return_applications.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_return_applications.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_return_applications.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_return_applications.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_return_applications.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_return_applications.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_return_applications.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_return_applications.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_return_applications.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_return_applications.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_return_applications.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_return_applications.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_return_applications.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_return_applications.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_return_applications.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_return_applications.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_return_applications.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_return_applications.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_return_applications.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_return_applications.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_return_applications.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_return_applications.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_return_applications.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_return_applications.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_return_applications.update_time not between", value1, value2, "updateTime");
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