package com.gani.factory.simpleFactory;

/**
 * Created by Gani on 8/1/17.
 */
public class PizzaStore {

    SimplePizzaFactory pizzaFactory;

    PizzaStore(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    Pizza OrderPizza(String type){


        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
