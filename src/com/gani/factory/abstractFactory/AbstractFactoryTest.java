package com.gani.factory.abstractFactory;

/**
 * Created by Gani on 8/1/17.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
