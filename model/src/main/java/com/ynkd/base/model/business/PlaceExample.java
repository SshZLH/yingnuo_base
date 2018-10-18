package com.ynkd.base.model.business;

import java.util.ArrayList;
import java.util.List;

public class PlaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PlaceExample() {
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

        public Criteria andPlaceNameIsNull() {
            addCriterion("place_name is null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNotNull() {
            addCriterion("place_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameEqualTo(String value) {
            addCriterion("place_name =", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotEqualTo(String value) {
            addCriterion("place_name <>", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThan(String value) {
            addCriterion("place_name >", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("place_name >=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThan(String value) {
            addCriterion("place_name <", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThanOrEqualTo(String value) {
            addCriterion("place_name <=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLike(String value) {
            addCriterion("place_name like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotLike(String value) {
            addCriterion("place_name not like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIn(List<String> values) {
            addCriterion("place_name in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotIn(List<String> values) {
            addCriterion("place_name not in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameBetween(String value1, String value2) {
            addCriterion("place_name between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotBetween(String value1, String value2) {
            addCriterion("place_name not between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaIsNull() {
            addCriterion("place_area is null");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaIsNotNull() {
            addCriterion("place_area is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaEqualTo(String value) {
            addCriterion("place_area =", value, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaNotEqualTo(String value) {
            addCriterion("place_area <>", value, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaGreaterThan(String value) {
            addCriterion("place_area >", value, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("place_area >=", value, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaLessThan(String value) {
            addCriterion("place_area <", value, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaLessThanOrEqualTo(String value) {
            addCriterion("place_area <=", value, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaLike(String value) {
            addCriterion("place_area like", value, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaNotLike(String value) {
            addCriterion("place_area not like", value, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaIn(List<String> values) {
            addCriterion("place_area in", values, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaNotIn(List<String> values) {
            addCriterion("place_area not in", values, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaBetween(String value1, String value2) {
            addCriterion("place_area between", value1, value2, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceAreaNotBetween(String value1, String value2) {
            addCriterion("place_area not between", value1, value2, "placeArea");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanIsNull() {
            addCriterion("place_floorPlan is null");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanIsNotNull() {
            addCriterion("place_floorPlan is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanEqualTo(String value) {
            addCriterion("place_floorPlan =", value, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanNotEqualTo(String value) {
            addCriterion("place_floorPlan <>", value, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanGreaterThan(String value) {
            addCriterion("place_floorPlan >", value, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanGreaterThanOrEqualTo(String value) {
            addCriterion("place_floorPlan >=", value, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanLessThan(String value) {
            addCriterion("place_floorPlan <", value, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanLessThanOrEqualTo(String value) {
            addCriterion("place_floorPlan <=", value, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanLike(String value) {
            addCriterion("place_floorPlan like", value, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanNotLike(String value) {
            addCriterion("place_floorPlan not like", value, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanIn(List<String> values) {
            addCriterion("place_floorPlan in", values, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanNotIn(List<String> values) {
            addCriterion("place_floorPlan not in", values, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanBetween(String value1, String value2) {
            addCriterion("place_floorPlan between", value1, value2, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceFloorplanNotBetween(String value1, String value2) {
            addCriterion("place_floorPlan not between", value1, value2, "placeFloorplan");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrIsNull() {
            addCriterion("place_addr is null");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrIsNotNull() {
            addCriterion("place_addr is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrEqualTo(String value) {
            addCriterion("place_addr =", value, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrNotEqualTo(String value) {
            addCriterion("place_addr <>", value, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrGreaterThan(String value) {
            addCriterion("place_addr >", value, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("place_addr >=", value, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrLessThan(String value) {
            addCriterion("place_addr <", value, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrLessThanOrEqualTo(String value) {
            addCriterion("place_addr <=", value, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrLike(String value) {
            addCriterion("place_addr like", value, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrNotLike(String value) {
            addCriterion("place_addr not like", value, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrIn(List<String> values) {
            addCriterion("place_addr in", values, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrNotIn(List<String> values) {
            addCriterion("place_addr not in", values, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrBetween(String value1, String value2) {
            addCriterion("place_addr between", value1, value2, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceAddrNotBetween(String value1, String value2) {
            addCriterion("place_addr not between", value1, value2, "placeAddr");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeIsNull() {
            addCriterion("place_scope is null");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeIsNotNull() {
            addCriterion("place_scope is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeEqualTo(String value) {
            addCriterion("place_scope =", value, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeNotEqualTo(String value) {
            addCriterion("place_scope <>", value, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeGreaterThan(String value) {
            addCriterion("place_scope >", value, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeGreaterThanOrEqualTo(String value) {
            addCriterion("place_scope >=", value, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeLessThan(String value) {
            addCriterion("place_scope <", value, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeLessThanOrEqualTo(String value) {
            addCriterion("place_scope <=", value, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeLike(String value) {
            addCriterion("place_scope like", value, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeNotLike(String value) {
            addCriterion("place_scope not like", value, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeIn(List<String> values) {
            addCriterion("place_scope in", values, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeNotIn(List<String> values) {
            addCriterion("place_scope not in", values, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeBetween(String value1, String value2) {
            addCriterion("place_scope between", value1, value2, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceScopeNotBetween(String value1, String value2) {
            addCriterion("place_scope not between", value1, value2, "placeScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBossIsNull() {
            addCriterion("place_boss is null");
            return (Criteria) this;
        }

        public Criteria andPlaceBossIsNotNull() {
            addCriterion("place_boss is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceBossEqualTo(String value) {
            addCriterion("place_boss =", value, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossNotEqualTo(String value) {
            addCriterion("place_boss <>", value, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossGreaterThan(String value) {
            addCriterion("place_boss >", value, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossGreaterThanOrEqualTo(String value) {
            addCriterion("place_boss >=", value, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossLessThan(String value) {
            addCriterion("place_boss <", value, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossLessThanOrEqualTo(String value) {
            addCriterion("place_boss <=", value, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossLike(String value) {
            addCriterion("place_boss like", value, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossNotLike(String value) {
            addCriterion("place_boss not like", value, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossIn(List<String> values) {
            addCriterion("place_boss in", values, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossNotIn(List<String> values) {
            addCriterion("place_boss not in", values, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossBetween(String value1, String value2) {
            addCriterion("place_boss between", value1, value2, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossNotBetween(String value1, String value2) {
            addCriterion("place_boss not between", value1, value2, "placeBoss");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelIsNull() {
            addCriterion("place_boss_tel is null");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelIsNotNull() {
            addCriterion("place_boss_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelEqualTo(String value) {
            addCriterion("place_boss_tel =", value, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelNotEqualTo(String value) {
            addCriterion("place_boss_tel <>", value, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelGreaterThan(String value) {
            addCriterion("place_boss_tel >", value, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelGreaterThanOrEqualTo(String value) {
            addCriterion("place_boss_tel >=", value, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelLessThan(String value) {
            addCriterion("place_boss_tel <", value, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelLessThanOrEqualTo(String value) {
            addCriterion("place_boss_tel <=", value, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelLike(String value) {
            addCriterion("place_boss_tel like", value, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelNotLike(String value) {
            addCriterion("place_boss_tel not like", value, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelIn(List<String> values) {
            addCriterion("place_boss_tel in", values, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelNotIn(List<String> values) {
            addCriterion("place_boss_tel not in", values, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelBetween(String value1, String value2) {
            addCriterion("place_boss_tel between", value1, value2, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceBossTelNotBetween(String value1, String value2) {
            addCriterion("place_boss_tel not between", value1, value2, "placeBossTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneIsNull() {
            addCriterion("place_telephone is null");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneIsNotNull() {
            addCriterion("place_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneEqualTo(String value) {
            addCriterion("place_telephone =", value, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneNotEqualTo(String value) {
            addCriterion("place_telephone <>", value, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneGreaterThan(String value) {
            addCriterion("place_telephone >", value, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("place_telephone >=", value, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneLessThan(String value) {
            addCriterion("place_telephone <", value, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneLessThanOrEqualTo(String value) {
            addCriterion("place_telephone <=", value, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneLike(String value) {
            addCriterion("place_telephone like", value, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneNotLike(String value) {
            addCriterion("place_telephone not like", value, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneIn(List<String> values) {
            addCriterion("place_telephone in", values, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneNotIn(List<String> values) {
            addCriterion("place_telephone not in", values, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneBetween(String value1, String value2) {
            addCriterion("place_telephone between", value1, value2, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andPlaceTelephoneNotBetween(String value1, String value2) {
            addCriterion("place_telephone not between", value1, value2, "placeTelephone");
            return (Criteria) this;
        }

        public Criteria andInformWayIsNull() {
            addCriterion("inform_way is null");
            return (Criteria) this;
        }

        public Criteria andInformWayIsNotNull() {
            addCriterion("inform_way is not null");
            return (Criteria) this;
        }

        public Criteria andInformWayEqualTo(String value) {
            addCriterion("inform_way =", value, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayNotEqualTo(String value) {
            addCriterion("inform_way <>", value, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayGreaterThan(String value) {
            addCriterion("inform_way >", value, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayGreaterThanOrEqualTo(String value) {
            addCriterion("inform_way >=", value, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayLessThan(String value) {
            addCriterion("inform_way <", value, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayLessThanOrEqualTo(String value) {
            addCriterion("inform_way <=", value, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayLike(String value) {
            addCriterion("inform_way like", value, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayNotLike(String value) {
            addCriterion("inform_way not like", value, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayIn(List<String> values) {
            addCriterion("inform_way in", values, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayNotIn(List<String> values) {
            addCriterion("inform_way not in", values, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayBetween(String value1, String value2) {
            addCriterion("inform_way between", value1, value2, "informWay");
            return (Criteria) this;
        }

        public Criteria andInformWayNotBetween(String value1, String value2) {
            addCriterion("inform_way not between", value1, value2, "informWay");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
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