package com.yarenty.decorator;

/**
 * Created by yarenty on 02/02/15.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}