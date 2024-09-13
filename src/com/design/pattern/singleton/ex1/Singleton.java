package com.design.pattern.singleton.ex1;

import java.util.Random;

/*
Date: 13/09/2024
Time: 1:45 PM
Description: This Project to Specify Singleton Pattern
Author: Utkarsh Khalkar
 */
public class Singleton {

    private static Singleton instance=null;
private final Integer number;
    private Singleton()
    {
        number = new Random().nextInt();
    }
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }

    public void show()
    {
        System.out.printf("\n Singleton test is %s",this.number);
        System.out.println();
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().hashCode());
    }
}
