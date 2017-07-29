package com.gani.strategy;

/**
 * Created by Gani on 7/29/17.
 */
public class DuckCall {

    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void mimicQuack(){
        quackBehavior.quack();
    }
}
