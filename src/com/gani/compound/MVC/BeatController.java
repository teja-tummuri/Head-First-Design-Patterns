package com.gani.compound.MVC;

/**
 * Created by Gani on 8/7/17.
 */
public class BeatController implements ControllerInterface {

    DJView view;
    BeatModelInterface model;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(model,this);
        view.createView();
        view.createControls();
        view.disableStopMenu();
        view.enableStartMenu();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenu();
        view.enableStopMenu();
    }

    @Override
    public void stop() {
        model.off();
        view.enableStartMenu();
        view.disableStopMenu();
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

    @Override
    public void increaseBPM() {
        model.setBPM(model.getBPM()+1);
    }

    @Override
    public void decreaseBPM() {
        model.setBPM(model.getBPM()-1);
    }
}
