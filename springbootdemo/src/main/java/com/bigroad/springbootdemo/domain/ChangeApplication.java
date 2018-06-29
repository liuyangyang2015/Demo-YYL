package com.bigroad.springbootdemo.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ChangeApplication implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer applicantId;

    private BigDecimal money;

    private BigDecimal costMoney;

    private Byte solver;

    private Byte type;

    private Byte ticketChannel;

    private Byte applyStatus;

    private Integer financeBackId;

    private String reason;

    private String rejectReason;

    private Integer refundAgreementId;

    private String bankOfDeposit;

    private String bankAccount;

    private String cardNumber;

    private Date expectPaymentDate;

    private Date operateDate;

    private Integer operateAccount;

    private Date recordTime;

    private Date updateTime;

    private Integer applicationId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getCostMoney() {
        return costMoney;
    }

    public void setCostMoney(BigDecimal costMoney) {
        this.costMoney = costMoney;
    }

    public Byte getSolver() {
        return solver;
    }

    public void setSolver(Byte solver) {
        this.solver = solver;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getTicketChannel() {
        return ticketChannel;
    }

    public void setTicketChannel(Byte ticketChannel) {
        this.ticketChannel = ticketChannel;
    }

    public Byte getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Byte applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Integer getFinanceBackId() {
        return financeBackId;
    }

    public void setFinanceBackId(Integer financeBackId) {
        this.financeBackId = financeBackId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public Integer getRefundAgreementId() {
        return refundAgreementId;
    }

    public void setRefundAgreementId(Integer refundAgreementId) {
        this.refundAgreementId = refundAgreementId;
    }

    public String getBankOfDeposit() {
        return bankOfDeposit;
    }

    public void setBankOfDeposit(String bankOfDeposit) {
        this.bankOfDeposit = bankOfDeposit == null ? null : bankOfDeposit.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public Date getExpectPaymentDate() {
        return expectPaymentDate;
    }

    public void setExpectPaymentDate(Date expectPaymentDate) {
        this.expectPaymentDate = expectPaymentDate;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public Integer getOperateAccount() {
        return operateAccount;
    }

    public void setOperateAccount(Integer operateAccount) {
        this.operateAccount = operateAccount;
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

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
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
        ChangeApplication other = (ChangeApplication) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getApplicantId() == null ? other.getApplicantId() == null : this.getApplicantId().equals(other.getApplicantId()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getCostMoney() == null ? other.getCostMoney() == null : this.getCostMoney().equals(other.getCostMoney()))
            && (this.getSolver() == null ? other.getSolver() == null : this.getSolver().equals(other.getSolver()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTicketChannel() == null ? other.getTicketChannel() == null : this.getTicketChannel().equals(other.getTicketChannel()))
            && (this.getApplyStatus() == null ? other.getApplyStatus() == null : this.getApplyStatus().equals(other.getApplyStatus()))
            && (this.getFinanceBackId() == null ? other.getFinanceBackId() == null : this.getFinanceBackId().equals(other.getFinanceBackId()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getRejectReason() == null ? other.getRejectReason() == null : this.getRejectReason().equals(other.getRejectReason()))
            && (this.getRefundAgreementId() == null ? other.getRefundAgreementId() == null : this.getRefundAgreementId().equals(other.getRefundAgreementId()))
            && (this.getBankOfDeposit() == null ? other.getBankOfDeposit() == null : this.getBankOfDeposit().equals(other.getBankOfDeposit()))
            && (this.getBankAccount() == null ? other.getBankAccount() == null : this.getBankAccount().equals(other.getBankAccount()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getExpectPaymentDate() == null ? other.getExpectPaymentDate() == null : this.getExpectPaymentDate().equals(other.getExpectPaymentDate()))
            && (this.getOperateDate() == null ? other.getOperateDate() == null : this.getOperateDate().equals(other.getOperateDate()))
            && (this.getOperateAccount() == null ? other.getOperateAccount() == null : this.getOperateAccount().equals(other.getOperateAccount()))
            && (this.getRecordTime() == null ? other.getRecordTime() == null : this.getRecordTime().equals(other.getRecordTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getApplicationId() == null ? other.getApplicationId() == null : this.getApplicationId().equals(other.getApplicationId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getApplicantId() == null) ? 0 : getApplicantId().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getCostMoney() == null) ? 0 : getCostMoney().hashCode());
        result = prime * result + ((getSolver() == null) ? 0 : getSolver().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTicketChannel() == null) ? 0 : getTicketChannel().hashCode());
        result = prime * result + ((getApplyStatus() == null) ? 0 : getApplyStatus().hashCode());
        result = prime * result + ((getFinanceBackId() == null) ? 0 : getFinanceBackId().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getRejectReason() == null) ? 0 : getRejectReason().hashCode());
        result = prime * result + ((getRefundAgreementId() == null) ? 0 : getRefundAgreementId().hashCode());
        result = prime * result + ((getBankOfDeposit() == null) ? 0 : getBankOfDeposit().hashCode());
        result = prime * result + ((getBankAccount() == null) ? 0 : getBankAccount().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getExpectPaymentDate() == null) ? 0 : getExpectPaymentDate().hashCode());
        result = prime * result + ((getOperateDate() == null) ? 0 : getOperateDate().hashCode());
        result = prime * result + ((getOperateAccount() == null) ? 0 : getOperateAccount().hashCode());
        result = prime * result + ((getRecordTime() == null) ? 0 : getRecordTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", applicantId=").append(applicantId);
        sb.append(", money=").append(money);
        sb.append(", costMoney=").append(costMoney);
        sb.append(", solver=").append(solver);
        sb.append(", type=").append(type);
        sb.append(", ticketChannel=").append(ticketChannel);
        sb.append(", applyStatus=").append(applyStatus);
        sb.append(", financeBackId=").append(financeBackId);
        sb.append(", reason=").append(reason);
        sb.append(", rejectReason=").append(rejectReason);
        sb.append(", refundAgreementId=").append(refundAgreementId);
        sb.append(", bankOfDeposit=").append(bankOfDeposit);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", expectPaymentDate=").append(expectPaymentDate);
        sb.append(", operateDate=").append(operateDate);
        sb.append(", operateAccount=").append(operateAccount);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}