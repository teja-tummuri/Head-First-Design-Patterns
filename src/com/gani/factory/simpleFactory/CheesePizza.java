package com.gani.factory.simpleFactory;

/**
 * Created by Gani on 8/1/17.
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}
