package com.yarenty.intercepting_filter;

/**
 * Created by yarenty on 18/02/2015.
 */
public class Target {
    public void execute(final String request) {
        System.out.println("EXECUTING request:" + request);
    }


}
