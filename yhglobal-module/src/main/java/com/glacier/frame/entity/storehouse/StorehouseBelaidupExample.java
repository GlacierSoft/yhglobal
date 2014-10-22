package com.glacier.frame.entity.storehouse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseBelaidupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseBelaidupExample() {
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
        public Criteria andStorageDisplayLike(String value) {
            addCriterion("temp_storage.storage_name like ", value, "storageDisplay");
            return (Criteria) this;
        }
        
        public Criteria andPackageDisplayLike(String value) {
            addCriterion("temp_packcode.pack_bar_code like ", value, "packageCode");
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

        public Criteria andBelaidupIdIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_id is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_id =", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_id <>", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_id >", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_id >=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_id <", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_id <=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_id like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_id not like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_id in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_id not in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_id between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_id not between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name =", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name <>", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name >", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name >=", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name <", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name <=", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name like", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name not like", value, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name in", values, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name not in", values, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name between", value1, value2, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andBelaidupProdNameNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_prod_name not between", value1, value2, "belaidupProdName");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_storehouse_belaidup.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_storehouse_belaidup.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_storehouse_belaidup.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice =", value, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice <>", value, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice >", value, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice >=", value, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice <", value, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice <=", value, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice in", values, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice not in", values, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice between", value1, value2, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andBelaidupUnitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_unitprice not between", value1, value2, "belaidupUnitprice");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdIsNull() {
            addCriterion("temp_storehouse_belaidup.goodstype_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdIsNotNull() {
            addCriterion("temp_storehouse_belaidup.goodstype_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.goodstype_id =", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.goodstype_id <>", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.goodstype_id >", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.goodstype_id >=", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.goodstype_id <", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.goodstype_id <=", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdLike(String value) {
            addCriterion("temp_storehouse_belaidup.goodstype_id like", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.goodstype_id not like", value, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.goodstype_id in", values, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.goodstype_id not in", values, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.goodstype_id between", value1, value2, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.goodstype_id not between", value1, value2, "goodstypeId");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIsNull() {
            addCriterion("temp_storehouse_belaidup.yes_or_no is null");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIsNotNull() {
            addCriterion("temp_storehouse_belaidup.yes_or_no is not null");
            return (Criteria) this;
        }

        public Criteria andYesOrNoEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.yes_or_no =", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.yes_or_no <>", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.yes_or_no >", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.yes_or_no >=", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.yes_or_no <", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.yes_or_no <=", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoLike(String value) {
            addCriterion("temp_storehouse_belaidup.yes_or_no like", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.yes_or_no not like", value, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.yes_or_no in", values, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.yes_or_no not in", values, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.yes_or_no between", value1, value2, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andYesOrNoNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.yes_or_no not between", value1, value2, "yesOrNo");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_weight is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_weight is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight =", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightNotEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight <>", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightGreaterThan(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight >", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight >=", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightLessThan(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight <", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight <=", value, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightIn(List<Float> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight in", values, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightNotIn(List<Float> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight not in", values, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight between", value1, value2, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupWeightNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_weight not between", value1, value2, "belaidupWeight");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk =", value, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkNotEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk <>", value, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkGreaterThan(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk >", value, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk >=", value, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkLessThan(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk <", value, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk <=", value, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkIn(List<Float> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk in", values, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkNotIn(List<Float> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk not in", values, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk between", value1, value2, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupBulkNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_bulk not between", value1, value2, "belaidupBulk");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceIsNull() {
            addCriterion("temp_storehouse_belaidup.repertory_price is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceIsNotNull() {
            addCriterion("temp_storehouse_belaidup.repertory_price is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.repertory_price =", value, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.repertory_price <>", value, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.repertory_price >", value, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.repertory_price >=", value, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.repertory_price <", value, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.repertory_price <=", value, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.repertory_price in", values, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.repertory_price not in", values, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.repertory_price between", value1, value2, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andRepertoryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.repertory_price not between", value1, value2, "repertoryPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceIsNull() {
            addCriterion("temp_storehouse_belaidup.stock_price is null");
            return (Criteria) this;
        }

        public Criteria andStockPriceIsNotNull() {
            addCriterion("temp_storehouse_belaidup.stock_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockPriceEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.stock_price =", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.stock_price <>", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.stock_price >", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.stock_price >=", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.stock_price <", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.stock_price <=", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.stock_price in", values, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.stock_price not in", values, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.stock_price between", value1, value2, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.stock_price not between", value1, value2, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceIsNull() {
            addCriterion("temp_storehouse_belaidup.pack_price is null");
            return (Criteria) this;
        }

        public Criteria andPackPriceIsNotNull() {
            addCriterion("temp_storehouse_belaidup.pack_price is not null");
            return (Criteria) this;
        }

        public Criteria andPackPriceEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.pack_price =", value, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.pack_price <>", value, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.pack_price >", value, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.pack_price >=", value, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.pack_price <", value, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.pack_price <=", value, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.pack_price in", values, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.pack_price not in", values, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.pack_price between", value1, value2, "packPrice");
            return (Criteria) this;
        }

        public Criteria andPackPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.pack_price not between", value1, value2, "packPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIsNull() {
            addCriterion("temp_storehouse_belaidup.freight_price is null");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIsNotNull() {
            addCriterion("temp_storehouse_belaidup.freight_price is not null");
            return (Criteria) this;
        }

        public Criteria andFreightPriceEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.freight_price =", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.freight_price <>", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.freight_price >", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.freight_price >=", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.freight_price <", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.freight_price <=", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.freight_price in", values, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.freight_price not in", values, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.freight_price between", value1, value2, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.freight_price not between", value1, value2, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin =", value, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin <>", value, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin >", value, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin >=", value, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin <", value, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin <=", value, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin like", value, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin not like", value, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin in", values, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin not in", values, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin between", value1, value2, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupInitiatinNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_initiatin not between", value1, value2, "belaidupInitiatin");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu =", value, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu <>", value, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu >", value, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu >=", value, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu <", value, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu <=", value, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu like", value, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu not like", value, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu in", values, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu not in", values, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu between", value1, value2, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andBelaidupTerminuNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_terminu not between", value1, value2, "belaidupTerminu");
            return (Criteria) this;
        }

        public Criteria andReplenishmentIsNull() {
            addCriterion("temp_storehouse_belaidup.replenishment is null");
            return (Criteria) this;
        }

        public Criteria andReplenishmentIsNotNull() {
            addCriterion("temp_storehouse_belaidup.replenishment is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishmentEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.replenishment =", value, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.replenishment <>", value, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.replenishment >", value, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.replenishment >=", value, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.replenishment <", value, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.replenishment <=", value, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentLike(String value) {
            addCriterion("temp_storehouse_belaidup.replenishment like", value, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.replenishment not like", value, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.replenishment in", values, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.replenishment not in", values, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.replenishment between", value1, value2, "replenishment");
            return (Criteria) this;
        }

        public Criteria andReplenishmentNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.replenishment not between", value1, value2, "replenishment");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeIsNull() {
            addCriterion("temp_storehouse_belaidup.order_consignee is null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeIsNotNull() {
            addCriterion("temp_storehouse_belaidup.order_consignee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_consignee =", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_consignee <>", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.order_consignee >", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_consignee >=", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.order_consignee <", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_consignee <=", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeLike(String value) {
            addCriterion("temp_storehouse_belaidup.order_consignee like", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.order_consignee not like", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.order_consignee in", values, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.order_consignee not in", values, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.order_consignee between", value1, value2, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.order_consignee not between", value1, value2, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNull() {
            addCriterion("temp_storehouse_belaidup.order_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNotNull() {
            addCriterion("temp_storehouse_belaidup.order_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_phone =", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_phone <>", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.order_phone >", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_phone >=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.order_phone <", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_phone <=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLike(String value) {
            addCriterion("temp_storehouse_belaidup.order_phone like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.order_phone not like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.order_phone in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.order_phone not in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.order_phone between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.order_phone not between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNull() {
            addCriterion("temp_storehouse_belaidup.order_address is null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNotNull() {
            addCriterion("temp_storehouse_belaidup.order_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_address =", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_address <>", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.order_address >", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_address >=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.order_address <", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.order_address <=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLike(String value) {
            addCriterion("temp_storehouse_belaidup.order_address like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.order_address not like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.order_address in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.order_address not in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.order_address between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.order_address not between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_status is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_status is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_status =", value, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_status <>", value, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_status >", value, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_status >=", value, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_status <", value, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_status <=", value, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_status like", value, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_status not like", value, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_status in", values, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_status not in", values, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_status between", value1, value2, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andBelaidupStatusNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_status not between", value1, value2, "belaidupStatus");
            return (Criteria) this;
        }

        public Criteria andSortingStautsIsNull() {
            addCriterion("temp_storehouse_belaidup.sorting_stauts is null");
            return (Criteria) this;
        }

        public Criteria andSortingStautsIsNotNull() {
            addCriterion("temp_storehouse_belaidup.sorting_stauts is not null");
            return (Criteria) this;
        }

        public Criteria andSortingStautsEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts =", value, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts <>", value, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts >", value, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts >=", value, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts <", value, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts <=", value, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsLike(String value) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts like", value, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts not like", value, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts in", values, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts not in", values, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts between", value1, value2, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andSortingStautsNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.sorting_stauts not between", value1, value2, "sortingStauts");
            return (Criteria) this;
        }

        public Criteria andStautsIsNull() {
            addCriterion("temp_storehouse_belaidup.stauts is null");
            return (Criteria) this;
        }

        public Criteria andStautsIsNotNull() {
            addCriterion("temp_storehouse_belaidup.stauts is not null");
            return (Criteria) this;
        }

        public Criteria andStautsEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.stauts =", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.stauts <>", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.stauts >", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.stauts >=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.stauts <", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.stauts <=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLike(String value) {
            addCriterion("temp_storehouse_belaidup.stauts like", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.stauts not like", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.stauts in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.stauts not in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.stauts between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.stauts not between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time =", value, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time <>", value, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time >", value, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time >=", value, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeLessThan(Date value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time <", value, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time <=", value, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time in", values, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time not in", values, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time between", value1, value2, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_time not between", value1, value2, "belaidupReturnTime");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage =", value, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage <>", value, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage >", value, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage >=", value, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage <", value, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage <=", value, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage in", values, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage not in", values, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage between", value1, value2, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupReturnPoundageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_return_poundage not between", value1, value2, "belaidupReturnPoundage");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeIsNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeIsNotNull() {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code =", value, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code <>", value, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code >", value, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code >=", value, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code <", value, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code <=", value, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code like", value, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code not like", value, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code in", values, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code not in", values, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code between", value1, value2, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andBelaidupBarCodeNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.belaidup_bar_code not between", value1, value2, "belaidupBarCode");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIsNull() {
            addCriterion("temp_storehouse_belaidup.storehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIsNotNull() {
            addCriterion("temp_storehouse_belaidup.storehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.storehouse_id =", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.storehouse_id <>", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.storehouse_id >", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.storehouse_id >=", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.storehouse_id <", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.storehouse_id <=", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLike(String value) {
            addCriterion("temp_storehouse_belaidup.storehouse_id like", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.storehouse_id not like", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.storehouse_id in", values, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.storehouse_id not in", values, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.storehouse_id between", value1, value2, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.storehouse_id not between", value1, value2, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_storehouse_belaidup.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_storehouse_belaidup.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_storehouse_belaidup.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_belaidup.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_belaidup.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_belaidup.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_belaidup.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_belaidup.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_belaidup.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_belaidup.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_belaidup.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_belaidup.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_belaidup.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_belaidup.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_belaidup.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_belaidup.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_belaidup.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_belaidup.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_belaidup.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_belaidup.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_belaidup.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_belaidup.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_belaidup.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_belaidup.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_belaidup.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_belaidup.update_time not between", value1, value2, "updateTime");
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