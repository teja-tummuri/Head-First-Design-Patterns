package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        Size size = beverage.getSize();
        double cost = beverage.cost();
        if(size==Size.TALL)
            cost+=0.10;
        if(size==Size.GRANDE)
            cost+=0.15;
        if(size==Size.VENTI)
            cost+=0.20;
        return cost;
    }

}
