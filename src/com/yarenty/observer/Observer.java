package com.yarenty.observer;

/**
 * Created by yarenty on 10/02/2015.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
