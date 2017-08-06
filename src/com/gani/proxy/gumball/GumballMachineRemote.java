package com.gani.proxy.gumball;

import java.rmi.*;
/**
 * Created by Gani on 8/5/17.
 */
public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;

}
