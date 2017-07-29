package com.gani.strategy;

/**
 * Created by Gani on 7/29/17.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
