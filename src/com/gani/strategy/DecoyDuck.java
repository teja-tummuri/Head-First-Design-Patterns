package com.gani.strategy;

/**
 * Created by Gani on 7/29/17.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a decoy");
    }
}
