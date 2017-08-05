package com.gani.proxy;

import java.rmi.Naming;

/**
 * Created by Gani on 8/4/17.
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }


    public void go(){
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
