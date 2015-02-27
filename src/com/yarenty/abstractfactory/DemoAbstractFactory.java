package com.yarenty.abstractfactory;

/**
 * Created by yarenty on 02/02/15.
 */
public class DemoAbstractFactory {

    public static void main(final String[] args) {

        System.out.println("\n\n *** ABSTRACT FACTORY PATTERN***\n Abstract Factory pattern work around a" +
                " super-factory which creates other factories. This is also called as factory of factories." +
                " In Abstract Factory pattern an interface is responsible for creating a factory of related" +
                " objects without explicitly specifying their classes. Each generated factory can give the" +
                " objects as per the Factory pattern.\n" +
                " Creational pattern.\n" +
                " \n\n");

        //get shape factory
        final AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        final Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        shape1.draw();

        //get an object of Shape Rectangle
        final Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        shape2.draw();

        //get an object of Shape Square
        final Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        shape3.draw();

        //get color factory
        final AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        final Color color1 = colorFactory.getColor("RED");

        //call fill method of Red
        color1.fill();

        //get an object of Color Green
        final Color color2 = colorFactory.getColor("Green");

        //call fill method of Green
        color2.fill();

        //get an object of Color Blue
        final Color color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        color3.fill();
    }
}
