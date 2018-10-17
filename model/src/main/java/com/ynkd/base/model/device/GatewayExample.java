package com.ynkd.base.model.device;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GatewayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public GatewayExample() {
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

        public Criteria andGatewayNameIsNull() {
            addCriterion("gateway_name is null");
            return (Criteria) this;
        }

        public Criteria andGatewayNameIsNotNull() {
            addCriterion("gateway_name is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayNameEqualTo(String value) {
            addCriterion("gateway_name =", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotEqualTo(String value) {
            addCriterion("gateway_name <>", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameGreaterThan(String value) {
            addCriterion("gateway_name >", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_name >=", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLessThan(String value) {
            addCriterion("gateway_name <", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLessThanOrEqualTo(String value) {
            addCriterion("gateway_name <=", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameLike(String value) {
            addCriterion("gateway_name like", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotLike(String value) {
            addCriterion("gateway_name not like", value, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameIn(List<String> values) {
            addCriterion("gateway_name in", values, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotIn(List<String> values) {
            addCriterion("gateway_name not in", values, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameBetween(String value1, String value2) {
            addCriterion("gateway_name between", value1, value2, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNameNotBetween(String value1, String value2) {
            addCriterion("gateway_name not between", value1, value2, "gatewayName");
            return (Criteria) this;
        }

        public Criteria andGatewayNoIsNull() {
            addCriterion("gateway_no is null");
            return (Criteria) this;
        }

        public Criteria andGatewayNoIsNotNull() {
            addCriterion("gateway_no is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayNoEqualTo(String value) {
            addCriterion("gateway_no =", value, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoNotEqualTo(String value) {
            addCriterion("gateway_no <>", value, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoGreaterThan(String value) {
            addCriterion("gateway_no >", value, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_no >=", value, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoLessThan(String value) {
            addCriterion("gateway_no <", value, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoLessThanOrEqualTo(String value) {
            addCriterion("gateway_no <=", value, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoLike(String value) {
            addCriterion("gateway_no like", value, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoNotLike(String value) {
            addCriterion("gateway_no not like", value, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoIn(List<String> values) {
            addCriterion("gateway_no in", values, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoNotIn(List<String> values) {
            addCriterion("gateway_no not in", values, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoBetween(String value1, String value2) {
            addCriterion("gateway_no between", value1, value2, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayNoNotBetween(String value1, String value2) {
            addCriterion("gateway_no not between", value1, value2, "gatewayNo");
            return (Criteria) this;
        }

        public Criteria andGatewayModelIsNull() {
            addCriterion("gateway_model is null");
            return (Criteria) this;
        }

        public Criteria andGatewayModelIsNotNull() {
            addCriterion("gateway_model is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayModelEqualTo(String value) {
            addCriterion("gateway_model =", value, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelNotEqualTo(String value) {
            addCriterion("gateway_model <>", value, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelGreaterThan(String value) {
            addCriterion("gateway_model >", value, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_model >=", value, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelLessThan(String value) {
            addCriterion("gateway_model <", value, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelLessThanOrEqualTo(String value) {
            addCriterion("gateway_model <=", value, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelLike(String value) {
            addCriterion("gateway_model like", value, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelNotLike(String value) {
            addCriterion("gateway_model not like", value, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelIn(List<String> values) {
            addCriterion("gateway_model in", values, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelNotIn(List<String> values) {
            addCriterion("gateway_model not in", values, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelBetween(String value1, String value2) {
            addCriterion("gateway_model between", value1, value2, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayModelNotBetween(String value1, String value2) {
            addCriterion("gateway_model not between", value1, value2, "gatewayModel");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationIsNull() {
            addCriterion("gateway_location is null");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationIsNotNull() {
            addCriterion("gateway_location is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationEqualTo(String value) {
            addCriterion("gateway_location =", value, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationNotEqualTo(String value) {
            addCriterion("gateway_location <>", value, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationGreaterThan(String value) {
            addCriterion("gateway_location >", value, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_location >=", value, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationLessThan(String value) {
            addCriterion("gateway_location <", value, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationLessThanOrEqualTo(String value) {
            addCriterion("gateway_location <=", value, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationLike(String value) {
            addCriterion("gateway_location like", value, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationNotLike(String value) {
            addCriterion("gateway_location not like", value, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationIn(List<String> values) {
            addCriterion("gateway_location in", values, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationNotIn(List<String> values) {
            addCriterion("gateway_location not in", values, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationBetween(String value1, String value2) {
            addCriterion("gateway_location between", value1, value2, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLocationNotBetween(String value1, String value2) {
            addCriterion("gateway_location not between", value1, value2, "gatewayLocation");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiIsNull() {
            addCriterion("gateway_lati is null");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiIsNotNull() {
            addCriterion("gateway_lati is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiEqualTo(String value) {
            addCriterion("gateway_lati =", value, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiNotEqualTo(String value) {
            addCriterion("gateway_lati <>", value, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiGreaterThan(String value) {
            addCriterion("gateway_lati >", value, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_lati >=", value, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiLessThan(String value) {
            addCriterion("gateway_lati <", value, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiLessThanOrEqualTo(String value) {
            addCriterion("gateway_lati <=", value, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiLike(String value) {
            addCriterion("gateway_lati like", value, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiNotLike(String value) {
            addCriterion("gateway_lati not like", value, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiIn(List<String> values) {
            addCriterion("gateway_lati in", values, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiNotIn(List<String> values) {
            addCriterion("gateway_lati not in", values, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiBetween(String value1, String value2) {
            addCriterion("gateway_lati between", value1, value2, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLatiNotBetween(String value1, String value2) {
            addCriterion("gateway_lati not between", value1, value2, "gatewayLati");
            return (Criteria) this;
        }

        public Criteria andGatewayLongIsNull() {
            addCriterion("gateway_long is null");
            return (Criteria) this;
        }

        public Criteria andGatewayLongIsNotNull() {
            addCriterion("gateway_long is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayLongEqualTo(String value) {
            addCriterion("gateway_long =", value, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongNotEqualTo(String value) {
            addCriterion("gateway_long <>", value, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongGreaterThan(String value) {
            addCriterion("gateway_long >", value, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_long >=", value, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongLessThan(String value) {
            addCriterion("gateway_long <", value, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongLessThanOrEqualTo(String value) {
            addCriterion("gateway_long <=", value, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongLike(String value) {
            addCriterion("gateway_long like", value, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongNotLike(String value) {
            addCriterion("gateway_long not like", value, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongIn(List<String> values) {
            addCriterion("gateway_long in", values, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongNotIn(List<String> values) {
            addCriterion("gateway_long not in", values, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongBetween(String value1, String value2) {
            addCriterion("gateway_long between", value1, value2, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayLongNotBetween(String value1, String value2) {
            addCriterion("gateway_long not between", value1, value2, "gatewayLong");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayIsNull() {
            addCriterion("gateway_conn_way is null");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayIsNotNull() {
            addCriterion("gateway_conn_way is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayEqualTo(String value) {
            addCriterion("gateway_conn_way =", value, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayNotEqualTo(String value) {
            addCriterion("gateway_conn_way <>", value, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayGreaterThan(String value) {
            addCriterion("gateway_conn_way >", value, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_conn_way >=", value, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayLessThan(String value) {
            addCriterion("gateway_conn_way <", value, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayLessThanOrEqualTo(String value) {
            addCriterion("gateway_conn_way <=", value, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayLike(String value) {
            addCriterion("gateway_conn_way like", value, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayNotLike(String value) {
            addCriterion("gateway_conn_way not like", value, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayIn(List<String> values) {
            addCriterion("gateway_conn_way in", values, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayNotIn(List<String> values) {
            addCriterion("gateway_conn_way not in", values, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayBetween(String value1, String value2) {
            addCriterion("gateway_conn_way between", value1, value2, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnWayNotBetween(String value1, String value2) {
            addCriterion("gateway_conn_way not between", value1, value2, "gatewayConnWay");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlIsNull() {
            addCriterion("gateway_conn_url is null");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlIsNotNull() {
            addCriterion("gateway_conn_url is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlEqualTo(String value) {
            addCriterion("gateway_conn_url =", value, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlNotEqualTo(String value) {
            addCriterion("gateway_conn_url <>", value, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlGreaterThan(String value) {
            addCriterion("gateway_conn_url >", value, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_conn_url >=", value, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlLessThan(String value) {
            addCriterion("gateway_conn_url <", value, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlLessThanOrEqualTo(String value) {
            addCriterion("gateway_conn_url <=", value, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlLike(String value) {
            addCriterion("gateway_conn_url like", value, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlNotLike(String value) {
            addCriterion("gateway_conn_url not like", value, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlIn(List<String> values) {
            addCriterion("gateway_conn_url in", values, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlNotIn(List<String> values) {
            addCriterion("gateway_conn_url not in", values, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlBetween(String value1, String value2) {
            addCriterion("gateway_conn_url between", value1, value2, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnUrlNotBetween(String value1, String value2) {
            addCriterion("gateway_conn_url not between", value1, value2, "gatewayConnUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortIsNull() {
            addCriterion("gateway_conn_port is null");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortIsNotNull() {
            addCriterion("gateway_conn_port is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortEqualTo(String value) {
            addCriterion("gateway_conn_port =", value, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortNotEqualTo(String value) {
            addCriterion("gateway_conn_port <>", value, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortGreaterThan(String value) {
            addCriterion("gateway_conn_port >", value, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_conn_port >=", value, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortLessThan(String value) {
            addCriterion("gateway_conn_port <", value, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortLessThanOrEqualTo(String value) {
            addCriterion("gateway_conn_port <=", value, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortLike(String value) {
            addCriterion("gateway_conn_port like", value, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortNotLike(String value) {
            addCriterion("gateway_conn_port not like", value, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortIn(List<String> values) {
            addCriterion("gateway_conn_port in", values, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortNotIn(List<String> values) {
            addCriterion("gateway_conn_port not in", values, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortBetween(String value1, String value2) {
            addCriterion("gateway_conn_port between", value1, value2, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnPortNotBetween(String value1, String value2) {
            addCriterion("gateway_conn_port not between", value1, value2, "gatewayConnPort");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyIsNull() {
            addCriterion("gateway_conn_company is null");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyIsNotNull() {
            addCriterion("gateway_conn_company is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyEqualTo(String value) {
            addCriterion("gateway_conn_company =", value, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyNotEqualTo(String value) {
            addCriterion("gateway_conn_company <>", value, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyGreaterThan(String value) {
            addCriterion("gateway_conn_company >", value, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_conn_company >=", value, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyLessThan(String value) {
            addCriterion("gateway_conn_company <", value, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyLessThanOrEqualTo(String value) {
            addCriterion("gateway_conn_company <=", value, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyLike(String value) {
            addCriterion("gateway_conn_company like", value, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyNotLike(String value) {
            addCriterion("gateway_conn_company not like", value, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyIn(List<String> values) {
            addCriterion("gateway_conn_company in", values, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyNotIn(List<String> values) {
            addCriterion("gateway_conn_company not in", values, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyBetween(String value1, String value2) {
            addCriterion("gateway_conn_company between", value1, value2, "gatewayConnCompany");
            return (Criteria) this;
        }

        public Criteria andGatewayConnCompanyNotBetween(String value1, String value2) {
            addCriterion("gateway_conn_company not between", value1, value2, "gatewayConnCompany");
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

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
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

        public Criteria andUpdateByEqualTo(Date value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Date value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Date value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Date value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Date value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Date value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Date> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Date> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Date value1, Date value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Date value1, Date value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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