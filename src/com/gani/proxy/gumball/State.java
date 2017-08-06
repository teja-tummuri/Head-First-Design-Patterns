package com.gani.proxy.gumball;

import java.io.Serializable;

/**
 * Created by Gani on 8/4/17.
 */
public interface State extends Serializable{

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
