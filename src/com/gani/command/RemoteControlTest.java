package com.gani.command;

/**
 * Created by Gani on 8/2/17.
 */
public class RemoteControlTest {//client

    public static void main(String[] args) {

        //the invoker
        RemoteControl remote = new RemoteControl();

        //creating receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        //light command
        LightOnCommand livingRoomightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        //fan commands
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        //garage door commands
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        //stereo commands
        StereoOnWIthCDCommand stereoOnWIthCD = new StereoOnWIthCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0,livingRoomightOn,livingRoomLightOff);
        remote.setCommand(1,kitchenLightOn,kitchenLightOff);
        remote.setCommand(2,ceilingFanOn,ceilingFanOff);
        remote.setCommand(3,stereoOnWIthCD,stereoOff);


        System.out.println(remote);

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
        remote.onButtonPressed(3);
        remote.offButtonPressed(3);
    }
}
