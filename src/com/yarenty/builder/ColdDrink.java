package com.yarenty.builder;

/**
 * Created by yarenty on 02/02/15.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}