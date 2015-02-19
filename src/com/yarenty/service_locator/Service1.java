package com.yarenty.service_locator;

/**
 * Created by yarenty on 19/02/2015.
 */
public class Service1 implements Service {

    @Override
    public void execute() {
        System.out.println("Executing service #1");
    }

    @Override
    public String getName() {
        return "service1";
    }
}
