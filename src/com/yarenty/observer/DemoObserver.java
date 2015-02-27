package com.yarenty.observer;

/**
 * Created by yarenty on 10/02/2015.
 */
public class DemoObserver {

    public static void main(final String[] args) {

        System.out.println("\n\n **OBSERVER PATTERN*** \n Observer pattern is used when there is one-to-many " +
                " relationship between objects such as if one object is modified, its dependent objects are to be" +
                " notified automatically. " +
                " \n" +
                " Behavioral pattern.\n" +
                " Memento pattern uses 3 actor classes: Subject, Observer and Client. \n" +
                " Subject is an object having methods to attach and detach observers to a client object" +
                " \n\n");


        final Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
