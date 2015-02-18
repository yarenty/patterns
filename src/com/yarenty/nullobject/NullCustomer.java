package com.yarenty.nullobject;

/**
 * Created by yarenty on 16/02/2015.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Unknown ...";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
