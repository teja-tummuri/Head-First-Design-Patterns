package com.gani.adapter;

/**
 * Created by Gani on 8/3/17.
 */
public class MallardDuck  implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
