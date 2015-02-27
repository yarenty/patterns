package com.yarenty.nullobject;

/**
 * Created by yarenty on 16/02/2015.
 */
public class DemoNullPattern {

    public static void main(final String[] args) {

        System.out.println("\n\n ***NULL OBJECT PATTERN***\n In null object pattern, a null object replaces check" +
                " of NULL object instance. Instead of putting check for a null value, Null Object reflects a do " +
                " nothing relationship. Such Null object can also be used to provide default behaviour in case data" +
                " is not available.\n" +
                " Behavior pattern.\n" +
                " \n" +
                " We create an abstract class specifying various operations to be done, concrete classes extending" +
                " this class and a null object class providing do nothing implementation of this class and will be " +
                " used seamlessly where we need check null value.\n\n");


        final AbstractCustomer c1 = CustomerFactory.getCustomer("Rob");
        final AbstractCustomer c2 = CustomerFactory.getCustomer("Bob");
        final AbstractCustomer c3 = CustomerFactory.getCustomer("Julie");
        final AbstractCustomer c4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers::");
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());

    }
}
