package com.yarenty.abstractfactory;

/**
 * Created by yarenty on 02/02/15.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}