package com.ssm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DispatchBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DispatchBillExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andCardNumberIsNull() {
            addCriterion("card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(Integer value) {
            addCriterion("card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(Integer value) {
            addCriterion("card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(Integer value) {
            addCriterion("card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(Integer value) {
            addCriterion("card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(Integer value) {
            addCriterion("card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<Integer> values) {
            addCriterion("card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<Integer> values) {
            addCriterion("card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(Integer value1, Integer value2) {
            addCriterion("card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberIsNull() {
            addCriterion("ticket_number is null");
            return (Criteria) this;
        }

        public Criteria andTicketNumberIsNotNull() {
            addCriterion("ticket_number is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNumberEqualTo(Integer value) {
            addCriterion("ticket_number =", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberNotEqualTo(Integer value) {
            addCriterion("ticket_number <>", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberGreaterThan(Integer value) {
            addCriterion("ticket_number >", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_number >=", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberLessThan(Integer value) {
            addCriterion("ticket_number <", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_number <=", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberIn(List<Integer> values) {
            addCriterion("ticket_number in", values, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberNotIn(List<Integer> values) {
            addCriterion("ticket_number not in", values, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberBetween(Integer value1, Integer value2) {
            addCriterion("ticket_number between", value1, value2, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_number not between", value1, value2, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andConsignerIsNull() {
            addCriterion("consigner is null");
            return (Criteria) this;
        }

        public Criteria andConsignerIsNotNull() {
            addCriterion("consigner is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerEqualTo(String value) {
            addCriterion("consigner =", value, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerNotEqualTo(String value) {
            addCriterion("consigner <>", value, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerGreaterThan(String value) {
            addCriterion("consigner >", value, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerGreaterThanOrEqualTo(String value) {
            addCriterion("consigner >=", value, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerLessThan(String value) {
            addCriterion("consigner <", value, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerLessThanOrEqualTo(String value) {
            addCriterion("consigner <=", value, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerLike(String value) {
            addCriterion("consigner like", value, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerNotLike(String value) {
            addCriterion("consigner not like", value, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerIn(List<String> values) {
            addCriterion("consigner in", values, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerNotIn(List<String> values) {
            addCriterion("consigner not in", values, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerBetween(String value1, String value2) {
            addCriterion("consigner between", value1, value2, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsignerNotBetween(String value1, String value2) {
            addCriterion("consigner not between", value1, value2, "consigner");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andToStandIsNull() {
            addCriterion("to_stand is null");
            return (Criteria) this;
        }

        public Criteria andToStandIsNotNull() {
            addCriterion("to_stand is not null");
            return (Criteria) this;
        }

        public Criteria andToStandEqualTo(String value) {
            addCriterion("to_stand =", value, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandNotEqualTo(String value) {
            addCriterion("to_stand <>", value, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandGreaterThan(String value) {
            addCriterion("to_stand >", value, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandGreaterThanOrEqualTo(String value) {
            addCriterion("to_stand >=", value, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandLessThan(String value) {
            addCriterion("to_stand <", value, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandLessThanOrEqualTo(String value) {
            addCriterion("to_stand <=", value, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandLike(String value) {
            addCriterion("to_stand like", value, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandNotLike(String value) {
            addCriterion("to_stand not like", value, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandIn(List<String> values) {
            addCriterion("to_stand in", values, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandNotIn(List<String> values) {
            addCriterion("to_stand not in", values, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandBetween(String value1, String value2) {
            addCriterion("to_stand between", value1, value2, "toStand");
            return (Criteria) this;
        }

        public Criteria andToStandNotBetween(String value1, String value2) {
            addCriterion("to_stand not between", value1, value2, "toStand");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoIsNull() {
            addCriterion("consignee_photo is null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoIsNotNull() {
            addCriterion("consignee_photo is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoEqualTo(String value) {
            addCriterion("consignee_photo =", value, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoNotEqualTo(String value) {
            addCriterion("consignee_photo <>", value, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoGreaterThan(String value) {
            addCriterion("consignee_photo >", value, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_photo >=", value, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoLessThan(String value) {
            addCriterion("consignee_photo <", value, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoLessThanOrEqualTo(String value) {
            addCriterion("consignee_photo <=", value, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoLike(String value) {
            addCriterion("consignee_photo like", value, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoNotLike(String value) {
            addCriterion("consignee_photo not like", value, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoIn(List<String> values) {
            addCriterion("consignee_photo in", values, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoNotIn(List<String> values) {
            addCriterion("consignee_photo not in", values, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoBetween(String value1, String value2) {
            addCriterion("consignee_photo between", value1, value2, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andConsigneePhotoNotBetween(String value1, String value2) {
            addCriterion("consignee_photo not between", value1, value2, "consigneePhoto");
            return (Criteria) this;
        }

        public Criteria andCargoNameIsNull() {
            addCriterion("cargo_name is null");
            return (Criteria) this;
        }

        public Criteria andCargoNameIsNotNull() {
            addCriterion("cargo_name is not null");
            return (Criteria) this;
        }

        public Criteria andCargoNameEqualTo(String value) {
            addCriterion("cargo_name =", value, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameNotEqualTo(String value) {
            addCriterion("cargo_name <>", value, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameGreaterThan(String value) {
            addCriterion("cargo_name >", value, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameGreaterThanOrEqualTo(String value) {
            addCriterion("cargo_name >=", value, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameLessThan(String value) {
            addCriterion("cargo_name <", value, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameLessThanOrEqualTo(String value) {
            addCriterion("cargo_name <=", value, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameLike(String value) {
            addCriterion("cargo_name like", value, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameNotLike(String value) {
            addCriterion("cargo_name not like", value, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameIn(List<String> values) {
            addCriterion("cargo_name in", values, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameNotIn(List<String> values) {
            addCriterion("cargo_name not in", values, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameBetween(String value1, String value2) {
            addCriterion("cargo_name between", value1, value2, "cargoName");
            return (Criteria) this;
        }

        public Criteria andCargoNameNotBetween(String value1, String value2) {
            addCriterion("cargo_name not between", value1, value2, "cargoName");
            return (Criteria) this;
        }

        public Criteria andPackagingIsNull() {
            addCriterion("packaging is null");
            return (Criteria) this;
        }

        public Criteria andPackagingIsNotNull() {
            addCriterion("packaging is not null");
            return (Criteria) this;
        }

        public Criteria andPackagingEqualTo(String value) {
            addCriterion("packaging =", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingNotEqualTo(String value) {
            addCriterion("packaging <>", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingGreaterThan(String value) {
            addCriterion("packaging >", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingGreaterThanOrEqualTo(String value) {
            addCriterion("packaging >=", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingLessThan(String value) {
            addCriterion("packaging <", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingLessThanOrEqualTo(String value) {
            addCriterion("packaging <=", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingLike(String value) {
            addCriterion("packaging like", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingNotLike(String value) {
            addCriterion("packaging not like", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingIn(List<String> values) {
            addCriterion("packaging in", values, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingNotIn(List<String> values) {
            addCriterion("packaging not in", values, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingBetween(String value1, String value2) {
            addCriterion("packaging between", value1, value2, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingNotBetween(String value1, String value2) {
            addCriterion("packaging not between", value1, value2, "packaging");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(String value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(String value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(String value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(String value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(String value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(String value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLike(String value) {
            addCriterion("freight like", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotLike(String value) {
            addCriterion("freight not like", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<String> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<String> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(String value1, String value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(String value1, String value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andWeight1IsNull() {
            addCriterion("weight1 is null");
            return (Criteria) this;
        }

        public Criteria andWeight1IsNotNull() {
            addCriterion("weight1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeight1EqualTo(Double value) {
            addCriterion("weight1 =", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1NotEqualTo(Double value) {
            addCriterion("weight1 <>", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1GreaterThan(Double value) {
            addCriterion("weight1 >", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1GreaterThanOrEqualTo(Double value) {
            addCriterion("weight1 >=", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1LessThan(Double value) {
            addCriterion("weight1 <", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1LessThanOrEqualTo(Double value) {
            addCriterion("weight1 <=", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1In(List<Double> values) {
            addCriterion("weight1 in", values, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1NotIn(List<Double> values) {
            addCriterion("weight1 not in", values, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1Between(Double value1, Double value2) {
            addCriterion("weight1 between", value1, value2, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1NotBetween(Double value1, Double value2) {
            addCriterion("weight1 not between", value1, value2, "weight1");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andClearingFormIsNull() {
            addCriterion("clearing_form is null");
            return (Criteria) this;
        }

        public Criteria andClearingFormIsNotNull() {
            addCriterion("clearing_form is not null");
            return (Criteria) this;
        }

        public Criteria andClearingFormEqualTo(String value) {
            addCriterion("clearing_form =", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotEqualTo(String value) {
            addCriterion("clearing_form <>", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormGreaterThan(String value) {
            addCriterion("clearing_form >", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormGreaterThanOrEqualTo(String value) {
            addCriterion("clearing_form >=", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLessThan(String value) {
            addCriterion("clearing_form <", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLessThanOrEqualTo(String value) {
            addCriterion("clearing_form <=", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLike(String value) {
            addCriterion("clearing_form like", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotLike(String value) {
            addCriterion("clearing_form not like", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormIn(List<String> values) {
            addCriterion("clearing_form in", values, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotIn(List<String> values) {
            addCriterion("clearing_form not in", values, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormBetween(String value1, String value2) {
            addCriterion("clearing_form between", value1, value2, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotBetween(String value1, String value2) {
            addCriterion("clearing_form not between", value1, value2, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andCodIsNull() {
            addCriterion("COD is null");
            return (Criteria) this;
        }

        public Criteria andCodIsNotNull() {
            addCriterion("COD is not null");
            return (Criteria) this;
        }

        public Criteria andCodEqualTo(String value) {
            addCriterion("COD =", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotEqualTo(String value) {
            addCriterion("COD <>", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodGreaterThan(String value) {
            addCriterion("COD >", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodGreaterThanOrEqualTo(String value) {
            addCriterion("COD >=", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodLessThan(String value) {
            addCriterion("COD <", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodLessThanOrEqualTo(String value) {
            addCriterion("COD <=", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodLike(String value) {
            addCriterion("COD like", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotLike(String value) {
            addCriterion("COD not like", value, "cod");
            return (Criteria) this;
        }

        public Criteria andCodIn(List<String> values) {
            addCriterion("COD in", values, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotIn(List<String> values) {
            addCriterion("COD not in", values, "cod");
            return (Criteria) this;
        }

        public Criteria andCodBetween(String value1, String value2) {
            addCriterion("COD between", value1, value2, "cod");
            return (Criteria) this;
        }

        public Criteria andCodNotBetween(String value1, String value2) {
            addCriterion("COD not between", value1, value2, "cod");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesIsNull() {
            addCriterion("transhipment_charges is null");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesIsNotNull() {
            addCriterion("transhipment_charges is not null");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesEqualTo(String value) {
            addCriterion("transhipment_charges =", value, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesNotEqualTo(String value) {
            addCriterion("transhipment_charges <>", value, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesGreaterThan(String value) {
            addCriterion("transhipment_charges >", value, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesGreaterThanOrEqualTo(String value) {
            addCriterion("transhipment_charges >=", value, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesLessThan(String value) {
            addCriterion("transhipment_charges <", value, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesLessThanOrEqualTo(String value) {
            addCriterion("transhipment_charges <=", value, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesLike(String value) {
            addCriterion("transhipment_charges like", value, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesNotLike(String value) {
            addCriterion("transhipment_charges not like", value, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesIn(List<String> values) {
            addCriterion("transhipment_charges in", values, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesNotIn(List<String> values) {
            addCriterion("transhipment_charges not in", values, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesBetween(String value1, String value2) {
            addCriterion("transhipment_charges between", value1, value2, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andTranshipmentChargesNotBetween(String value1, String value2) {
            addCriterion("transhipment_charges not between", value1, value2, "transhipmentCharges");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(String value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(String value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(String value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(String value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(String value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLike(String value) {
            addCriterion("insurance like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotLike(String value) {
            addCriterion("insurance not like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<String> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<String> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(String value1, String value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(String value1, String value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNull() {
            addCriterion("premium is null");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNotNull() {
            addCriterion("premium is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumEqualTo(String value) {
            addCriterion("premium =", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotEqualTo(String value) {
            addCriterion("premium <>", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThan(String value) {
            addCriterion("premium >", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThanOrEqualTo(String value) {
            addCriterion("premium >=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThan(String value) {
            addCriterion("premium <", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThanOrEqualTo(String value) {
            addCriterion("premium <=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLike(String value) {
            addCriterion("premium like", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotLike(String value) {
            addCriterion("premium not like", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumIn(List<String> values) {
            addCriterion("premium in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotIn(List<String> values) {
            addCriterion("premium not in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumBetween(String value1, String value2) {
            addCriterion("premium between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotBetween(String value1, String value2) {
            addCriterion("premium not between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseIsNull() {
            addCriterion("delivery_expense is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseIsNotNull() {
            addCriterion("delivery_expense is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseEqualTo(String value) {
            addCriterion("delivery_expense =", value, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseNotEqualTo(String value) {
            addCriterion("delivery_expense <>", value, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseGreaterThan(String value) {
            addCriterion("delivery_expense >", value, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_expense >=", value, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseLessThan(String value) {
            addCriterion("delivery_expense <", value, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseLessThanOrEqualTo(String value) {
            addCriterion("delivery_expense <=", value, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseLike(String value) {
            addCriterion("delivery_expense like", value, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseNotLike(String value) {
            addCriterion("delivery_expense not like", value, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseIn(List<String> values) {
            addCriterion("delivery_expense in", values, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseNotIn(List<String> values) {
            addCriterion("delivery_expense not in", values, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseBetween(String value1, String value2) {
            addCriterion("delivery_expense between", value1, value2, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andDeliveryExpenseNotBetween(String value1, String value2) {
            addCriterion("delivery_expense not between", value1, value2, "deliveryExpense");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIsNull() {
            addCriterion("shipping_method is null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIsNotNull() {
            addCriterion("shipping_method is not null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodEqualTo(String value) {
            addCriterion("shipping_method =", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotEqualTo(String value) {
            addCriterion("shipping_method <>", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodGreaterThan(String value) {
            addCriterion("shipping_method >", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_method >=", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodLessThan(String value) {
            addCriterion("shipping_method <", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodLessThanOrEqualTo(String value) {
            addCriterion("shipping_method <=", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodLike(String value) {
            addCriterion("shipping_method like", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotLike(String value) {
            addCriterion("shipping_method not like", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIn(List<String> values) {
            addCriterion("shipping_method in", values, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotIn(List<String> values) {
            addCriterion("shipping_method not in", values, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodBetween(String value1, String value2) {
            addCriterion("shipping_method between", value1, value2, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotBetween(String value1, String value2) {
            addCriterion("shipping_method not between", value1, value2, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIsNull() {
            addCriterion("need_receipt is null");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIsNotNull() {
            addCriterion("need_receipt is not null");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptEqualTo(String value) {
            addCriterion("need_receipt =", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotEqualTo(String value) {
            addCriterion("need_receipt <>", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptGreaterThan(String value) {
            addCriterion("need_receipt >", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptGreaterThanOrEqualTo(String value) {
            addCriterion("need_receipt >=", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptLessThan(String value) {
            addCriterion("need_receipt <", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptLessThanOrEqualTo(String value) {
            addCriterion("need_receipt <=", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptLike(String value) {
            addCriterion("need_receipt like", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotLike(String value) {
            addCriterion("need_receipt not like", value, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptIn(List<String> values) {
            addCriterion("need_receipt in", values, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotIn(List<String> values) {
            addCriterion("need_receipt not in", values, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptBetween(String value1, String value2) {
            addCriterion("need_receipt between", value1, value2, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andNeedReceiptNotBetween(String value1, String value2) {
            addCriterion("need_receipt not between", value1, value2, "needReceipt");
            return (Criteria) this;
        }

        public Criteria andRefundIsNull() {
            addCriterion("refund is null");
            return (Criteria) this;
        }

        public Criteria andRefundIsNotNull() {
            addCriterion("refund is not null");
            return (Criteria) this;
        }

        public Criteria andRefundEqualTo(String value) {
            addCriterion("refund =", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotEqualTo(String value) {
            addCriterion("refund <>", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThan(String value) {
            addCriterion("refund >", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThanOrEqualTo(String value) {
            addCriterion("refund >=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThan(String value) {
            addCriterion("refund <", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThanOrEqualTo(String value) {
            addCriterion("refund <=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLike(String value) {
            addCriterion("refund like", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotLike(String value) {
            addCriterion("refund not like", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundIn(List<String> values) {
            addCriterion("refund in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotIn(List<String> values) {
            addCriterion("refund not in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundBetween(String value1, String value2) {
            addCriterion("refund between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotBetween(String value1, String value2) {
            addCriterion("refund not between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andInetialStationIsNull() {
            addCriterion("inetial_station is null");
            return (Criteria) this;
        }

        public Criteria andInetialStationIsNotNull() {
            addCriterion("inetial_station is not null");
            return (Criteria) this;
        }

        public Criteria andInetialStationEqualTo(String value) {
            addCriterion("inetial_station =", value, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationNotEqualTo(String value) {
            addCriterion("inetial_station <>", value, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationGreaterThan(String value) {
            addCriterion("inetial_station >", value, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationGreaterThanOrEqualTo(String value) {
            addCriterion("inetial_station >=", value, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationLessThan(String value) {
            addCriterion("inetial_station <", value, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationLessThanOrEqualTo(String value) {
            addCriterion("inetial_station <=", value, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationLike(String value) {
            addCriterion("inetial_station like", value, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationNotLike(String value) {
            addCriterion("inetial_station not like", value, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationIn(List<String> values) {
            addCriterion("inetial_station in", values, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationNotIn(List<String> values) {
            addCriterion("inetial_station not in", values, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationBetween(String value1, String value2) {
            addCriterion("inetial_station between", value1, value2, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andInetialStationNotBetween(String value1, String value2) {
            addCriterion("inetial_station not between", value1, value2, "inetialStation");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoIsNull() {
            addCriterion("consigner_photo is null");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoIsNotNull() {
            addCriterion("consigner_photo is not null");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoEqualTo(String value) {
            addCriterion("consigner_photo =", value, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoNotEqualTo(String value) {
            addCriterion("consigner_photo <>", value, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoGreaterThan(String value) {
            addCriterion("consigner_photo >", value, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("consigner_photo >=", value, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoLessThan(String value) {
            addCriterion("consigner_photo <", value, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoLessThanOrEqualTo(String value) {
            addCriterion("consigner_photo <=", value, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoLike(String value) {
            addCriterion("consigner_photo like", value, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoNotLike(String value) {
            addCriterion("consigner_photo not like", value, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoIn(List<String> values) {
            addCriterion("consigner_photo in", values, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoNotIn(List<String> values) {
            addCriterion("consigner_photo not in", values, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoBetween(String value1, String value2) {
            addCriterion("consigner_photo between", value1, value2, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andConsignerPhotoNotBetween(String value1, String value2) {
            addCriterion("consigner_photo not between", value1, value2, "consignerPhoto");
            return (Criteria) this;
        }

        public Criteria andTransferToIsNull() {
            addCriterion("transfer_to is null");
            return (Criteria) this;
        }

        public Criteria andTransferToIsNotNull() {
            addCriterion("transfer_to is not null");
            return (Criteria) this;
        }

        public Criteria andTransferToEqualTo(String value) {
            addCriterion("transfer_to =", value, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToNotEqualTo(String value) {
            addCriterion("transfer_to <>", value, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToGreaterThan(String value) {
            addCriterion("transfer_to >", value, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_to >=", value, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToLessThan(String value) {
            addCriterion("transfer_to <", value, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToLessThanOrEqualTo(String value) {
            addCriterion("transfer_to <=", value, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToLike(String value) {
            addCriterion("transfer_to like", value, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToNotLike(String value) {
            addCriterion("transfer_to not like", value, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToIn(List<String> values) {
            addCriterion("transfer_to in", values, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToNotIn(List<String> values) {
            addCriterion("transfer_to not in", values, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToBetween(String value1, String value2) {
            addCriterion("transfer_to between", value1, value2, "transferTo");
            return (Criteria) this;
        }

        public Criteria andTransferToNotBetween(String value1, String value2) {
            addCriterion("transfer_to not between", value1, value2, "transferTo");
            return (Criteria) this;
        }
    }

    /**
     */
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