package com.gani.state;

/**
 * Created by Gani on 8/4/17.
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
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
