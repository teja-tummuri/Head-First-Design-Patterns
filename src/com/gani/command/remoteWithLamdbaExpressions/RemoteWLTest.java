package com.gani.command.remoteWithLamdbaExpressions;

import com.gani.command.remote.CeilingFan;
import com.gani.command.remote.GarageDoor;
import com.gani.command.remote.Light;
import com.gani.command.remote.Stereo;

/**
 * Created by Gani on 8/3/17.
 */
public class RemoteWLTest {

    public static void main(String[] args) {

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo livingRoomStereo = new Stereo("Living room");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("Main house");

        RemoteControl remote = new RemoteControl();

        remote.setCommand(0,()->livingRoomLight.on(),()->livingRoomLight.off());
        remote.setCommand(1,kitchenLight::on,kitchenLight::off);

        Command stereoOnWithCD = ()->{livingRoomStereo.on();livingRoomStereo.setCd();livingRoomStereo.setVolume(11);};

        remote.setCommand(2,stereoOnWithCD,livingRoomStereo::off);
        remote.setCommand(3,ceilingFan::high,ceilingFan::off);
        remote.setCommand(4,garageDoor::up,garageDoor::down);

        System.out.println(remote);

        remote.onButtonPressed(0);
        remote.onButtonPressed(1);
        remote.onButtonPressed(2);
        remote.onButtonPressed(3);
        remote.onButtonPressed(4);

        remote.offButtonPressed(1);


    }
}
