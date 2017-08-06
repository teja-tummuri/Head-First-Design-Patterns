package com.gani.proxy.gumball;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Gani on 8/5/17.
 */
public class GumballMonitorTest {

    public static void main(String[] args) {

        GumballMonitor monitor = null;
        GumballMachineRemote machine = null;
        try {
            machine = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/myAdda");
            monitor = new GumballMonitor(machine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        monitor.report();

    }
}
