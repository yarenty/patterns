package com.yarenty.decorator;

/**
 * Created by yarenty on 02/02/15.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(final Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(final Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
