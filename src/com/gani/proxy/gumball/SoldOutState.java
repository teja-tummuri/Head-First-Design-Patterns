package com.gani.proxy.gumball;

/**
 * Created by Gani on 8/4/17.
 */
public class SoldOutState implements State {

    private static final long serialVersionUID = 2L;
    transient GumballMachineRemoteImpl gumballMachine;

    public SoldOutState(GumballMachineRemoteImpl gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, we are out of gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't given any quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("No use turning, we are out of gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("We are out of gumballs");
    }
}
