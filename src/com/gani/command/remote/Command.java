package com.gani.command.remote;

/**
 * Created by Gani on 8/1/17.
 */
public interface Command {

    public void execute();
    public void undo();
}
