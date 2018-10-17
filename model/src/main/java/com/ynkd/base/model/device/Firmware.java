package com.ynkd.base.model.device;

import java.io.Serializable;

/**
 * firmware
 * @author 
 */
public class Firmware implements Serializable {
    /**
     * 固件ID
     */
    private Integer firmwareId;

    /**
     * 固件名称
     */
    private String firmwareName;

    /**
     * 固件版本
     */
    private String firmwareVersion;

    /**
     * 固件路径
     */
    private String firmwarePath;

    /**
     * 固件状态
     */
    private Integer firmwareStatus;

    /**
     * 固件类型
     */
    private String firmwareType;

    /**
     * 备注
     */
    private String firmwareMemo;

    /**
     * 逻辑删除
     */
    private String idDelete;

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

    public Integer getFirmwareId() {
        return firmwareId;
    }

    public void setFirmwareId(Integer firmwareId) {
        this.firmwareId = firmwareId;
    }

    public String getFirmwareName() {
        return firmwareName;
    }

    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getFirmwarePath() {
        return firmwarePath;
    }

    public void setFirmwarePath(String firmwarePath) {
        this.firmwarePath = firmwarePath;
    }

    public Integer getFirmwareStatus() {
        return firmwareStatus;
    }

    public void setFirmwareStatus(Integer firmwareStatus) {
        this.firmwareStatus = firmwareStatus;
    }

    public String getFirmwareType() {
        return firmwareType;
    }

    public void setFirmwareType(String firmwareType) {
        this.firmwareType = firmwareType;
    }

    public String getFirmwareMemo() {
        return firmwareMemo;
    }

    public void setFirmwareMemo(String firmwareMemo) {
        this.firmwareMemo = firmwareMemo;
    }

    public String getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(String idDelete) {
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
        Firmware other = (Firmware) that;
        return (this.getFirmwareId() == null ? other.getFirmwareId() == null : this.getFirmwareId().equals(other.getFirmwareId()))
            && (this.getFirmwareName() == null ? other.getFirmwareName() == null : this.getFirmwareName().equals(other.getFirmwareName()))
            && (this.getFirmwareVersion() == null ? other.getFirmwareVersion() == null : this.getFirmwareVersion().equals(other.getFirmwareVersion()))
            && (this.getFirmwarePath() == null ? other.getFirmwarePath() == null : this.getFirmwarePath().equals(other.getFirmwarePath()))
            && (this.getFirmwareStatus() == null ? other.getFirmwareStatus() == null : this.getFirmwareStatus().equals(other.getFirmwareStatus()))
            && (this.getFirmwareType() == null ? other.getFirmwareType() == null : this.getFirmwareType().equals(other.getFirmwareType()))
            && (this.getFirmwareMemo() == null ? other.getFirmwareMemo() == null : this.getFirmwareMemo().equals(other.getFirmwareMemo()))
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
        result = prime * result + ((getFirmwareId() == null) ? 0 : getFirmwareId().hashCode());
        result = prime * result + ((getFirmwareName() == null) ? 0 : getFirmwareName().hashCode());
        result = prime * result + ((getFirmwareVersion() == null) ? 0 : getFirmwareVersion().hashCode());
        result = prime * result + ((getFirmwarePath() == null) ? 0 : getFirmwarePath().hashCode());
        result = prime * result + ((getFirmwareStatus() == null) ? 0 : getFirmwareStatus().hashCode());
        result = prime * result + ((getFirmwareType() == null) ? 0 : getFirmwareType().hashCode());
        result = prime * result + ((getFirmwareMemo() == null) ? 0 : getFirmwareMemo().hashCode());
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
        sb.append(", firmwareId=").append(firmwareId);
        sb.append(", firmwareName=").append(firmwareName);
        sb.append(", firmwareVersion=").append(firmwareVersion);
        sb.append(", firmwarePath=").append(firmwarePath);
        sb.append(", firmwareStatus=").append(firmwareStatus);
        sb.append(", firmwareType=").append(firmwareType);
        sb.append(", firmwareMemo=").append(firmwareMemo);
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