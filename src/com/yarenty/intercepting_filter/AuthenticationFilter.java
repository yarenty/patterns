package com.yarenty.intercepting_filter;

/**
 * Created by yarenty on 18/02/2015.
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(final String request) {
        System.out.println("Authenticating request:" + request);
    }
}
