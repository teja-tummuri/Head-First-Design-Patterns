package com.gani.factory.simpleFactory;

/**
 * Created by Gani on 8/1/17.
 */
public class TestPizza {

    public static void main(String [] args){

        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(pizzaFactory);

        Pizza pizza = store.OrderPizza("cheese");
    }

}
