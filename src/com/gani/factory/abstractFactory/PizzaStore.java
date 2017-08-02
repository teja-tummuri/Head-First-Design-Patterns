package com.gani.factory.abstractFactory;


import com.gani.factory.abstractFactory.pizzas.Pizza;

/**
 * Created by Gani on 8/1/17.
 */
public abstract class PizzaStore {
    
    public Pizza orderPizza(String type){
        
        Pizza pizza;
        pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
