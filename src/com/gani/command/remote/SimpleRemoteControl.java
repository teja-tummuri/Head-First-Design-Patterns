package com.gani.command.remote;

/**
 * Created by Gani on 8/1/17.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
