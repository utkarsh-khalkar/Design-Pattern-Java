package com.design.pattern.singleton;

public class Singleton {
    // This is Lazy of creation of Object..
    private static Singleton instance=null;
    // This Approach is Not Thread Safe

    // Constructor from  preventing Object creation
    private Singleton()
    {}

    // Method for Object Creation
    public static Singleton getInstance()
    {
        if (instance == null) {
            instance=new Singleton();
        }

        return instance;
    }
}
class Test{
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton.hashCode());
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton1.hashCode());
    }
}