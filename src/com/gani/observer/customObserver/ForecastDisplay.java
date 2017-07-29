package com.gani.observer.customObserver;

/**
 * Created by Gani on 7/29/17.
 */
public class ForecastDisplay implements DisplayElement,Observer {

    private WeatherData weatherData;
    private float currPressure = 0;
    private float prevPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        prevPressure = currPressure;
        currPressure = pressure;
        display();
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
}
