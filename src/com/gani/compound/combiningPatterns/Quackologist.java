package com.gani.compound.combiningPatterns;

/**
 * Created by Gani on 8/7/17.
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+duck+" has quacked");
    }
}
