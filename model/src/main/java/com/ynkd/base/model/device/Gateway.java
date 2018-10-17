package com.ynkd.base.model.device;

import java.io.Serializable;
import java.util.Date;

/**
 * gateway
 * @author 
 */
public class Gateway implements Serializable {
    /**
     * 网关Id
     */
    private String gatewayId;

    /**
     * 网关名称
     */
    private String gatewayName;

    /**
     * 网关编号
     */
    private String gatewayNo;

    /**
     * 网关型号
     */
    private String gatewayModel;

    /**
     * 安装位置
     */
    private String gatewayLocation;

    /**
     * 维度
     */
    private String gatewayLati;

    /**
     * 经度
     */
    private String gatewayLong;

    /**
     * 连接方式  2，3，4G ; NBIOT,LRA
     */
    private String gatewayConnWay;

    /**
     * 连接目标服务路径 外网IP或域名
     */
    private String gatewayConnUrl;

    /**
     * 连接目标服务端口
     */
    private String gatewayConnPort;

    /**
     * 连接服务所属公司
     */
    private String gatewayConnCompany;

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
    private Date updateAt;

    /**
     * 更新人
     */
    private Date updateBy;

    /**
     * 固件Id
     */
    private Integer firmwareId;

    private static final long serialVersionUID = 1L;

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public String getGatewayNo() {
        return gatewayNo;
    }

    public void setGatewayNo(String gatewayNo) {
        this.gatewayNo = gatewayNo;
    }

    public String getGatewayModel() {
        return gatewayModel;
    }

    public void setGatewayModel(String gatewayModel) {
        this.gatewayModel = gatewayModel;
    }

    public String getGatewayLocation() {
        return gatewayLocation;
    }

    public void setGatewayLocation(String gatewayLocation) {
        this.gatewayLocation = gatewayLocation;
    }

    public String getGatewayLati() {
        return gatewayLati;
    }

    public void setGatewayLati(String gatewayLati) {
        this.gatewayLati = gatewayLati;
    }

    public String getGatewayLong() {
        return gatewayLong;
    }

    public void setGatewayLong(String gatewayLong) {
        this.gatewayLong = gatewayLong;
    }

    public String getGatewayConnWay() {
        return gatewayConnWay;
    }

    public void setGatewayConnWay(String gatewayConnWay) {
        this.gatewayConnWay = gatewayConnWay;
    }

    public String getGatewayConnUrl() {
        return gatewayConnUrl;
    }

    public void setGatewayConnUrl(String gatewayConnUrl) {
        this.gatewayConnUrl = gatewayConnUrl;
    }

    public String getGatewayConnPort() {
        return gatewayConnPort;
    }

    public void setGatewayConnPort(String gatewayConnPort) {
        this.gatewayConnPort = gatewayConnPort;
    }

    public String getGatewayConnCompany() {
        return gatewayConnCompany;
    }

    public void setGatewayConnCompany(String gatewayConnCompany) {
        this.gatewayConnCompany = gatewayConnCompany;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Date updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getFirmwareId() {
        return firmwareId;
    }

    public void setFirmwareId(Integer firmwareId) {
        this.firmwareId = firmwareId;
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
        Gateway other = (Gateway) that;
        return (this.getGatewayId() == null ? other.getGatewayId() == null : this.getGatewayId().equals(other.getGatewayId()))
            && (this.getGatewayName() == null ? other.getGatewayName() == null : this.getGatewayName().equals(other.getGatewayName()))
            && (this.getGatewayNo() == null ? other.getGatewayNo() == null : this.getGatewayNo().equals(other.getGatewayNo()))
            && (this.getGatewayModel() == null ? other.getGatewayModel() == null : this.getGatewayModel().equals(other.getGatewayModel()))
            && (this.getGatewayLocation() == null ? other.getGatewayLocation() == null : this.getGatewayLocation().equals(other.getGatewayLocation()))
            && (this.getGatewayLati() == null ? other.getGatewayLati() == null : this.getGatewayLati().equals(other.getGatewayLati()))
            && (this.getGatewayLong() == null ? other.getGatewayLong() == null : this.getGatewayLong().equals(other.getGatewayLong()))
            && (this.getGatewayConnWay() == null ? other.getGatewayConnWay() == null : this.getGatewayConnWay().equals(other.getGatewayConnWay()))
            && (this.getGatewayConnUrl() == null ? other.getGatewayConnUrl() == null : this.getGatewayConnUrl().equals(other.getGatewayConnUrl()))
            && (this.getGatewayConnPort() == null ? other.getGatewayConnPort() == null : this.getGatewayConnPort().equals(other.getGatewayConnPort()))
            && (this.getGatewayConnCompany() == null ? other.getGatewayConnCompany() == null : this.getGatewayConnCompany().equals(other.getGatewayConnCompany()))
            && (this.getIdDelete() == null ? other.getIdDelete() == null : this.getIdDelete().equals(other.getIdDelete()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateAt() == null ? other.getUpdateAt() == null : this.getUpdateAt().equals(other.getUpdateAt()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getFirmwareId() == null ? other.getFirmwareId() == null : this.getFirmwareId().equals(other.getFirmwareId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        result = prime * result + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        result = prime * result + ((getGatewayNo() == null) ? 0 : getGatewayNo().hashCode());
        result = prime * result + ((getGatewayModel() == null) ? 0 : getGatewayModel().hashCode());
        result = prime * result + ((getGatewayLocation() == null) ? 0 : getGatewayLocation().hashCode());
        result = prime * result + ((getGatewayLati() == null) ? 0 : getGatewayLati().hashCode());
        result = prime * result + ((getGatewayLong() == null) ? 0 : getGatewayLong().hashCode());
        result = prime * result + ((getGatewayConnWay() == null) ? 0 : getGatewayConnWay().hashCode());
        result = prime * result + ((getGatewayConnUrl() == null) ? 0 : getGatewayConnUrl().hashCode());
        result = prime * result + ((getGatewayConnPort() == null) ? 0 : getGatewayConnPort().hashCode());
        result = prime * result + ((getGatewayConnCompany() == null) ? 0 : getGatewayConnCompany().hashCode());
        result = prime * result + ((getIdDelete() == null) ? 0 : getIdDelete().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateAt() == null) ? 0 : getUpdateAt().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getFirmwareId() == null) ? 0 : getFirmwareId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gatewayId=").append(gatewayId);
        sb.append(", gatewayName=").append(gatewayName);
        sb.append(", gatewayNo=").append(gatewayNo);
        sb.append(", gatewayModel=").append(gatewayModel);
        sb.append(", gatewayLocation=").append(gatewayLocation);
        sb.append(", gatewayLati=").append(gatewayLati);
        sb.append(", gatewayLong=").append(gatewayLong);
        sb.append(", gatewayConnWay=").append(gatewayConnWay);
        sb.append(", gatewayConnUrl=").append(gatewayConnUrl);
        sb.append(", gatewayConnPort=").append(gatewayConnPort);
        sb.append(", gatewayConnCompany=").append(gatewayConnCompany);
        sb.append(", idDelete=").append(idDelete);
        sb.append(", createAt=").append(createAt);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", firmwareId=").append(firmwareId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}