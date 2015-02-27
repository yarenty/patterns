package com.yarenty.strategy;

/**
 * Created by yarenty on 16/02/2015.
 */
public class DemoStrategy {


    public static void main(final String[] args) {


        System.out.println("\n\n ***STRATEGY PATTERN***\n In strategy pattern, a class behavior or its algorithm " +
                " can be changed at run time.\n" +
                " Behavior pattern.\n" +
                " \n" +
                " We create objects which represents various strategies and a context object whose behavior varies " +
                " as per its strategy object. The strategy object changes the executing algorithm of the context " +
                " object.\n\n");


        Context context = new Context(new OperationAdd());
        System.out.println(("10+5=" + context.executeStrategy(10, 5)));
        context = new Context(new OperationSubstract());
        System.out.println(("10-5=" + context.executeStrategy(10, 5)));
        context = new Context(new OperationMultiply());
        System.out.println(("10*5=" + context.executeStrategy(10, 5)));

    }
}
