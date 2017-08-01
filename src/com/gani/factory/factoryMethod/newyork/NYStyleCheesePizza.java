package com.gani.factory.factoryMethod.newyork;

import com.gani.factory.simpleFactory.Pizza;

/**
 * Created by Gani on 8/1/17.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sause and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
