package com.yarenty.builder;

/**
 * Created by yarenty on 02/02/15.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
