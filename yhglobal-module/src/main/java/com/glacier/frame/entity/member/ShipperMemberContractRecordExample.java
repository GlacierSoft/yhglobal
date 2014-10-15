package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShipperMemberContractRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ShipperMemberContractRecordExample() {
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

        public Criteria andMemberDispaly(String value) {
        	addCriterion("temp_shipper_member.member_name like",value,"memberDisplay");
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

        public Criteria andContractRecordIdIsNull() {
            addCriterion("temp_shipper_member_contract_record.contract_record_id is null");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.contract_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id =", value, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id <>", value, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id >", value, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id >=", value, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id <", value, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id <=", value, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdLike(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id like", value, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id not like", value, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id in", values, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id not in", values, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id between", value1, value2, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andContractRecordIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.contract_record_id not between", value1, value2, "contractRecordId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("temp_shipper_member_contract_record.goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("temp_shipper_member_contract_record.goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_shipper_member_contract_record.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_shipper_member_contract_record.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdIsNull() {
            addCriterion("temp_shipper_member_contract_record.contract_type_id is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.contract_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id =", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id <>", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id >", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id >=", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id <", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id <=", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdLike(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id like", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id not like", value, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id in", values, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id not in", values, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id between", value1, value2, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.contract_type_id not between", value1, value2, "contractTypeId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("temp_shipper_member_contract_record.platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLike(String value) {
            addCriterion("temp_shipper_member_contract_record.platform_id like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.platform_id not like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_shipper_member_contract_record.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_shipper_member_contract_record.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andContractContentIsNull() {
            addCriterion("temp_shipper_member_contract_record.contract_content is null");
            return (Criteria) this;
        }

        public Criteria andContractContentIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.contract_content is not null");
            return (Criteria) this;
        }

        public Criteria andContractContentEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_content =", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_content <>", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_content >", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_content >=", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_content <", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_content <=", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentLike(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_content like", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.contract_content not like", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.contract_content in", values, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.contract_content not in", values, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.contract_content between", value1, value2, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.contract_content not between", value1, value2, "contractContent");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("temp_shipper_member_contract_record.operation_time is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.operation_time =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.operation_time <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(Date value) {
            addCriterion("temp_shipper_member_contract_record.operation_time >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.operation_time >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(Date value) {
            addCriterion("temp_shipper_member_contract_record.operation_time <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.operation_time <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<Date> values) {
            addCriterion("temp_shipper_member_contract_record.operation_time in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<Date> values) {
            addCriterion("temp_shipper_member_contract_record.operation_time not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_contract_record.operation_time between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_contract_record.operation_time not between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("temp_shipper_member_contract_record.close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("temp_shipper_member_contract_record.close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("temp_shipper_member_contract_record.close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("temp_shipper_member_contract_record.close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("temp_shipper_member_contract_record.close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_contract_record.close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_contract_record.close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_shipper_member_contract_record.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_shipper_member_contract_record.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_shipper_member_contract_record.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_shipper_member_contract_record.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_shipper_member_contract_record.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_shipper_member_contract_record.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_shipper_member_contract_record.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_shipper_member_contract_record.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_shipper_member_contract_record.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_contract_record.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_contract_record.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_shipper_member_contract_record.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_shipper_member_contract_record.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_shipper_member_contract_record.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_shipper_member_contract_record.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_shipper_member_contract_record.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_shipper_member_contract_record.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_shipper_member_contract_record.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_shipper_member_contract_record.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_shipper_member_contract_record.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_shipper_member_contract_record.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_shipper_member_contract_record.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_shipper_member_contract_record.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_shipper_member_contract_record.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_shipper_member_contract_record.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_shipper_member_contract_record.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_contract_record.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_shipper_member_contract_record.update_time not between", value1, value2, "updateTime");
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