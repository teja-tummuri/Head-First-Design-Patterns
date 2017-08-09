package com.gani.compound.MVC;

/**
 * Created by Gani on 8/8/17.
 */
public interface HeartModelInterface {

    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
