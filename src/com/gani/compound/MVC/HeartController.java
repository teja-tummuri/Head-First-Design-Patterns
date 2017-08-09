package com.gani.compound.MVC;

/**
 * Created by Gani on 8/8/17.
 */
public class HeartController implements ControllerInterface {

    DJView view;
    HeartModelInterface model;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(new HeartAdapter(model),this);
        view.createView();
        view.createControls();
        view.disableStopMenu();
        view.disableStartMenu();

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }
}
