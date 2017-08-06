package com.gani.proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Gani on 8/5/17.
 */
public class ImageLoadingState implements ImageState {

    Thread retrievalThread;

    ImageProxy imageProxy;

    public ImageLoadingState(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }



    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("loading image..",x+300,y+190);
            retrievalThread = new Thread(() -> {
                try{
                    imageProxy.setImage(new ImageIcon(imageProxy.getImageURL(),"CD Cover"));
                    c.repaint();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            });
            retrievalThread.start();
        imageProxy.setState(imageProxy.getImageReadyState());
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
