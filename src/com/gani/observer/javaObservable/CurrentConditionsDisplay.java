
package com.gani.observer.javaObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Gani on 7/29/17.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions are: Temperature is "+temperature+"F degrees, Humidity is "+humidity+"%");
    }

    @Override
    public void update(Observable obs, Object arg) {

        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }
}
