package com.gani.state;

/**
 * Created by Gani on 8/4/17.
 */
public class GumballMachine {

    private State hasQuarterState;
    private State noQuarterState;
    private State soldOutState;
    private State soldState;
    private State winnerState;

    private State state;
    int count = 0;

    public GumballMachine(int numberOfGumballs){

        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        count = numberOfGumballs;

        if(count>0)
            state = noQuarterState;
        else
            state = soldOutState;

    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count!=0)
            count-=1;
    }

    public void refill(int gumballs){
        count+=gumballs;
        System.out.println("Added "+gumballs+" to the machine");
        System.out.println("Current total is "+count);
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }
}
