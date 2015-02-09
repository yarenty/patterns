package com.yarenty.prototype;

/**
 * Created by yarenty on 02/02/15.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
