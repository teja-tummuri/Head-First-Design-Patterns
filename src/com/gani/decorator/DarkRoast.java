package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }

}
