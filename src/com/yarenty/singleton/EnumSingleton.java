package com.yarenty.singleton;

/**
 * Joshua Bloch solution - Java ensures that any enum is instantiated only once in a Java program.
 * The drawback: is not flexible - it does not allow lazy initialization.
 * <p/>
 * Created by yarenty on 24/02/2015.
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("you cannot create 2 instances  anymore");
    }
}
