package com.gani.proxy;

import java.rmi.*;

/**
 * Created by Gani on 8/3/17.
 */
public interface MyRemote extends Remote{

    public String sayHello() throws RemoteException;
}
