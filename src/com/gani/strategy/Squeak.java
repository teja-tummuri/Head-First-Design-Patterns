package com.gani.strategy;

/**
 * Created by Gani on 7/29/17.
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
