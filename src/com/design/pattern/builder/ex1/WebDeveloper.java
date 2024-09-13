package com.design.pattern.builder.ex1;
/*
Date: 13/09/2024
Time: 2:40 PM
Description: This Project to Specify Builder Pattern
Author: Utkarsh Khalkar

 */
public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Web Developer salary...");
        return 40000;
    }
}
