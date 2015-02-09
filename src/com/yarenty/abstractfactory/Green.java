package com.yarenty.abstractfactory;

/**
 * Created by yarenty on 02/02/15.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}