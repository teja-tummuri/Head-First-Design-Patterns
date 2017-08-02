package com.gani.template;

/**
 * Created by Gani on 8/2/17.
 */
public class Coffee extends CaffeineBeverage{

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    void brew() {
        System.out.println("Brewing coffee");
    }

}
