package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
