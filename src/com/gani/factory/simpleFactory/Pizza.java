package com.gani.factory.simpleFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gani on 8/1/17.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing "+name+"...");
        System.out.println("Tossing dough...");
        System.out.println("Adding "+sauce+"...");
        System.out.println("Adding toppings: ");
        toppings.forEach(topping-> System.out.println(" "+topping));

    }
    void bake(){
        System.out.println("Bake for 20 min at 400");
    }
    void cut(){
        System.out.println("Cutting pizza into slices");
    }
    void box(){
        System.out.println("Putting the pizza in the box");
    }

    public String getName(){
        return name;
    }

}
