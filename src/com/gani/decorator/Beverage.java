package com.gani.decorator;

/**
 * Created by Gani on 7/29/17.
 */
public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI}

    Size size = Size.TALL;

    public String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
