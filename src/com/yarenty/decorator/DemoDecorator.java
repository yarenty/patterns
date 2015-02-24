package com.yarenty.decorator;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoDecorator {
    public static void main(String[] args) {


        System.out.println("\n\n ***DECORATOR PATTERN***\n Decorator pattern allows a user to add new functionality" +
                " to an existing object without altering its structure. It acts as a wrapper to existing class." +
                " This pattern creates a decorator class which wraps the original class and provides additional" +
                " functionality keeping class methods signature intact.\n" +
                " Structural pattern.\n" +
                " \n\n");

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
