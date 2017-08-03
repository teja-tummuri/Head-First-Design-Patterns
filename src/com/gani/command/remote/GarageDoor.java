package com.gani.command.remote;

/**
 * Created by Gani on 8/1/17.
 */
public class GarageDoor {

    String location="";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println("Garage door is opened");
    }

    public void down(){
        System.out.println("Garage door is closed down");
    }

    public void stop(){

    }

    public void lightOn(){

    }

    public void lightOff(){

    }

}
