package org.moldavets.model;

import java.util.Random;

public class Employee {
    private Long id;
    private String name;
    private String department;
    private Boolean isWorking;

    public Employee(String name, String department, Boolean isWorking) {
        this.id = new Random().nextLong(1, 1000000);
        this.name = name;
        this.department = department;
        this.isWorking = isWorking;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }
}
