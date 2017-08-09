package com.gani.compound.MVC;

/**
 * Created by Gani on 8/7/17.
 */
public interface ControllerInterface {

    void start();
    void stop();

    void setBPM(int bpm);

    void increaseBPM();

    void decreaseBPM();
}
