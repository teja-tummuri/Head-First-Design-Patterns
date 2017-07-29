package com.gani.strategy;

/**
 * Created by Gani on 7/29/17.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duckd");
    }
}
