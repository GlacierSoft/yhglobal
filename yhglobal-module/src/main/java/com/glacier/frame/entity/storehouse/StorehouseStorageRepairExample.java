package com.glacier.frame.entity.storehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseStorageRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseStorageRepairExample() {
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

        public Criteria andRepairIdIsNull() {
            addCriterion("temp_storehouse_storage_repair.repair_id is null");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.repair_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIdEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_id =", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_id <>", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_id >", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_id >=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThan(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_id <", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_id <=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLike(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_id like", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotLike(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_id not like", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.repair_id in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.repair_id not in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.repair_id between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.repair_id not between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairTitleIsNull() {
            addCriterion("temp_storehouse_storage_repair.repair_title is null");
            return (Criteria) this;
        }

        public Criteria andRepairTitleIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.repair_title is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTitleEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_title =", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_title <>", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_title >", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_title >=", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleLessThan(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_title <", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_title <=", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleLike(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_title like", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleNotLike(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_title not like", value, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.repair_title in", values, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.repair_title not in", values, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.repair_title between", value1, value2, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRepairTitleNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.repair_title not between", value1, value2, "repairTitle");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_storehouse_storage_repair.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_repair.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_storehouse_storage_repair.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_storehouse_storage_repair.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_storehouse_storage_repair.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStorageIdIsNull() {
            addCriterion("temp_storehouse_storage_repair.storage_id is null");
            return (Criteria) this;
        }

        public Criteria andStorageIdIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.storage_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorageIdEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.storage_id =", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.storage_id <>", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_repair.storage_id >", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.storage_id >=", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdLessThan(String value) {
            addCriterion("temp_storehouse_storage_repair.storage_id <", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.storage_id <=", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdLike(String value) {
            addCriterion("temp_storehouse_storage_repair.storage_id like", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdNotLike(String value) {
            addCriterion("temp_storehouse_storage_repair.storage_id not like", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.storage_id in", values, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.storage_id not in", values, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.storage_id between", value1, value2, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.storage_id not between", value1, value2, "storageId");
            return (Criteria) this;
        }

        public Criteria andRepairStautsIsNull() {
            addCriterion("temp_storehouse_storage_repair.repair_stauts is null");
            return (Criteria) this;
        }

        public Criteria andRepairStautsIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.repair_stauts is not null");
            return (Criteria) this;
        }

        public Criteria andRepairStautsEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts =", value, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts <>", value, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts >", value, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts >=", value, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsLessThan(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts <", value, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts <=", value, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsLike(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts like", value, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsNotLike(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts not like", value, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts in", values, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts not in", values, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts between", value1, value2, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairStautsNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.repair_stauts not between", value1, value2, "repairStauts");
            return (Criteria) this;
        }

        public Criteria andRepairGradeIsNull() {
            addCriterion("temp_storehouse_storage_repair.repair_grade is null");
            return (Criteria) this;
        }

        public Criteria andRepairGradeIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.repair_grade is not null");
            return (Criteria) this;
        }

        public Criteria andRepairGradeEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_grade =", value, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_grade <>", value, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_grade >", value, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_grade >=", value, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeLessThan(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_grade <", value, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_grade <=", value, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeLike(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_grade like", value, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeNotLike(String value) {
            addCriterion("temp_storehouse_storage_repair.repair_grade not like", value, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.repair_grade in", values, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.repair_grade not in", values, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.repair_grade between", value1, value2, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andRepairGradeNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.repair_grade not between", value1, value2, "repairGrade");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_storage_repair.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_repair.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_storage_repair.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_storage_repair.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_storage_repair.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_storage_repair.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_repair.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_repair.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage_repair.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_repair.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_storage_repair.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_repair.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_repair.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_repair.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_repair.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_repair.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_storage_repair.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_storage_repair.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_storage_repair.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage_repair.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_storage_repair.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_storage_repair.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage_repair.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage_repair.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_storage_repair.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_storage_repair.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_repair.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_repair.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage_repair.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_repair.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_storage_repair.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage_repair.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_repair.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage_repair.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_repair.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage_repair.update_time not between", value1, value2, "updateTime");
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