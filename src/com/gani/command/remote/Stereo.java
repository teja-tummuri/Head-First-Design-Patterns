package com.gani.command.remote;

/**
 * Created by Gani on 8/1/17.
 */
public class Stereo {

    String location="";

    public Stereo(String location) {
        this.location = location;
    }

    private int volume;

    public void on(){
        System.out.println(location+" Stereo is ON");
    }

    public void off(){
        System.out.println(location+" Stereo is OFF");
    }

    public void setCd(){
        System.out.println(location+" Stereo is set for CD input");
    }

    public void setDvd(){

    }

    public void setRadio(){

    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(location+" Volume is set to "+volume);
    }

    public int getVolume(){
        return volume;
    }
}
