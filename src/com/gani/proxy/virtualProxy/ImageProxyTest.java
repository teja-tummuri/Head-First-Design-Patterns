package com.gani.proxy.virtualProxy;

//import javax.swing.*;
//import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.util.Hashtable;

/**
 * Created by Gani on 8/5/17.
 */
public class ImageProxyTest {

    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;

    Hashtable<String, String> cds = new Hashtable<String, String>();

    public static void main(String[] args) throws Exception{
        long currentTime = System.currentTimeMillis();
        ImageProxyTest myTest = new ImageProxyTest();
        System.out.println(System.currentTimeMillis()-currentTime);
    }


    public ImageProxyTest() throws Exception{
        loadCDs();
        URL initialURL = new URL(cds.get("Selected Ambient Works, Vol. 2"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        //creating menu item for each cd
        cds.forEach((name,url)->{
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            //adding action listener for each menuitem
            menuItem.addActionListener(event->{
                long currTime = System.currentTimeMillis();
            setIcon(url);
            frame.repaint();
                System.out.println("Time taken to load icon= "+(System.currentTimeMillis()-currTime));

            });
        });

        Icon icon = new ImageProxy(initialURL);

        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);


    }

    private void loadCDs() {
        cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
    }

    private void setIcon(String url){
        try{
            imageComponent.setIcon(new ImageProxy(new URL(url)));
        }
        catch(MalformedURLException e){
            e.printStackTrace();
        }

    }
}
