package com.gani.strategy;

/**
 * Created by Gani on 7/29/17.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("By the power of rockets!!");
    }
}
