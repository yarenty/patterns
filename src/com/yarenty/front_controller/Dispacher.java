package com.yarenty.front_controller;

/**
 * Created by yarenty on 18/02/2015.
 */
public class Dispacher {

    private StudentView studentView;
    private HomeView homeView;

    public Dispacher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }


    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
