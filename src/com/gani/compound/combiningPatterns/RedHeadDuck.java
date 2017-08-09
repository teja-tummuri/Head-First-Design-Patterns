package com.gani.compound.combiningPatterns;

/**
 * Created by Gani on 8/6/17.
 */
public class RedHeadDuck implements Quackable {

    Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack");
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Red Head Duck";
    }
}
