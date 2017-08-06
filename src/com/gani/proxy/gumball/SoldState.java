package com.gani.proxy.gumball;

/**
 * Created by Gani on 8/4/17.
 */
public class SoldState implements State{

    private static final long serialVersionUID = 2L;
    transient GumballMachineRemoteImpl gumballMachine;

    public SoldState(GumballMachineRemoteImpl gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait while we process your previous request");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0)
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        else {
            System.out.println("Out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
