package com.ynkd.base.model.alarm;

import java.io.Serializable;

/**
 * alarm_contact
 * @author 
 */
public class AlarmContact implements Serializable {
    /**
     * 联系人id
     */
    private String contId;

    /**
     * 联系人姓名
     */
    private String contName;

    /**
     * 联系人电话
     */
    private String contTel;

    /**
     * 联系人邮箱
     */
    private String contEmail;

    /**
     * 通知级别
     */
    private String contLevel;

    /**
     * 紧急联系人组id
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

    public String getContId() {
        return contId;
    }

    public void setContId(String contId) {
        this.contId = contId;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public String getContTel() {
        return contTel;
    }

    public void setContTel(String contTel) {
        this.contTel = contTel;
    }

    public String getContEmail() {
        return contEmail;
    }

    public void setContEmail(String contEmail) {
        this.contEmail = contEmail;
    }

    public String getContLevel() {
        return contLevel;
    }

    public void setContLevel(String contLevel) {
        this.contLevel = contLevel;
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
        AlarmContact other = (AlarmContact) that;
        return (this.getContId() == null ? other.getContId() == null : this.getContId().equals(other.getContId()))
            && (this.getContName() == null ? other.getContName() == null : this.getContName().equals(other.getContName()))
            && (this.getContTel() == null ? other.getContTel() == null : this.getContTel().equals(other.getContTel()))
            && (this.getContEmail() == null ? other.getContEmail() == null : this.getContEmail().equals(other.getContEmail()))
            && (this.getContLevel() == null ? other.getContLevel() == null : this.getContLevel().equals(other.getContLevel()))
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
        result = prime * result + ((getContId() == null) ? 0 : getContId().hashCode());
        result = prime * result + ((getContName() == null) ? 0 : getContName().hashCode());
        result = prime * result + ((getContTel() == null) ? 0 : getContTel().hashCode());
        result = prime * result + ((getContEmail() == null) ? 0 : getContEmail().hashCode());
        result = prime * result + ((getContLevel() == null) ? 0 : getContLevel().hashCode());
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
        sb.append(", contId=").append(contId);
        sb.append(", contName=").append(contName);
        sb.append(", contTel=").append(contTel);
        sb.append(", contEmail=").append(contEmail);
        sb.append(", contLevel=").append(contLevel);
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