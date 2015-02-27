package com.yarenty.prototype;

/**
 * Created by yarenty on 02/02/15.
 */

import java.util.Hashtable;

public class ShapeCache {

    private static final Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(final String shapeId) {
        final Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        final Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        final Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        final Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
