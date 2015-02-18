package com.yarenty.bussines_delegate;

/**
 * Created by yarenty on 18/02/2015.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service.");
    }
}
