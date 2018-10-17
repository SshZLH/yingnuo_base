package com.ynkd.base.model.device;

import java.util.ArrayList;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DeviceExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(Integer value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(Integer value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(Integer value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(Integer value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<Integer> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<Integer> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(Integer value1, Integer value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNull() {
            addCriterion("device_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNotNull() {
            addCriterion("device_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoEqualTo(String value) {
            addCriterion("device_no =", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotEqualTo(String value) {
            addCriterion("device_no <>", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThan(String value) {
            addCriterion("device_no >", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThanOrEqualTo(String value) {
            addCriterion("device_no >=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThan(String value) {
            addCriterion("device_no <", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThanOrEqualTo(String value) {
            addCriterion("device_no <=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLike(String value) {
            addCriterion("device_no like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotLike(String value) {
            addCriterion("device_no not like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIn(List<String> values) {
            addCriterion("device_no in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotIn(List<String> values) {
            addCriterion("device_no not in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoBetween(String value1, String value2) {
            addCriterion("device_no between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotBetween(String value1, String value2) {
            addCriterion("device_no not between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNull() {
            addCriterion("device_status is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNotNull() {
            addCriterion("device_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusEqualTo(Integer value) {
            addCriterion("device_status =", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotEqualTo(Integer value) {
            addCriterion("device_status <>", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThan(Integer value) {
            addCriterion("device_status >", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_status >=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThan(Integer value) {
            addCriterion("device_status <", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("device_status <=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIn(List<Integer> values) {
            addCriterion("device_status in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotIn(List<Integer> values) {
            addCriterion("device_status not in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusBetween(Integer value1, Integer value2) {
            addCriterion("device_status between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("device_status not between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionIsNull() {
            addCriterion("device_version is null");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionIsNotNull() {
            addCriterion("device_version is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionEqualTo(String value) {
            addCriterion("device_version =", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionNotEqualTo(String value) {
            addCriterion("device_version <>", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionGreaterThan(String value) {
            addCriterion("device_version >", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionGreaterThanOrEqualTo(String value) {
            addCriterion("device_version >=", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionLessThan(String value) {
            addCriterion("device_version <", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionLessThanOrEqualTo(String value) {
            addCriterion("device_version <=", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionLike(String value) {
            addCriterion("device_version like", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionNotLike(String value) {
            addCriterion("device_version not like", value, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionIn(List<String> values) {
            addCriterion("device_version in", values, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionNotIn(List<String> values) {
            addCriterion("device_version not in", values, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionBetween(String value1, String value2) {
            addCriterion("device_version between", value1, value2, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceVersionNotBetween(String value1, String value2) {
            addCriterion("device_version not between", value1, value2, "deviceVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIsNull() {
            addCriterion("device_addr is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIsNotNull() {
            addCriterion("device_addr is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrEqualTo(String value) {
            addCriterion("device_addr =", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotEqualTo(String value) {
            addCriterion("device_addr <>", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrGreaterThan(String value) {
            addCriterion("device_addr >", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("device_addr >=", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLessThan(String value) {
            addCriterion("device_addr <", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLessThanOrEqualTo(String value) {
            addCriterion("device_addr <=", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLike(String value) {
            addCriterion("device_addr like", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotLike(String value) {
            addCriterion("device_addr not like", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIn(List<String> values) {
            addCriterion("device_addr in", values, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotIn(List<String> values) {
            addCriterion("device_addr not in", values, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrBetween(String value1, String value2) {
            addCriterion("device_addr between", value1, value2, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotBetween(String value1, String value2) {
            addCriterion("device_addr not between", value1, value2, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationIsNull() {
            addCriterion("device_location is null");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationIsNotNull() {
            addCriterion("device_location is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationEqualTo(String value) {
            addCriterion("device_location =", value, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationNotEqualTo(String value) {
            addCriterion("device_location <>", value, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationGreaterThan(String value) {
            addCriterion("device_location >", value, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationGreaterThanOrEqualTo(String value) {
            addCriterion("device_location >=", value, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationLessThan(String value) {
            addCriterion("device_location <", value, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationLessThanOrEqualTo(String value) {
            addCriterion("device_location <=", value, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationLike(String value) {
            addCriterion("device_location like", value, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationNotLike(String value) {
            addCriterion("device_location not like", value, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationIn(List<String> values) {
            addCriterion("device_location in", values, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationNotIn(List<String> values) {
            addCriterion("device_location not in", values, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationBetween(String value1, String value2) {
            addCriterion("device_location between", value1, value2, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationNotBetween(String value1, String value2) {
            addCriterion("device_location not between", value1, value2, "deviceLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoIsNull() {
            addCriterion("device_memo is null");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoIsNotNull() {
            addCriterion("device_memo is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoEqualTo(String value) {
            addCriterion("device_memo =", value, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoNotEqualTo(String value) {
            addCriterion("device_memo <>", value, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoGreaterThan(String value) {
            addCriterion("device_memo >", value, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoGreaterThanOrEqualTo(String value) {
            addCriterion("device_memo >=", value, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoLessThan(String value) {
            addCriterion("device_memo <", value, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoLessThanOrEqualTo(String value) {
            addCriterion("device_memo <=", value, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoLike(String value) {
            addCriterion("device_memo like", value, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoNotLike(String value) {
            addCriterion("device_memo not like", value, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoIn(List<String> values) {
            addCriterion("device_memo in", values, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoNotIn(List<String> values) {
            addCriterion("device_memo not in", values, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoBetween(String value1, String value2) {
            addCriterion("device_memo between", value1, value2, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceMemoNotBetween(String value1, String value2) {
            addCriterion("device_memo not between", value1, value2, "deviceMemo");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierIsNull() {
            addCriterion("device_supplier is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierIsNotNull() {
            addCriterion("device_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierEqualTo(String value) {
            addCriterion("device_supplier =", value, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierNotEqualTo(String value) {
            addCriterion("device_supplier <>", value, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierGreaterThan(String value) {
            addCriterion("device_supplier >", value, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("device_supplier >=", value, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierLessThan(String value) {
            addCriterion("device_supplier <", value, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierLessThanOrEqualTo(String value) {
            addCriterion("device_supplier <=", value, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierLike(String value) {
            addCriterion("device_supplier like", value, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierNotLike(String value) {
            addCriterion("device_supplier not like", value, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierIn(List<String> values) {
            addCriterion("device_supplier in", values, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierNotIn(List<String> values) {
            addCriterion("device_supplier not in", values, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierBetween(String value1, String value2) {
            addCriterion("device_supplier between", value1, value2, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceSupplierNotBetween(String value1, String value2) {
            addCriterion("device_supplier not between", value1, value2, "deviceSupplier");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIsNull() {
            addCriterion("device_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIsNotNull() {
            addCriterion("device_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeEqualTo(String value) {
            addCriterion("device_start_time =", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotEqualTo(String value) {
            addCriterion("device_start_time <>", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeGreaterThan(String value) {
            addCriterion("device_start_time >", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("device_start_time >=", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeLessThan(String value) {
            addCriterion("device_start_time <", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeLessThanOrEqualTo(String value) {
            addCriterion("device_start_time <=", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeLike(String value) {
            addCriterion("device_start_time like", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotLike(String value) {
            addCriterion("device_start_time not like", value, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeIn(List<String> values) {
            addCriterion("device_start_time in", values, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotIn(List<String> values) {
            addCriterion("device_start_time not in", values, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeBetween(String value1, String value2) {
            addCriterion("device_start_time between", value1, value2, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceStartTimeNotBetween(String value1, String value2) {
            addCriterion("device_start_time not between", value1, value2, "deviceStartTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeIsNull() {
            addCriterion("device_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeIsNotNull() {
            addCriterion("device_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeEqualTo(String value) {
            addCriterion("device_end_time =", value, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeNotEqualTo(String value) {
            addCriterion("device_end_time <>", value, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeGreaterThan(String value) {
            addCriterion("device_end_time >", value, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("device_end_time >=", value, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeLessThan(String value) {
            addCriterion("device_end_time <", value, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeLessThanOrEqualTo(String value) {
            addCriterion("device_end_time <=", value, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeLike(String value) {
            addCriterion("device_end_time like", value, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeNotLike(String value) {
            addCriterion("device_end_time not like", value, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeIn(List<String> values) {
            addCriterion("device_end_time in", values, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeNotIn(List<String> values) {
            addCriterion("device_end_time not in", values, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeBetween(String value1, String value2) {
            addCriterion("device_end_time between", value1, value2, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceEndTimeNotBetween(String value1, String value2) {
            addCriterion("device_end_time not between", value1, value2, "deviceEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalIsNull() {
            addCriterion("device_numerical is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalIsNotNull() {
            addCriterion("device_numerical is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalEqualTo(String value) {
            addCriterion("device_numerical =", value, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalNotEqualTo(String value) {
            addCriterion("device_numerical <>", value, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalGreaterThan(String value) {
            addCriterion("device_numerical >", value, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalGreaterThanOrEqualTo(String value) {
            addCriterion("device_numerical >=", value, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalLessThan(String value) {
            addCriterion("device_numerical <", value, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalLessThanOrEqualTo(String value) {
            addCriterion("device_numerical <=", value, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalLike(String value) {
            addCriterion("device_numerical like", value, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalNotLike(String value) {
            addCriterion("device_numerical not like", value, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalIn(List<String> values) {
            addCriterion("device_numerical in", values, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalNotIn(List<String> values) {
            addCriterion("device_numerical not in", values, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalBetween(String value1, String value2) {
            addCriterion("device_numerical between", value1, value2, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceNumericalNotBetween(String value1, String value2) {
            addCriterion("device_numerical not between", value1, value2, "deviceNumerical");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIsNull() {
            addCriterion("device_unit is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIsNotNull() {
            addCriterion("device_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitEqualTo(String value) {
            addCriterion("device_unit =", value, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitNotEqualTo(String value) {
            addCriterion("device_unit <>", value, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitGreaterThan(String value) {
            addCriterion("device_unit >", value, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("device_unit >=", value, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitLessThan(String value) {
            addCriterion("device_unit <", value, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitLessThanOrEqualTo(String value) {
            addCriterion("device_unit <=", value, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitLike(String value) {
            addCriterion("device_unit like", value, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitNotLike(String value) {
            addCriterion("device_unit not like", value, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitIn(List<String> values) {
            addCriterion("device_unit in", values, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitNotIn(List<String> values) {
            addCriterion("device_unit not in", values, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitBetween(String value1, String value2) {
            addCriterion("device_unit between", value1, value2, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitNotBetween(String value1, String value2) {
            addCriterion("device_unit not between", value1, value2, "deviceUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdIsNull() {
            addCriterion("device_threshold is null");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdIsNotNull() {
            addCriterion("device_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdEqualTo(String value) {
            addCriterion("device_threshold =", value, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdNotEqualTo(String value) {
            addCriterion("device_threshold <>", value, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdGreaterThan(String value) {
            addCriterion("device_threshold >", value, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdGreaterThanOrEqualTo(String value) {
            addCriterion("device_threshold >=", value, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdLessThan(String value) {
            addCriterion("device_threshold <", value, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdLessThanOrEqualTo(String value) {
            addCriterion("device_threshold <=", value, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdLike(String value) {
            addCriterion("device_threshold like", value, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdNotLike(String value) {
            addCriterion("device_threshold not like", value, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdIn(List<String> values) {
            addCriterion("device_threshold in", values, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdNotIn(List<String> values) {
            addCriterion("device_threshold not in", values, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdBetween(String value1, String value2) {
            addCriterion("device_threshold between", value1, value2, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceThresholdNotBetween(String value1, String value2) {
            addCriterion("device_threshold not between", value1, value2, "deviceThreshold");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelIsNull() {
            addCriterion("device_level is null");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelIsNotNull() {
            addCriterion("device_level is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelEqualTo(Integer value) {
            addCriterion("device_level =", value, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelNotEqualTo(Integer value) {
            addCriterion("device_level <>", value, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelGreaterThan(Integer value) {
            addCriterion("device_level >", value, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_level >=", value, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelLessThan(Integer value) {
            addCriterion("device_level <", value, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelLessThanOrEqualTo(Integer value) {
            addCriterion("device_level <=", value, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelIn(List<Integer> values) {
            addCriterion("device_level in", values, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelNotIn(List<Integer> values) {
            addCriterion("device_level not in", values, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelBetween(Integer value1, Integer value2) {
            addCriterion("device_level between", value1, value2, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andDeviceLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("device_level not between", value1, value2, "deviceLevel");
            return (Criteria) this;
        }

        public Criteria andNetworkNowIsNull() {
            addCriterion("network_now is null");
            return (Criteria) this;
        }

        public Criteria andNetworkNowIsNotNull() {
            addCriterion("network_now is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkNowEqualTo(Integer value) {
            addCriterion("network_now =", value, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowNotEqualTo(Integer value) {
            addCriterion("network_now <>", value, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowGreaterThan(Integer value) {
            addCriterion("network_now >", value, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowGreaterThanOrEqualTo(Integer value) {
            addCriterion("network_now >=", value, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowLessThan(Integer value) {
            addCriterion("network_now <", value, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowLessThanOrEqualTo(Integer value) {
            addCriterion("network_now <=", value, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowIn(List<Integer> values) {
            addCriterion("network_now in", values, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowNotIn(List<Integer> values) {
            addCriterion("network_now not in", values, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowBetween(Integer value1, Integer value2) {
            addCriterion("network_now between", value1, value2, "networkNow");
            return (Criteria) this;
        }

        public Criteria andNetworkNowNotBetween(Integer value1, Integer value2) {
            addCriterion("network_now not between", value1, value2, "networkNow");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNull() {
            addCriterion("father_id is null");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNotNull() {
            addCriterion("father_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatherIdEqualTo(String value) {
            addCriterion("father_id =", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotEqualTo(String value) {
            addCriterion("father_id <>", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThan(String value) {
            addCriterion("father_id >", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThanOrEqualTo(String value) {
            addCriterion("father_id >=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThan(String value) {
            addCriterion("father_id <", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThanOrEqualTo(String value) {
            addCriterion("father_id <=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLike(String value) {
            addCriterion("father_id like", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotLike(String value) {
            addCriterion("father_id not like", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdIn(List<String> values) {
            addCriterion("father_id in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotIn(List<String> values) {
            addCriterion("father_id not in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdBetween(String value1, String value2) {
            addCriterion("father_id between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotBetween(String value1, String value2) {
            addCriterion("father_id not between", value1, value2, "fatherId");
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

        public Criteria andGatewayIdIsNull() {
            addCriterion("gateway_id is null");
            return (Criteria) this;
        }

        public Criteria andGatewayIdIsNotNull() {
            addCriterion("gateway_id is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayIdEqualTo(String value) {
            addCriterion("gateway_id =", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdNotEqualTo(String value) {
            addCriterion("gateway_id <>", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdGreaterThan(String value) {
            addCriterion("gateway_id >", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_id >=", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdLessThan(String value) {
            addCriterion("gateway_id <", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdLessThanOrEqualTo(String value) {
            addCriterion("gateway_id <=", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdLike(String value) {
            addCriterion("gateway_id like", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdNotLike(String value) {
            addCriterion("gateway_id not like", value, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdIn(List<String> values) {
            addCriterion("gateway_id in", values, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdNotIn(List<String> values) {
            addCriterion("gateway_id not in", values, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdBetween(String value1, String value2) {
            addCriterion("gateway_id between", value1, value2, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andGatewayIdNotBetween(String value1, String value2) {
            addCriterion("gateway_id not between", value1, value2, "gatewayId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdIsNull() {
            addCriterion("firmware_id is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdIsNotNull() {
            addCriterion("firmware_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdEqualTo(String value) {
            addCriterion("firmware_id =", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdNotEqualTo(String value) {
            addCriterion("firmware_id <>", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdGreaterThan(String value) {
            addCriterion("firmware_id >", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_id >=", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdLessThan(String value) {
            addCriterion("firmware_id <", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdLessThanOrEqualTo(String value) {
            addCriterion("firmware_id <=", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdLike(String value) {
            addCriterion("firmware_id like", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdNotLike(String value) {
            addCriterion("firmware_id not like", value, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdIn(List<String> values) {
            addCriterion("firmware_id in", values, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdNotIn(List<String> values) {
            addCriterion("firmware_id not in", values, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdBetween(String value1, String value2) {
            addCriterion("firmware_id between", value1, value2, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andFirmwareIdNotBetween(String value1, String value2) {
            addCriterion("firmware_id not between", value1, value2, "firmwareId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(String value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(String value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(String value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(String value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLike(String value) {
            addCriterion("place_id like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotLike(String value) {
            addCriterion("place_id not like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<String> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<String> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(String value1, String value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(String value1, String value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
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