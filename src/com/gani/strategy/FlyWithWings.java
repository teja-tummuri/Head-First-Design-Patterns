package com.gani.strategy;

/**
 * Created by Gani on 7/29/17.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly like a duck!!");
    }
}
