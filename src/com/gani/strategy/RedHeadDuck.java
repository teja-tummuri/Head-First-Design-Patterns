package com.gani.strategy;

/**
 * Created by Gani on 7/29/17.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a red head duck!!");
    }
}
