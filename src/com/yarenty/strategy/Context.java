package com.yarenty.strategy;

/**
 * Created by yarenty on 16/02/2015.
 */
public class Context {

    private Strategy strategy;

    public Context(final Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(final int num1, final int num2) {
        return strategy.doOperation(num1, num2);
    }
}
