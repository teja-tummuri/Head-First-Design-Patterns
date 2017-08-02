package com.gani.factory.abstractFactory;

import com.gani.factory.abstractFactory.cheese.Cheese;
import com.gani.factory.abstractFactory.clams.Clams;
import com.gani.factory.abstractFactory.dough.Dough;
import com.gani.factory.abstractFactory.pepperoni.Pepperoni;
import com.gani.factory.abstractFactory.sauce.Sauce;
import com.gani.factory.abstractFactory.veggies.Veggies;

/**
 * Created by Gani on 8/1/17.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
