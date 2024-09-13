package com.design.pattern.builder.ex1;

public class DeveloperClient {
    public static void main(String[] args) {

        // Getting the Android Developer
        Employee employee=EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee.salary());

        // Getting the Web Developer
        employee=EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee.salary());


    }
}
