package com.gani.command.remote;

/**
 * Created by Gani on 8/1/17.
 */
public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor("");

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

    }
}
