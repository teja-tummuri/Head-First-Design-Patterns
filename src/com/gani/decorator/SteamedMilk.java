package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Steamed Milk";
    }

    @Override
    public double cost() {
        return 0.10+beverage.cost();
    }
}
