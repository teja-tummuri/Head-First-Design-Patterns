package com.gani.observer;

/**
 * Created by Gani on 7/29/17.
 */
public class StatisticsDisplay implements DisplayElement,Observer {

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum = 0;
    private int totalReadings = 0;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if(temp>maxTemp)
            maxTemp = temp;
        if(temp<minTemp)
            minTemp = temp;
        totalReadings++;
        tempSum+=temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("Minimum Temperature: "+minTemp+"F");
        System.out.println("Maximum Temperature: "+maxTemp+"F");
        System.out.println("Average Temperature: "+tempSum/totalReadings+"F");
    }
}
