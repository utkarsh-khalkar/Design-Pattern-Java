package com.design.pattern.singleton;

public class Singleton_ThreadSafe {


    private static Singleton_ThreadSafe singletonThreadSafe=null;

    public static Singleton_ThreadSafe getInstance() {
        if (singletonThreadSafe==null)
        {
            synchronized (Singleton_ThreadSafe.class) {
                if(singletonThreadSafe==null)
                {
                    singletonThreadSafe=new Singleton_ThreadSafe();
                }
            }
        }
        return singletonThreadSafe;
    }

}
class Demo{
    public static void main(String[] args) {
        System.out.println(Singleton_ThreadSafe.getInstance().hashCode());
        System.out.println(Singleton_ThreadSafe.getInstance().hashCode());
    }
}