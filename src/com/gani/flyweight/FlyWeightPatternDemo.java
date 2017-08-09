package com.gani.flyweight;

import sun.security.provider.SHA;

import java.util.HashMap;

/**
 * Created by Gani on 8/8/17.
 */
public class FlyWeightPatternDemo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        HashMap<String,Shape> myMap = ShapeFactory.getCircleMap();

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        System.out.println(Circle.getCount());

        System.out.println("Whoaa");
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}