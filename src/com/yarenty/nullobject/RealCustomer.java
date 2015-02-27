package com.yarenty.nullobject;

/**
 * Created by yarenty on 16/02/2015.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
