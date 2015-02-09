package com.yarenty.abstractfactory;

/**
 * Created by yarenty on 02/02/15.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
