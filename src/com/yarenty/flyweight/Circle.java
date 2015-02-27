package com.yarenty.flyweight;


/**
 * Created by yarenty on 03/02/15.
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(final String color) {
        this.color = color;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public void setRadius(final int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw() [Color:" + color + ", x:" + x + ", y:" + y + ", radius:" + radius + "]");
    }
}
