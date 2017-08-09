package com.gani.compound.MVC;

import javax.swing.*;

/**
 * Created by Gani on 8/7/17.
 */
public class BeatBar extends JProgressBar implements Runnable{

    private static final long serialVersionUID = 2L;

    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        for(;;){
            int value = getValue();
            value = (int)(value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {};
        }
    }
}
