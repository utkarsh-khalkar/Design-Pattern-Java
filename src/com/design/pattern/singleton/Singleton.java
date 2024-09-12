package com.design.pattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton implements Serializable {
    // This is Lazy of creation of Object..
    private static Singleton instance=null;
    // This Approach is Not Thread Safe

    // Constructor from  preventing Object creation
    private Singleton()
    {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    // Method for Object Creation
    public static Singleton getInstance()
    {
        if (instance == null) {
            instance=new Singleton();
        }

        return instance;
    }
    public Object readResolve()
    {
        return instance;
    }
}
class Test{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton.hashCode());
//        Singleton singleton1=Singleton.getInstance();
//        System.out.println(singleton1.hashCode());


        // Using Reflection API we can Break the Singleton Pattern.
//        Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton singleton1=constructor.newInstance();
//
//        System.out.println(singleton1.hashCode());


        // Using Deserialization we can break the Singleton Pattern

        // First We need to Serialize the Object then need to convert it into Deserialization
        Singleton singleton1=Singleton.getInstance();

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new
                FileOutputStream("abc.txt"));

        objectOutputStream.writeObject(singleton1);
        System.out.println("Serialization  Done...");

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("abc.txt"));

        Singleton singleton2=(Singleton) objectInputStream.readObject();

        System.out.println(singleton2.hashCode());
    }
}