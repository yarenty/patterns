package com.yarenty.mediator;

/**
 * Created by yarenty on 10/02/2015.
 */
public class DemoMediator {

    public static void main(final String[] args) {

        System.out.println("\n\n **MEDIATOR PATTERN*** \n Mediator pattern is used to reduce communication complexity" +
                " between multiple objects or classes. This pattern provides mediator class which normally  handles" +
                " all the communications between different classes and supports easy maintenance of the code by loose" +
                " coupling. " +
                " \n" +
                " Behavioral pattern.\n" +
                " \n\n");

        final User robert = new User("Robert");
        final User john = new User("John");

        robert.sendMessage("Hi John");
        john.sendMessage("Hello how r u?");
    }
}
