package com.gani.command;

/**
 * Created by Gani on 8/2/17.
 */
public class RemoteControlTest {

    public static void main(String[] args) {

        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        remote.setCommand(0,lightOn,lightOff);



        System.out.println(remote.toString());

        remote.onButtonPressed(0);
        remote.offButtonPressed(1);
    }
}
