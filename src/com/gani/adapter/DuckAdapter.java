package com.gani.adapter;

/**
 * Created by Gani on 8/3/17.
 */
public class DuckAdapter implements Turkey {

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
