package com.yarenty.template;

/**
 * Created by yarenty on 16/02/2015.
 */
public class DemoTemplate {

    public static void main(String[] args) {


        System.out.println("\n\n ***TEMPLATE PATTERN***\n In template pattern, an abstract exposes defined ways/" +
                " templates to  execute its methods. Its subclasses can override the method implementation as per " +
                " need but the invocation is to be in the same way as defined by an abstract class. \n" +
                " Behavior pattern.\n" +
                " \n" +
                " \n\n");

        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}
