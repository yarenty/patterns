package com.yarenty.proxy;

/**
 * In proxy pattern, a class represents functionality of another class.
 * Structural pattern.
 * <p/>
 * We create object having original object to interface its functionality to outer world.
 * <p/>
 * Created by yarenty on 03/02/15.
 */
public class DemoProxy {

    public static void main(final String[] args) {

        System.out.println("\n\n ***PROXY PATTERN***\n In proxy pattern, a class represents functionality of another" +
                " class.\n" +
                " Structural pattern.\n" +
                " \n" +
                " We create object having original object to interface its functionality to outer world.\n\n");


        final Image image = new ProxyImage("test.png");

        image.display();
        System.out.println("---");
        image.display();
    }
}
