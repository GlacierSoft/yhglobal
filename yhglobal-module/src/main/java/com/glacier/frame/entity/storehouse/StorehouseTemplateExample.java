package com.glacier.frame.entity.storehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorehouseTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StorehouseTemplateExample() {
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

        public Criteria andTemplateidIsNull() {
            addCriterion("temp_storehouse_template.templateId is null");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNotNull() {
            addCriterion("temp_storehouse_template.templateId is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateidEqualTo(String value) {
            addCriterion("temp_storehouse_template.templateId =", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.templateId <>", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThan(String value) {
            addCriterion("temp_storehouse_template.templateId >", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.templateId >=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThan(String value) {
            addCriterion("temp_storehouse_template.templateId <", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.templateId <=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLike(String value) {
            addCriterion("temp_storehouse_template.templateId like", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotLike(String value) {
            addCriterion("temp_storehouse_template.templateId not like", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidIn(List<String> values) {
            addCriterion("temp_storehouse_template.templateId in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.templateId not in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.templateId between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.templateId not between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIsNull() {
            addCriterion("temp_storehouse_template.templateName is null");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIsNotNull() {
            addCriterion("temp_storehouse_template.templateName is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatenameEqualTo(String value) {
            addCriterion("temp_storehouse_template.templateName =", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.templateName <>", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameGreaterThan(String value) {
            addCriterion("temp_storehouse_template.templateName >", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.templateName >=", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLessThan(String value) {
            addCriterion("temp_storehouse_template.templateName <", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.templateName <=", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLike(String value) {
            addCriterion("temp_storehouse_template.templateName like", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotLike(String value) {
            addCriterion("temp_storehouse_template.templateName not like", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIn(List<String> values) {
            addCriterion("temp_storehouse_template.templateName in", values, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.templateName not in", values, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.templateName between", value1, value2, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.templateName not between", value1, value2, "templatename");
            return (Criteria) this;
        }

        public Criteria andReceivingareaIsNull() {
            addCriterion("temp_storehouse_template.receivingArea is null");
            return (Criteria) this;
        }

        public Criteria andReceivingareaIsNotNull() {
            addCriterion("temp_storehouse_template.receivingArea is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingareaEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingArea =", value, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingArea <>", value, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaGreaterThan(String value) {
            addCriterion("temp_storehouse_template.receivingArea >", value, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingArea >=", value, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaLessThan(String value) {
            addCriterion("temp_storehouse_template.receivingArea <", value, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingArea <=", value, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaLike(String value) {
            addCriterion("temp_storehouse_template.receivingArea like", value, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaNotLike(String value) {
            addCriterion("temp_storehouse_template.receivingArea not like", value, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaIn(List<String> values) {
            addCriterion("temp_storehouse_template.receivingArea in", values, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.receivingArea not in", values, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.receivingArea between", value1, value2, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingareaNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.receivingArea not between", value1, value2, "receivingarea");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIsNull() {
            addCriterion("temp_storehouse_template.receivingAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIsNotNull() {
            addCriterion("temp_storehouse_template.receivingAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingAddress =", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingAddress <>", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressGreaterThan(String value) {
            addCriterion("temp_storehouse_template.receivingAddress >", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingAddress >=", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLessThan(String value) {
            addCriterion("temp_storehouse_template.receivingAddress <", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingAddress <=", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLike(String value) {
            addCriterion("temp_storehouse_template.receivingAddress like", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotLike(String value) {
            addCriterion("temp_storehouse_template.receivingAddress not like", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIn(List<String> values) {
            addCriterion("temp_storehouse_template.receivingAddress in", values, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.receivingAddress not in", values, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.receivingAddress between", value1, value2, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.receivingAddress not between", value1, value2, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneIsNull() {
            addCriterion("temp_storehouse_template.receivingPhone is null");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneIsNotNull() {
            addCriterion("temp_storehouse_template.receivingPhone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingPhone =", value, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingPhone <>", value, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneGreaterThan(String value) {
            addCriterion("temp_storehouse_template.receivingPhone >", value, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingPhone >=", value, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneLessThan(String value) {
            addCriterion("temp_storehouse_template.receivingPhone <", value, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.receivingPhone <=", value, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneLike(String value) {
            addCriterion("temp_storehouse_template.receivingPhone like", value, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneNotLike(String value) {
            addCriterion("temp_storehouse_template.receivingPhone not like", value, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneIn(List<String> values) {
            addCriterion("temp_storehouse_template.receivingPhone in", values, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.receivingPhone not in", values, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.receivingPhone between", value1, value2, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andReceivingphoneNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.receivingPhone not between", value1, value2, "receivingphone");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaIsNull() {
            addCriterion("temp_storehouse_template.deliveryArea is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaIsNotNull() {
            addCriterion("temp_storehouse_template.deliveryArea is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaEqualTo(String value) {
            addCriterion("temp_storehouse_template.deliveryArea =", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.deliveryArea <>", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaGreaterThan(String value) {
            addCriterion("temp_storehouse_template.deliveryArea >", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.deliveryArea >=", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaLessThan(String value) {
            addCriterion("temp_storehouse_template.deliveryArea <", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.deliveryArea <=", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaLike(String value) {
            addCriterion("temp_storehouse_template.deliveryArea like", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaNotLike(String value) {
            addCriterion("temp_storehouse_template.deliveryArea not like", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaIn(List<String> values) {
            addCriterion("temp_storehouse_template.deliveryArea in", values, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.deliveryArea not in", values, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.deliveryArea between", value1, value2, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.deliveryArea not between", value1, value2, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2IsNull() {
            addCriterion("temp_storehouse_template.deliveryAddress2 is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2IsNotNull() {
            addCriterion("temp_storehouse_template.deliveryAddress2 is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2EqualTo(String value) {
            addCriterion("temp_storehouse_template.deliveryAddress2 =", value, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2NotEqualTo(String value) {
            addCriterion("temp_storehouse_template.deliveryAddress2 <>", value, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2GreaterThan(String value) {
            addCriterion("temp_storehouse_template.deliveryAddress2 >", value, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2GreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.deliveryAddress2 >=", value, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2LessThan(String value) {
            addCriterion("temp_storehouse_template.deliveryAddress2 <", value, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2LessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.deliveryAddress2 <=", value, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2Like(String value) {
            addCriterion("temp_storehouse_template.deliveryAddress2 like", value, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2NotLike(String value) {
            addCriterion("temp_storehouse_template.deliveryAddress2 not like", value, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2In(List<String> values) {
            addCriterion("temp_storehouse_template.deliveryAddress2 in", values, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2NotIn(List<String> values) {
            addCriterion("temp_storehouse_template.deliveryAddress2 not in", values, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2Between(String value1, String value2) {
            addCriterion("temp_storehouse_template.deliveryAddress2 between", value1, value2, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddress2NotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.deliveryAddress2 not between", value1, value2, "deliveryaddress2");
            return (Criteria) this;
        }

        public Criteria andTradingphoneIsNull() {
            addCriterion("temp_storehouse_template.tradingPhone is null");
            return (Criteria) this;
        }

        public Criteria andTradingphoneIsNotNull() {
            addCriterion("temp_storehouse_template.tradingPhone is not null");
            return (Criteria) this;
        }

        public Criteria andTradingphoneEqualTo(String value) {
            addCriterion("temp_storehouse_template.tradingPhone =", value, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.tradingPhone <>", value, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneGreaterThan(String value) {
            addCriterion("temp_storehouse_template.tradingPhone >", value, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.tradingPhone >=", value, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneLessThan(String value) {
            addCriterion("temp_storehouse_template.tradingPhone <", value, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.tradingPhone <=", value, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneLike(String value) {
            addCriterion("temp_storehouse_template.tradingPhone like", value, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneNotLike(String value) {
            addCriterion("temp_storehouse_template.tradingPhone not like", value, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneIn(List<String> values) {
            addCriterion("temp_storehouse_template.tradingPhone in", values, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.tradingPhone not in", values, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.tradingPhone between", value1, value2, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingphoneNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.tradingPhone not between", value1, value2, "tradingphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneIsNull() {
            addCriterion("temp_storehouse_template.tradingCellphone is null");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneIsNotNull() {
            addCriterion("temp_storehouse_template.tradingCellphone is not null");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneEqualTo(String value) {
            addCriterion("temp_storehouse_template.tradingCellphone =", value, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.tradingCellphone <>", value, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneGreaterThan(String value) {
            addCriterion("temp_storehouse_template.tradingCellphone >", value, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.tradingCellphone >=", value, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneLessThan(String value) {
            addCriterion("temp_storehouse_template.tradingCellphone <", value, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.tradingCellphone <=", value, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneLike(String value) {
            addCriterion("temp_storehouse_template.tradingCellphone like", value, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneNotLike(String value) {
            addCriterion("temp_storehouse_template.tradingCellphone not like", value, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneIn(List<String> values) {
            addCriterion("temp_storehouse_template.tradingCellphone in", values, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.tradingCellphone not in", values, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.tradingCellphone between", value1, value2, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andTradingcellphoneNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.tradingCellphone not between", value1, value2, "tradingcellphone");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIsNull() {
            addCriterion("temp_storehouse_template.goodstypeId is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIsNotNull() {
            addCriterion("temp_storehouse_template.goodstypeId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidEqualTo(String value) {
            addCriterion("temp_storehouse_template.goodstypeId =", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.goodstypeId <>", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThan(String value) {
            addCriterion("temp_storehouse_template.goodstypeId >", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.goodstypeId >=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThan(String value) {
            addCriterion("temp_storehouse_template.goodstypeId <", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.goodstypeId <=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLike(String value) {
            addCriterion("temp_storehouse_template.goodstypeId like", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotLike(String value) {
            addCriterion("temp_storehouse_template.goodstypeId not like", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIn(List<String> values) {
            addCriterion("temp_storehouse_template.goodstypeId in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.goodstypeId not in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.goodstypeId between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.goodstypeId not between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameIsNull() {
            addCriterion("temp_storehouse_template.belaidupProdName is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameIsNotNull() {
            addCriterion("temp_storehouse_template.belaidupProdName is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameEqualTo(String value) {
            addCriterion("temp_storehouse_template.belaidupProdName =", value, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.belaidupProdName <>", value, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameGreaterThan(String value) {
            addCriterion("temp_storehouse_template.belaidupProdName >", value, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.belaidupProdName >=", value, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameLessThan(String value) {
            addCriterion("temp_storehouse_template.belaidupProdName <", value, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.belaidupProdName <=", value, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameLike(String value) {
            addCriterion("temp_storehouse_template.belaidupProdName like", value, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameNotLike(String value) {
            addCriterion("temp_storehouse_template.belaidupProdName not like", value, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameIn(List<String> values) {
            addCriterion("temp_storehouse_template.belaidupProdName in", values, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.belaidupProdName not in", values, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.belaidupProdName between", value1, value2, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupprodnameNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.belaidupProdName not between", value1, value2, "belaidupprodname");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightIsNull() {
            addCriterion("temp_storehouse_template.belaidupWeight is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightIsNotNull() {
            addCriterion("temp_storehouse_template.belaidupWeight is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightEqualTo(Float value) {
            addCriterion("temp_storehouse_template.belaidupWeight =", value, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightNotEqualTo(Float value) {
            addCriterion("temp_storehouse_template.belaidupWeight <>", value, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightGreaterThan(Float value) {
            addCriterion("temp_storehouse_template.belaidupWeight >", value, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_template.belaidupWeight >=", value, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightLessThan(Float value) {
            addCriterion("temp_storehouse_template.belaidupWeight <", value, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_template.belaidupWeight <=", value, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightIn(List<Float> values) {
            addCriterion("temp_storehouse_template.belaidupWeight in", values, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightNotIn(List<Float> values) {
            addCriterion("temp_storehouse_template.belaidupWeight not in", values, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_template.belaidupWeight between", value1, value2, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupweightNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_template.belaidupWeight not between", value1, value2, "belaidupweight");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkIsNull() {
            addCriterion("temp_storehouse_template.belaidupBulk is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkIsNotNull() {
            addCriterion("temp_storehouse_template.belaidupBulk is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkEqualTo(Float value) {
            addCriterion("temp_storehouse_template.belaidupBulk =", value, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkNotEqualTo(Float value) {
            addCriterion("temp_storehouse_template.belaidupBulk <>", value, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkGreaterThan(Float value) {
            addCriterion("temp_storehouse_template.belaidupBulk >", value, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_template.belaidupBulk >=", value, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkLessThan(Float value) {
            addCriterion("temp_storehouse_template.belaidupBulk <", value, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkLessThanOrEqualTo(Float value) {
            addCriterion("temp_storehouse_template.belaidupBulk <=", value, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkIn(List<Float> values) {
            addCriterion("temp_storehouse_template.belaidupBulk in", values, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkNotIn(List<Float> values) {
            addCriterion("temp_storehouse_template.belaidupBulk not in", values, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_template.belaidupBulk between", value1, value2, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupbulkNotBetween(Float value1, Float value2) {
            addCriterion("temp_storehouse_template.belaidupBulk not between", value1, value2, "belaidupbulk");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberIsNull() {
            addCriterion("temp_storehouse_template.belaidupNumber is null");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberIsNotNull() {
            addCriterion("temp_storehouse_template.belaidupNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.belaidupNumber =", value, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberNotEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.belaidupNumber <>", value, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberGreaterThan(Integer value) {
            addCriterion("temp_storehouse_template.belaidupNumber >", value, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.belaidupNumber >=", value, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberLessThan(Integer value) {
            addCriterion("temp_storehouse_template.belaidupNumber <", value, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberLessThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.belaidupNumber <=", value, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberIn(List<Integer> values) {
            addCriterion("temp_storehouse_template.belaidupNumber in", values, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberNotIn(List<Integer> values) {
            addCriterion("temp_storehouse_template.belaidupNumber not in", values, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_template.belaidupNumber between", value1, value2, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andBelaidupnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_template.belaidupNumber not between", value1, value2, "belaidupnumber");
            return (Criteria) this;
        }

        public Criteria andCartypeidIsNull() {
            addCriterion("temp_storehouse_template.cartypeId is null");
            return (Criteria) this;
        }

        public Criteria andCartypeidIsNotNull() {
            addCriterion("temp_storehouse_template.cartypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeidEqualTo(String value) {
            addCriterion("temp_storehouse_template.cartypeId =", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.cartypeId <>", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidGreaterThan(String value) {
            addCriterion("temp_storehouse_template.cartypeId >", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.cartypeId >=", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLessThan(String value) {
            addCriterion("temp_storehouse_template.cartypeId <", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.cartypeId <=", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidLike(String value) {
            addCriterion("temp_storehouse_template.cartypeId like", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotLike(String value) {
            addCriterion("temp_storehouse_template.cartypeId not like", value, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidIn(List<String> values) {
            addCriterion("temp_storehouse_template.cartypeId in", values, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.cartypeId not in", values, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.cartypeId between", value1, value2, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andCartypeidNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.cartypeId not between", value1, value2, "cartypeid");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("temp_storehouse_template.service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("temp_storehouse_template.service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("temp_storehouse_template.service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("temp_storehouse_template.service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("temp_storehouse_template.service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("temp_storehouse_template.service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("temp_storehouse_template.service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("temp_storehouse_template.service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andLengthstartIsNull() {
            addCriterion("temp_storehouse_template.lengthStart is null");
            return (Criteria) this;
        }

        public Criteria andLengthstartIsNotNull() {
            addCriterion("temp_storehouse_template.lengthStart is not null");
            return (Criteria) this;
        }

        public Criteria andLengthstartEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.lengthStart =", value, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartNotEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.lengthStart <>", value, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartGreaterThan(Integer value) {
            addCriterion("temp_storehouse_template.lengthStart >", value, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.lengthStart >=", value, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartLessThan(Integer value) {
            addCriterion("temp_storehouse_template.lengthStart <", value, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartLessThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.lengthStart <=", value, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartIn(List<Integer> values) {
            addCriterion("temp_storehouse_template.lengthStart in", values, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartNotIn(List<Integer> values) {
            addCriterion("temp_storehouse_template.lengthStart not in", values, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_template.lengthStart between", value1, value2, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstartNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_template.lengthStart not between", value1, value2, "lengthstart");
            return (Criteria) this;
        }

        public Criteria andLengthstopIsNull() {
            addCriterion("temp_storehouse_template.lengthStop is null");
            return (Criteria) this;
        }

        public Criteria andLengthstopIsNotNull() {
            addCriterion("temp_storehouse_template.lengthStop is not null");
            return (Criteria) this;
        }

        public Criteria andLengthstopEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.lengthStop =", value, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopNotEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.lengthStop <>", value, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopGreaterThan(Integer value) {
            addCriterion("temp_storehouse_template.lengthStop >", value, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.lengthStop >=", value, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopLessThan(Integer value) {
            addCriterion("temp_storehouse_template.lengthStop <", value, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopLessThanOrEqualTo(Integer value) {
            addCriterion("temp_storehouse_template.lengthStop <=", value, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopIn(List<Integer> values) {
            addCriterion("temp_storehouse_template.lengthStop in", values, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopNotIn(List<Integer> values) {
            addCriterion("temp_storehouse_template.lengthStop not in", values, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_template.lengthStop between", value1, value2, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andLengthstopNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_storehouse_template.lengthStop not between", value1, value2, "lengthstop");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_storehouse_template.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_storehouse_template.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_storehouse_template.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_storehouse_template.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_storehouse_template.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_storehouse_template.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_storehouse_template.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_storehouse_template.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_storehouse_template.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_storehouse_template.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_template.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_template.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_template.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_template.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_template.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_template.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_template.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_template.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_template.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_template.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_storehouse_template.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_storehouse_template.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_storehouse_template.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_storehouse_template.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_storehouse_template.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_storehouse_template.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_storehouse_template.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_storehouse_template.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_storehouse_template.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_storehouse_template.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_storehouse_template.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_storehouse_template.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_storehouse_template.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_template.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_storehouse_template.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_storehouse_template.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_storehouse_template.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_storehouse_template.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_template.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_storehouse_template.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("temp_storehouse_template.memberId is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("temp_storehouse_template.memberId is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("temp_storehouse_template.memberId =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("temp_storehouse_template.memberId <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("temp_storehouse_template.memberId >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.memberId >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("temp_storehouse_template.memberId <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("temp_storehouse_template.memberId <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("temp_storehouse_template.memberId like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("temp_storehouse_template.memberId not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("temp_storehouse_template.memberId in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("temp_storehouse_template.memberId not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.memberId between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("temp_storehouse_template.memberId not between", value1, value2, "memberid");
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