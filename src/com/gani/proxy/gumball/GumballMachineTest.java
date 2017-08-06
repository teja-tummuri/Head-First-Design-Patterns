package com.gani.proxy.gumball;

import java.rmi.Naming;

/**
 * Created by Gani on 8/4/17.
 */
public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachineRemoteImpl gumballMachine = null;
        int count;

        try{
            gumballMachine = new GumballMachineRemoteImpl("myAdda",10);
            Naming.bind("myAdda",gumballMachine);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
