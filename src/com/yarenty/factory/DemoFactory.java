package com.yarenty.factory;

public class DemoFactory {

    public static void main(final String[] args) {


        System.out.println("\n\n ***FACTORY PATTERN***\n The factory pattern is one of the most used design pattern" +
                " in Java. Provides one of the best ways to create an object. In factiory pattern, we create object" +
                " without exposing the creation logic to the client and refer to newly created object using a common" +
                " interface.\n" +
                " Creational pattern.\n" +
                " \n\n");


        final ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        final Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        final Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        final Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();

    }
}
