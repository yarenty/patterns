package com.yarenty.abstractfactory;

/**
 * Created by yarenty on 02/02/15.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
