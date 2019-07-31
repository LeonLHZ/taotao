package com.pmm.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIsNull() {
            addCriterion("user_username is null");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIsNotNull() {
            addCriterion("user_username is not null");
            return (Criteria) this;
        }

        public Criteria andUserUsernameEqualTo(String value) {
            addCriterion("user_username =", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotEqualTo(String value) {
            addCriterion("user_username <>", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameGreaterThan(String value) {
            addCriterion("user_username >", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("user_username >=", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLessThan(String value) {
            addCriterion("user_username <", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLessThanOrEqualTo(String value) {
            addCriterion("user_username <=", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLike(String value) {
            addCriterion("user_username like", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotLike(String value) {
            addCriterion("user_username not like", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIn(List<String> values) {
            addCriterion("user_username in", values, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotIn(List<String> values) {
            addCriterion("user_username not in", values, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameBetween(String value1, String value2) {
            addCriterion("user_username between", value1, value2, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotBetween(String value1, String value2) {
            addCriterion("user_username not between", value1, value2, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserReserved2IsNull() {
            addCriterion("user_reserved2 is null");
            return (Criteria) this;
        }

        public Criteria andUserReserved2IsNotNull() {
            addCriterion("user_reserved2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserReserved2EqualTo(String value) {
            addCriterion("user_reserved2 =", value, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2NotEqualTo(String value) {
            addCriterion("user_reserved2 <>", value, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2GreaterThan(String value) {
            addCriterion("user_reserved2 >", value, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("user_reserved2 >=", value, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2LessThan(String value) {
            addCriterion("user_reserved2 <", value, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2LessThanOrEqualTo(String value) {
            addCriterion("user_reserved2 <=", value, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2Like(String value) {
            addCriterion("user_reserved2 like", value, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2NotLike(String value) {
            addCriterion("user_reserved2 not like", value, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2In(List<String> values) {
            addCriterion("user_reserved2 in", values, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2NotIn(List<String> values) {
            addCriterion("user_reserved2 not in", values, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2Between(String value1, String value2) {
            addCriterion("user_reserved2 between", value1, value2, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved2NotBetween(String value1, String value2) {
            addCriterion("user_reserved2 not between", value1, value2, "userReserved2");
            return (Criteria) this;
        }

        public Criteria andUserReserved3IsNull() {
            addCriterion("user_reserved3 is null");
            return (Criteria) this;
        }

        public Criteria andUserReserved3IsNotNull() {
            addCriterion("user_reserved3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserReserved3EqualTo(String value) {
            addCriterion("user_reserved3 =", value, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3NotEqualTo(String value) {
            addCriterion("user_reserved3 <>", value, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3GreaterThan(String value) {
            addCriterion("user_reserved3 >", value, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3GreaterThanOrEqualTo(String value) {
            addCriterion("user_reserved3 >=", value, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3LessThan(String value) {
            addCriterion("user_reserved3 <", value, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3LessThanOrEqualTo(String value) {
            addCriterion("user_reserved3 <=", value, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3Like(String value) {
            addCriterion("user_reserved3 like", value, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3NotLike(String value) {
            addCriterion("user_reserved3 not like", value, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3In(List<String> values) {
            addCriterion("user_reserved3 in", values, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3NotIn(List<String> values) {
            addCriterion("user_reserved3 not in", values, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3Between(String value1, String value2) {
            addCriterion("user_reserved3 between", value1, value2, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved3NotBetween(String value1, String value2) {
            addCriterion("user_reserved3 not between", value1, value2, "userReserved3");
            return (Criteria) this;
        }

        public Criteria andUserReserved4IsNull() {
            addCriterion("user_reserved4 is null");
            return (Criteria) this;
        }

        public Criteria andUserReserved4IsNotNull() {
            addCriterion("user_reserved4 is not null");
            return (Criteria) this;
        }

        public Criteria andUserReserved4EqualTo(String value) {
            addCriterion("user_reserved4 =", value, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4NotEqualTo(String value) {
            addCriterion("user_reserved4 <>", value, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4GreaterThan(String value) {
            addCriterion("user_reserved4 >", value, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4GreaterThanOrEqualTo(String value) {
            addCriterion("user_reserved4 >=", value, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4LessThan(String value) {
            addCriterion("user_reserved4 <", value, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4LessThanOrEqualTo(String value) {
            addCriterion("user_reserved4 <=", value, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4Like(String value) {
            addCriterion("user_reserved4 like", value, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4NotLike(String value) {
            addCriterion("user_reserved4 not like", value, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4In(List<String> values) {
            addCriterion("user_reserved4 in", values, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4NotIn(List<String> values) {
            addCriterion("user_reserved4 not in", values, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4Between(String value1, String value2) {
            addCriterion("user_reserved4 between", value1, value2, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved4NotBetween(String value1, String value2) {
            addCriterion("user_reserved4 not between", value1, value2, "userReserved4");
            return (Criteria) this;
        }

        public Criteria andUserReserved5IsNull() {
            addCriterion("user_reserved5 is null");
            return (Criteria) this;
        }

        public Criteria andUserReserved5IsNotNull() {
            addCriterion("user_reserved5 is not null");
            return (Criteria) this;
        }

        public Criteria andUserReserved5EqualTo(String value) {
            addCriterion("user_reserved5 =", value, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5NotEqualTo(String value) {
            addCriterion("user_reserved5 <>", value, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5GreaterThan(String value) {
            addCriterion("user_reserved5 >", value, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5GreaterThanOrEqualTo(String value) {
            addCriterion("user_reserved5 >=", value, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5LessThan(String value) {
            addCriterion("user_reserved5 <", value, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5LessThanOrEqualTo(String value) {
            addCriterion("user_reserved5 <=", value, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5Like(String value) {
            addCriterion("user_reserved5 like", value, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5NotLike(String value) {
            addCriterion("user_reserved5 not like", value, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5In(List<String> values) {
            addCriterion("user_reserved5 in", values, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5NotIn(List<String> values) {
            addCriterion("user_reserved5 not in", values, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5Between(String value1, String value2) {
            addCriterion("user_reserved5 between", value1, value2, "userReserved5");
            return (Criteria) this;
        }

        public Criteria andUserReserved5NotBetween(String value1, String value2) {
            addCriterion("user_reserved5 not between", value1, value2, "userReserved5");
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