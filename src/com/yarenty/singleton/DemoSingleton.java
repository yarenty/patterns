package com.yarenty.singleton;

/**
 * Created by yarenty on 24/02/2015.
 */
public class DemoSingleton {

    public static void main(final String[] args) {

        System.out.println("\n\n *** SINGLETON PATTERN***\n Singleton pattern is one of the simplest design patterns" +
                " in Java. This pattern involves a single class which is responsible to create an object while making" +
                " sure that only single objects gets created. This class provides a way to access its only object" +
                " which can be accessed directly without need to instantiate the object of the class.\n" +
                " Default singleton is not thread safe, so here are 2 additional implementations:\n" +
                " > Bill Pugh with inner static helper class.\n" +
                " > Joshua BLoch with enum - prevent using reflection.\n" +
                " Creational pattern.\n" +
                " \n\n");


        //this is illegal:
        //SingleObject object = new SingleObject();

        final SingleObject object = SingleObject.getInstance();

        object.showMessage();

        final ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.showMe();

        final EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        enumSingleton.doSomething();

    }
}
