package com.bigroad.springbootdemo.domain;

import java.io.Serializable;
import java.util.Date;

public class Changepprover implements Serializable {
    private Integer id;

    private Integer applicationId;

    private Integer approverId;

    private Byte level;

    private Byte approvalProgress;

    private Date recordTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getApproverId() {
        return approverId;
    }

    public void setApproverId(Integer approverId) {
        this.approverId = approverId;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getApprovalProgress() {
        return approvalProgress;
    }

    public void setApprovalProgress(Byte approvalProgress) {
        this.approvalProgress = approvalProgress;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        Changepprover other = (Changepprover) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApplicationId() == null ? other.getApplicationId() == null : this.getApplicationId().equals(other.getApplicationId()))
            && (this.getApproverId() == null ? other.getApproverId() == null : this.getApproverId().equals(other.getApproverId()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getApprovalProgress() == null ? other.getApprovalProgress() == null : this.getApprovalProgress().equals(other.getApprovalProgress()))
            && (this.getRecordTime() == null ? other.getRecordTime() == null : this.getRecordTime().equals(other.getRecordTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        result = prime * result + ((getApproverId() == null) ? 0 : getApproverId().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getApprovalProgress() == null) ? 0 : getApprovalProgress().hashCode());
        result = prime * result + ((getRecordTime() == null) ? 0 : getRecordTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", approverId=").append(approverId);
        sb.append(", level=").append(level);
        sb.append(", approvalProgress=").append(approvalProgress);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}