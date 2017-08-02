package com.gani.factory.abstractFactory;

import com.gani.factory.abstractFactory.cheese.Cheese;
import com.gani.factory.abstractFactory.cheese.ReggianoCheese;
import com.gani.factory.abstractFactory.clams.Clams;
import com.gani.factory.abstractFactory.clams.FreshClams;
import com.gani.factory.abstractFactory.dough.Dough;
import com.gani.factory.abstractFactory.dough.ThinCrustDough;
import com.gani.factory.abstractFactory.pepperoni.Pepperoni;
import com.gani.factory.abstractFactory.pepperoni.SlicedPepperoni;
import com.gani.factory.abstractFactory.sauce.MarinaraSauce;
import com.gani.factory.abstractFactory.sauce.Sauce;
import com.gani.factory.abstractFactory.veggies.*;

/**
 * Created by Gani on 8/1/17.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
