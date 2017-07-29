package com.gani.observer;

/**
 * Created by Gani on 7/29/17.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;//why not use Subject interface? Why did we code to implementation?

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions are: Temperature is "+temperature+"F degrees, Humidity is "+humidity+"%");
    }

}
