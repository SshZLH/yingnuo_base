package com.ynkd.base.model.alarm;

import java.util.ArrayList;
import java.util.List;

public class ContactGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ContactGroupExample() {
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

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupMemoIsNull() {
            addCriterion("group_memo is null");
            return (Criteria) this;
        }

        public Criteria andGroupMemoIsNotNull() {
            addCriterion("group_memo is not null");
            return (Criteria) this;
        }

        public Criteria andGroupMemoEqualTo(String value) {
            addCriterion("group_memo =", value, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoNotEqualTo(String value) {
            addCriterion("group_memo <>", value, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoGreaterThan(String value) {
            addCriterion("group_memo >", value, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoGreaterThanOrEqualTo(String value) {
            addCriterion("group_memo >=", value, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoLessThan(String value) {
            addCriterion("group_memo <", value, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoLessThanOrEqualTo(String value) {
            addCriterion("group_memo <=", value, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoLike(String value) {
            addCriterion("group_memo like", value, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoNotLike(String value) {
            addCriterion("group_memo not like", value, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoIn(List<String> values) {
            addCriterion("group_memo in", values, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoNotIn(List<String> values) {
            addCriterion("group_memo not in", values, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoBetween(String value1, String value2) {
            addCriterion("group_memo between", value1, value2, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andGroupMemoNotBetween(String value1, String value2) {
            addCriterion("group_memo not between", value1, value2, "groupMemo");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateIsNull() {
            addCriterion("notice_start_date is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateIsNotNull() {
            addCriterion("notice_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateEqualTo(String value) {
            addCriterion("notice_start_date =", value, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateNotEqualTo(String value) {
            addCriterion("notice_start_date <>", value, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateGreaterThan(String value) {
            addCriterion("notice_start_date >", value, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("notice_start_date >=", value, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateLessThan(String value) {
            addCriterion("notice_start_date <", value, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateLessThanOrEqualTo(String value) {
            addCriterion("notice_start_date <=", value, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateLike(String value) {
            addCriterion("notice_start_date like", value, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateNotLike(String value) {
            addCriterion("notice_start_date not like", value, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateIn(List<String> values) {
            addCriterion("notice_start_date in", values, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateNotIn(List<String> values) {
            addCriterion("notice_start_date not in", values, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateBetween(String value1, String value2) {
            addCriterion("notice_start_date between", value1, value2, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartDateNotBetween(String value1, String value2) {
            addCriterion("notice_start_date not between", value1, value2, "noticeStartDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateIsNull() {
            addCriterion("notice_end_date is null");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateIsNotNull() {
            addCriterion("notice_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateEqualTo(String value) {
            addCriterion("notice_end_date =", value, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateNotEqualTo(String value) {
            addCriterion("notice_end_date <>", value, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateGreaterThan(String value) {
            addCriterion("notice_end_date >", value, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("notice_end_date >=", value, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateLessThan(String value) {
            addCriterion("notice_end_date <", value, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateLessThanOrEqualTo(String value) {
            addCriterion("notice_end_date <=", value, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateLike(String value) {
            addCriterion("notice_end_date like", value, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateNotLike(String value) {
            addCriterion("notice_end_date not like", value, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateIn(List<String> values) {
            addCriterion("notice_end_date in", values, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateNotIn(List<String> values) {
            addCriterion("notice_end_date not in", values, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateBetween(String value1, String value2) {
            addCriterion("notice_end_date between", value1, value2, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeEndDateNotBetween(String value1, String value2) {
            addCriterion("notice_end_date not between", value1, value2, "noticeEndDate");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeIsNull() {
            addCriterion("notice_start_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeIsNotNull() {
            addCriterion("notice_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeEqualTo(String value) {
            addCriterion("notice_start_time =", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeNotEqualTo(String value) {
            addCriterion("notice_start_time <>", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeGreaterThan(String value) {
            addCriterion("notice_start_time >", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("notice_start_time >=", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeLessThan(String value) {
            addCriterion("notice_start_time <", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeLessThanOrEqualTo(String value) {
            addCriterion("notice_start_time <=", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeLike(String value) {
            addCriterion("notice_start_time like", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeNotLike(String value) {
            addCriterion("notice_start_time not like", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeIn(List<String> values) {
            addCriterion("notice_start_time in", values, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeNotIn(List<String> values) {
            addCriterion("notice_start_time not in", values, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeBetween(String value1, String value2) {
            addCriterion("notice_start_time between", value1, value2, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeNotBetween(String value1, String value2) {
            addCriterion("notice_start_time not between", value1, value2, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeIsNull() {
            addCriterion("notice_end_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeIsNotNull() {
            addCriterion("notice_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeEqualTo(String value) {
            addCriterion("notice_end_time =", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeNotEqualTo(String value) {
            addCriterion("notice_end_time <>", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeGreaterThan(String value) {
            addCriterion("notice_end_time >", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("notice_end_time >=", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeLessThan(String value) {
            addCriterion("notice_end_time <", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeLessThanOrEqualTo(String value) {
            addCriterion("notice_end_time <=", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeLike(String value) {
            addCriterion("notice_end_time like", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeNotLike(String value) {
            addCriterion("notice_end_time not like", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeIn(List<String> values) {
            addCriterion("notice_end_time in", values, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeNotIn(List<String> values) {
            addCriterion("notice_end_time not in", values, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeBetween(String value1, String value2) {
            addCriterion("notice_end_time between", value1, value2, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeNotBetween(String value1, String value2) {
            addCriterion("notice_end_time not between", value1, value2, "noticeEndTime");
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