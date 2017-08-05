package com.gani.state;

/**
 * Created by Gani on 8/4/17.
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted any quarters");
    }

    @Override
    public void turnCrank() {
        System.out.println("There is no quarter inserted");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
