package com.ynkd.base.model.business;

import java.io.Serializable;

/**
 * project
 * @author 
 */
public class Project implements Serializable {
    /**
     *  项目ID
     */
    private String projectId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 省份ID
     */
    private String provincialId;

    /**
     * 市区ID

     */
    private String cityId;

    /**
     * 区域ID
     */
    private String areaId;

    /**
     * 详细地址
     */
    private String projectAddr;

    /**
     * 项目logo的路径
     */
    private String projectLogoUrl;

    /**
     * 项目范围 精确到每个楼的地址
     */
    private String projectLocation;

    /**
     * 项目负责人
     */
    private String projectLeader;

    /**
     * 管理端名称
     */
    private String manageName;

    /**
     * 面板端名称
     */
    private String panelName;

    /**
     * 项目备注
     */
    private String projectMemo;

    /**
     * 逻辑删除
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
     * 创建时间
     */
    private String updateAt;

    /**
     * 创建人
     */
    private String updateBy;

    private static final long serialVersionUID = 1L;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProvincialId() {
        return provincialId;
    }

    public void setProvincialId(String provincialId) {
        this.provincialId = provincialId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getProjectAddr() {
        return projectAddr;
    }

    public void setProjectAddr(String projectAddr) {
        this.projectAddr = projectAddr;
    }

    public String getProjectLogoUrl() {
        return projectLogoUrl;
    }

    public void setProjectLogoUrl(String projectLogoUrl) {
        this.projectLogoUrl = projectLogoUrl;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName;
    }

    public String getPanelName() {
        return panelName;
    }

    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    public String getProjectMemo() {
        return projectMemo;
    }

    public void setProjectMemo(String projectMemo) {
        this.projectMemo = projectMemo;
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
        Project other = (Project) that;
        return (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getProvincialId() == null ? other.getProvincialId() == null : this.getProvincialId().equals(other.getProvincialId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getProjectAddr() == null ? other.getProjectAddr() == null : this.getProjectAddr().equals(other.getProjectAddr()))
            && (this.getProjectLogoUrl() == null ? other.getProjectLogoUrl() == null : this.getProjectLogoUrl().equals(other.getProjectLogoUrl()))
            && (this.getProjectLocation() == null ? other.getProjectLocation() == null : this.getProjectLocation().equals(other.getProjectLocation()))
            && (this.getProjectLeader() == null ? other.getProjectLeader() == null : this.getProjectLeader().equals(other.getProjectLeader()))
            && (this.getManageName() == null ? other.getManageName() == null : this.getManageName().equals(other.getManageName()))
            && (this.getPanelName() == null ? other.getPanelName() == null : this.getPanelName().equals(other.getPanelName()))
            && (this.getProjectMemo() == null ? other.getProjectMemo() == null : this.getProjectMemo().equals(other.getProjectMemo()))
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
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getProvincialId() == null) ? 0 : getProvincialId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getProjectAddr() == null) ? 0 : getProjectAddr().hashCode());
        result = prime * result + ((getProjectLogoUrl() == null) ? 0 : getProjectLogoUrl().hashCode());
        result = prime * result + ((getProjectLocation() == null) ? 0 : getProjectLocation().hashCode());
        result = prime * result + ((getProjectLeader() == null) ? 0 : getProjectLeader().hashCode());
        result = prime * result + ((getManageName() == null) ? 0 : getManageName().hashCode());
        result = prime * result + ((getPanelName() == null) ? 0 : getPanelName().hashCode());
        result = prime * result + ((getProjectMemo() == null) ? 0 : getProjectMemo().hashCode());
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
        sb.append(", projectId=").append(projectId);
        sb.append(", projectName=").append(projectName);
        sb.append(", provincialId=").append(provincialId);
        sb.append(", cityId=").append(cityId);
        sb.append(", areaId=").append(areaId);
        sb.append(", projectAddr=").append(projectAddr);
        sb.append(", projectLogoUrl=").append(projectLogoUrl);
        sb.append(", projectLocation=").append(projectLocation);
        sb.append(", projectLeader=").append(projectLeader);
        sb.append(", manageName=").append(manageName);
        sb.append(", panelName=").append(panelName);
        sb.append(", projectMemo=").append(projectMemo);
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