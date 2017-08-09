package com.gani.compound.combiningPatterns;

/**
 * Created by Gani on 8/6/17.
 */
public class MallardDuck implements Quackable {

    Observable observable;//helper object which takes the role of being an observable

    public MallardDuck() {
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
        return "Mallard Duck";
    }
}
