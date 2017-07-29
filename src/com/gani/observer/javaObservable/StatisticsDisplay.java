package com.gani.observer.javaObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Gani on 7/29/17.
 */
public class StatisticsDisplay implements DisplayElement, Observer {

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum = 0;
    private int totalReadings = 0;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Minimum Temperature: "+minTemp+"F");
        System.out.println("Maximum Temperature: "+maxTemp+"F");
        System.out.println("Average Temperature: "+tempSum/totalReadings+"F");
    }

    @Override
    public void update(Observable obs, Object arg) {

        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            float temp = weatherData.getTemperature();
            if(temp>maxTemp)
                maxTemp = temp;
            if(temp<minTemp)
                minTemp = temp;
            totalReadings++;
            tempSum+=temp;
            display();
        }


    }
}
