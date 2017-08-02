package com.gani.command;

/**
 * Created by Gani on 8/1/17.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("I am not given any task");
    }
}
