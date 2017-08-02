package com.gani.singleton;

/**
 * Created by Gani on 8/1/17.
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null)
                    uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
