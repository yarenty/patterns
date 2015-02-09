package com.yarenty.proxy;

/**
 * In proxy pattern, a class represents functionality of another class.
 * Structural pattern.
 *
 * We create object having orginal object to interface its functionality to outer world.
 *
 * Created by yarenty on 03/02/15.
 */
public class DemoProxy {

    public static void main(String[] args) {

        System.out.println("\n\n ***PROXY PATTERN***\n In proxy pattern, a class represents functionality of another class.\n" +
                " Structural pattern.\n" +
                " \n" +
                " We create object having orginal object to interface its functionality to outer world.\n\n");


        Image image = new ProxyImage("test.png");

        image.display();
        System.out.println("---");
        image.display();
    }
}
