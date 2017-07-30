package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
