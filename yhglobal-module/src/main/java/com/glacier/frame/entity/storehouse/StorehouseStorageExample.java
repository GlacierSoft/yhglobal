package com.glacier.frame.entity.storehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseStorageExample() {
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
        public Criteria andUserDisplayLike(String value) {
            addCriterion("temp_user.username like", value, "userDisplay");
            return (Criteria) this;
        }
        
        //扩展查询条件
        public Criteria andStorageTypeLike(String value) {
            addCriterion("temp_storehouse_storagetype_set.storagetype_name like", value, "storageTyperDisplay");
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

        public Criteria andStorageIdIsNull() {
            addCriterion("temp_storehouse_storage.storage_id is null");
            return (Criteria) this;
        }

        public Criteria andStorageIdIsNotNull() {
            addCriterion("temp_storehouse_storage.storage_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorageIdEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_id =", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_id <>", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.storage_id >", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_id >=", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdLessThan(String value) {
            addCriterion("temp_storehouse_storage.storage_id <", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_id <=", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdLike(String value) {
            addCriterion("temp_storehouse_storage.storage_id like", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdNotLike(String value) {
            addCriterion("temp_storehouse_storage.storage_id not like", value, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_id in", values, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_id not in", values, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_id between", value1, value2, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_id not between", value1, value2, "storageId");
            return (Criteria) this;
        }

        public Criteria andStorageCodeIsNull() {
            addCriterion("temp_storehouse_storage.storage_code is null");
            return (Criteria) this;
        }

        public Criteria andStorageCodeIsNotNull() {
            addCriterion("temp_storehouse_storage.storage_code is not null");
            return (Criteria) this;
        }

        public Criteria andStorageCodeEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_code =", value, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_code <>", value, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.storage_code >", value, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_code >=", value, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeLessThan(String value) {
            addCriterion("temp_storehouse_storage.storage_code <", value, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_code <=", value, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeLike(String value) {
            addCriterion("temp_storehouse_storage.storage_code like", value, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeNotLike(String value) {
            addCriterion("temp_storehouse_storage.storage_code not like", value, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_code in", values, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_code not in", values, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_code between", value1, value2, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStorageCodeNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_code not between", value1, value2, "storageCode");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdIsNull() {
            addCriterion("temp_storehouse_storage.storagetype_id is null");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdIsNotNull() {
            addCriterion("temp_storehouse_storage.storagetype_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storagetype_id =", value, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storagetype_id <>", value, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.storagetype_id >", value, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storagetype_id >=", value, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdLessThan(String value) {
            addCriterion("temp_storehouse_storage.storagetype_id <", value, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storagetype_id <=", value, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdLike(String value) {
            addCriterion("temp_storehouse_storage.storagetype_id like", value, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdNotLike(String value) {
            addCriterion("temp_storehouse_storage.storagetype_id not like", value, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storagetype_id in", values, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storagetype_id not in", values, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storagetype_id between", value1, value2, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storagetype_id not between", value1, value2, "storagetypeId");
            return (Criteria) this;
        }

        public Criteria andStorageNameIsNull() {
            addCriterion("temp_storehouse_storage.storage_name is null");
            return (Criteria) this;
        }

        public Criteria andStorageNameIsNotNull() {
            addCriterion("temp_storehouse_storage.storage_name is not null");
            return (Criteria) this;
        }

        public Criteria andStorageNameEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_name =", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_name <>", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.storage_name >", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_name >=", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameLessThan(String value) {
            addCriterion("temp_storehouse_storage.storage_name <", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_name <=", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameLike(String value) {
            addCriterion("temp_storehouse_storage.storage_name like", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameNotLike(String value) {
            addCriterion("temp_storehouse_storage.storage_name not like", value, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_name in", values, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_name not in", values, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_name between", value1, value2, "storageName");
            return (Criteria) this;
        }

        public Criteria andStorageNameNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_name not between", value1, value2, "storageName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_storehouse_storage.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_storehouse_storage.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_storehouse_storage.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_storehouse_storage.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_storehouse_storage.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_storehouse_storage.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_storehouse_storage.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("temp_storehouse_storage.user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("temp_storehouse_storage.user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("temp_storehouse_storage.user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("temp_storehouse_storage.user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("temp_storehouse_storage.user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("temp_storehouse_storage.user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("temp_storehouse_storage.user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIsNull() {
            addCriterion("temp_storehouse_storage.yes_or_no is null");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIsNotNull() {
            addCriterion("temp_storehouse_storage.yes_or_no is not null");
            return (Criteria) this;
        }

        public Criteria andYesOrNoEqualTo(String value) {
            addCriterion("temp_storehouse_storage.yes_or_no =", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.yes_or_no <>", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.yes_or_no >", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.yes_or_no >=", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLessThan(String value) {
            addCriterion("temp_storehouse_storage.yes_or_no <", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.yes_or_no <=", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLike(String value) {
            addCriterion("temp_storehouse_storage.yes_or_no like", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotLike(String value) {
            addCriterion("temp_storehouse_storage.yes_or_no not like", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIn(List<String> values) {
            addCriterion("temp_storehouse_storage.yes_or_no in", values, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.yes_or_no not in", values, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.yes_or_no between", value1, value2, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.yes_or_no not between", value1, value2, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNull() {
            addCriterion("temp_storehouse_storage.build_date is null");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNotNull() {
            addCriterion("temp_storehouse_storage.build_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuildDateEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.build_date =", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.build_date <>", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage.build_date >", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.build_date >=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThan(Date value) {
            addCriterion("temp_storehouse_storage.build_date <", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.build_date <=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateIn(List<Date> values) {
            addCriterion("temp_storehouse_storage.build_date in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage.build_date not in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage.build_date between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage.build_date not between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumIsNull() {
            addCriterion("temp_storehouse_storage.must_overhaul_num is null");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumIsNotNull() {
            addCriterion("temp_storehouse_storage.must_overhaul_num is not null");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage.must_overhaul_num =", value, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumNotEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage.must_overhaul_num <>", value, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumGreaterThan(Integer value) {
            addCriterion("temp_storehouse_storage.must_overhaul_num >", value, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage.must_overhaul_num >=", value, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumLessThan(Integer value) {
            addCriterion("temp_storehouse_storage.must_overhaul_num <", value, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage.must_overhaul_num <=", value, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumIn(List<Integer> values) {
            addCriterion("temp_storehouse_storage.must_overhaul_num in", values, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumNotIn(List<Integer> values) {
            addCriterion("temp_storehouse_storage.must_overhaul_num not in", values, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_storage.must_overhaul_num between", value1, value2, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andMustOverhaulNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_storage.must_overhaul_num not between", value1, value2, "mustOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumIsNull() {
            addCriterion("temp_storehouse_storage.already_overhaul_num is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumIsNotNull() {
            addCriterion("temp_storehouse_storage.already_overhaul_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage.already_overhaul_num =", value, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumNotEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage.already_overhaul_num <>", value, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumGreaterThan(Integer value) {
            addCriterion("temp_storehouse_storage.already_overhaul_num >", value, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage.already_overhaul_num >=", value, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumLessThan(Integer value) {
            addCriterion("temp_storehouse_storage.already_overhaul_num <", value, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_storage.already_overhaul_num <=", value, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumIn(List<Integer> values) {
            addCriterion("temp_storehouse_storage.already_overhaul_num in", values, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumNotIn(List<Integer> values) {
            addCriterion("temp_storehouse_storage.already_overhaul_num not in", values, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_storage.already_overhaul_num between", value1, value2, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andAlreadyOverhaulNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_storage.already_overhaul_num not between", value1, value2, "alreadyOverhaulNum");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateIsNull() {
            addCriterion("temp_storehouse_storage.next_overhaul_date is null");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateIsNotNull() {
            addCriterion("temp_storehouse_storage.next_overhaul_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.next_overhaul_date =", value, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.next_overhaul_date <>", value, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage.next_overhaul_date >", value, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.next_overhaul_date >=", value, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateLessThan(Date value) {
            addCriterion("temp_storehouse_storage.next_overhaul_date <", value, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.next_overhaul_date <=", value, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateIn(List<Date> values) {
            addCriterion("temp_storehouse_storage.next_overhaul_date in", values, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage.next_overhaul_date not in", values, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage.next_overhaul_date between", value1, value2, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andNextOverhaulDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage.next_overhaul_date not between", value1, value2, "nextOverhaulDate");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundIsNull() {
            addCriterion("temp_storehouse_storage.weight_upper_bound is null");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundIsNotNull() {
            addCriterion("temp_storehouse_storage.weight_upper_bound is not null");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.weight_upper_bound =", value, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundNotEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.weight_upper_bound <>", value, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundGreaterThan(Float value) {
            addCriterion("temp_storehouse_storage.weight_upper_bound >", value, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.weight_upper_bound >=", value, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundLessThan(Float value) {
            addCriterion("temp_storehouse_storage.weight_upper_bound <", value, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.weight_upper_bound <=", value, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundIn(List<Float> values) {
            addCriterion("temp_storehouse_storage.weight_upper_bound in", values, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundNotIn(List<Float> values) {
            addCriterion("temp_storehouse_storage.weight_upper_bound not in", values, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_storage.weight_upper_bound between", value1, value2, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andWeightUpperBoundNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_storage.weight_upper_bound not between", value1, value2, "weightUpperBound");
            return (Criteria) this;
        }

        public Criteria andUsableWeightIsNull() {
            addCriterion("temp_storehouse_storage.usable_weight is null");
            return (Criteria) this;
        }

        public Criteria andUsableWeightIsNotNull() {
            addCriterion("temp_storehouse_storage.usable_weight is not null");
            return (Criteria) this;
        }

        public Criteria andUsableWeightEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.usable_weight =", value, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightNotEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.usable_weight <>", value, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightGreaterThan(Float value) {
            addCriterion("temp_storehouse_storage.usable_weight >", value, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.usable_weight >=", value, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightLessThan(Float value) {
            addCriterion("temp_storehouse_storage.usable_weight <", value, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.usable_weight <=", value, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightIn(List<Float> values) {
            addCriterion("temp_storehouse_storage.usable_weight in", values, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightNotIn(List<Float> values) {
            addCriterion("temp_storehouse_storage.usable_weight not in", values, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_storage.usable_weight between", value1, value2, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andUsableWeightNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_storage.usable_weight not between", value1, value2, "usableWeight");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundIsNull() {
            addCriterion("temp_storehouse_storage.bulk_upper_bound is null");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundIsNotNull() {
            addCriterion("temp_storehouse_storage.bulk_upper_bound is not null");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound =", value, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundNotEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound <>", value, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundGreaterThan(Float value) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound >", value, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound >=", value, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundLessThan(Float value) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound <", value, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound <=", value, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundIn(List<Float> values) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound in", values, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundNotIn(List<Float> values) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound not in", values, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound between", value1, value2, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andBulkUpperBoundNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_storage.bulk_upper_bound not between", value1, value2, "bulkUpperBound");
            return (Criteria) this;
        }

        public Criteria andUsableBulkIsNull() {
            addCriterion("temp_storehouse_storage.usable_bulk is null");
            return (Criteria) this;
        }

        public Criteria andUsableBulkIsNotNull() {
            addCriterion("temp_storehouse_storage.usable_bulk is not null");
            return (Criteria) this;
        }

        public Criteria andUsableBulkEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.usable_bulk =", value, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkNotEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.usable_bulk <>", value, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkGreaterThan(Float value) {
            addCriterion("temp_storehouse_storage.usable_bulk >", value, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.usable_bulk >=", value, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkLessThan(Float value) {
            addCriterion("temp_storehouse_storage.usable_bulk <", value, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_storage.usable_bulk <=", value, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkIn(List<Float> values) {
            addCriterion("temp_storehouse_storage.usable_bulk in", values, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkNotIn(List<Float> values) {
            addCriterion("temp_storehouse_storage.usable_bulk not in", values, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_storage.usable_bulk between", value1, value2, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andUsableBulkNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_storage.usable_bulk not between", value1, value2, "usableBulk");
            return (Criteria) this;
        }

        public Criteria andStorageTelIsNull() {
            addCriterion("temp_storehouse_storage.storage_tel is null");
            return (Criteria) this;
        }

        public Criteria andStorageTelIsNotNull() {
            addCriterion("temp_storehouse_storage.storage_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTelEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_tel =", value, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_tel <>", value, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.storage_tel >", value, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_tel >=", value, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelLessThan(String value) {
            addCriterion("temp_storehouse_storage.storage_tel <", value, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_tel <=", value, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelLike(String value) {
            addCriterion("temp_storehouse_storage.storage_tel like", value, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelNotLike(String value) {
            addCriterion("temp_storehouse_storage.storage_tel not like", value, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_tel in", values, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_tel not in", values, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_tel between", value1, value2, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageTelNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_tel not between", value1, value2, "storageTel");
            return (Criteria) this;
        }

        public Criteria andStorageAddressIsNull() {
            addCriterion("temp_storehouse_storage.storage_address is null");
            return (Criteria) this;
        }

        public Criteria andStorageAddressIsNotNull() {
            addCriterion("temp_storehouse_storage.storage_address is not null");
            return (Criteria) this;
        }

        public Criteria andStorageAddressEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_address =", value, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_address <>", value, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.storage_address >", value, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_address >=", value, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressLessThan(String value) {
            addCriterion("temp_storehouse_storage.storage_address <", value, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.storage_address <=", value, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressLike(String value) {
            addCriterion("temp_storehouse_storage.storage_address like", value, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressNotLike(String value) {
            addCriterion("temp_storehouse_storage.storage_address not like", value, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_address in", values, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.storage_address not in", values, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_address between", value1, value2, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andStorageAddressNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.storage_address not between", value1, value2, "storageAddress");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_storehouse_storage.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_storehouse_storage.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_storehouse_storage.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_storehouse_storage.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_storehouse_storage.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_storehouse_storage.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_storehouse_storage.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_storage.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_storage.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_storage.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_storage.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_storage.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_storage.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_storage.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_storage.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_storage.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_storage.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_storage.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_storage.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_storage.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_storage.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_storage.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_storage.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_storage.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_storage.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_storage.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_storage.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_storage.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_storage.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_storage.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_storage.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_storage.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_storage.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_storage.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_storage.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_storage.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_storage.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_storage.update_time not between", value1, value2, "updateTime");
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