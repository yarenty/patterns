package com.yarenty.front_controller;

/**
 * Created by yarenty on 18/02/2015.
 */
public class DemoFrontController {

    public static void main(String[] args){

        System.out.println("\n\n ***FRONT CONTROLLER PATTERN***\n Front controller pattern is used to provide " +
                " centralized request handling mechanism co that all requests will be handled by a single handler." +
                " This handler can do the authentication/ authorization/ logging or tracking of request and then pass" +
                " the request to corresponding handlers. Following are the entities ot this type of design pattern:\n" +
                " > FRONT CONTROLLER - single handler for all kinds of requests coming to the application (either" +
                " web based / desktop based).\n" +
                " > DISPATCHER - front controller may use a dispatcher object which can dispatch the request to " +
                " corresponding specific handler.\n" +
                " > VIEW - views are the objects for which the requests are made." +
                " \n" +
                " \n\n");

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
