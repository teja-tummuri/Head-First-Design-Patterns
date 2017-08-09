package com.gani.flyweight;

/**
 * Created by Gani on 8/8/17.
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    private static int count=0;

    public static int getCount(){
        return count;
    }
    public Circle(String color){
        this.color = color;
        count++;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
