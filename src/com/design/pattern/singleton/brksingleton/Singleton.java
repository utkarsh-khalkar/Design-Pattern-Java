package com.design.pattern.singleton.brksingleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    // This is Lazy of creation of Object..
    private static Singleton instance = null;
    // This Approach is Not Thread Safe

    // Constructor from  preventing Object creation
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    // Method for Object Creation
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public Object readResolve() {
        return instance;
    }
}
