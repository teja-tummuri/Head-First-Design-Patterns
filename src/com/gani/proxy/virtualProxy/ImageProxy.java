package com.gani.proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Gani on 8/5/17.
 */
public class ImageProxy implements Icon {

    private volatile ImageIcon image;
    private final URL imageURL;

//    Thread retrievalThread;
//    boolean retrieving = false;

    private ImageState imageReadyState;
    private ImageState imageLoadingState;

    private ImageState state;


    public ImageProxy(URL imageURL) {

        this.imageURL = imageURL;
        imageReadyState = new ImageReadyState(this);
        imageLoadingState = new ImageLoadingState(this);
        state = imageLoadingState;
    }

    synchronized public void setImage(ImageIcon image) {
        this.image = image;
    }

    public void setState(ImageState state){
        this.state = state;
    }


    public ImageIcon getImage(){
        return image;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

        state.paintIcon(c,g,x,y);
//
//        if(image!=null)
//            image.paintIcon(c,g,x,y);
//        else{
//            g.drawString("loading image..",x+300,y+190);
//            if(!retrieving){
//                retrieving = true;
//                retrievalThread = new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try{
//                            setImage(new ImageIcon(imageURL,"CD Cover"));
//                            c.repaint();
//                        }
//                        catch (Exception e){
//                            e.printStackTrace();
//                        }
//                    }
//                });
//
//                retrievalThread.start();
//            }
//        }

    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }

    public URL getImageURL() {
        return imageURL;
    }

    public ImageState getImageReadyState() {
        return imageReadyState;
    }

    public ImageState getImageLoadingState() {
        return imageLoadingState;
    }
}
