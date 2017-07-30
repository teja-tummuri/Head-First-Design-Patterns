package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;
    @Override
    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
