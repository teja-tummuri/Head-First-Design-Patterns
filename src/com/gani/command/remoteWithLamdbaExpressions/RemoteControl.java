package com.gani.command.remoteWithLamdbaExpressions;


/**
 * Created by Gani on 8/1/17.
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;


    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        for(int i=0;i<7;i++){
            onCommands[i] = ()->{};
            offCommands[i] = ()->{};
        }


    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot){
        offCommands[slot].execute();
    }

    public String toString(){

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------Remote Control-------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }

        return stringBuffer.toString();
    }

}
