package com.yarenty.factory;

/**
 * Created by yarenty on 02/02/15.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}