package com.gani.factory.simpleFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gani on 8/1/17.
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing "+name+"...");
        System.out.println("Tossing dough...");
        System.out.println("Adding "+sauce+"...");
        System.out.println("Adding toppings: ");
        toppings.forEach(topping-> System.out.println(" "+topping));

    }
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

}
