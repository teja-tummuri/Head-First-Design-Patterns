package com.gani.state;

/**
 * Created by Gani on 8/4/17.
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        if(gumballMachine.getCount()>0){
            System.out.println("Congratulations!! You are a winner and you get another gumball");
            gumballMachine.releaseBall();
            if(gumballMachine.getCount()>0)
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            else {
                System.out.println("Out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }

        }
        else{
            System.out.println("Out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }



    }
}
