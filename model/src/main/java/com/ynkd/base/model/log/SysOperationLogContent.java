package com.ynkd.base.model.log;

import java.io.Serializable;

/**
 * sys_operation_log_content
 * @author 
 */
public class SysOperationLogContent implements Serializable {
    /**
     * 日志详细id
     */
    private String logconId;

    /**
     * 日志id
     */
    private String logId;

    /**
     * 字段
     */
    private String logconKey;

    /**
     * 名称
     */
    private String logconValue;

    /**
     * 旧值
     */
    private String oldValue;

    /**
     * 新值
     */
    private String newValue;

    private static final long serialVersionUID = 1L;

    public String getLogconId() {
        return logconId;
    }

    public void setLogconId(String logconId) {
        this.logconId = logconId;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getLogconKey() {
        return logconKey;
    }

    public void setLogconKey(String logconKey) {
        this.logconKey = logconKey;
    }

    public String getLogconValue() {
        return logconValue;
    }

    public void setLogconValue(String logconValue) {
        this.logconValue = logconValue;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
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
        SysOperationLogContent other = (SysOperationLogContent) that;
        return (this.getLogconId() == null ? other.getLogconId() == null : this.getLogconId().equals(other.getLogconId()))
            && (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getLogconKey() == null ? other.getLogconKey() == null : this.getLogconKey().equals(other.getLogconKey()))
            && (this.getLogconValue() == null ? other.getLogconValue() == null : this.getLogconValue().equals(other.getLogconValue()))
            && (this.getOldValue() == null ? other.getOldValue() == null : this.getOldValue().equals(other.getOldValue()))
            && (this.getNewValue() == null ? other.getNewValue() == null : this.getNewValue().equals(other.getNewValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogconId() == null) ? 0 : getLogconId().hashCode());
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getLogconKey() == null) ? 0 : getLogconKey().hashCode());
        result = prime * result + ((getLogconValue() == null) ? 0 : getLogconValue().hashCode());
        result = prime * result + ((getOldValue() == null) ? 0 : getOldValue().hashCode());
        result = prime * result + ((getNewValue() == null) ? 0 : getNewValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logconId=").append(logconId);
        sb.append(", logId=").append(logId);
        sb.append(", logconKey=").append(logconKey);
        sb.append(", logconValue=").append(logconValue);
        sb.append(", oldValue=").append(oldValue);
        sb.append(", newValue=").append(newValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}