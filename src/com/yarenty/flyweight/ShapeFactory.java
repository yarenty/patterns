package com.yarenty.flyweight;

import java.util.HashMap;

/**
 * Created by yarenty on 03/02/15.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getSircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if (circle==null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color:" +color);
        }

        return circle;
    }
}
