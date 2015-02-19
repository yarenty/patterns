package com.yarenty.intercepting_filter;

/**
 * Created by yarenty on 18/02/2015.
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("DEBUG request:" + request);
    }
}
