package com.yarenty.bridge;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoBridge {

    public static void main(String[] args) {

        System.out.println("\n\n ***BRIDGE PATTERN***\n Bridge is used when we need to decouple an abstraction from" +
                " its implementation so that the two can vary independently. The pattern involves an interface which" +
                " acts as a bridge which makes the functionality of concrete classes independent from interface" +
                " implementer classes. BOth types of classes can be altered structurally without affecting each other.\n" +
                " Structural pattern.\n" +
                " \n\n");


        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
