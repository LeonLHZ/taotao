package com.pmm.pojo;

import java.util.ArrayList;
import java.util.List;

public class PersonalMessagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalMessagesExample() {
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

        public Criteria andPersonalMessagesNameIsNull() {
            addCriterion("personal_messages_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameIsNotNull() {
            addCriterion("personal_messages_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameEqualTo(String value) {
            addCriterion("personal_messages_name =", value, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameNotEqualTo(String value) {
            addCriterion("personal_messages_name <>", value, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameGreaterThan(String value) {
            addCriterion("personal_messages_name >", value, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameGreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_name >=", value, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameLessThan(String value) {
            addCriterion("personal_messages_name <", value, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameLessThanOrEqualTo(String value) {
            addCriterion("personal_messages_name <=", value, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameLike(String value) {
            addCriterion("personal_messages_name like", value, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameNotLike(String value) {
            addCriterion("personal_messages_name not like", value, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameIn(List<String> values) {
            addCriterion("personal_messages_name in", values, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameNotIn(List<String> values) {
            addCriterion("personal_messages_name not in", values, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameBetween(String value1, String value2) {
            addCriterion("personal_messages_name between", value1, value2, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNameNotBetween(String value1, String value2) {
            addCriterion("personal_messages_name not between", value1, value2, "personalMessagesName");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexIsNull() {
            addCriterion("personal_messages_sex is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexIsNotNull() {
            addCriterion("personal_messages_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexEqualTo(String value) {
            addCriterion("personal_messages_sex =", value, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexNotEqualTo(String value) {
            addCriterion("personal_messages_sex <>", value, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexGreaterThan(String value) {
            addCriterion("personal_messages_sex >", value, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexGreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_sex >=", value, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexLessThan(String value) {
            addCriterion("personal_messages_sex <", value, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexLessThanOrEqualTo(String value) {
            addCriterion("personal_messages_sex <=", value, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexLike(String value) {
            addCriterion("personal_messages_sex like", value, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexNotLike(String value) {
            addCriterion("personal_messages_sex not like", value, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexIn(List<String> values) {
            addCriterion("personal_messages_sex in", values, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexNotIn(List<String> values) {
            addCriterion("personal_messages_sex not in", values, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexBetween(String value1, String value2) {
            addCriterion("personal_messages_sex between", value1, value2, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesSexNotBetween(String value1, String value2) {
            addCriterion("personal_messages_sex not between", value1, value2, "personalMessagesSex");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldIsNull() {
            addCriterion("personal_messages_old is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldIsNotNull() {
            addCriterion("personal_messages_old is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldEqualTo(String value) {
            addCriterion("personal_messages_old =", value, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldNotEqualTo(String value) {
            addCriterion("personal_messages_old <>", value, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldGreaterThan(String value) {
            addCriterion("personal_messages_old >", value, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldGreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_old >=", value, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldLessThan(String value) {
            addCriterion("personal_messages_old <", value, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldLessThanOrEqualTo(String value) {
            addCriterion("personal_messages_old <=", value, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldLike(String value) {
            addCriterion("personal_messages_old like", value, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldNotLike(String value) {
            addCriterion("personal_messages_old not like", value, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldIn(List<String> values) {
            addCriterion("personal_messages_old in", values, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldNotIn(List<String> values) {
            addCriterion("personal_messages_old not in", values, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldBetween(String value1, String value2) {
            addCriterion("personal_messages_old between", value1, value2, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesOldNotBetween(String value1, String value2) {
            addCriterion("personal_messages_old not between", value1, value2, "personalMessagesOld");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneIsNull() {
            addCriterion("personal_messages_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneIsNotNull() {
            addCriterion("personal_messages_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneEqualTo(String value) {
            addCriterion("personal_messages_phone =", value, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneNotEqualTo(String value) {
            addCriterion("personal_messages_phone <>", value, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneGreaterThan(String value) {
            addCriterion("personal_messages_phone >", value, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_phone >=", value, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneLessThan(String value) {
            addCriterion("personal_messages_phone <", value, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneLessThanOrEqualTo(String value) {
            addCriterion("personal_messages_phone <=", value, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneLike(String value) {
            addCriterion("personal_messages_phone like", value, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneNotLike(String value) {
            addCriterion("personal_messages_phone not like", value, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneIn(List<String> values) {
            addCriterion("personal_messages_phone in", values, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneNotIn(List<String> values) {
            addCriterion("personal_messages_phone not in", values, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneBetween(String value1, String value2) {
            addCriterion("personal_messages_phone between", value1, value2, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesPhoneNotBetween(String value1, String value2) {
            addCriterion("personal_messages_phone not between", value1, value2, "personalMessagesPhone");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberIsNull() {
            addCriterion("personal_messages_idcard_number is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberIsNotNull() {
            addCriterion("personal_messages_idcard_number is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberEqualTo(String value) {
            addCriterion("personal_messages_idcard_number =", value, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberNotEqualTo(String value) {
            addCriterion("personal_messages_idcard_number <>", value, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberGreaterThan(String value) {
            addCriterion("personal_messages_idcard_number >", value, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_idcard_number >=", value, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberLessThan(String value) {
            addCriterion("personal_messages_idcard_number <", value, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("personal_messages_idcard_number <=", value, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberLike(String value) {
            addCriterion("personal_messages_idcard_number like", value, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberNotLike(String value) {
            addCriterion("personal_messages_idcard_number not like", value, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberIn(List<String> values) {
            addCriterion("personal_messages_idcard_number in", values, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberNotIn(List<String> values) {
            addCriterion("personal_messages_idcard_number not in", values, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberBetween(String value1, String value2) {
            addCriterion("personal_messages_idcard_number between", value1, value2, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("personal_messages_idcard_number not between", value1, value2, "personalMessagesIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceIsNull() {
            addCriterion("personal_messages_native_place is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceIsNotNull() {
            addCriterion("personal_messages_native_place is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceEqualTo(String value) {
            addCriterion("personal_messages_native_place =", value, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceNotEqualTo(String value) {
            addCriterion("personal_messages_native_place <>", value, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceGreaterThan(String value) {
            addCriterion("personal_messages_native_place >", value, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_native_place >=", value, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceLessThan(String value) {
            addCriterion("personal_messages_native_place <", value, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("personal_messages_native_place <=", value, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceLike(String value) {
            addCriterion("personal_messages_native_place like", value, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceNotLike(String value) {
            addCriterion("personal_messages_native_place not like", value, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceIn(List<String> values) {
            addCriterion("personal_messages_native_place in", values, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceNotIn(List<String> values) {
            addCriterion("personal_messages_native_place not in", values, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceBetween(String value1, String value2) {
            addCriterion("personal_messages_native_place between", value1, value2, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesNativePlaceNotBetween(String value1, String value2) {
            addCriterion("personal_messages_native_place not between", value1, value2, "personalMessagesNativePlace");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressIsNull() {
            addCriterion("personal_messages_current_address is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressIsNotNull() {
            addCriterion("personal_messages_current_address is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressEqualTo(String value) {
            addCriterion("personal_messages_current_address =", value, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressNotEqualTo(String value) {
            addCriterion("personal_messages_current_address <>", value, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressGreaterThan(String value) {
            addCriterion("personal_messages_current_address >", value, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_current_address >=", value, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressLessThan(String value) {
            addCriterion("personal_messages_current_address <", value, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressLessThanOrEqualTo(String value) {
            addCriterion("personal_messages_current_address <=", value, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressLike(String value) {
            addCriterion("personal_messages_current_address like", value, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressNotLike(String value) {
            addCriterion("personal_messages_current_address not like", value, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressIn(List<String> values) {
            addCriterion("personal_messages_current_address in", values, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressNotIn(List<String> values) {
            addCriterion("personal_messages_current_address not in", values, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressBetween(String value1, String value2) {
            addCriterion("personal_messages_current_address between", value1, value2, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesCurrentAddressNotBetween(String value1, String value2) {
            addCriterion("personal_messages_current_address not between", value1, value2, "personalMessagesCurrentAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1IsNull() {
            addCriterion("personal_messages_reserved1 is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1IsNotNull() {
            addCriterion("personal_messages_reserved1 is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1EqualTo(String value) {
            addCriterion("personal_messages_reserved1 =", value, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1NotEqualTo(String value) {
            addCriterion("personal_messages_reserved1 <>", value, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1GreaterThan(String value) {
            addCriterion("personal_messages_reserved1 >", value, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved1 >=", value, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1LessThan(String value) {
            addCriterion("personal_messages_reserved1 <", value, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1LessThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved1 <=", value, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1Like(String value) {
            addCriterion("personal_messages_reserved1 like", value, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1NotLike(String value) {
            addCriterion("personal_messages_reserved1 not like", value, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1In(List<String> values) {
            addCriterion("personal_messages_reserved1 in", values, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1NotIn(List<String> values) {
            addCriterion("personal_messages_reserved1 not in", values, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1Between(String value1, String value2) {
            addCriterion("personal_messages_reserved1 between", value1, value2, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved1NotBetween(String value1, String value2) {
            addCriterion("personal_messages_reserved1 not between", value1, value2, "personalMessagesReserved1");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2IsNull() {
            addCriterion("personal_messages_reserved2 is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2IsNotNull() {
            addCriterion("personal_messages_reserved2 is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2EqualTo(String value) {
            addCriterion("personal_messages_reserved2 =", value, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2NotEqualTo(String value) {
            addCriterion("personal_messages_reserved2 <>", value, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2GreaterThan(String value) {
            addCriterion("personal_messages_reserved2 >", value, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved2 >=", value, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2LessThan(String value) {
            addCriterion("personal_messages_reserved2 <", value, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2LessThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved2 <=", value, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2Like(String value) {
            addCriterion("personal_messages_reserved2 like", value, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2NotLike(String value) {
            addCriterion("personal_messages_reserved2 not like", value, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2In(List<String> values) {
            addCriterion("personal_messages_reserved2 in", values, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2NotIn(List<String> values) {
            addCriterion("personal_messages_reserved2 not in", values, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2Between(String value1, String value2) {
            addCriterion("personal_messages_reserved2 between", value1, value2, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved2NotBetween(String value1, String value2) {
            addCriterion("personal_messages_reserved2 not between", value1, value2, "personalMessagesReserved2");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3IsNull() {
            addCriterion("personal_messages_reserved3 is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3IsNotNull() {
            addCriterion("personal_messages_reserved3 is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3EqualTo(String value) {
            addCriterion("personal_messages_reserved3 =", value, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3NotEqualTo(String value) {
            addCriterion("personal_messages_reserved3 <>", value, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3GreaterThan(String value) {
            addCriterion("personal_messages_reserved3 >", value, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3GreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved3 >=", value, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3LessThan(String value) {
            addCriterion("personal_messages_reserved3 <", value, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3LessThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved3 <=", value, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3Like(String value) {
            addCriterion("personal_messages_reserved3 like", value, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3NotLike(String value) {
            addCriterion("personal_messages_reserved3 not like", value, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3In(List<String> values) {
            addCriterion("personal_messages_reserved3 in", values, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3NotIn(List<String> values) {
            addCriterion("personal_messages_reserved3 not in", values, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3Between(String value1, String value2) {
            addCriterion("personal_messages_reserved3 between", value1, value2, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved3NotBetween(String value1, String value2) {
            addCriterion("personal_messages_reserved3 not between", value1, value2, "personalMessagesReserved3");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4IsNull() {
            addCriterion("personal_messages_reserved4 is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4IsNotNull() {
            addCriterion("personal_messages_reserved4 is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4EqualTo(String value) {
            addCriterion("personal_messages_reserved4 =", value, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4NotEqualTo(String value) {
            addCriterion("personal_messages_reserved4 <>", value, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4GreaterThan(String value) {
            addCriterion("personal_messages_reserved4 >", value, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4GreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved4 >=", value, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4LessThan(String value) {
            addCriterion("personal_messages_reserved4 <", value, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4LessThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved4 <=", value, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4Like(String value) {
            addCriterion("personal_messages_reserved4 like", value, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4NotLike(String value) {
            addCriterion("personal_messages_reserved4 not like", value, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4In(List<String> values) {
            addCriterion("personal_messages_reserved4 in", values, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4NotIn(List<String> values) {
            addCriterion("personal_messages_reserved4 not in", values, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4Between(String value1, String value2) {
            addCriterion("personal_messages_reserved4 between", value1, value2, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved4NotBetween(String value1, String value2) {
            addCriterion("personal_messages_reserved4 not between", value1, value2, "personalMessagesReserved4");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5IsNull() {
            addCriterion("personal_messages_reserved5 is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5IsNotNull() {
            addCriterion("personal_messages_reserved5 is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5EqualTo(String value) {
            addCriterion("personal_messages_reserved5 =", value, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5NotEqualTo(String value) {
            addCriterion("personal_messages_reserved5 <>", value, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5GreaterThan(String value) {
            addCriterion("personal_messages_reserved5 >", value, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5GreaterThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved5 >=", value, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5LessThan(String value) {
            addCriterion("personal_messages_reserved5 <", value, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5LessThanOrEqualTo(String value) {
            addCriterion("personal_messages_reserved5 <=", value, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5Like(String value) {
            addCriterion("personal_messages_reserved5 like", value, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5NotLike(String value) {
            addCriterion("personal_messages_reserved5 not like", value, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5In(List<String> values) {
            addCriterion("personal_messages_reserved5 in", values, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5NotIn(List<String> values) {
            addCriterion("personal_messages_reserved5 not in", values, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5Between(String value1, String value2) {
            addCriterion("personal_messages_reserved5 between", value1, value2, "personalMessagesReserved5");
            return (Criteria) this;
        }

        public Criteria andPersonalMessagesReserved5NotBetween(String value1, String value2) {
            addCriterion("personal_messages_reserved5 not between", value1, value2, "personalMessagesReserved5");
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