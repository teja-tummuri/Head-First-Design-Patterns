package com.gani.template;

/**
 * Created by Gani on 8/2/17.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
     boilWater();
     brew();
     pourToCup();
     addCondiments();
    }

    abstract void addCondiments();

    abstract void brew();

    final void boilWater(){
        System.out.println("Boiling Water");
     }
    final void pourToCup(){
        System.out.println("Pouring into cup");
    }
}
