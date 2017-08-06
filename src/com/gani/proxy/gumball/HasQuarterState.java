package com.gani.proxy.gumball;

import java.util.Random;

/**
 * Created by Gani on 8/4/17.
 */
public class HasQuarterState implements State {

    private static final long serialVersionUID = 2L;
    transient GumballMachineRemoteImpl gumballMachine;
    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachineRemoteImpl gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You already inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Here is your quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned..");
        int winner = random.nextInt(10);
        if(winner==8)
            gumballMachine.setState(gumballMachine.getWinnerState());
        else
            gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}
