package com.glacier.frame.entity.storehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseBelaidupSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseBelaidupSourceExample() {
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

        public Criteria andBelaidupIdIsNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id =", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id <>", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id >", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id >=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id <", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id <=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id not like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id not in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_id not between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameIsNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name =", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name <>", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name >", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name >=", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name <", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name <=", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name like", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name not like", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name in", values, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name not in", values, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name between", value1, value2, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_prod_name not between", value1, value2, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdIsNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id =", value, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id <>", value, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id >", value, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id >=", value, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id <", value, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id <=", value, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id like", value, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id not like", value, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id in", values, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id not in", values, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id between", value1, value2, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_type_id not between", value1, value2, "belaidupTypeId");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeIsNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume =", value, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeNotEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume <>", value, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeGreaterThan(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume >", value, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume >=", value, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeLessThan(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume <", value, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume <=", value, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeIn(List<Float> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume in", values, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeNotIn(List<Float> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume not in", values, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume between", value1, value2, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupVolumeNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_volume not between", value1, value2, "belaidupVolume");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightIsNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight =", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightNotEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight <>", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightGreaterThan(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight >", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight >=", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightLessThan(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight <", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight <=", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightIn(List<Float> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight in", values, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightNotIn(List<Float> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight not in", values, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight between", value1, value2, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_weight not between", value1, value2, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andOriginationStationIsNull() {
            addCriterion("temp_storehouse_belaidup_source.origination_station is null");
            return (Criteria) this;
        }

        public Criteria andOriginationStationIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.origination_station is not null");
            return (Criteria) this;
        }

        public Criteria andOriginationStationEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_station =", value, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_station <>", value, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_station >", value, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_station >=", value, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_station <", value, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_station <=", value, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_station like", value, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_station not like", value, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.origination_station in", values, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.origination_station not in", values, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.origination_station between", value1, value2, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationStationNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.origination_station not between", value1, value2, "originationStation");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressIsNull() {
            addCriterion("temp_storehouse_belaidup_source.origination_address is null");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.origination_address is not null");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_address =", value, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_address <>", value, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_address >", value, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_address >=", value, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_address <", value, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_address <=", value, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_address like", value, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.origination_address not like", value, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.origination_address in", values, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.origination_address not in", values, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.origination_address between", value1, value2, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andOriginationAddressNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.origination_address not between", value1, value2, "originationAddress");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_storehouse_belaidup_source.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentIsNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent =", value, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent <>", value, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent >", value, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent >=", value, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent <", value, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent <=", value, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent like", value, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent not like", value, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent in", values, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent not in", values, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent between", value1, value2, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andBelaidupUrgentNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.belaidup_urgent not between", value1, value2, "belaidupUrgent");
            return (Criteria) this;
        }

        public Criteria andMembermobileIsNull() {
            addCriterion("temp_storehouse_belaidup_source.memberMobile is null");
            return (Criteria) this;
        }

        public Criteria andMembermobileIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.memberMobile is not null");
            return (Criteria) this;
        }

        public Criteria andMembermobileEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile =", value, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile <>", value, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile >", value, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile >=", value, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile <", value, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile <=", value, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile like", value, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile not like", value, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile in", values, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile not in", values, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile between", value1, value2, "membermobile");
            return (Criteria) this;
        }

        public Criteria andMembermobileNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.memberMobile not between", value1, value2, "membermobile");
            return (Criteria) this;
        }

        public Criteria andEndStationIsNull() {
            addCriterion("temp_storehouse_belaidup_source.end_station is null");
            return (Criteria) this;
        }

        public Criteria andEndStationIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.end_station is not null");
            return (Criteria) this;
        }

        public Criteria andEndStationEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_station =", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_station <>", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_station >", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_station >=", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_station <", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_station <=", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_station like", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_station not like", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.end_station in", values, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.end_station not in", values, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.end_station between", value1, value2, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.end_station not between", value1, value2, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndAddressIsNull() {
            addCriterion("temp_storehouse_belaidup_source.end_address is null");
            return (Criteria) this;
        }

        public Criteria andEndAddressIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.end_address is not null");
            return (Criteria) this;
        }

        public Criteria andEndAddressEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_address =", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_address <>", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_address >", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_address >=", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_address <", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_address <=", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_address like", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.end_address not like", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.end_address in", values, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.end_address not in", values, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.end_address between", value1, value2, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.end_address not between", value1, value2, "endAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileIsNull() {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile =", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile <>", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile >", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile >=", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile <", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile <=", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile like", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile not like", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile in", values, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile not in", values, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile between", value1, value2, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.receive_mobile not between", value1, value2, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleIsNull() {
            addCriterion("temp_storehouse_belaidup_source.receivc_style is null");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.receivc_style is not null");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style =", value, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style <>", value, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style >", value, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style >=", value, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style <", value, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style <=", value, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style like", value, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style not like", value, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style in", values, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style not in", values, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style between", value1, value2, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andReceivcStyleNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.receivc_style not between", value1, value2, "receivcStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleIsNull() {
            addCriterion("temp_storehouse_belaidup_source.show_style is null");
            return (Criteria) this;
        }

        public Criteria andShowStyleIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.show_style is not null");
            return (Criteria) this;
        }

        public Criteria andShowStyleEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.show_style =", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.show_style <>", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.show_style >", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.show_style >=", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.show_style <", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.show_style <=", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.show_style like", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.show_style not like", value, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.show_style in", values, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.show_style not in", values, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.show_style between", value1, value2, "showStyle");
            return (Criteria) this;
        }

        public Criteria andShowStyleNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.show_style not between", value1, value2, "showStyle");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_storehouse_belaidup_source.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_belaidup_source.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_belaidup_source.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup_source.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup_source.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_belaidup_source.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup_source.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_belaidup_source.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup_source.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup_source.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup_source.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup_source.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup_source.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_belaidup_source.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_belaidup_source.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup_source.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_belaidup_source.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup_source.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup_source.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_belaidup_source.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_belaidup_source.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup_source.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup_source.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_belaidup_source.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup_source.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_belaidup_source.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup_source.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup_source.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup_source.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup_source.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup_source.update_time not between", value1, value2, "updateTime");
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