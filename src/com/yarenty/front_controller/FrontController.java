package com.yarenty.front_controller;

/**
 * Created by yarenty on 18/02/2015.
 */
public class FrontController {

    private Dispacher dispacher;

    public FrontController() {
        dispacher = new Dispacher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(final String request) {
        System.out.println("Page requested:" + request);
    }

    public void dispatchRequest(final String request) {
        trackRequest(request);

        if (isAuthenticUser()) {
            dispacher.dispatch(request);
        }
    }
}
