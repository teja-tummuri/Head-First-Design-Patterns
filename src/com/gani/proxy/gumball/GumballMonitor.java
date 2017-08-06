package com.gani.proxy.gumball;

/**
 * Created by Gani on 8/5/17.
 */
public class GumballMonitor {

    private GumballMachineRemote machineRemote;

    public GumballMonitor(GumballMachineRemote machineRemote) {
        this.machineRemote = machineRemote;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: " + machineRemote.getLocation());
            System.out.println("Current inventory: "+machineRemote.getCount());
            System.out.println("Current state: "+machineRemote.getState());
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }

}
