package com.gani.observer.javaObservable;

import java.util.Observable;

/**
 * Created by Gani on 7/29/17.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


}
