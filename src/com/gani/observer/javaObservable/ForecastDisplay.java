package com.gani.observer.javaObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Gani on 7/29/17.
 */
public class ForecastDisplay implements DisplayElement, Observer {

    private Observable observable;
    private float currPressure = 0;
    private float prevPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast:");
        if(prevPressure<currPressure)
            System.out.println("Weather is kinda improving");
        else if(prevPressure>currPressure)
            System.out.println("Rain Rain go away!!");
        else
            System.out.println("More or less the same");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            prevPressure = currPressure;
            currPressure = weatherData.getPressure();
            display();
        }
    }
}
