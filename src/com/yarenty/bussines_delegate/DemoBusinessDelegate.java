package com.yarenty.bussines_delegate;

/**
 * Created by yarenty on 18/02/2015.
 */
public class DemoBusinessDelegate {

    public static void main(final String[] args) {

        System.out.println("\n\n ***BUSINESS DELEGATE PATTERN***\n Business delegate pattern is used to decouple " +
                " presentation tier. It is basically use to reduce communication or remote lookup functionality to" +
                " business tier code in presentation tier code. It business tier we have following entities:\n" +
                " > CLIENT - presentation tier code may be JSP, servlet or UI java code.\n" +
                " > BUSINESS DELEGATE - a single entry point class for client entities to provide access to " +
                " business service methods.\n" +
                " > LOOKUP SERVICE - responsible to get relative business implementation and provide business object" +
                " access to business delegate object.\n" +
                " > BUSINESS SERVICE - business service interface. Concrete classes implement this business service" +
                " to provide actual business implementation logic \n" +
                " Behavior pattern.\n" +
                " \n" +
                " \n\n");

        final BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        final Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();

    }
}
