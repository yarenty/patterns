package com.yarenty.composite_entity;

/**
 * Created by yarenty on 18/02/2015.
 */
public class DemoCompositeEntity {


    public static void main(final String[] args) {

        System.out.println("\n\n ***COMPOSITE ENTITY PATTERN***\n Composite entity pattern is used  in EJB persistence" +
                " mechanism. A Composite entity is an EJB entity bean which represents a graph of objects." +
                " When a composite entity is updated, internally dependent object beans get updated automatically" +
                " as being managed by EJB entity bean. Following are the participants in Composite Entity Bean:\n" +
                " > COMPOSITE ENTITY - it is primary entity bean. It can be coarse grained or can contain a coarse" +
                " grained object to be used for persistence purpose.\n" +
                " > COARSE-GRAINED OBJECT - this object contains depended objects. It has its own life cycle and" +
                " also manages life cycle of dependent objects.\n" +
                " > DEPENDENT OBJECT - is an object which depends on coarse grained object for its persistence " +
                " lifecycle.\n" +
                " > STRATEGIES - strategies represents hot to  implement a composite entity. " +
                " Behavior pattern.\n" +
                " \n" +
                " \n\n");

        final Client client = new Client();
        client.setData("Test", "Data");
        client.printData();

        client.setData("Second", "TEst");
        client.printData();
    }
}
