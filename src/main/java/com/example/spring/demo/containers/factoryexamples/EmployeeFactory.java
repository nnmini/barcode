package com.example.spring.demo.containers.factoryexamples;

public class EmployeeFactory {
    public static EmployeeFactory employeeFactory;

    public EmployeeFactory() {

    }

    public static EmployeeFactory getEmployeeFactory() {
        if (employeeFactory == null) {
            employeeFactory = new EmployeeFactory();
        }
        return employeeFactory;


    }

    public Employee createEmployee(){
        return new Employee();
    }
}
