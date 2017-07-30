package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost(){
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription(){
        return beverage.getDescription()+", Soy";
    }
}
