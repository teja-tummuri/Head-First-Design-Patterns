package com.gani.factory.factoryMethod.newyork;

import com.gani.factory.factoryMethod.PizzaStore;
import com.gani.factory.simpleFactory.Pizza;

/**
 * Created by Gani on 8/1/17.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch(type){
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
            case "clam":
                pizza = new NYStyleClamPizza();
        }

        return pizza;
    }
}
