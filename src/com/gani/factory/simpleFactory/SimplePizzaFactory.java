package com.gani.factory.simpleFactory;

/**
 * Created by Gani on 8/1/17.
 */
public class SimplePizzaFactory {

    Pizza createPizza(String type){
        Pizza pizza = null;
        switch(type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
        }

        return pizza;
    }
}
