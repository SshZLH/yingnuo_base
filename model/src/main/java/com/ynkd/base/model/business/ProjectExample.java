package com.ynkd.base.model.business;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ProjectExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectAddrIsNull() {
            addCriterion("project_addr is null");
            return (Criteria) this;
        }

        public Criteria andProjectAddrIsNotNull() {
            addCriterion("project_addr is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAddrEqualTo(String value) {
            addCriterion("project_addr =", value, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrNotEqualTo(String value) {
            addCriterion("project_addr <>", value, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrGreaterThan(String value) {
            addCriterion("project_addr >", value, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrGreaterThanOrEqualTo(String value) {
            addCriterion("project_addr >=", value, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrLessThan(String value) {
            addCriterion("project_addr <", value, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrLessThanOrEqualTo(String value) {
            addCriterion("project_addr <=", value, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrLike(String value) {
            addCriterion("project_addr like", value, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrNotLike(String value) {
            addCriterion("project_addr not like", value, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrIn(List<String> values) {
            addCriterion("project_addr in", values, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrNotIn(List<String> values) {
            addCriterion("project_addr not in", values, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrBetween(String value1, String value2) {
            addCriterion("project_addr between", value1, value2, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectAddrNotBetween(String value1, String value2) {
            addCriterion("project_addr not between", value1, value2, "projectAddr");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlIsNull() {
            addCriterion("project_logo_url is null");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlIsNotNull() {
            addCriterion("project_logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlEqualTo(String value) {
            addCriterion("project_logo_url =", value, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlNotEqualTo(String value) {
            addCriterion("project_logo_url <>", value, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlGreaterThan(String value) {
            addCriterion("project_logo_url >", value, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("project_logo_url >=", value, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlLessThan(String value) {
            addCriterion("project_logo_url <", value, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("project_logo_url <=", value, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlLike(String value) {
            addCriterion("project_logo_url like", value, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlNotLike(String value) {
            addCriterion("project_logo_url not like", value, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlIn(List<String> values) {
            addCriterion("project_logo_url in", values, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlNotIn(List<String> values) {
            addCriterion("project_logo_url not in", values, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlBetween(String value1, String value2) {
            addCriterion("project_logo_url between", value1, value2, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLogoUrlNotBetween(String value1, String value2) {
            addCriterion("project_logo_url not between", value1, value2, "projectLogoUrl");
            return (Criteria) this;
        }

        public Criteria andProjectLocationIsNull() {
            addCriterion("project_location is null");
            return (Criteria) this;
        }

        public Criteria andProjectLocationIsNotNull() {
            addCriterion("project_location is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLocationEqualTo(String value) {
            addCriterion("project_location =", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationNotEqualTo(String value) {
            addCriterion("project_location <>", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationGreaterThan(String value) {
            addCriterion("project_location >", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationGreaterThanOrEqualTo(String value) {
            addCriterion("project_location >=", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationLessThan(String value) {
            addCriterion("project_location <", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationLessThanOrEqualTo(String value) {
            addCriterion("project_location <=", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationLike(String value) {
            addCriterion("project_location like", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationNotLike(String value) {
            addCriterion("project_location not like", value, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationIn(List<String> values) {
            addCriterion("project_location in", values, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationNotIn(List<String> values) {
            addCriterion("project_location not in", values, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationBetween(String value1, String value2) {
            addCriterion("project_location between", value1, value2, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLocationNotBetween(String value1, String value2) {
            addCriterion("project_location not between", value1, value2, "projectLocation");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderIsNull() {
            addCriterion("project_leader is null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderIsNotNull() {
            addCriterion("project_leader is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderEqualTo(String value) {
            addCriterion("project_leader =", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNotEqualTo(String value) {
            addCriterion("project_leader <>", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderGreaterThan(String value) {
            addCriterion("project_leader >", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("project_leader >=", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderLessThan(String value) {
            addCriterion("project_leader <", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderLessThanOrEqualTo(String value) {
            addCriterion("project_leader <=", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderLike(String value) {
            addCriterion("project_leader like", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNotLike(String value) {
            addCriterion("project_leader not like", value, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderIn(List<String> values) {
            addCriterion("project_leader in", values, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNotIn(List<String> values) {
            addCriterion("project_leader not in", values, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderBetween(String value1, String value2) {
            addCriterion("project_leader between", value1, value2, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNotBetween(String value1, String value2) {
            addCriterion("project_leader not between", value1, value2, "projectLeader");
            return (Criteria) this;
        }

        public Criteria andManageNameIsNull() {
            addCriterion("manage_name is null");
            return (Criteria) this;
        }

        public Criteria andManageNameIsNotNull() {
            addCriterion("manage_name is not null");
            return (Criteria) this;
        }

        public Criteria andManageNameEqualTo(String value) {
            addCriterion("manage_name =", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameNotEqualTo(String value) {
            addCriterion("manage_name <>", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameGreaterThan(String value) {
            addCriterion("manage_name >", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameGreaterThanOrEqualTo(String value) {
            addCriterion("manage_name >=", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameLessThan(String value) {
            addCriterion("manage_name <", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameLessThanOrEqualTo(String value) {
            addCriterion("manage_name <=", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameLike(String value) {
            addCriterion("manage_name like", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameNotLike(String value) {
            addCriterion("manage_name not like", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameIn(List<String> values) {
            addCriterion("manage_name in", values, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameNotIn(List<String> values) {
            addCriterion("manage_name not in", values, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameBetween(String value1, String value2) {
            addCriterion("manage_name between", value1, value2, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameNotBetween(String value1, String value2) {
            addCriterion("manage_name not between", value1, value2, "manageName");
            return (Criteria) this;
        }

        public Criteria andPanelNameIsNull() {
            addCriterion("panel_name is null");
            return (Criteria) this;
        }

        public Criteria andPanelNameIsNotNull() {
            addCriterion("panel_name is not null");
            return (Criteria) this;
        }

        public Criteria andPanelNameEqualTo(String value) {
            addCriterion("panel_name =", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameNotEqualTo(String value) {
            addCriterion("panel_name <>", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameGreaterThan(String value) {
            addCriterion("panel_name >", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameGreaterThanOrEqualTo(String value) {
            addCriterion("panel_name >=", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameLessThan(String value) {
            addCriterion("panel_name <", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameLessThanOrEqualTo(String value) {
            addCriterion("panel_name <=", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameLike(String value) {
            addCriterion("panel_name like", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameNotLike(String value) {
            addCriterion("panel_name not like", value, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameIn(List<String> values) {
            addCriterion("panel_name in", values, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameNotIn(List<String> values) {
            addCriterion("panel_name not in", values, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameBetween(String value1, String value2) {
            addCriterion("panel_name between", value1, value2, "panelName");
            return (Criteria) this;
        }

        public Criteria andPanelNameNotBetween(String value1, String value2) {
            addCriterion("panel_name not between", value1, value2, "panelName");
            return (Criteria) this;
        }

        public Criteria andProjectMemoIsNull() {
            addCriterion("project_memo is null");
            return (Criteria) this;
        }

        public Criteria andProjectMemoIsNotNull() {
            addCriterion("project_memo is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMemoEqualTo(String value) {
            addCriterion("project_memo =", value, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoNotEqualTo(String value) {
            addCriterion("project_memo <>", value, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoGreaterThan(String value) {
            addCriterion("project_memo >", value, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoGreaterThanOrEqualTo(String value) {
            addCriterion("project_memo >=", value, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoLessThan(String value) {
            addCriterion("project_memo <", value, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoLessThanOrEqualTo(String value) {
            addCriterion("project_memo <=", value, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoLike(String value) {
            addCriterion("project_memo like", value, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoNotLike(String value) {
            addCriterion("project_memo not like", value, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoIn(List<String> values) {
            addCriterion("project_memo in", values, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoNotIn(List<String> values) {
            addCriterion("project_memo not in", values, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoBetween(String value1, String value2) {
            addCriterion("project_memo between", value1, value2, "projectMemo");
            return (Criteria) this;
        }

        public Criteria andProjectMemoNotBetween(String value1, String value2) {
            addCriterion("project_memo not between", value1, value2, "projectMemo");
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