package com.yarenty.prototype;

/**
 * Created by yarenty on 02/02/15.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}