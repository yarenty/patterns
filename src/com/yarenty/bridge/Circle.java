package com.yarenty.bridge;

/**
 * Created by yarenty on 02/02/15.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(final int x, final int y, final int radius, final DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
