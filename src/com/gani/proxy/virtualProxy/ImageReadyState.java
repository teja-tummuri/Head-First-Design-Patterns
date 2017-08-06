package com.gani.proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gani on 8/5/17.
 */
public class ImageReadyState implements ImageState {

    private ImageProxy imageProxy;

    public ImageReadyState(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageProxy.getImage().paintIcon(c,g,x,y);
    }

    @Override
    public int getIconWidth() {
        return imageProxy.getImage().getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageProxy.getImage().getIconHeight();
    }

}
