package com.gani.factory.abstractFactory.pizzas;

import com.gani.factory.abstractFactory.cheese.Cheese;
import com.gani.factory.abstractFactory.clams.Clams;
import com.gani.factory.abstractFactory.dough.Dough;
import com.gani.factory.abstractFactory.pepperoni.Pepperoni;
import com.gani.factory.abstractFactory.sauce.Sauce;
import com.gani.factory.abstractFactory.veggies.Veggies;

/**
 * Created by Gani on 8/1/17.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 20 min at 400");
    }

    public void cut(){
        System.out.println("Cutting pizza into slices");
    }

    public void box(){
        System.out.println("Putting the pizza in the box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){

        return "";
    }

}
