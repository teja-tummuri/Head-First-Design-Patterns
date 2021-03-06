package com.gani.compound.MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gani on 8/7/17.
 */
public class DJView implements ActionListener, BeatObserver, BPMObserver {

    BeatModelInterface model;
    ControllerInterface controller;
    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputlabel;

    JFrame controlFrame;
    JPanel controlPanel;

    JLabel bpmLabel;
    JTextField bpmTextField;

    JButton setBPMButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;

    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;
    JMenuItem quitMenuItem;

    public DJView(BeatModelInterface model, ControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver((BPMObserver) this);
        model.registerObserver((BeatObserver) this);
    }

    @Override
    public void updateBPM() {
        int bpm = model.getBPM();
        if(bpm == 0)
            bpmOutputlabel.setText("Offline");
        else
            bpmOutputlabel.setText("Current BPM: "+model.getBPM());
    }

    @Override
    public void updateBeat() {
        if(beatBar!=null)
            beatBar.setValue(model.getBPM());
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==setBPMButton){
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        } else if(event.getSource()==increaseBPMButton){
            controller.increaseBPM();
        } else if(event.getSource()==decreaseBPMButton){
            controller.decreaseBPM();
        }

    }


    public void enableStopMenu(){
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenu(){
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenu(){
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenu(){
        startMenuItem.setEnabled(false);
    }

    public void createView(){
        viewPanel = new JPanel(new GridLayout(1,2));
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100,80));
        bpmOutputlabel = new JLabel("Offline",SwingConstants.CENTER);
        bpmOutputlabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        beatBar = new BeatBar();
        beatBar.setValue(50);
        JPanel bpmPanel = new JPanel(new GridLayout(2,1));
        bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputlabel);
        viewPanel.add(bpmPanel);
        viewFrame.getContentPane().add(viewPanel,BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);

    }

    public void createControls(){

        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100,80));
        controlPanel = new JPanel(new GridLayout(1,2));

        menuBar = new JMenuBar();
        menu = new JMenu("DJ Control");
        startMenuItem = new JMenuItem("Start");
        stopMenuItem = new JMenuItem("Stop");
        quitMenuItem = new JMenuItem("Quit");

        startMenuItem.addActionListener(event->controller.start());
        stopMenuItem.addActionListener(event->controller.stop());
        quitMenuItem.addActionListener(event->System.exit(0));

        menu.add(startMenuItem);
        menu.add(stopMenuItem);
        menu.add(quitMenuItem);

        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("Enter BPM:",SwingConstants.RIGHT);
        setBPMButton = new JButton("Set");
        setBPMButton.setSize(new Dimension(10,40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");

        setBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1,2));

        buttonPanel.add(decreaseBPMButton);
        buttonPanel.add(increaseBPMButton);

        JPanel enterPanel = new JPanel(new GridLayout(1,2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);
        JPanel insideControlPanel = new JPanel(new GridLayout(3,1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBPMButton);
        insideControlPanel.add(buttonPanel);
        controlPanel.add(insideControlPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.getContentPane().add(controlPanel,BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setVisible(true);

    }


}
