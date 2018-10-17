package com.ynkd.base.model.alarm;

import com.ynkd.base.model.base.BaseDO;

import java.io.Serializable;

/**
 * alarm
 * @author 
 */
public class Alarm extends BaseDO {
    /**
     * 报警id
     */
    private String alarmId;

    /**
     * 报警名称
     */
    private String alarmName;

    /**
     * 报警类型
     */
    private String alarmType;

    /**
     * 报警状态（0 未处理，1已处理，2误报）
     */
    private Integer alarmStatus;

    /**
     * 报警开始时间
     */
    private String alarmStartDate;

    /**
     * 报警结束时间
     */
    private String alarmEndDate;

    /**
     * 报警内容
     */
    private String alarmContent;

    /**
     * 备注
     */
    private String alarmMemo;

    /**
     * 区域id
     */
    private String areaId;

    /**
     * 场所id
     */
    private String placeId;

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
     * 更新时间
     */
    private String updateAt;

    /**
     * 更新人
     */
    private String updateBy;

    private static final long serialVersionUID = 1L;

    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public String getAlarmStartDate() {
        return alarmStartDate;
    }

    public void setAlarmStartDate(String alarmStartDate) {
        this.alarmStartDate = alarmStartDate;
    }

    public String getAlarmEndDate() {
        return alarmEndDate;
    }

    public void setAlarmEndDate(String alarmEndDate) {
        this.alarmEndDate = alarmEndDate;
    }

    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
    }

    public String getAlarmMemo() {
        return alarmMemo;
    }

    public void setAlarmMemo(String alarmMemo) {
        this.alarmMemo = alarmMemo;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
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
        Alarm other = (Alarm) that;
        return (this.getAlarmId() == null ? other.getAlarmId() == null : this.getAlarmId().equals(other.getAlarmId()))
            && (this.getAlarmName() == null ? other.getAlarmName() == null : this.getAlarmName().equals(other.getAlarmName()))
            && (this.getAlarmType() == null ? other.getAlarmType() == null : this.getAlarmType().equals(other.getAlarmType()))
            && (this.getAlarmStatus() == null ? other.getAlarmStatus() == null : this.getAlarmStatus().equals(other.getAlarmStatus()))
            && (this.getAlarmStartDate() == null ? other.getAlarmStartDate() == null : this.getAlarmStartDate().equals(other.getAlarmStartDate()))
            && (this.getAlarmEndDate() == null ? other.getAlarmEndDate() == null : this.getAlarmEndDate().equals(other.getAlarmEndDate()))
            && (this.getAlarmContent() == null ? other.getAlarmContent() == null : this.getAlarmContent().equals(other.getAlarmContent()))
            && (this.getAlarmMemo() == null ? other.getAlarmMemo() == null : this.getAlarmMemo().equals(other.getAlarmMemo()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getPlaceId() == null ? other.getPlaceId() == null : this.getPlaceId().equals(other.getPlaceId()))
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
        result = prime * result + ((getAlarmId() == null) ? 0 : getAlarmId().hashCode());
        result = prime * result + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        result = prime * result + ((getAlarmType() == null) ? 0 : getAlarmType().hashCode());
        result = prime * result + ((getAlarmStatus() == null) ? 0 : getAlarmStatus().hashCode());
        result = prime * result + ((getAlarmStartDate() == null) ? 0 : getAlarmStartDate().hashCode());
        result = prime * result + ((getAlarmEndDate() == null) ? 0 : getAlarmEndDate().hashCode());
        result = prime * result + ((getAlarmContent() == null) ? 0 : getAlarmContent().hashCode());
        result = prime * result + ((getAlarmMemo() == null) ? 0 : getAlarmMemo().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
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
        sb.append(", alarmId=").append(alarmId);
        sb.append(", alarmName=").append(alarmName);
        sb.append(", alarmType=").append(alarmType);
        sb.append(", alarmStatus=").append(alarmStatus);
        sb.append(", alarmStartDate=").append(alarmStartDate);
        sb.append(", alarmEndDate=").append(alarmEndDate);
        sb.append(", alarmContent=").append(alarmContent);
        sb.append(", alarmMemo=").append(alarmMemo);
        sb.append(", areaId=").append(areaId);
        sb.append(", placeId=").append(placeId);
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