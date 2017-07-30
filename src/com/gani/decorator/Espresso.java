package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
