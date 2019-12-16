package com.hz.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("Employee_Id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("Employee_Id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("Employee_Id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("Employee_Id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("Employee_Id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_Id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("Employee_Id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("Employee_Id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("Employee_Id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("Employee_Id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("Employee_Id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("Employee_Id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("Employee_Id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("Employee_Id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("Employee_Name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("Employee_Name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("Employee_Name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("Employee_Name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("Employee_Name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_Name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("Employee_Name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("Employee_Name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("Employee_Name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("Employee_Name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("Employee_Name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("Employee_Name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("Employee_Name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("Employee_Name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoIsNull() {
            addCriterion("Employee_Id_No is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoIsNotNull() {
            addCriterion("Employee_Id_No is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoEqualTo(String value) {
            addCriterion("Employee_Id_No =", value, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoNotEqualTo(String value) {
            addCriterion("Employee_Id_No <>", value, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoGreaterThan(String value) {
            addCriterion("Employee_Id_No >", value, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_Id_No >=", value, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoLessThan(String value) {
            addCriterion("Employee_Id_No <", value, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoLessThanOrEqualTo(String value) {
            addCriterion("Employee_Id_No <=", value, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoLike(String value) {
            addCriterion("Employee_Id_No like", value, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoNotLike(String value) {
            addCriterion("Employee_Id_No not like", value, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoIn(List<String> values) {
            addCriterion("Employee_Id_No in", values, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoNotIn(List<String> values) {
            addCriterion("Employee_Id_No not in", values, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoBetween(String value1, String value2) {
            addCriterion("Employee_Id_No between", value1, value2, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNoNotBetween(String value1, String value2) {
            addCriterion("Employee_Id_No not between", value1, value2, "employeeIdNo");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBornDateIsNull() {
            addCriterion("Born_Date is null");
            return (Criteria) this;
        }

        public Criteria andBornDateIsNotNull() {
            addCriterion("Born_Date is not null");
            return (Criteria) this;
        }

        public Criteria andBornDateEqualTo(Date value) {
            addCriterion("Born_Date =", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotEqualTo(Date value) {
            addCriterion("Born_Date <>", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateGreaterThan(Date value) {
            addCriterion("Born_Date >", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Born_Date >=", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateLessThan(Date value) {
            addCriterion("Born_Date <", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateLessThanOrEqualTo(Date value) {
            addCriterion("Born_Date <=", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateIn(List<Date> values) {
            addCriterion("Born_Date in", values, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotIn(List<Date> values) {
            addCriterion("Born_Date not in", values, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateBetween(Date value1, Date value2) {
            addCriterion("Born_Date between", value1, value2, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotBetween(Date value1, Date value2) {
            addCriterion("Born_Date not between", value1, value2, "bornDate");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("Degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("Degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("Degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("Degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("Degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("Degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("Degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("Degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("Degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("Degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("Degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("Degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("Degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("Degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andSchoolTagIsNull() {
            addCriterion("School_Tag is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTagIsNotNull() {
            addCriterion("School_Tag is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTagEqualTo(String value) {
            addCriterion("School_Tag =", value, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagNotEqualTo(String value) {
            addCriterion("School_Tag <>", value, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagGreaterThan(String value) {
            addCriterion("School_Tag >", value, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagGreaterThanOrEqualTo(String value) {
            addCriterion("School_Tag >=", value, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagLessThan(String value) {
            addCriterion("School_Tag <", value, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagLessThanOrEqualTo(String value) {
            addCriterion("School_Tag <=", value, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagLike(String value) {
            addCriterion("School_Tag like", value, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagNotLike(String value) {
            addCriterion("School_Tag not like", value, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagIn(List<String> values) {
            addCriterion("School_Tag in", values, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagNotIn(List<String> values) {
            addCriterion("School_Tag not in", values, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagBetween(String value1, String value2) {
            addCriterion("School_Tag between", value1, value2, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andSchoolTagNotBetween(String value1, String value2) {
            addCriterion("School_Tag not between", value1, value2, "schoolTag");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("Phone_No is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("Phone_No is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(Integer value) {
            addCriterion("Phone_No =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(Integer value) {
            addCriterion("Phone_No <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(Integer value) {
            addCriterion("Phone_No >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Phone_No >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(Integer value) {
            addCriterion("Phone_No <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(Integer value) {
            addCriterion("Phone_No <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<Integer> values) {
            addCriterion("Phone_No in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<Integer> values) {
            addCriterion("Phone_No not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(Integer value1, Integer value2) {
            addCriterion("Phone_No between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(Integer value1, Integer value2) {
            addCriterion("Phone_No not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("Department_Id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("Department_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("Department_Id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("Department_Id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("Department_Id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department_Id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("Department_Id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Department_Id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("Department_Id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("Department_Id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Department_Id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Department_Id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("Position_Id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("Position_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("Position_Id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("Position_Id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("Position_Id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Position_Id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("Position_Id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("Position_Id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("Position_Id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("Position_Id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("Position_Id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Position_Id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("Salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("Salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Double value) {
            addCriterion("Salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Double value) {
            addCriterion("Salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Double value) {
            addCriterion("Salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("Salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Double value) {
            addCriterion("Salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Double value) {
            addCriterion("Salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Double> values) {
            addCriterion("Salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Double> values) {
            addCriterion("Salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Double value1, Double value2) {
            addCriterion("Salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Double value1, Double value2) {
            addCriterion("Salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("Contract_Id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("Contract_Id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("Contract_Id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("Contract_Id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("Contract_Id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("Contract_Id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("Contract_Id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("Contract_Id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("Contract_Id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("Contract_Id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("Contract_Id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("Contract_Id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("Contract_Id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("Contract_Id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescIsNull() {
            addCriterion("Employee_Desc is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescIsNotNull() {
            addCriterion("Employee_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescEqualTo(String value) {
            addCriterion("Employee_Desc =", value, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescNotEqualTo(String value) {
            addCriterion("Employee_Desc <>", value, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescGreaterThan(String value) {
            addCriterion("Employee_Desc >", value, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_Desc >=", value, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescLessThan(String value) {
            addCriterion("Employee_Desc <", value, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescLessThanOrEqualTo(String value) {
            addCriterion("Employee_Desc <=", value, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescLike(String value) {
            addCriterion("Employee_Desc like", value, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescNotLike(String value) {
            addCriterion("Employee_Desc not like", value, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescIn(List<String> values) {
            addCriterion("Employee_Desc in", values, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescNotIn(List<String> values) {
            addCriterion("Employee_Desc not in", values, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescBetween(String value1, String value2) {
            addCriterion("Employee_Desc between", value1, value2, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andEmployeeDescNotBetween(String value1, String value2) {
            addCriterion("Employee_Desc not between", value1, value2, "employeeDesc");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
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