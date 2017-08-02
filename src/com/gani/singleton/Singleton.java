package com.gani.singleton;

/**
 * Created by Gani on 8/1/17.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){

        if(uniqueInstance == null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }
}
