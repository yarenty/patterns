package com.yarenty.strategy;

/**
 * Created by yarenty on 16/02/2015.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }
}
