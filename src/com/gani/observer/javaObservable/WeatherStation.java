package com.gani.observer.javaObservable;

import java.util.Observable;

/**
 * Created by Gani on 7/29/17.
 */
public class WeatherStation {

    public static void main(String[] args){


        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(70,40,30);
        weatherData.setMeasurements(80,40,45);

        weatherData.addObserver(heatIndexDisplay);
        weatherData.setMeasurements(90,70,20);
    }
}
