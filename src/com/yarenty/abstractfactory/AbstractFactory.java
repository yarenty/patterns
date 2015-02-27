package com.yarenty.abstractfactory;

/**
 * Created by yarenty on 02/02/15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(final String color);

    abstract Shape getShape(final String shape);
}
