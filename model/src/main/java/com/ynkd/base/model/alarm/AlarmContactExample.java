package com.ynkd.base.model.alarm;

import java.util.ArrayList;
import java.util.List;

public class AlarmContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AlarmContactExample() {
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

        public Criteria andContIdIsNull() {
            addCriterion("cont_id is null");
            return (Criteria) this;
        }

        public Criteria andContIdIsNotNull() {
            addCriterion("cont_id is not null");
            return (Criteria) this;
        }

        public Criteria andContIdEqualTo(String value) {
            addCriterion("cont_id =", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotEqualTo(String value) {
            addCriterion("cont_id <>", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdGreaterThan(String value) {
            addCriterion("cont_id >", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdGreaterThanOrEqualTo(String value) {
            addCriterion("cont_id >=", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLessThan(String value) {
            addCriterion("cont_id <", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLessThanOrEqualTo(String value) {
            addCriterion("cont_id <=", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLike(String value) {
            addCriterion("cont_id like", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotLike(String value) {
            addCriterion("cont_id not like", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdIn(List<String> values) {
            addCriterion("cont_id in", values, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotIn(List<String> values) {
            addCriterion("cont_id not in", values, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdBetween(String value1, String value2) {
            addCriterion("cont_id between", value1, value2, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotBetween(String value1, String value2) {
            addCriterion("cont_id not between", value1, value2, "contId");
            return (Criteria) this;
        }

        public Criteria andContNameIsNull() {
            addCriterion("cont_name is null");
            return (Criteria) this;
        }

        public Criteria andContNameIsNotNull() {
            addCriterion("cont_name is not null");
            return (Criteria) this;
        }

        public Criteria andContNameEqualTo(String value) {
            addCriterion("cont_name =", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotEqualTo(String value) {
            addCriterion("cont_name <>", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThan(String value) {
            addCriterion("cont_name >", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThanOrEqualTo(String value) {
            addCriterion("cont_name >=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThan(String value) {
            addCriterion("cont_name <", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThanOrEqualTo(String value) {
            addCriterion("cont_name <=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLike(String value) {
            addCriterion("cont_name like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotLike(String value) {
            addCriterion("cont_name not like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameIn(List<String> values) {
            addCriterion("cont_name in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotIn(List<String> values) {
            addCriterion("cont_name not in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameBetween(String value1, String value2) {
            addCriterion("cont_name between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotBetween(String value1, String value2) {
            addCriterion("cont_name not between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContTelIsNull() {
            addCriterion("cont_tel is null");
            return (Criteria) this;
        }

        public Criteria andContTelIsNotNull() {
            addCriterion("cont_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContTelEqualTo(String value) {
            addCriterion("cont_tel =", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotEqualTo(String value) {
            addCriterion("cont_tel <>", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelGreaterThan(String value) {
            addCriterion("cont_tel >", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelGreaterThanOrEqualTo(String value) {
            addCriterion("cont_tel >=", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLessThan(String value) {
            addCriterion("cont_tel <", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLessThanOrEqualTo(String value) {
            addCriterion("cont_tel <=", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLike(String value) {
            addCriterion("cont_tel like", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotLike(String value) {
            addCriterion("cont_tel not like", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelIn(List<String> values) {
            addCriterion("cont_tel in", values, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotIn(List<String> values) {
            addCriterion("cont_tel not in", values, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelBetween(String value1, String value2) {
            addCriterion("cont_tel between", value1, value2, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotBetween(String value1, String value2) {
            addCriterion("cont_tel not between", value1, value2, "contTel");
            return (Criteria) this;
        }

        public Criteria andContEmailIsNull() {
            addCriterion("cont_email is null");
            return (Criteria) this;
        }

        public Criteria andContEmailIsNotNull() {
            addCriterion("cont_email is not null");
            return (Criteria) this;
        }

        public Criteria andContEmailEqualTo(String value) {
            addCriterion("cont_email =", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotEqualTo(String value) {
            addCriterion("cont_email <>", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailGreaterThan(String value) {
            addCriterion("cont_email >", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cont_email >=", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLessThan(String value) {
            addCriterion("cont_email <", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLessThanOrEqualTo(String value) {
            addCriterion("cont_email <=", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLike(String value) {
            addCriterion("cont_email like", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotLike(String value) {
            addCriterion("cont_email not like", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailIn(List<String> values) {
            addCriterion("cont_email in", values, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotIn(List<String> values) {
            addCriterion("cont_email not in", values, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailBetween(String value1, String value2) {
            addCriterion("cont_email between", value1, value2, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotBetween(String value1, String value2) {
            addCriterion("cont_email not between", value1, value2, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContLevelIsNull() {
            addCriterion("cont_level is null");
            return (Criteria) this;
        }

        public Criteria andContLevelIsNotNull() {
            addCriterion("cont_level is not null");
            return (Criteria) this;
        }

        public Criteria andContLevelEqualTo(String value) {
            addCriterion("cont_level =", value, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelNotEqualTo(String value) {
            addCriterion("cont_level <>", value, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelGreaterThan(String value) {
            addCriterion("cont_level >", value, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cont_level >=", value, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelLessThan(String value) {
            addCriterion("cont_level <", value, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelLessThanOrEqualTo(String value) {
            addCriterion("cont_level <=", value, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelLike(String value) {
            addCriterion("cont_level like", value, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelNotLike(String value) {
            addCriterion("cont_level not like", value, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelIn(List<String> values) {
            addCriterion("cont_level in", values, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelNotIn(List<String> values) {
            addCriterion("cont_level not in", values, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelBetween(String value1, String value2) {
            addCriterion("cont_level between", value1, value2, "contLevel");
            return (Criteria) this;
        }

        public Criteria andContLevelNotBetween(String value1, String value2) {
            addCriterion("cont_level not between", value1, value2, "contLevel");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andIdDeleteIsNull() {
            addCriterion("id_delete is null");
            return (Criteria) this;
        }

        public Criteria andIdDeleteIsNotNull() {
            addCriterion("id_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIdDeleteEqualTo(Integer value) {
            addCriterion("id_delete =", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteNotEqualTo(Integer value) {
            addCriterion("id_delete <>", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteGreaterThan(Integer value) {
            addCriterion("id_delete >", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_delete >=", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteLessThan(Integer value) {
            addCriterion("id_delete <", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("id_delete <=", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteIn(List<Integer> values) {
            addCriterion("id_delete in", values, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteNotIn(List<Integer> values) {
            addCriterion("id_delete not in", values, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteBetween(Integer value1, Integer value2) {
            addCriterion("id_delete between", value1, value2, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_delete not between", value1, value2, "idDelete");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(String value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(String value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(String value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(String value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(String value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(String value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLike(String value) {
            addCriterion("create_at like", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotLike(String value) {
            addCriterion("create_at not like", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<String> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<String> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(String value1, String value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(String value1, String value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(String value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(String value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(String value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(String value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(String value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(String value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLike(String value) {
            addCriterion("update_at like", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotLike(String value) {
            addCriterion("update_at not like", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<String> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<String> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(String value1, String value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(String value1, String value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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