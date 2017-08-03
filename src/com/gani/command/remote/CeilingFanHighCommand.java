package com.gani.command.remote;

/**
 * Created by Gani on 8/3/17.
 */
public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();

    }

    @Override
    public void undo() {
        switch(prevSpeed){
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
            case CeilingFan.OFF:
                ceilingFan.off();
        }
    }
}
