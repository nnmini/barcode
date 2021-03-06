package com.example.spring.demo.containers.factoryexamples;

import java.util.Random;

public class Employee {

    private long employeeId = 0;
    private String employeeName = null;
    private String title = null;
    private String grade = null;
    private int upperbound =100;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = new Random().nextInt(upperbound);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", title=" + title + ", grade=" + grade + '}';
    }
}
