package com.gani.command.remote;

/**
 * Created by Gani on 8/2/17.
 */
public class CeilingFan {

    private String location="";
    private int speed;

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location+" Fan speed is set to HIGH");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location+" Fan speed is set to MEDIUM");
    }

    public void low(){
        speed = LOW;
        System.out.println(location+" Fan speed is set to LOW");
    }

    public void off(){
        speed = OFF;
        System.out.println(location+" Fan is OFF");
    }


    public int getSpeed(){
        return speed;
    }

}
