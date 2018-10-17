package com.ynkd.base.model.device;

import java.util.ArrayList;
import java.util.List;

public class FirmwareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FirmwareExample() {
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

        public Criteria andFirmwareIdIsNull() {
            addCriterion("firmware_id is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdIsNotNull() {
            addCriterion("firmware_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdEqualTo(Integer value) {
            addCriterion("firmware_id =", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdNotEqualTo(Integer value) {
            addCriterion("firmware_id <>", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdGreaterThan(Integer value) {
            addCriterion("firmware_id >", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("firmware_id >=", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdLessThan(Integer value) {
            addCriterion("firmware_id <", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdLessThanOrEqualTo(Integer value) {
            addCriterion("firmware_id <=", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdIn(List<Integer> values) {
            addCriterion("firmware_id in", values, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdNotIn(List<Integer> values) {
            addCriterion("firmware_id not in", values, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdBetween(Integer value1, Integer value2) {
            addCriterion("firmware_id between", value1, value2, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("firmware_id not between", value1, value2, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameIsNull() {
            addCriterion("firmware_name is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameIsNotNull() {
            addCriterion("firmware_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameEqualTo(String value) {
            addCriterion("firmware_name =", value, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameNotEqualTo(String value) {
            addCriterion("firmware_name <>", value, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameGreaterThan(String value) {
            addCriterion("firmware_name >", value, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_name >=", value, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameLessThan(String value) {
            addCriterion("firmware_name <", value, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameLessThanOrEqualTo(String value) {
            addCriterion("firmware_name <=", value, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameLike(String value) {
            addCriterion("firmware_name like", value, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameNotLike(String value) {
            addCriterion("firmware_name not like", value, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameIn(List<String> values) {
            addCriterion("firmware_name in", values, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameNotIn(List<String> values) {
            addCriterion("firmware_name not in", values, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameBetween(String value1, String value2) {
            addCriterion("firmware_name between", value1, value2, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareNameNotBetween(String value1, String value2) {
            addCriterion("firmware_name not between", value1, value2, "firmwareName");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionIsNull() {
            addCriterion("firmware_version is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionIsNotNull() {
            addCriterion("firmware_version is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionEqualTo(String value) {
            addCriterion("firmware_version =", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionNotEqualTo(String value) {
            addCriterion("firmware_version <>", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionGreaterThan(String value) {
            addCriterion("firmware_version >", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_version >=", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionLessThan(String value) {
            addCriterion("firmware_version <", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionLessThanOrEqualTo(String value) {
            addCriterion("firmware_version <=", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionLike(String value) {
            addCriterion("firmware_version like", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionNotLike(String value) {
            addCriterion("firmware_version not like", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionIn(List<String> values) {
            addCriterion("firmware_version in", values, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionNotIn(List<String> values) {
            addCriterion("firmware_version not in", values, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionBetween(String value1, String value2) {
            addCriterion("firmware_version between", value1, value2, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionNotBetween(String value1, String value2) {
            addCriterion("firmware_version not between", value1, value2, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathIsNull() {
            addCriterion("firmware_path is null");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathIsNotNull() {
            addCriterion("firmware_path is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathEqualTo(String value) {
            addCriterion("firmware_path =", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathNotEqualTo(String value) {
            addCriterion("firmware_path <>", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathGreaterThan(String value) {
            addCriterion("firmware_path >", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_path >=", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathLessThan(String value) {
            addCriterion("firmware_path <", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathLessThanOrEqualTo(String value) {
            addCriterion("firmware_path <=", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathLike(String value) {
            addCriterion("firmware_path like", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathNotLike(String value) {
            addCriterion("firmware_path not like", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathIn(List<String> values) {
            addCriterion("firmware_path in", values, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathNotIn(List<String> values) {
            addCriterion("firmware_path not in", values, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathBetween(String value1, String value2) {
            addCriterion("firmware_path between", value1, value2, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathNotBetween(String value1, String value2) {
            addCriterion("firmware_path not between", value1, value2, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusIsNull() {
            addCriterion("firmware_status is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusIsNotNull() {
            addCriterion("firmware_status is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusEqualTo(Integer value) {
            addCriterion("firmware_status =", value, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusNotEqualTo(Integer value) {
            addCriterion("firmware_status <>", value, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusGreaterThan(Integer value) {
            addCriterion("firmware_status >", value, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("firmware_status >=", value, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusLessThan(Integer value) {
            addCriterion("firmware_status <", value, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusLessThanOrEqualTo(Integer value) {
            addCriterion("firmware_status <=", value, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusIn(List<Integer> values) {
            addCriterion("firmware_status in", values, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusNotIn(List<Integer> values) {
            addCriterion("firmware_status not in", values, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusBetween(Integer value1, Integer value2) {
            addCriterion("firmware_status between", value1, value2, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("firmware_status not between", value1, value2, "firmwareStatus");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeIsNull() {
            addCriterion("firmware_type is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeIsNotNull() {
            addCriterion("firmware_type is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeEqualTo(String value) {
            addCriterion("firmware_type =", value, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeNotEqualTo(String value) {
            addCriterion("firmware_type <>", value, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeGreaterThan(String value) {
            addCriterion("firmware_type >", value, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_type >=", value, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeLessThan(String value) {
            addCriterion("firmware_type <", value, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeLessThanOrEqualTo(String value) {
            addCriterion("firmware_type <=", value, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeLike(String value) {
            addCriterion("firmware_type like", value, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeNotLike(String value) {
            addCriterion("firmware_type not like", value, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeIn(List<String> values) {
            addCriterion("firmware_type in", values, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeNotIn(List<String> values) {
            addCriterion("firmware_type not in", values, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeBetween(String value1, String value2) {
            addCriterion("firmware_type between", value1, value2, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareTypeNotBetween(String value1, String value2) {
            addCriterion("firmware_type not between", value1, value2, "firmwareType");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoIsNull() {
            addCriterion("firmware_memo is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoIsNotNull() {
            addCriterion("firmware_memo is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoEqualTo(String value) {
            addCriterion("firmware_memo =", value, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoNotEqualTo(String value) {
            addCriterion("firmware_memo <>", value, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoGreaterThan(String value) {
            addCriterion("firmware_memo >", value, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_memo >=", value, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoLessThan(String value) {
            addCriterion("firmware_memo <", value, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoLessThanOrEqualTo(String value) {
            addCriterion("firmware_memo <=", value, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoLike(String value) {
            addCriterion("firmware_memo like", value, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoNotLike(String value) {
            addCriterion("firmware_memo not like", value, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoIn(List<String> values) {
            addCriterion("firmware_memo in", values, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoNotIn(List<String> values) {
            addCriterion("firmware_memo not in", values, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoBetween(String value1, String value2) {
            addCriterion("firmware_memo between", value1, value2, "firmwareMemo");
            return (Criteria) this;
        }

        public Criteria andFirmwareMemoNotBetween(String value1, String value2) {
            addCriterion("firmware_memo not between", value1, value2, "firmwareMemo");
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

        public Criteria andIdDeleteEqualTo(String value) {
            addCriterion("id_delete =", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteNotEqualTo(String value) {
            addCriterion("id_delete <>", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteGreaterThan(String value) {
            addCriterion("id_delete >", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("id_delete >=", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteLessThan(String value) {
            addCriterion("id_delete <", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteLessThanOrEqualTo(String value) {
            addCriterion("id_delete <=", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteLike(String value) {
            addCriterion("id_delete like", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteNotLike(String value) {
            addCriterion("id_delete not like", value, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteIn(List<String> values) {
            addCriterion("id_delete in", values, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteNotIn(List<String> values) {
            addCriterion("id_delete not in", values, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteBetween(String value1, String value2) {
            addCriterion("id_delete between", value1, value2, "idDelete");
            return (Criteria) this;
        }

        public Criteria andIdDeleteNotBetween(String value1, String value2) {
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