package com.yarenty.abstractfactory;

/**
 * Created by yarenty on 02/02/15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
