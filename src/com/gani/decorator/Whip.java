package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public class Whip extends CondimentDecorator {


    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return 0.10+beverage.cost();
    }
}
