package com.gani.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gani on 7/29/17.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observers.indexOf(observer)<0)
                observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index>=0)
            observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature,humidity,pressure));
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
