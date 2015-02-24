package com.yarenty.flyweight;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint
 * and increase performance. This type of design patter comes under structural pattern provides ways to decrease
 * object count this improving the object structure of application.
 *
 * Created by yarenty on 03/02/15.
 */
public class DemoFlyweight {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        System.out.println("\n\n *** FLYWEIGHT PATTERN***\n Flyweight pattern is primarily used to reduce the number" +
                " of objects created and to decrease memory footprint and increase performance. This type of design" +
                " patter comes under structural pattern provides ways to decrease object count this improving the" +
                " object structure of application.\n\n");

        for (int i = 0; i<20; ++i) {
            Circle circle = (Circle)ShapeFactory.getSircle(getRandomColor());
            circle.setX(randomX());
            circle.setY(randomX());
            circle.setRadius(randomX());
            circle.draw();
        }
    }

    private static int randomX() {
        return (int) (Math.random()*100);
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random()*colors.length)];
    }
}
