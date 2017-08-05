package com.gani.state;

/**
 * Created by Gani on 8/4/17.
 */
public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
