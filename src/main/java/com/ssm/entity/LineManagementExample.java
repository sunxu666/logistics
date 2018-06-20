package com.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class LineManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LineManagementExample() {
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

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("abbreviation =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("abbreviation <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("abbreviation >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("abbreviation >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("abbreviation <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("abbreviation <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("abbreviation like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("abbreviation not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("abbreviation in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("abbreviation not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("abbreviation between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("abbreviation not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andTotalProportionIsNull() {
            addCriterion("total_proportion is null");
            return (Criteria) this;
        }

        public Criteria andTotalProportionIsNotNull() {
            addCriterion("total_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProportionEqualTo(String value) {
            addCriterion("total_proportion =", value, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionNotEqualTo(String value) {
            addCriterion("total_proportion <>", value, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionGreaterThan(String value) {
            addCriterion("total_proportion >", value, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionGreaterThanOrEqualTo(String value) {
            addCriterion("total_proportion >=", value, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionLessThan(String value) {
            addCriterion("total_proportion <", value, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionLessThanOrEqualTo(String value) {
            addCriterion("total_proportion <=", value, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionLike(String value) {
            addCriterion("total_proportion like", value, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionNotLike(String value) {
            addCriterion("total_proportion not like", value, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionIn(List<String> values) {
            addCriterion("total_proportion in", values, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionNotIn(List<String> values) {
            addCriterion("total_proportion not in", values, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionBetween(String value1, String value2) {
            addCriterion("total_proportion between", value1, value2, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andTotalProportionNotBetween(String value1, String value2) {
            addCriterion("total_proportion not between", value1, value2, "totalProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionIsNull() {
            addCriterion("branch_proportion is null");
            return (Criteria) this;
        }

        public Criteria andBranchProportionIsNotNull() {
            addCriterion("branch_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andBranchProportionEqualTo(String value) {
            addCriterion("branch_proportion =", value, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionNotEqualTo(String value) {
            addCriterion("branch_proportion <>", value, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionGreaterThan(String value) {
            addCriterion("branch_proportion >", value, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionGreaterThanOrEqualTo(String value) {
            addCriterion("branch_proportion >=", value, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionLessThan(String value) {
            addCriterion("branch_proportion <", value, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionLessThanOrEqualTo(String value) {
            addCriterion("branch_proportion <=", value, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionLike(String value) {
            addCriterion("branch_proportion like", value, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionNotLike(String value) {
            addCriterion("branch_proportion not like", value, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionIn(List<String> values) {
            addCriterion("branch_proportion in", values, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionNotIn(List<String> values) {
            addCriterion("branch_proportion not in", values, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionBetween(String value1, String value2) {
            addCriterion("branch_proportion between", value1, value2, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andBranchProportionNotBetween(String value1, String value2) {
            addCriterion("branch_proportion not between", value1, value2, "branchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionIsNull() {
            addCriterion("return_total_proportion is null");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionIsNotNull() {
            addCriterion("return_total_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionEqualTo(String value) {
            addCriterion("return_total_proportion =", value, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionNotEqualTo(String value) {
            addCriterion("return_total_proportion <>", value, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionGreaterThan(String value) {
            addCriterion("return_total_proportion >", value, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionGreaterThanOrEqualTo(String value) {
            addCriterion("return_total_proportion >=", value, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionLessThan(String value) {
            addCriterion("return_total_proportion <", value, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionLessThanOrEqualTo(String value) {
            addCriterion("return_total_proportion <=", value, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionLike(String value) {
            addCriterion("return_total_proportion like", value, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionNotLike(String value) {
            addCriterion("return_total_proportion not like", value, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionIn(List<String> values) {
            addCriterion("return_total_proportion in", values, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionNotIn(List<String> values) {
            addCriterion("return_total_proportion not in", values, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionBetween(String value1, String value2) {
            addCriterion("return_total_proportion between", value1, value2, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnTotalProportionNotBetween(String value1, String value2) {
            addCriterion("return_total_proportion not between", value1, value2, "returnTotalProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionIsNull() {
            addCriterion("return_branch_proportion is null");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionIsNotNull() {
            addCriterion("return_branch_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionEqualTo(String value) {
            addCriterion("return_branch_proportion =", value, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionNotEqualTo(String value) {
            addCriterion("return_branch_proportion <>", value, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionGreaterThan(String value) {
            addCriterion("return_branch_proportion >", value, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionGreaterThanOrEqualTo(String value) {
            addCriterion("return_branch_proportion >=", value, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionLessThan(String value) {
            addCriterion("return_branch_proportion <", value, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionLessThanOrEqualTo(String value) {
            addCriterion("return_branch_proportion <=", value, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionLike(String value) {
            addCriterion("return_branch_proportion like", value, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionNotLike(String value) {
            addCriterion("return_branch_proportion not like", value, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionIn(List<String> values) {
            addCriterion("return_branch_proportion in", values, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionNotIn(List<String> values) {
            addCriterion("return_branch_proportion not in", values, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionBetween(String value1, String value2) {
            addCriterion("return_branch_proportion between", value1, value2, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andReturnBranchProportionNotBetween(String value1, String value2) {
            addCriterion("return_branch_proportion not between", value1, value2, "returnBranchProportion");
            return (Criteria) this;
        }

        public Criteria andProportion1IsNull() {
            addCriterion("proportion1 is null");
            return (Criteria) this;
        }

        public Criteria andProportion1IsNotNull() {
            addCriterion("proportion1 is not null");
            return (Criteria) this;
        }

        public Criteria andProportion1EqualTo(String value) {
            addCriterion("proportion1 =", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1NotEqualTo(String value) {
            addCriterion("proportion1 <>", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1GreaterThan(String value) {
            addCriterion("proportion1 >", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1GreaterThanOrEqualTo(String value) {
            addCriterion("proportion1 >=", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1LessThan(String value) {
            addCriterion("proportion1 <", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1LessThanOrEqualTo(String value) {
            addCriterion("proportion1 <=", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1Like(String value) {
            addCriterion("proportion1 like", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1NotLike(String value) {
            addCriterion("proportion1 not like", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1In(List<String> values) {
            addCriterion("proportion1 in", values, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1NotIn(List<String> values) {
            addCriterion("proportion1 not in", values, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1Between(String value1, String value2) {
            addCriterion("proportion1 between", value1, value2, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1NotBetween(String value1, String value2) {
            addCriterion("proportion1 not between", value1, value2, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion2IsNull() {
            addCriterion("proportion2 is null");
            return (Criteria) this;
        }

        public Criteria andProportion2IsNotNull() {
            addCriterion("proportion2 is not null");
            return (Criteria) this;
        }

        public Criteria andProportion2EqualTo(String value) {
            addCriterion("proportion2 =", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2NotEqualTo(String value) {
            addCriterion("proportion2 <>", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2GreaterThan(String value) {
            addCriterion("proportion2 >", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2GreaterThanOrEqualTo(String value) {
            addCriterion("proportion2 >=", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2LessThan(String value) {
            addCriterion("proportion2 <", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2LessThanOrEqualTo(String value) {
            addCriterion("proportion2 <=", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2Like(String value) {
            addCriterion("proportion2 like", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2NotLike(String value) {
            addCriterion("proportion2 not like", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2In(List<String> values) {
            addCriterion("proportion2 in", values, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2NotIn(List<String> values) {
            addCriterion("proportion2 not in", values, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2Between(String value1, String value2) {
            addCriterion("proportion2 between", value1, value2, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2NotBetween(String value1, String value2) {
            addCriterion("proportion2 not between", value1, value2, "proportion2");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(String value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(String value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(String value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(String value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(String value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(String value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLike(String value) {
            addCriterion("unit_price like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotLike(String value) {
            addCriterion("unit_price not like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<String> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<String> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(String value1, String value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(String value1, String value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2IsNull() {
            addCriterion("unit_price2 is null");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2IsNotNull() {
            addCriterion("unit_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2EqualTo(String value) {
            addCriterion("unit_price2 =", value, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2NotEqualTo(String value) {
            addCriterion("unit_price2 <>", value, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2GreaterThan(String value) {
            addCriterion("unit_price2 >", value, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2GreaterThanOrEqualTo(String value) {
            addCriterion("unit_price2 >=", value, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2LessThan(String value) {
            addCriterion("unit_price2 <", value, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2LessThanOrEqualTo(String value) {
            addCriterion("unit_price2 <=", value, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2Like(String value) {
            addCriterion("unit_price2 like", value, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2NotLike(String value) {
            addCriterion("unit_price2 not like", value, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2In(List<String> values) {
            addCriterion("unit_price2 in", values, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2NotIn(List<String> values) {
            addCriterion("unit_price2 not in", values, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2Between(String value1, String value2) {
            addCriterion("unit_price2 between", value1, value2, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andUnitPrice2NotBetween(String value1, String value2) {
            addCriterion("unit_price2 not between", value1, value2, "unitPrice2");
            return (Criteria) this;
        }

        public Criteria andStartingFareIsNull() {
            addCriterion("starting_fare is null");
            return (Criteria) this;
        }

        public Criteria andStartingFareIsNotNull() {
            addCriterion("starting_fare is not null");
            return (Criteria) this;
        }

        public Criteria andStartingFareEqualTo(String value) {
            addCriterion("starting_fare =", value, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareNotEqualTo(String value) {
            addCriterion("starting_fare <>", value, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareGreaterThan(String value) {
            addCriterion("starting_fare >", value, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareGreaterThanOrEqualTo(String value) {
            addCriterion("starting_fare >=", value, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareLessThan(String value) {
            addCriterion("starting_fare <", value, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareLessThanOrEqualTo(String value) {
            addCriterion("starting_fare <=", value, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareLike(String value) {
            addCriterion("starting_fare like", value, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareNotLike(String value) {
            addCriterion("starting_fare not like", value, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareIn(List<String> values) {
            addCriterion("starting_fare in", values, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareNotIn(List<String> values) {
            addCriterion("starting_fare not in", values, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareBetween(String value1, String value2) {
            addCriterion("starting_fare between", value1, value2, "startingFare");
            return (Criteria) this;
        }

        public Criteria andStartingFareNotBetween(String value1, String value2) {
            addCriterion("starting_fare not between", value1, value2, "startingFare");
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