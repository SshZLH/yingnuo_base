package com.ynkd.base.service.VO;

import com.ynkd.base.model.base.BaseDO;

/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/10/30
 * Time:20:24
 */
public class ProjectVo  extends BaseDO {
    /**
     *  项目ID
     */
    private Integer projectId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目地址
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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"projectId\":\"")
                .append(projectId).append('\"');
        sb.append(",\"projectName\":\"")
                .append(projectName).append('\"');
        sb.append(",\"projectAddr\":\"")
                .append(projectAddr).append('\"');
        sb.append(",\"projectLogoUrl\":\"")
                .append(projectLogoUrl).append('\"');
        sb.append(",\"projectLocation\":\"")
                .append(projectLocation).append('\"');
        sb.append(",\"projectLeader\":\"")
                .append(projectLeader).append('\"');
        sb.append(",\"manageName\":\"")
                .append(manageName).append('\"');
        sb.append(",\"panelName\":\"")
                .append(panelName).append('\"');
        sb.append(",\"projectMemo\":\"")
                .append(projectMemo).append('\"');
        sb.append(",\"idDelete\":\"")
                .append(idDelete).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
}
