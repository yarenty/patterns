package com.yarenty.singleton;

/**
 * Created by yarenty on 24/02/2015.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be instantiated
    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }


    public void showMessage() {
        System.out.println("Hello world!");
    }


}
