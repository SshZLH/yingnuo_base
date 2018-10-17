package com.ynkd.base.model.device;

import java.io.Serializable;

/**
 * device
 * @author 
 */
public class Device implements Serializable {
    /**
     * 设备Id
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备类型 
     */
    private Integer deviceType;

    /**
     * 设备编号
     */
    private String deviceNo;

    /**
     * 设备状态  0 断线  1 在线
     */
    private Integer deviceStatus;

    /**
     * 设备版本
     */
    private String deviceVersion;

    /**
     * 设备地址
     */
    private String deviceAddr;

    /**
     * 设备所在位置
     */
    private String deviceLocation;

    /**
     * 备注
     */
    private String deviceMemo;

    /**
     * 生产商
     */
    private String deviceSupplier;

    /**
     * 设备开始时间
     */
    private String deviceStartTime;

    /**
     * 设备到期时间
     */
    private String deviceEndTime;

    /**
     * 实时数值
     */
    private String deviceNumerical;

    /**
     * 单位
     */
    private String deviceUnit;

    /**
     * 报警阙值，何时开始报警
     */
    private String deviceThreshold;

    /**
     * 设备等级，1为一级设备，可联网，2为2级设备 不能联网
     */
    private Integer deviceLevel;

    /**
     * 联网状况，0为断线，1为在线
     */
    private Integer networkNow;

    /**
     * 父级Id，用于2级设备通过内部网连接其上级设备使用
     */
    private String fatherId;

    /**
     * 创建时间
     */
    private String createAt;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private String updateAt;

    /**
     * 所属网关
     */
    private String gatewayId;

    /**
     * 固件ID
     */
    private String firmwareId;

    /**
     * 所属场景ID
     */
    private String placeId;

    private static final long serialVersionUID = 1L;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public String getDeviceAddr() {
        return deviceAddr;
    }

    public void setDeviceAddr(String deviceAddr) {
        this.deviceAddr = deviceAddr;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public String getDeviceMemo() {
        return deviceMemo;
    }

    public void setDeviceMemo(String deviceMemo) {
        this.deviceMemo = deviceMemo;
    }

    public String getDeviceSupplier() {
        return deviceSupplier;
    }

    public void setDeviceSupplier(String deviceSupplier) {
        this.deviceSupplier = deviceSupplier;
    }

    public String getDeviceStartTime() {
        return deviceStartTime;
    }

    public void setDeviceStartTime(String deviceStartTime) {
        this.deviceStartTime = deviceStartTime;
    }

    public String getDeviceEndTime() {
        return deviceEndTime;
    }

    public void setDeviceEndTime(String deviceEndTime) {
        this.deviceEndTime = deviceEndTime;
    }

    public String getDeviceNumerical() {
        return deviceNumerical;
    }

    public void setDeviceNumerical(String deviceNumerical) {
        this.deviceNumerical = deviceNumerical;
    }

    public String getDeviceUnit() {
        return deviceUnit;
    }

    public void setDeviceUnit(String deviceUnit) {
        this.deviceUnit = deviceUnit;
    }

    public String getDeviceThreshold() {
        return deviceThreshold;
    }

    public void setDeviceThreshold(String deviceThreshold) {
        this.deviceThreshold = deviceThreshold;
    }

    public Integer getDeviceLevel() {
        return deviceLevel;
    }

    public void setDeviceLevel(Integer deviceLevel) {
        this.deviceLevel = deviceLevel;
    }

    public Integer getNetworkNow() {
        return networkNow;
    }

    public void setNetworkNow(Integer networkNow) {
        this.networkNow = networkNow;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
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

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getFirmwareId() {
        return firmwareId;
    }

    public void setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
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
        Device other = (Device) that;
        return (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getDeviceName() == null ? other.getDeviceName() == null : this.getDeviceName().equals(other.getDeviceName()))
            && (this.getDeviceType() == null ? other.getDeviceType() == null : this.getDeviceType().equals(other.getDeviceType()))
            && (this.getDeviceNo() == null ? other.getDeviceNo() == null : this.getDeviceNo().equals(other.getDeviceNo()))
            && (this.getDeviceStatus() == null ? other.getDeviceStatus() == null : this.getDeviceStatus().equals(other.getDeviceStatus()))
            && (this.getDeviceVersion() == null ? other.getDeviceVersion() == null : this.getDeviceVersion().equals(other.getDeviceVersion()))
            && (this.getDeviceAddr() == null ? other.getDeviceAddr() == null : this.getDeviceAddr().equals(other.getDeviceAddr()))
            && (this.getDeviceLocation() == null ? other.getDeviceLocation() == null : this.getDeviceLocation().equals(other.getDeviceLocation()))
            && (this.getDeviceMemo() == null ? other.getDeviceMemo() == null : this.getDeviceMemo().equals(other.getDeviceMemo()))
            && (this.getDeviceSupplier() == null ? other.getDeviceSupplier() == null : this.getDeviceSupplier().equals(other.getDeviceSupplier()))
            && (this.getDeviceStartTime() == null ? other.getDeviceStartTime() == null : this.getDeviceStartTime().equals(other.getDeviceStartTime()))
            && (this.getDeviceEndTime() == null ? other.getDeviceEndTime() == null : this.getDeviceEndTime().equals(other.getDeviceEndTime()))
            && (this.getDeviceNumerical() == null ? other.getDeviceNumerical() == null : this.getDeviceNumerical().equals(other.getDeviceNumerical()))
            && (this.getDeviceUnit() == null ? other.getDeviceUnit() == null : this.getDeviceUnit().equals(other.getDeviceUnit()))
            && (this.getDeviceThreshold() == null ? other.getDeviceThreshold() == null : this.getDeviceThreshold().equals(other.getDeviceThreshold()))
            && (this.getDeviceLevel() == null ? other.getDeviceLevel() == null : this.getDeviceLevel().equals(other.getDeviceLevel()))
            && (this.getNetworkNow() == null ? other.getNetworkNow() == null : this.getNetworkNow().equals(other.getNetworkNow()))
            && (this.getFatherId() == null ? other.getFatherId() == null : this.getFatherId().equals(other.getFatherId()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateAt() == null ? other.getUpdateAt() == null : this.getUpdateAt().equals(other.getUpdateAt()))
            && (this.getGatewayId() == null ? other.getGatewayId() == null : this.getGatewayId().equals(other.getGatewayId()))
            && (this.getFirmwareId() == null ? other.getFirmwareId() == null : this.getFirmwareId().equals(other.getFirmwareId()))
            && (this.getPlaceId() == null ? other.getPlaceId() == null : this.getPlaceId().equals(other.getPlaceId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        result = prime * result + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        result = prime * result + ((getDeviceNo() == null) ? 0 : getDeviceNo().hashCode());
        result = prime * result + ((getDeviceStatus() == null) ? 0 : getDeviceStatus().hashCode());
        result = prime * result + ((getDeviceVersion() == null) ? 0 : getDeviceVersion().hashCode());
        result = prime * result + ((getDeviceAddr() == null) ? 0 : getDeviceAddr().hashCode());
        result = prime * result + ((getDeviceLocation() == null) ? 0 : getDeviceLocation().hashCode());
        result = prime * result + ((getDeviceMemo() == null) ? 0 : getDeviceMemo().hashCode());
        result = prime * result + ((getDeviceSupplier() == null) ? 0 : getDeviceSupplier().hashCode());
        result = prime * result + ((getDeviceStartTime() == null) ? 0 : getDeviceStartTime().hashCode());
        result = prime * result + ((getDeviceEndTime() == null) ? 0 : getDeviceEndTime().hashCode());
        result = prime * result + ((getDeviceNumerical() == null) ? 0 : getDeviceNumerical().hashCode());
        result = prime * result + ((getDeviceUnit() == null) ? 0 : getDeviceUnit().hashCode());
        result = prime * result + ((getDeviceThreshold() == null) ? 0 : getDeviceThreshold().hashCode());
        result = prime * result + ((getDeviceLevel() == null) ? 0 : getDeviceLevel().hashCode());
        result = prime * result + ((getNetworkNow() == null) ? 0 : getNetworkNow().hashCode());
        result = prime * result + ((getFatherId() == null) ? 0 : getFatherId().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateAt() == null) ? 0 : getUpdateAt().hashCode());
        result = prime * result + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        result = prime * result + ((getFirmwareId() == null) ? 0 : getFirmwareId().hashCode());
        result = prime * result + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deviceId=").append(deviceId);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", deviceNo=").append(deviceNo);
        sb.append(", deviceStatus=").append(deviceStatus);
        sb.append(", deviceVersion=").append(deviceVersion);
        sb.append(", deviceAddr=").append(deviceAddr);
        sb.append(", deviceLocation=").append(deviceLocation);
        sb.append(", deviceMemo=").append(deviceMemo);
        sb.append(", deviceSupplier=").append(deviceSupplier);
        sb.append(", deviceStartTime=").append(deviceStartTime);
        sb.append(", deviceEndTime=").append(deviceEndTime);
        sb.append(", deviceNumerical=").append(deviceNumerical);
        sb.append(", deviceUnit=").append(deviceUnit);
        sb.append(", deviceThreshold=").append(deviceThreshold);
        sb.append(", deviceLevel=").append(deviceLevel);
        sb.append(", networkNow=").append(networkNow);
        sb.append(", fatherId=").append(fatherId);
        sb.append(", createAt=").append(createAt);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", gatewayId=").append(gatewayId);
        sb.append(", firmwareId=").append(firmwareId);
        sb.append(", placeId=").append(placeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}