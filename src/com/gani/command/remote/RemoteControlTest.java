package com.gani.command.remote;

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
        LightOnCommand livingRoomlightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        //fan commands
        CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        //garage door commands
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        //stereo commands
        StereoOnWIthCDCommand stereoOnWIthCD = new StereoOnWIthCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = {livingRoomlightOn,kitchenLightOn,ceilingFanOn};
        Command[] partyOff = {livingRoomLightOff,kitchenLightOff,ceilingFanOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remote.setCommand(0,livingRoomlightOn,livingRoomLightOff);
        remote.setCommand(1,kitchenLightOn,kitchenLightOff);
        remote.setCommand(2,ceilingFanOn,ceilingFanOff);
        remote.setCommand(3,stereoOnWIthCD,stereoOff);

        remote.setCommand(5,partyOnMacro,partyOffMacro);


        System.out.println(remote);

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.undoButtonPressed();
        remote.onButtonPressed(2);

        remote.offButtonPressed(2);
        remote.onButtonPressed(3);
        remote.offButtonPressed(3);

        System.out.println("----Pushing Macro----");
        remote.onButtonPressed(5);

        remote.undoButtonPressed();

        System.out.println(remote);

    }
}
