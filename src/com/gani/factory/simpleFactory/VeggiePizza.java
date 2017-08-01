package com.gani.factory.simpleFactory;

/**
 * Created by Gani on 8/1/17.
 */

public class VeggiePizza extends Pizza {

    public VeggiePizza() {

        name = "Veggie Pizza";
        dough = "Thin crust dough";
        sauce = "Tomato Sauce";
        toppings.add("Olives and jalapenos");
    }
}
