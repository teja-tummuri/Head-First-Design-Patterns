package com.gani.state;

/**
 * Created by Gani on 8/4/17.
 */
public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);


        for(int i=0;i<10;i++){
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
    }
}
