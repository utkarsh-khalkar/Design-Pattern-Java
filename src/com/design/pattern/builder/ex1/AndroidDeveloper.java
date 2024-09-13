package com.design.pattern.builder.ex1;
/*
Date: 13/09/2024
Time: 2:55 PM
Description: This Project to Specify Builder Pattern
Author: Utkarsh Khalkar

 */
public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Getting Android Developer salary...");
        return 50000;
    }
}
