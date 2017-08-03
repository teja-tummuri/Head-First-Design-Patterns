package com.gani.command.remote;

/**
 * Created by Gani on 8/1/17.
 */
public class StereoOffCommand implements Command{

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void undo() {
        stereo.on();
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
