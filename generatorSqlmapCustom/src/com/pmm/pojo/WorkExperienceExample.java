package com.pmm.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorkExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkExperienceExample() {
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

        public Criteria andWorkExperienceIdIsNull() {
            addCriterion("work_experience_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdIsNotNull() {
            addCriterion("work_experience_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdEqualTo(String value) {
            addCriterion("work_experience_id =", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdNotEqualTo(String value) {
            addCriterion("work_experience_id <>", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdGreaterThan(String value) {
            addCriterion("work_experience_id >", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_id >=", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdLessThan(String value) {
            addCriterion("work_experience_id <", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdLessThanOrEqualTo(String value) {
            addCriterion("work_experience_id <=", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdLike(String value) {
            addCriterion("work_experience_id like", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdNotLike(String value) {
            addCriterion("work_experience_id not like", value, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdIn(List<String> values) {
            addCriterion("work_experience_id in", values, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdNotIn(List<String> values) {
            addCriterion("work_experience_id not in", values, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdBetween(String value1, String value2) {
            addCriterion("work_experience_id between", value1, value2, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIdNotBetween(String value1, String value2) {
            addCriterion("work_experience_id not between", value1, value2, "workExperienceId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyIsNull() {
            addCriterion("work_experience_company is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyIsNotNull() {
            addCriterion("work_experience_company is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyEqualTo(String value) {
            addCriterion("work_experience_company =", value, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyNotEqualTo(String value) {
            addCriterion("work_experience_company <>", value, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyGreaterThan(String value) {
            addCriterion("work_experience_company >", value, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_company >=", value, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyLessThan(String value) {
            addCriterion("work_experience_company <", value, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyLessThanOrEqualTo(String value) {
            addCriterion("work_experience_company <=", value, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyLike(String value) {
            addCriterion("work_experience_company like", value, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyNotLike(String value) {
            addCriterion("work_experience_company not like", value, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyIn(List<String> values) {
            addCriterion("work_experience_company in", values, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyNotIn(List<String> values) {
            addCriterion("work_experience_company not in", values, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyBetween(String value1, String value2) {
            addCriterion("work_experience_company between", value1, value2, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceCompanyNotBetween(String value1, String value2) {
            addCriterion("work_experience_company not between", value1, value2, "workExperienceCompany");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentIsNull() {
            addCriterion("work_experience_department is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentIsNotNull() {
            addCriterion("work_experience_department is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentEqualTo(String value) {
            addCriterion("work_experience_department =", value, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentNotEqualTo(String value) {
            addCriterion("work_experience_department <>", value, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentGreaterThan(String value) {
            addCriterion("work_experience_department >", value, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_department >=", value, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentLessThan(String value) {
            addCriterion("work_experience_department <", value, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentLessThanOrEqualTo(String value) {
            addCriterion("work_experience_department <=", value, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentLike(String value) {
            addCriterion("work_experience_department like", value, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentNotLike(String value) {
            addCriterion("work_experience_department not like", value, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentIn(List<String> values) {
            addCriterion("work_experience_department in", values, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentNotIn(List<String> values) {
            addCriterion("work_experience_department not in", values, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentBetween(String value1, String value2) {
            addCriterion("work_experience_department between", value1, value2, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceDepartmentNotBetween(String value1, String value2) {
            addCriterion("work_experience_department not between", value1, value2, "workExperienceDepartment");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityIsNull() {
            addCriterion("work_experience_responsibility is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityIsNotNull() {
            addCriterion("work_experience_responsibility is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityEqualTo(String value) {
            addCriterion("work_experience_responsibility =", value, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityNotEqualTo(String value) {
            addCriterion("work_experience_responsibility <>", value, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityGreaterThan(String value) {
            addCriterion("work_experience_responsibility >", value, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_responsibility >=", value, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityLessThan(String value) {
            addCriterion("work_experience_responsibility <", value, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityLessThanOrEqualTo(String value) {
            addCriterion("work_experience_responsibility <=", value, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityLike(String value) {
            addCriterion("work_experience_responsibility like", value, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityNotLike(String value) {
            addCriterion("work_experience_responsibility not like", value, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityIn(List<String> values) {
            addCriterion("work_experience_responsibility in", values, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityNotIn(List<String> values) {
            addCriterion("work_experience_responsibility not in", values, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityBetween(String value1, String value2) {
            addCriterion("work_experience_responsibility between", value1, value2, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceResponsibilityNotBetween(String value1, String value2) {
            addCriterion("work_experience_responsibility not between", value1, value2, "workExperienceResponsibility");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeIsNull() {
            addCriterion("work_experience_starttime is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeIsNotNull() {
            addCriterion("work_experience_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeEqualTo(String value) {
            addCriterion("work_experience_starttime =", value, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeNotEqualTo(String value) {
            addCriterion("work_experience_starttime <>", value, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeGreaterThan(String value) {
            addCriterion("work_experience_starttime >", value, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_starttime >=", value, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeLessThan(String value) {
            addCriterion("work_experience_starttime <", value, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeLessThanOrEqualTo(String value) {
            addCriterion("work_experience_starttime <=", value, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeLike(String value) {
            addCriterion("work_experience_starttime like", value, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeNotLike(String value) {
            addCriterion("work_experience_starttime not like", value, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeIn(List<String> values) {
            addCriterion("work_experience_starttime in", values, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeNotIn(List<String> values) {
            addCriterion("work_experience_starttime not in", values, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeBetween(String value1, String value2) {
            addCriterion("work_experience_starttime between", value1, value2, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceStarttimeNotBetween(String value1, String value2) {
            addCriterion("work_experience_starttime not between", value1, value2, "workExperienceStarttime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeIsNull() {
            addCriterion("work_experience_overtime is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeIsNotNull() {
            addCriterion("work_experience_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeEqualTo(String value) {
            addCriterion("work_experience_overtime =", value, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeNotEqualTo(String value) {
            addCriterion("work_experience_overtime <>", value, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeGreaterThan(String value) {
            addCriterion("work_experience_overtime >", value, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_overtime >=", value, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeLessThan(String value) {
            addCriterion("work_experience_overtime <", value, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeLessThanOrEqualTo(String value) {
            addCriterion("work_experience_overtime <=", value, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeLike(String value) {
            addCriterion("work_experience_overtime like", value, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeNotLike(String value) {
            addCriterion("work_experience_overtime not like", value, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeIn(List<String> values) {
            addCriterion("work_experience_overtime in", values, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeNotIn(List<String> values) {
            addCriterion("work_experience_overtime not in", values, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeBetween(String value1, String value2) {
            addCriterion("work_experience_overtime between", value1, value2, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceOvertimeNotBetween(String value1, String value2) {
            addCriterion("work_experience_overtime not between", value1, value2, "workExperienceOvertime");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdIsNull() {
            addCriterion("personal_messages_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdIsNotNull() {
            addCriterion("personal_messages_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdEqualTo(String value) {
            addCriterion("personal_messages_id =", value, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdNotEqualTo(String value) {
            addCriterion("personal_messages_id <>", value, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdGreaterThan(String value) {
            addCriterion("personal_messages_id >", value, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdGreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_id >=", value, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdLessThan(String value) {
            addCriterion("personal_messages_id <", value, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdLessThanOrEqualTo(String value) {
            addCriterion("personal_messages_id <=", value, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdLike(String value) {
            addCriterion("personal_messages_id like", value, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdNotLike(String value) {
            addCriterion("personal_messages_id not like", value, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdIn(List<String> values) {
            addCriterion("personal_messages_id in", values, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdNotIn(List<String> values) {
            addCriterion("personal_messages_id not in", values, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdBetween(String value1, String value2) {
            addCriterion("personal_messages_id between", value1, value2, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdNotBetween(String value1, String value2) {
            addCriterion("personal_messages_id not between", value1, value2, "personalMessagesId");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1IsNull() {
            addCriterion("work_experience_reserved1 is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1IsNotNull() {
            addCriterion("work_experience_reserved1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1EqualTo(String value) {
            addCriterion("work_experience_reserved1 =", value, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1NotEqualTo(String value) {
            addCriterion("work_experience_reserved1 <>", value, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1GreaterThan(String value) {
            addCriterion("work_experience_reserved1 >", value, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved1 >=", value, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1LessThan(String value) {
            addCriterion("work_experience_reserved1 <", value, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1LessThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved1 <=", value, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1Like(String value) {
            addCriterion("work_experience_reserved1 like", value, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1NotLike(String value) {
            addCriterion("work_experience_reserved1 not like", value, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1In(List<String> values) {
            addCriterion("work_experience_reserved1 in", values, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1NotIn(List<String> values) {
            addCriterion("work_experience_reserved1 not in", values, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1Between(String value1, String value2) {
            addCriterion("work_experience_reserved1 between", value1, value2, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved1NotBetween(String value1, String value2) {
            addCriterion("work_experience_reserved1 not between", value1, value2, "workExperienceReserved1");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2IsNull() {
            addCriterion("work_experience_reserved2 is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2IsNotNull() {
            addCriterion("work_experience_reserved2 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2EqualTo(String value) {
            addCriterion("work_experience_reserved2 =", value, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2NotEqualTo(String value) {
            addCriterion("work_experience_reserved2 <>", value, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2GreaterThan(String value) {
            addCriterion("work_experience_reserved2 >", value, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved2 >=", value, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2LessThan(String value) {
            addCriterion("work_experience_reserved2 <", value, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2LessThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved2 <=", value, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2Like(String value) {
            addCriterion("work_experience_reserved2 like", value, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2NotLike(String value) {
            addCriterion("work_experience_reserved2 not like", value, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2In(List<String> values) {
            addCriterion("work_experience_reserved2 in", values, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2NotIn(List<String> values) {
            addCriterion("work_experience_reserved2 not in", values, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2Between(String value1, String value2) {
            addCriterion("work_experience_reserved2 between", value1, value2, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved2NotBetween(String value1, String value2) {
            addCriterion("work_experience_reserved2 not between", value1, value2, "workExperienceReserved2");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3IsNull() {
            addCriterion("work_experience_reserved3 is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3IsNotNull() {
            addCriterion("work_experience_reserved3 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3EqualTo(String value) {
            addCriterion("work_experience_reserved3 =", value, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3NotEqualTo(String value) {
            addCriterion("work_experience_reserved3 <>", value, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3GreaterThan(String value) {
            addCriterion("work_experience_reserved3 >", value, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3GreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved3 >=", value, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3LessThan(String value) {
            addCriterion("work_experience_reserved3 <", value, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3LessThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved3 <=", value, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3Like(String value) {
            addCriterion("work_experience_reserved3 like", value, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3NotLike(String value) {
            addCriterion("work_experience_reserved3 not like", value, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3In(List<String> values) {
            addCriterion("work_experience_reserved3 in", values, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3NotIn(List<String> values) {
            addCriterion("work_experience_reserved3 not in", values, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3Between(String value1, String value2) {
            addCriterion("work_experience_reserved3 between", value1, value2, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved3NotBetween(String value1, String value2) {
            addCriterion("work_experience_reserved3 not between", value1, value2, "workExperienceReserved3");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4IsNull() {
            addCriterion("work_experience_reserved4 is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4IsNotNull() {
            addCriterion("work_experience_reserved4 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4EqualTo(String value) {
            addCriterion("work_experience_reserved4 =", value, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4NotEqualTo(String value) {
            addCriterion("work_experience_reserved4 <>", value, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4GreaterThan(String value) {
            addCriterion("work_experience_reserved4 >", value, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4GreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved4 >=", value, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4LessThan(String value) {
            addCriterion("work_experience_reserved4 <", value, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4LessThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved4 <=", value, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4Like(String value) {
            addCriterion("work_experience_reserved4 like", value, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4NotLike(String value) {
            addCriterion("work_experience_reserved4 not like", value, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4In(List<String> values) {
            addCriterion("work_experience_reserved4 in", values, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4NotIn(List<String> values) {
            addCriterion("work_experience_reserved4 not in", values, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4Between(String value1, String value2) {
            addCriterion("work_experience_reserved4 between", value1, value2, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved4NotBetween(String value1, String value2) {
            addCriterion("work_experience_reserved4 not between", value1, value2, "workExperienceReserved4");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5IsNull() {
            addCriterion("work_experience_reserved5 is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5IsNotNull() {
            addCriterion("work_experience_reserved5 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5EqualTo(String value) {
            addCriterion("work_experience_reserved5 =", value, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5NotEqualTo(String value) {
            addCriterion("work_experience_reserved5 <>", value, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5GreaterThan(String value) {
            addCriterion("work_experience_reserved5 >", value, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5GreaterThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved5 >=", value, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5LessThan(String value) {
            addCriterion("work_experience_reserved5 <", value, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5LessThanOrEqualTo(String value) {
            addCriterion("work_experience_reserved5 <=", value, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5Like(String value) {
            addCriterion("work_experience_reserved5 like", value, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5NotLike(String value) {
            addCriterion("work_experience_reserved5 not like", value, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5In(List<String> values) {
            addCriterion("work_experience_reserved5 in", values, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5NotIn(List<String> values) {
            addCriterion("work_experience_reserved5 not in", values, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5Between(String value1, String value2) {
            addCriterion("work_experience_reserved5 between", value1, value2, "workExperienceReserved5");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceReserved5NotBetween(String value1, String value2) {
            addCriterion("work_experience_reserved5 not between", value1, value2, "workExperienceReserved5");
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