package com.yarenty.state;


/**
 * Created by yarenty on 16/02/2015.
 */
public class DemoState {

    public static void main(final String[] args) {

        System.out.println("\n\n ***STATE PATTERN***\n In state pattern, a class behavior changes on its state.\n" +
                " Behavior pattern.\n" +
                " \n" +
                " We create objects which represents various states and a context object whose behavior varies" +
                " as its state changes.\n\n");


        final Context context = new Context();

        final StartState startState = new StartState();

        startState.doAction(context);

        System.out.println(context.getState().toString());

        final StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());


    }
}
