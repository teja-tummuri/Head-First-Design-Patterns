package com.gani.compound.combiningPatterns;


/**
 * Created by Gani on 8/7/17.
 */
public interface QuackObservable{

    public void registerObserver(Observer observer);
    public void notifyObservers();

}
