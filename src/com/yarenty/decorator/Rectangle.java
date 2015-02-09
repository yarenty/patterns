package com.yarenty.decorator;

/**
 * Created by yarenty on 02/02/15.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}