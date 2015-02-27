package com.yarenty.facade;

/**
 * Facade pattern hides the complexities of the system and provides an interface to the client using which the client
 * can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface
 * to existing system to hide its complexities.
 * <p/>
 * This pattern involves a single class which provides simplified methods required by client
 * and delegates calls to methods of existing classes.
 * <p/>
 * Created by yarenty on 03/02/15.
 */
public class DemoFacade {

    public static void main(final String[] args) {

        System.out.println("\n\n ***FACADE PATTERN***\n  Facade pattern hides the complexities of the system and" +
                " provides an interface to the client using which the client an access the system. This pattern" +
                " adds an interface to existing system to hide its complexities. This pattern involves a single" +
                " class which provides simplified methods required by client and delegates calls to methods of" +
                " existing classes.\n" +
                " Structural pattern.\n" +
                " \n\n");

        final ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
