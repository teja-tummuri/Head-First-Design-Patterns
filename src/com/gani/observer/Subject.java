package com.gani.observer;

/**
 * Created by Gani on 7/29/17.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
