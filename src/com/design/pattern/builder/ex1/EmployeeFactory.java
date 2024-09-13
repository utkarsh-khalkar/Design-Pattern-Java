package com.design.pattern.builder.ex1;
/*
Date: 13/09/2024
Time: 2:35 PM
Description: This Project to Specify Builder Pattern
Author: Utkarsh Khalkar

 */
public class EmployeeFactory {

    // Get Employee
    // This method is used to get the Employee
    public static Employee getEmployee(String type) {
        if(type.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        }else if (type.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        }
        return null;
    }
}
