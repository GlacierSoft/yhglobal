package com.glacier.frame.entity.storehouse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StorehouseAddedServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseAddedServiceExample() {
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

        public Criteria andAddedServiceIdIsNull() {
            addCriterion("temp_storehouse_added_service.added_service_id is null");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdIsNotNull() {
            addCriterion("temp_storehouse_added_service.added_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.added_service_id =", value, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.added_service_id <>", value, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.added_service_id >", value, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.added_service_id >=", value, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdLessThan(String value) {
            addCriterion("temp_storehouse_added_service.added_service_id <", value, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.added_service_id <=", value, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdLike(String value) {
            addCriterion("temp_storehouse_added_service.added_service_id like", value, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdNotLike(String value) {
            addCriterion("temp_storehouse_added_service.added_service_id not like", value, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.added_service_id in", values, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.added_service_id not in", values, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.added_service_id between", value1, value2, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andAddedServiceIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.added_service_id not between", value1, value2, "addedServiceId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNull() {
            addCriterion("temp_storehouse_added_service.belaidup_id is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIsNotNull() {
            addCriterion("temp_storehouse_added_service.belaidup_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.belaidup_id =", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.belaidup_id <>", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.belaidup_id >", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.belaidup_id >=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThan(String value) {
            addCriterion("temp_storehouse_added_service.belaidup_id <", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.belaidup_id <=", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdLike(String value) {
            addCriterion("temp_storehouse_added_service.belaidup_id like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotLike(String value) {
            addCriterion("temp_storehouse_added_service.belaidup_id not like", value, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.belaidup_id in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.belaidup_id not in", values, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.belaidup_id between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andBelaidupIdNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.belaidup_id not between", value1, value2, "belaidupId");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryIsNull() {
            addCriterion("temp_storehouse_added_service.door_delivery is null");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryIsNotNull() {
            addCriterion("temp_storehouse_added_service.door_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.door_delivery =", value, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.door_delivery <>", value, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.door_delivery >", value, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.door_delivery >=", value, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryLessThan(String value) {
            addCriterion("temp_storehouse_added_service.door_delivery <", value, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.door_delivery <=", value, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryLike(String value) {
            addCriterion("temp_storehouse_added_service.door_delivery like", value, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryNotLike(String value) {
            addCriterion("temp_storehouse_added_service.door_delivery not like", value, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.door_delivery in", values, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.door_delivery not in", values, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.door_delivery between", value1, value2, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andDoorDeliveryNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.door_delivery not between", value1, value2, "doorDelivery");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("temp_storehouse_added_service.message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("temp_storehouse_added_service.message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("temp_storehouse_added_service.message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("temp_storehouse_added_service.message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("temp_storehouse_added_service.message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andFuelBillsIsNull() {
            addCriterion("temp_storehouse_added_service.fuel_bills is null");
            return (Criteria) this;
        }

        public Criteria andFuelBillsIsNotNull() {
            addCriterion("temp_storehouse_added_service.fuel_bills is not null");
            return (Criteria) this;
        }

        public Criteria andFuelBillsEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.fuel_bills =", value, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.fuel_bills <>", value, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.fuel_bills >", value, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.fuel_bills >=", value, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.fuel_bills <", value, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.fuel_bills <=", value, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.fuel_bills in", values, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.fuel_bills not in", values, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.fuel_bills between", value1, value2, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andFuelBillsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.fuel_bills not between", value1, value2, "fuelBills");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitIsNull() {
            addCriterion("temp_storehouse_added_service.delivery_visit is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitIsNotNull() {
            addCriterion("temp_storehouse_added_service.delivery_visit is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.delivery_visit =", value, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.delivery_visit <>", value, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.delivery_visit >", value, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.delivery_visit >=", value, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitLessThan(String value) {
            addCriterion("temp_storehouse_added_service.delivery_visit <", value, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.delivery_visit <=", value, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitLike(String value) {
            addCriterion("temp_storehouse_added_service.delivery_visit like", value, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitNotLike(String value) {
            addCriterion("temp_storehouse_added_service.delivery_visit not like", value, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.delivery_visit in", values, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.delivery_visit not in", values, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.delivery_visit between", value1, value2, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andDeliveryVisitNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.delivery_visit not between", value1, value2, "deliveryVisit");
            return (Criteria) this;
        }

        public Criteria andSignReceiptIsNull() {
            addCriterion("temp_storehouse_added_service.sign_receipt is null");
            return (Criteria) this;
        }

        public Criteria andSignReceiptIsNotNull() {
            addCriterion("temp_storehouse_added_service.sign_receipt is not null");
            return (Criteria) this;
        }

        public Criteria andSignReceiptEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.sign_receipt =", value, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.sign_receipt <>", value, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.sign_receipt >", value, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.sign_receipt >=", value, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptLessThan(String value) {
            addCriterion("temp_storehouse_added_service.sign_receipt <", value, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.sign_receipt <=", value, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptLike(String value) {
            addCriterion("temp_storehouse_added_service.sign_receipt like", value, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptNotLike(String value) {
            addCriterion("temp_storehouse_added_service.sign_receipt not like", value, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.sign_receipt in", values, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.sign_receipt not in", values, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.sign_receipt between", value1, value2, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.sign_receipt not between", value1, value2, "signReceipt");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeIsNull() {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" is null");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeIsNotNull() {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" is not null");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" =", value, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" <>", value, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" >", value, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" >=", value, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeLessThan(String value) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" <", value, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" <=", value, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeLike(String value) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" like", value, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeNotLike(String value) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" not like", value, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" in", values, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" not in", values, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" between", value1, value2, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptTypeNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.\"sign_receipt _type\" not between", value1, value2, "signReceiptType");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostIsNull() {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost is null");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostIsNotNull() {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost =", value, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost <>", value, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost >", value, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost >=", value, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost <", value, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost <=", value, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost in", values, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost not in", values, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost between", value1, value2, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andSignReceiptCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.sign_receipt_cost not between", value1, value2, "signReceiptCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostIsNull() {
            addCriterion("temp_storehouse_added_service.flat_cost is null");
            return (Criteria) this;
        }

        public Criteria andFlatCostIsNotNull() {
            addCriterion("temp_storehouse_added_service.flat_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFlatCostEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.flat_cost =", value, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.flat_cost <>", value, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.flat_cost >", value, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.flat_cost >=", value, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.flat_cost <", value, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.flat_cost <=", value, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.flat_cost in", values, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.flat_cost not in", values, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.flat_cost between", value1, value2, "flatCost");
            return (Criteria) this;
        }

        public Criteria andFlatCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.flat_cost not between", value1, value2, "flatCost");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryIsNull() {
            addCriterion("temp_storehouse_added_service.urgent_delivery is null");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryIsNotNull() {
            addCriterion("temp_storehouse_added_service.urgent_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.urgent_delivery =", value, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.urgent_delivery <>", value, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.urgent_delivery >", value, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.urgent_delivery >=", value, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryLessThan(String value) {
            addCriterion("temp_storehouse_added_service.urgent_delivery <", value, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.urgent_delivery <=", value, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryLike(String value) {
            addCriterion("temp_storehouse_added_service.urgent_delivery like", value, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryNotLike(String value) {
            addCriterion("temp_storehouse_added_service.urgent_delivery not like", value, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.urgent_delivery in", values, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.urgent_delivery not in", values, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.urgent_delivery between", value1, value2, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andUrgentDeliveryNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.urgent_delivery not between", value1, value2, "urgentDelivery");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("temp_storehouse_added_service.insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("temp_storehouse_added_service.insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(String value) {
            addCriterion("temp_storehouse_added_service.insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(String value) {
            addCriterion("temp_storehouse_added_service.insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_added_service.insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLike(String value) {
            addCriterion("temp_storehouse_added_service.insurance like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotLike(String value) {
            addCriterion("temp_storehouse_added_service.insurance not like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<String> values) {
            addCriterion("temp_storehouse_added_service.insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_added_service.insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNull() {
            addCriterion("temp_storehouse_added_service.insurance_cost is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNotNull() {
            addCriterion("temp_storehouse_added_service.insurance_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.insurance_cost =", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.insurance_cost <>", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.insurance_cost >", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.insurance_cost >=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.insurance_cost <", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.insurance_cost <=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.insurance_cost in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.insurance_cost not in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.insurance_cost between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.insurance_cost not between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostIsNull() {
            addCriterion("temp_storehouse_added_service.transportation_cost is null");
            return (Criteria) this;
        }

        public Criteria andTransportationCostIsNotNull() {
            addCriterion("temp_storehouse_added_service.transportation_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationCostEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.transportation_cost =", value, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.transportation_cost <>", value, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.transportation_cost >", value, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.transportation_cost >=", value, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.transportation_cost <", value, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.transportation_cost <=", value, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.transportation_cost in", values, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.transportation_cost not in", values, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.transportation_cost between", value1, value2, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andTransportationCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.transportation_cost not between", value1, value2, "transportationCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIsNull() {
            addCriterion("temp_storehouse_added_service.goods_cost is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIsNotNull() {
            addCriterion("temp_storehouse_added_service.goods_cost is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.goods_cost =", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.goods_cost <>", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.goods_cost >", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.goods_cost >=", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.goods_cost <", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.goods_cost <=", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.goods_cost in", values, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.goods_cost not in", values, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.goods_cost between", value1, value2, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.goods_cost not between", value1, value2, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("temp_storehouse_added_service.total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("temp_storehouse_added_service.total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_storehouse_added_service.total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("temp_storehouse_added_service.total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_storehouse_added_service.total_cost not between", value1, value2, "totalCost");
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