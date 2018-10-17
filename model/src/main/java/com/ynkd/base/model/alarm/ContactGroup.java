package com.ynkd.base.model.alarm;

import java.io.Serializable;

/**
 * contact_group
 * @author 
 */
public class ContactGroup implements Serializable {
    /**
     * 紧急联系人
     */
    private String groupId;

    /**
     * 紧急联系组名称
     */
    private String groupName;

    /**
     * 备注
     */
    private String groupMemo;

    /**
     * 通知开始日期
     */
    private String noticeStartDate;

    /**
     * 通知结束日期
     */
    private String noticeEndDate;

    /**
     * 通知开始时间
     */
    private String noticeStartTime;

    /**
     * 通知结束时间
     */
    private String noticeEndTime;

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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupMemo() {
        return groupMemo;
    }

    public void setGroupMemo(String groupMemo) {
        this.groupMemo = groupMemo;
    }

    public String getNoticeStartDate() {
        return noticeStartDate;
    }

    public void setNoticeStartDate(String noticeStartDate) {
        this.noticeStartDate = noticeStartDate;
    }

    public String getNoticeEndDate() {
        return noticeEndDate;
    }

    public void setNoticeEndDate(String noticeEndDate) {
        this.noticeEndDate = noticeEndDate;
    }

    public String getNoticeStartTime() {
        return noticeStartTime;
    }

    public void setNoticeStartTime(String noticeStartTime) {
        this.noticeStartTime = noticeStartTime;
    }

    public String getNoticeEndTime() {
        return noticeEndTime;
    }

    public void setNoticeEndTime(String noticeEndTime) {
        this.noticeEndTime = noticeEndTime;
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
        ContactGroup other = (ContactGroup) that;
        return (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getGroupMemo() == null ? other.getGroupMemo() == null : this.getGroupMemo().equals(other.getGroupMemo()))
            && (this.getNoticeStartDate() == null ? other.getNoticeStartDate() == null : this.getNoticeStartDate().equals(other.getNoticeStartDate()))
            && (this.getNoticeEndDate() == null ? other.getNoticeEndDate() == null : this.getNoticeEndDate().equals(other.getNoticeEndDate()))
            && (this.getNoticeStartTime() == null ? other.getNoticeStartTime() == null : this.getNoticeStartTime().equals(other.getNoticeStartTime()))
            && (this.getNoticeEndTime() == null ? other.getNoticeEndTime() == null : this.getNoticeEndTime().equals(other.getNoticeEndTime()))
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
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getGroupMemo() == null) ? 0 : getGroupMemo().hashCode());
        result = prime * result + ((getNoticeStartDate() == null) ? 0 : getNoticeStartDate().hashCode());
        result = prime * result + ((getNoticeEndDate() == null) ? 0 : getNoticeEndDate().hashCode());
        result = prime * result + ((getNoticeStartTime() == null) ? 0 : getNoticeStartTime().hashCode());
        result = prime * result + ((getNoticeEndTime() == null) ? 0 : getNoticeEndTime().hashCode());
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
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", groupMemo=").append(groupMemo);
        sb.append(", noticeStartDate=").append(noticeStartDate);
        sb.append(", noticeEndDate=").append(noticeEndDate);
        sb.append(", noticeStartTime=").append(noticeStartTime);
        sb.append(", noticeEndTime=").append(noticeEndTime);
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