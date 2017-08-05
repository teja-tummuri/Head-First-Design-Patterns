package com.gani.proxy;

import java.rmi.*;
import java.rmi.server.*;

/**
 * Created by Gani on 8/3/17.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello(){
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
