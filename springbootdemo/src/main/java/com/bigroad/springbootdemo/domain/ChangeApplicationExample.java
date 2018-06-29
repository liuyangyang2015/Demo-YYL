package com.bigroad.springbootdemo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChangeApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangeApplicationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIsNull() {
            addCriterion("applicant_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIsNotNull() {
            addCriterion("applicant_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantIdEqualTo(Integer value) {
            addCriterion("applicant_id =", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotEqualTo(Integer value) {
            addCriterion("applicant_id <>", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdGreaterThan(Integer value) {
            addCriterion("applicant_id >", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicant_id >=", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLessThan(Integer value) {
            addCriterion("applicant_id <", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLessThanOrEqualTo(Integer value) {
            addCriterion("applicant_id <=", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIn(List<Integer> values) {
            addCriterion("applicant_id in", values, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotIn(List<Integer> values) {
            addCriterion("applicant_id not in", values, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdBetween(Integer value1, Integer value2) {
            addCriterion("applicant_id between", value1, value2, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("applicant_id not between", value1, value2, "applicantId");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andCostMoneyIsNull() {
            addCriterion("cost_money is null");
            return (Criteria) this;
        }

        public Criteria andCostMoneyIsNotNull() {
            addCriterion("cost_money is not null");
            return (Criteria) this;
        }

        public Criteria andCostMoneyEqualTo(BigDecimal value) {
            addCriterion("cost_money =", value, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyNotEqualTo(BigDecimal value) {
            addCriterion("cost_money <>", value, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyGreaterThan(BigDecimal value) {
            addCriterion("cost_money >", value, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_money >=", value, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyLessThan(BigDecimal value) {
            addCriterion("cost_money <", value, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_money <=", value, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyIn(List<BigDecimal> values) {
            addCriterion("cost_money in", values, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyNotIn(List<BigDecimal> values) {
            addCriterion("cost_money not in", values, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_money between", value1, value2, "costMoney");
            return (Criteria) this;
        }

        public Criteria andCostMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_money not between", value1, value2, "costMoney");
            return (Criteria) this;
        }

        public Criteria andSolverIsNull() {
            addCriterion("solver is null");
            return (Criteria) this;
        }

        public Criteria andSolverIsNotNull() {
            addCriterion("solver is not null");
            return (Criteria) this;
        }

        public Criteria andSolverEqualTo(Byte value) {
            addCriterion("solver =", value, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverNotEqualTo(Byte value) {
            addCriterion("solver <>", value, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverGreaterThan(Byte value) {
            addCriterion("solver >", value, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverGreaterThanOrEqualTo(Byte value) {
            addCriterion("solver >=", value, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverLessThan(Byte value) {
            addCriterion("solver <", value, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverLessThanOrEqualTo(Byte value) {
            addCriterion("solver <=", value, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverIn(List<Byte> values) {
            addCriterion("solver in", values, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverNotIn(List<Byte> values) {
            addCriterion("solver not in", values, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverBetween(Byte value1, Byte value2) {
            addCriterion("solver between", value1, value2, "solver");
            return (Criteria) this;
        }

        public Criteria andSolverNotBetween(Byte value1, Byte value2) {
            addCriterion("solver not between", value1, value2, "solver");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTicketChannelIsNull() {
            addCriterion("ticket_channel is null");
            return (Criteria) this;
        }

        public Criteria andTicketChannelIsNotNull() {
            addCriterion("ticket_channel is not null");
            return (Criteria) this;
        }

        public Criteria andTicketChannelEqualTo(Byte value) {
            addCriterion("ticket_channel =", value, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelNotEqualTo(Byte value) {
            addCriterion("ticket_channel <>", value, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelGreaterThan(Byte value) {
            addCriterion("ticket_channel >", value, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("ticket_channel >=", value, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelLessThan(Byte value) {
            addCriterion("ticket_channel <", value, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelLessThanOrEqualTo(Byte value) {
            addCriterion("ticket_channel <=", value, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelIn(List<Byte> values) {
            addCriterion("ticket_channel in", values, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelNotIn(List<Byte> values) {
            addCriterion("ticket_channel not in", values, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelBetween(Byte value1, Byte value2) {
            addCriterion("ticket_channel between", value1, value2, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andTicketChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("ticket_channel not between", value1, value2, "ticketChannel");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNull() {
            addCriterion("apply_status is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNotNull() {
            addCriterion("apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusEqualTo(Byte value) {
            addCriterion("apply_status =", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotEqualTo(Byte value) {
            addCriterion("apply_status <>", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThan(Byte value) {
            addCriterion("apply_status >", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("apply_status >=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThan(Byte value) {
            addCriterion("apply_status <", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("apply_status <=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIn(List<Byte> values) {
            addCriterion("apply_status in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotIn(List<Byte> values) {
            addCriterion("apply_status not in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusBetween(Byte value1, Byte value2) {
            addCriterion("apply_status between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("apply_status not between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdIsNull() {
            addCriterion("finance_back_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdIsNotNull() {
            addCriterion("finance_back_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdEqualTo(Integer value) {
            addCriterion("finance_back_id =", value, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdNotEqualTo(Integer value) {
            addCriterion("finance_back_id <>", value, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdGreaterThan(Integer value) {
            addCriterion("finance_back_id >", value, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_back_id >=", value, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdLessThan(Integer value) {
            addCriterion("finance_back_id <", value, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdLessThanOrEqualTo(Integer value) {
            addCriterion("finance_back_id <=", value, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdIn(List<Integer> values) {
            addCriterion("finance_back_id in", values, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdNotIn(List<Integer> values) {
            addCriterion("finance_back_id not in", values, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdBetween(Integer value1, Integer value2) {
            addCriterion("finance_back_id between", value1, value2, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andFinanceBackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_back_id not between", value1, value2, "financeBackId");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonIsNull() {
            addCriterion("reject_reason is null");
            return (Criteria) this;
        }

        public Criteria andRejectReasonIsNotNull() {
            addCriterion("reject_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRejectReasonEqualTo(String value) {
            addCriterion("reject_reason =", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotEqualTo(String value) {
            addCriterion("reject_reason <>", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonGreaterThan(String value) {
            addCriterion("reject_reason >", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reject_reason >=", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLessThan(String value) {
            addCriterion("reject_reason <", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLessThanOrEqualTo(String value) {
            addCriterion("reject_reason <=", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLike(String value) {
            addCriterion("reject_reason like", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotLike(String value) {
            addCriterion("reject_reason not like", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonIn(List<String> values) {
            addCriterion("reject_reason in", values, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotIn(List<String> values) {
            addCriterion("reject_reason not in", values, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonBetween(String value1, String value2) {
            addCriterion("reject_reason between", value1, value2, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotBetween(String value1, String value2) {
            addCriterion("reject_reason not between", value1, value2, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdIsNull() {
            addCriterion("refund_agreement_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdIsNotNull() {
            addCriterion("refund_agreement_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdEqualTo(Integer value) {
            addCriterion("refund_agreement_id =", value, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdNotEqualTo(Integer value) {
            addCriterion("refund_agreement_id <>", value, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdGreaterThan(Integer value) {
            addCriterion("refund_agreement_id >", value, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_agreement_id >=", value, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdLessThan(Integer value) {
            addCriterion("refund_agreement_id <", value, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_agreement_id <=", value, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdIn(List<Integer> values) {
            addCriterion("refund_agreement_id in", values, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdNotIn(List<Integer> values) {
            addCriterion("refund_agreement_id not in", values, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_agreement_id between", value1, value2, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andRefundAgreementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_agreement_id not between", value1, value2, "refundAgreementId");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositIsNull() {
            addCriterion("bank_of_deposit is null");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositIsNotNull() {
            addCriterion("bank_of_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositEqualTo(String value) {
            addCriterion("bank_of_deposit =", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotEqualTo(String value) {
            addCriterion("bank_of_deposit <>", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositGreaterThan(String value) {
            addCriterion("bank_of_deposit >", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositGreaterThanOrEqualTo(String value) {
            addCriterion("bank_of_deposit >=", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositLessThan(String value) {
            addCriterion("bank_of_deposit <", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositLessThanOrEqualTo(String value) {
            addCriterion("bank_of_deposit <=", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositLike(String value) {
            addCriterion("bank_of_deposit like", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotLike(String value) {
            addCriterion("bank_of_deposit not like", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositIn(List<String> values) {
            addCriterion("bank_of_deposit in", values, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotIn(List<String> values) {
            addCriterion("bank_of_deposit not in", values, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositBetween(String value1, String value2) {
            addCriterion("bank_of_deposit between", value1, value2, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotBetween(String value1, String value2) {
            addCriterion("bank_of_deposit not between", value1, value2, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("card_number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("card_number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateIsNull() {
            addCriterion("expect_payment_date is null");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateIsNotNull() {
            addCriterion("expect_payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("expect_payment_date =", value, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expect_payment_date <>", value, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expect_payment_date >", value, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expect_payment_date >=", value, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("expect_payment_date <", value, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expect_payment_date <=", value, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("expect_payment_date in", values, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expect_payment_date not in", values, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expect_payment_date between", value1, value2, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andExpectPaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expect_payment_date not between", value1, value2, "expectPaymentDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNull() {
            addCriterion("operate_date is null");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNotNull() {
            addCriterion("operate_date is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDateEqualTo(Date value) {
            addCriterion("operate_date =", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotEqualTo(Date value) {
            addCriterion("operate_date <>", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThan(Date value) {
            addCriterion("operate_date >", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_date >=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThan(Date value) {
            addCriterion("operate_date <", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThanOrEqualTo(Date value) {
            addCriterion("operate_date <=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateIn(List<Date> values) {
            addCriterion("operate_date in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotIn(List<Date> values) {
            addCriterion("operate_date not in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateBetween(Date value1, Date value2) {
            addCriterion("operate_date between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotBetween(Date value1, Date value2) {
            addCriterion("operate_date not between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateAccountIsNull() {
            addCriterion("operate_account is null");
            return (Criteria) this;
        }

        public Criteria andOperateAccountIsNotNull() {
            addCriterion("operate_account is not null");
            return (Criteria) this;
        }

        public Criteria andOperateAccountEqualTo(Integer value) {
            addCriterion("operate_account =", value, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountNotEqualTo(Integer value) {
            addCriterion("operate_account <>", value, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountGreaterThan(Integer value) {
            addCriterion("operate_account >", value, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_account >=", value, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountLessThan(Integer value) {
            addCriterion("operate_account <", value, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountLessThanOrEqualTo(Integer value) {
            addCriterion("operate_account <=", value, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountIn(List<Integer> values) {
            addCriterion("operate_account in", values, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountNotIn(List<Integer> values) {
            addCriterion("operate_account not in", values, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountBetween(Integer value1, Integer value2) {
            addCriterion("operate_account between", value1, value2, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andOperateAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_account not between", value1, value2, "operateAccount");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(Integer value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(Integer value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(Integer value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(Integer value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(Integer value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<Integer> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<Integer> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(Integer value1, Integer value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}