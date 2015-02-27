package com.yarenty.prototype;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoPrototype {

    public static void main(final String[] args) {

        System.out.println("\n\n ***PROTOTYPEPATTERN***\n Prototype pattern refers to creating duplicate object while " +
                " keeping performance in mind. The pattern involves implementing a prototype interface which tells to" +
                " create a clone of current object. This pattern is used when creation of object directly is costly." +
                " For example, an object is to be created after a costly database operation. We can cache the object," +
                " return its clone on next request and update the database as and when needed thus reducing" +
                " database calls.\n" +
                " Creational pattern.\n" +
                " \n\n");

        ShapeCache.loadCache();

        final Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        final Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        final Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

}
