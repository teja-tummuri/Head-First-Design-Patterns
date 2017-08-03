package com.gani.command;

/**
 * Created by Gani on 8/2/17.
 */
public class CeilingFan {

    String location="";

    public CeilingFan(String location) {
        this.location = location;
    }

    public void off(){
        System.out.println(location+" Fan is OFF");
    }

    public void on(){
        System.out.println(location+" Fan is ON");
    }


}
