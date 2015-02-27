package com.yarenty.bussines_delegate;

/**
 * Created by yarenty on 18/02/2015.
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(final BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }


    public void doTask() {
        businessDelegate.doTask();
    }
}
