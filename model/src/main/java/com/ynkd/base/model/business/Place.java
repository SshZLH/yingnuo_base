package com.ynkd.base.model.business;

import java.io.Serializable;

/**
 * place
 * @author 
 */
public class Place implements Serializable {
    /**
     * 场所ID
     */
    private String placeId;

    /**
     * 场所名称
     */
    private String placeName;

    /**
     * 场所片区
     */
    private String placeArea;

    /**
     * 场所平面图
     */
    private String placeFloorplan;

    /**
     * 场所地址
     */
    private String placeAddr;

    /**
     * 场所范围
     */
    private String placeScope;

    /**
     * 业主
     */
    private String placeBoss;

    /**
     * 业主电话
     */
    private String placeBossTel;

    /**
     * 固定电话
     */
    private String placeTelephone;

    /**
     * 通知方式
     */
    private String informWay;

    /**
     * 区域id
     */
    private String areaId;

    /**
     * 紧急联系人组id（用于警报）
     */
    private String groupId;

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

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceArea() {
        return placeArea;
    }

    public void setPlaceArea(String placeArea) {
        this.placeArea = placeArea;
    }

    public String getPlaceFloorplan() {
        return placeFloorplan;
    }

    public void setPlaceFloorplan(String placeFloorplan) {
        this.placeFloorplan = placeFloorplan;
    }

    public String getPlaceAddr() {
        return placeAddr;
    }

    public void setPlaceAddr(String placeAddr) {
        this.placeAddr = placeAddr;
    }

    public String getPlaceScope() {
        return placeScope;
    }

    public void setPlaceScope(String placeScope) {
        this.placeScope = placeScope;
    }

    public String getPlaceBoss() {
        return placeBoss;
    }

    public void setPlaceBoss(String placeBoss) {
        this.placeBoss = placeBoss;
    }

    public String getPlaceBossTel() {
        return placeBossTel;
    }

    public void setPlaceBossTel(String placeBossTel) {
        this.placeBossTel = placeBossTel;
    }

    public String getPlaceTelephone() {
        return placeTelephone;
    }

    public void setPlaceTelephone(String placeTelephone) {
        this.placeTelephone = placeTelephone;
    }

    public String getInformWay() {
        return informWay;
    }

    public void setInformWay(String informWay) {
        this.informWay = informWay;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
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
        Place other = (Place) that;
        return (this.getPlaceId() == null ? other.getPlaceId() == null : this.getPlaceId().equals(other.getPlaceId()))
            && (this.getPlaceName() == null ? other.getPlaceName() == null : this.getPlaceName().equals(other.getPlaceName()))
            && (this.getPlaceArea() == null ? other.getPlaceArea() == null : this.getPlaceArea().equals(other.getPlaceArea()))
            && (this.getPlaceFloorplan() == null ? other.getPlaceFloorplan() == null : this.getPlaceFloorplan().equals(other.getPlaceFloorplan()))
            && (this.getPlaceAddr() == null ? other.getPlaceAddr() == null : this.getPlaceAddr().equals(other.getPlaceAddr()))
            && (this.getPlaceScope() == null ? other.getPlaceScope() == null : this.getPlaceScope().equals(other.getPlaceScope()))
            && (this.getPlaceBoss() == null ? other.getPlaceBoss() == null : this.getPlaceBoss().equals(other.getPlaceBoss()))
            && (this.getPlaceBossTel() == null ? other.getPlaceBossTel() == null : this.getPlaceBossTel().equals(other.getPlaceBossTel()))
            && (this.getPlaceTelephone() == null ? other.getPlaceTelephone() == null : this.getPlaceTelephone().equals(other.getPlaceTelephone()))
            && (this.getInformWay() == null ? other.getInformWay() == null : this.getInformWay().equals(other.getInformWay()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
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
        result = prime * result + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
        result = prime * result + ((getPlaceName() == null) ? 0 : getPlaceName().hashCode());
        result = prime * result + ((getPlaceArea() == null) ? 0 : getPlaceArea().hashCode());
        result = prime * result + ((getPlaceFloorplan() == null) ? 0 : getPlaceFloorplan().hashCode());
        result = prime * result + ((getPlaceAddr() == null) ? 0 : getPlaceAddr().hashCode());
        result = prime * result + ((getPlaceScope() == null) ? 0 : getPlaceScope().hashCode());
        result = prime * result + ((getPlaceBoss() == null) ? 0 : getPlaceBoss().hashCode());
        result = prime * result + ((getPlaceBossTel() == null) ? 0 : getPlaceBossTel().hashCode());
        result = prime * result + ((getPlaceTelephone() == null) ? 0 : getPlaceTelephone().hashCode());
        result = prime * result + ((getInformWay() == null) ? 0 : getInformWay().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
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
        sb.append(", placeId=").append(placeId);
        sb.append(", placeName=").append(placeName);
        sb.append(", placeArea=").append(placeArea);
        sb.append(", placeFloorplan=").append(placeFloorplan);
        sb.append(", placeAddr=").append(placeAddr);
        sb.append(", placeScope=").append(placeScope);
        sb.append(", placeBoss=").append(placeBoss);
        sb.append(", placeBossTel=").append(placeBossTel);
        sb.append(", placeTelephone=").append(placeTelephone);
        sb.append(", informWay=").append(informWay);
        sb.append(", areaId=").append(areaId);
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