package com.yarenty.bridge;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoBridge {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
