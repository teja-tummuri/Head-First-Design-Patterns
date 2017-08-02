package com.gani.command;

/**
 * Created by Gani on 8/1/17.
 */
public class StereoOnWIthCDCommand implements Command {

    Stereo stereo;

    public StereoOnWIthCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
