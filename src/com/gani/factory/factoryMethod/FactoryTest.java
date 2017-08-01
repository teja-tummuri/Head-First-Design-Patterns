package com.gani.factory.factoryMethod;

import com.gani.factory.factoryMethod.chicago.ChicagoStylePizzaStore;
import com.gani.factory.factoryMethod.newyork.NYStylePizzaStore;

/**
 * Created by Gani on 8/1/17.
 */
public class FactoryTest {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        chicagoPizzaStore.orderPizza("cheese");


    }
}
