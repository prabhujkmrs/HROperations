package com.prabhuj.coding.model;

public class Department {

    private long depatementId;
    private String departmentName;

    public Department(long departementId, String departmentName) {
        this.depatementId = departementId;
        this.departmentName = departmentName;
    }

    public long getDepatementId() {
        return depatementId;
    }

    public void setDepatementId(long departementId) {
        this.depatementId = departementId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
