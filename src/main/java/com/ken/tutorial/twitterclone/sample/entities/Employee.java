package com.ken.tutorial.twitterclone.sample.entities;

import javax.persistence.Entity;

@Entity
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Integer employeeAge;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }
}
