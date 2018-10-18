package com.ynkd.base.model.business;

import java.io.Serializable;

/**
 * area
 * @author 
 */
public class Area implements Serializable {
    /**
     * 区域ID
     */
    private String areaId;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 区域父级ID
     */
    private String areaFatherId;

    /**
     * 区域范围
     */
    private String areaScope;

    /**
     * 区域负责人
     */
    private String areaLeader;

    /**
     * 区域负责人电话
     */
    private String areaLeaderTel;

    /**
     * 项目id
     */
    private String projectId;

    /**
     * 紧急联系人组
     */
    private String groupId;

    /**
     * 逻辑删除 常规 0 删除1
     */
    private Integer idDelete;

    /**
     * 创建时间
     */
    private String createAt;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private String updateAt;

    /**
     * 修改人
     */
    private String updateBy;

    private static final long serialVersionUID = 1L;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaFatherId() {
        return areaFatherId;
    }

    public void setAreaFatherId(String areaFatherId) {
        this.areaFatherId = areaFatherId;
    }

    public String getAreaScope() {
        return areaScope;
    }

    public void setAreaScope(String areaScope) {
        this.areaScope = areaScope;
    }

    public String getAreaLeader() {
        return areaLeader;
    }

    public void setAreaLeader(String areaLeader) {
        this.areaLeader = areaLeader;
    }

    public String getAreaLeaderTel() {
        return areaLeaderTel;
    }

    public void setAreaLeaderTel(String areaLeaderTel) {
        this.areaLeaderTel = areaLeaderTel;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(Integer idDelete) {
        this.idDelete = idDelete;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Area other = (Area) that;
        return (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getAreaName() == null ? other.getAreaName() == null : this.getAreaName().equals(other.getAreaName()))
            && (this.getAreaFatherId() == null ? other.getAreaFatherId() == null : this.getAreaFatherId().equals(other.getAreaFatherId()))
            && (this.getAreaScope() == null ? other.getAreaScope() == null : this.getAreaScope().equals(other.getAreaScope()))
            && (this.getAreaLeader() == null ? other.getAreaLeader() == null : this.getAreaLeader().equals(other.getAreaLeader()))
            && (this.getAreaLeaderTel() == null ? other.getAreaLeaderTel() == null : this.getAreaLeaderTel().equals(other.getAreaLeaderTel()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getIdDelete() == null ? other.getIdDelete() == null : this.getIdDelete().equals(other.getIdDelete()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateAt() == null ? other.getUpdateAt() == null : this.getUpdateAt().equals(other.getUpdateAt()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getAreaName() == null) ? 0 : getAreaName().hashCode());
        result = prime * result + ((getAreaFatherId() == null) ? 0 : getAreaFatherId().hashCode());
        result = prime * result + ((getAreaScope() == null) ? 0 : getAreaScope().hashCode());
        result = prime * result + ((getAreaLeader() == null) ? 0 : getAreaLeader().hashCode());
        result = prime * result + ((getAreaLeaderTel() == null) ? 0 : getAreaLeaderTel().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getIdDelete() == null) ? 0 : getIdDelete().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateAt() == null) ? 0 : getUpdateAt().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", areaId=").append(areaId);
        sb.append(", areaName=").append(areaName);
        sb.append(", areaFatherId=").append(areaFatherId);
        sb.append(", areaScope=").append(areaScope);
        sb.append(", areaLeader=").append(areaLeader);
        sb.append(", areaLeaderTel=").append(areaLeaderTel);
        sb.append(", projectId=").append(projectId);
        sb.append(", groupId=").append(groupId);
        sb.append(", idDelete=").append(idDelete);
        sb.append(", createAt=").append(createAt);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}