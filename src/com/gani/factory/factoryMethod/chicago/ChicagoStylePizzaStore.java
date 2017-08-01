package com.gani.factory.factoryMethod.chicago;

import com.gani.factory.factoryMethod.PizzaStore;
import com.gani.factory.simpleFactory.Pizza;

/**
 * Created by Gani on 8/1/17.
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch(type){
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
            case "clam":
                pizza = new ChicagoStyleClamPizza();
        }

        return pizza;
    }
}
