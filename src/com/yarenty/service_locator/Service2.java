package com.yarenty.service_locator;

/**
 * Created by yarenty on 19/02/2015.
 */
public class Service2 implements Service {

    @Override
    public void execute() {
        System.out.println("Executing service #2");
    }

    @Override
    public String getName() {
        return "service2";
    }
}
