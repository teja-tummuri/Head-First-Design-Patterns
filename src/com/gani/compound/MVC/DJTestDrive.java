package com.gani.compound.MVC;

/**
 * Created by Gani on 8/7/17.
 */
public class DJTestDrive {

    public static void main(String[] args) {

        BeatModelInterface model = new BeatModel();
        BeatController controller = new BeatController(model);

    }
}
