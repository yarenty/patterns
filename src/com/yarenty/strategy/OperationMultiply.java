package com.yarenty.strategy;

/**
 * Created by yarenty on 16/02/2015.
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(final int num1, final int num2) {
        return num1 * num2;
    }
}
