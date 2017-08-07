package com.gani.compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Gani on 8/6/17.
 */
public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();


    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {

        quackers.forEach(quacker->quacker.quack());
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.forEach(quacker->quacker.registerObserver(observer));

    }

    @Override
    public void notifyObservers() {
    }
}
