package com.gani.adapter;

/**
 * Created by Gani on 8/3/17.
 */
public class WIldTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I fly in short distances");
    }
}
