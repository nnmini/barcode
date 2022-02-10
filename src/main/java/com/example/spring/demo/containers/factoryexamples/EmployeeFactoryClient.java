package com.example.spring.demo.containers.factoryexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeFactoryClient {

    private ApplicationContext ctx = null;

    public void testEmployeeFactory() {
        ctx = new ClassPathXmlApplicationContext("containers-beans.xml");

        EmployeeFactory factory = ctx.getBean("employeeFactory", EmployeeFactory.class);
        Employee emp = factory.createEmployee();
        System.out.println("Employee Factory: " + factory.hashCode());
        System.out.println("Employee: " + emp.hashCode());
        EmployeeFactory factory1 = ctx.getBean("employeeFactory", EmployeeFactory.class);
        Employee emp1 = factory1.createEmployee();
        System.out.println("Employee Factory: " + factory1.hashCode());
        System.out.println("Employee: " + emp1.hashCode());
    }

    public static void main(String args[]) {
        EmployeeFactoryClient client = new EmployeeFactoryClient();

        client.testEmployeeFactory();;
    }
}
