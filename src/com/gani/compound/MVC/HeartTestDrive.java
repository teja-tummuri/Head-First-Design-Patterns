package com.gani.compound.MVC;

/**
 * Created by Gani on 8/8/17.
 */
public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModel heart = new HeartModel();
        ControllerInterface controller = new HeartController(heart);
    }
}
