package com.gani.singleton;

/**
 * Created by Gani on 8/1/17.
 */
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return uniqueInstance;
    }
}
