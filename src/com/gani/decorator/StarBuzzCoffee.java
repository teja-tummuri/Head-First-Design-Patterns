package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public class StarBuzzCoffee {

    public static void main(String[] args){
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Whip(beverage3);
        beverage3 = new SteamedMilk(beverage3);
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
    }
}
