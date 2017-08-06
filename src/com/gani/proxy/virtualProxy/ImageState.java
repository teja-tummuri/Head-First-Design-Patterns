package com.gani.proxy.virtualProxy;

import java.awt.*;

/**
 * Created by Gani on 8/5/17.
 */
public interface ImageState {

    public int getIconWidth();
    public int getIconHeight();
    public void paintIcon(final Component c, Graphics g, int x, int y);
}
