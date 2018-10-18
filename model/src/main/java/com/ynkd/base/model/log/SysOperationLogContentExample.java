package com.ynkd.base.model.log;

import java.util.ArrayList;
import java.util.List;

public class SysOperationLogContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SysOperationLogContentExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andLogconIdIsNull() {
            addCriterion("logcon_id is null");
            return (Criteria) this;
        }

        public Criteria andLogconIdIsNotNull() {
            addCriterion("logcon_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogconIdEqualTo(String value) {
            addCriterion("logcon_id =", value, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdNotEqualTo(String value) {
            addCriterion("logcon_id <>", value, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdGreaterThan(String value) {
            addCriterion("logcon_id >", value, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdGreaterThanOrEqualTo(String value) {
            addCriterion("logcon_id >=", value, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdLessThan(String value) {
            addCriterion("logcon_id <", value, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdLessThanOrEqualTo(String value) {
            addCriterion("logcon_id <=", value, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdLike(String value) {
            addCriterion("logcon_id like", value, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdNotLike(String value) {
            addCriterion("logcon_id not like", value, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdIn(List<String> values) {
            addCriterion("logcon_id in", values, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdNotIn(List<String> values) {
            addCriterion("logcon_id not in", values, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdBetween(String value1, String value2) {
            addCriterion("logcon_id between", value1, value2, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogconIdNotBetween(String value1, String value2) {
            addCriterion("logcon_id not between", value1, value2, "logconId");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("log_id like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("log_id not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogconKeyIsNull() {
            addCriterion("logcon_key is null");
            return (Criteria) this;
        }

        public Criteria andLogconKeyIsNotNull() {
            addCriterion("logcon_key is not null");
            return (Criteria) this;
        }

        public Criteria andLogconKeyEqualTo(String value) {
            addCriterion("logcon_key =", value, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyNotEqualTo(String value) {
            addCriterion("logcon_key <>", value, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyGreaterThan(String value) {
            addCriterion("logcon_key >", value, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyGreaterThanOrEqualTo(String value) {
            addCriterion("logcon_key >=", value, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyLessThan(String value) {
            addCriterion("logcon_key <", value, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyLessThanOrEqualTo(String value) {
            addCriterion("logcon_key <=", value, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyLike(String value) {
            addCriterion("logcon_key like", value, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyNotLike(String value) {
            addCriterion("logcon_key not like", value, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyIn(List<String> values) {
            addCriterion("logcon_key in", values, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyNotIn(List<String> values) {
            addCriterion("logcon_key not in", values, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyBetween(String value1, String value2) {
            addCriterion("logcon_key between", value1, value2, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconKeyNotBetween(String value1, String value2) {
            addCriterion("logcon_key not between", value1, value2, "logconKey");
            return (Criteria) this;
        }

        public Criteria andLogconValueIsNull() {
            addCriterion("logcon_value is null");
            return (Criteria) this;
        }

        public Criteria andLogconValueIsNotNull() {
            addCriterion("logcon_value is not null");
            return (Criteria) this;
        }

        public Criteria andLogconValueEqualTo(String value) {
            addCriterion("logcon_value =", value, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueNotEqualTo(String value) {
            addCriterion("logcon_value <>", value, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueGreaterThan(String value) {
            addCriterion("logcon_value >", value, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueGreaterThanOrEqualTo(String value) {
            addCriterion("logcon_value >=", value, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueLessThan(String value) {
            addCriterion("logcon_value <", value, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueLessThanOrEqualTo(String value) {
            addCriterion("logcon_value <=", value, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueLike(String value) {
            addCriterion("logcon_value like", value, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueNotLike(String value) {
            addCriterion("logcon_value not like", value, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueIn(List<String> values) {
            addCriterion("logcon_value in", values, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueNotIn(List<String> values) {
            addCriterion("logcon_value not in", values, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueBetween(String value1, String value2) {
            addCriterion("logcon_value between", value1, value2, "logconValue");
            return (Criteria) this;
        }

        public Criteria andLogconValueNotBetween(String value1, String value2) {
            addCriterion("logcon_value not between", value1, value2, "logconValue");
            return (Criteria) this;
        }

        public Criteria andOldValueIsNull() {
            addCriterion("old_value is null");
            return (Criteria) this;
        }

        public Criteria andOldValueIsNotNull() {
            addCriterion("old_value is not null");
            return (Criteria) this;
        }

        public Criteria andOldValueEqualTo(String value) {
            addCriterion("old_value =", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueNotEqualTo(String value) {
            addCriterion("old_value <>", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueGreaterThan(String value) {
            addCriterion("old_value >", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueGreaterThanOrEqualTo(String value) {
            addCriterion("old_value >=", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueLessThan(String value) {
            addCriterion("old_value <", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueLessThanOrEqualTo(String value) {
            addCriterion("old_value <=", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueLike(String value) {
            addCriterion("old_value like", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueNotLike(String value) {
            addCriterion("old_value not like", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueIn(List<String> values) {
            addCriterion("old_value in", values, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueNotIn(List<String> values) {
            addCriterion("old_value not in", values, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueBetween(String value1, String value2) {
            addCriterion("old_value between", value1, value2, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueNotBetween(String value1, String value2) {
            addCriterion("old_value not between", value1, value2, "oldValue");
            return (Criteria) this;
        }

        public Criteria andNewValueIsNull() {
            addCriterion("new_value is null");
            return (Criteria) this;
        }

        public Criteria andNewValueIsNotNull() {
            addCriterion("new_value is not null");
            return (Criteria) this;
        }

        public Criteria andNewValueEqualTo(String value) {
            addCriterion("new_value =", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueNotEqualTo(String value) {
            addCriterion("new_value <>", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueGreaterThan(String value) {
            addCriterion("new_value >", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueGreaterThanOrEqualTo(String value) {
            addCriterion("new_value >=", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueLessThan(String value) {
            addCriterion("new_value <", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueLessThanOrEqualTo(String value) {
            addCriterion("new_value <=", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueLike(String value) {
            addCriterion("new_value like", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueNotLike(String value) {
            addCriterion("new_value not like", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueIn(List<String> values) {
            addCriterion("new_value in", values, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueNotIn(List<String> values) {
            addCriterion("new_value not in", values, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueBetween(String value1, String value2) {
            addCriterion("new_value between", value1, value2, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueNotBetween(String value1, String value2) {
            addCriterion("new_value not between", value1, value2, "newValue");
            return (Criteria) this;
        }
    }

    /**
     */
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