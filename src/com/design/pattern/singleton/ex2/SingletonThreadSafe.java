package com.design.pattern.singleton.ex2;
/*
Date: 13/09/2024
Time: 1:55 PM
Description: This Project to Specify Singleton Pattern
Author: Utkarsh Khalkar

 */
public class SingletonThreadSafe {


    private static SingletonThreadSafe singletonThreadSafe=null;

    public static SingletonThreadSafe getInstance() {
        if (singletonThreadSafe==null)
        {
            synchronized (SingletonThreadSafe.class) {
                if(singletonThreadSafe==null)
                {
                    singletonThreadSafe=new SingletonThreadSafe();
                }
            }
        }
        return singletonThreadSafe;
    }

}
class Demo{
    public static void main(String[] args) {
        System.out.println(SingletonThreadSafe.getInstance().hashCode());
        System.out.println(SingletonThreadSafe.getInstance().hashCode());
    }
}