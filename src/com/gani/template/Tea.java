package com.gani.template;

/**
 * Created by Gani on 8/2/17.
 */
public class Tea extends CaffeineBeverage{

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }



}

