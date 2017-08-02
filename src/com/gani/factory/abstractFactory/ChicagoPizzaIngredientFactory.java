package com.gani.factory.abstractFactory;

import com.gani.factory.abstractFactory.cheese.Cheese;
import com.gani.factory.abstractFactory.cheese.MozzarellaCheese;
import com.gani.factory.abstractFactory.clams.Clams;
import com.gani.factory.abstractFactory.clams.FrozenClams;
import com.gani.factory.abstractFactory.dough.Dough;
import com.gani.factory.abstractFactory.dough.ThickCrustDough;
import com.gani.factory.abstractFactory.pepperoni.Pepperoni;
import com.gani.factory.abstractFactory.pepperoni.SlicedPepperoni;
import com.gani.factory.abstractFactory.sauce.PlumTomatoSauce;
import com.gani.factory.abstractFactory.sauce.Sauce;
import com.gani.factory.abstractFactory.veggies.BlackOlives;
import com.gani.factory.abstractFactory.veggies.EggPlant;
import com.gani.factory.abstractFactory.veggies.Spinach;
import com.gani.factory.abstractFactory.veggies.Veggies;

/**
 * Created by Gani on 8/1/17.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
