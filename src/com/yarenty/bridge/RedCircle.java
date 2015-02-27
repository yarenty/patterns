package com.yarenty.bridge;

/**
 * Created by yarenty on 02/02/15.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(final int radius, final int x, final int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
