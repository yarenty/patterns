package com.yarenty.strategy;

/**
 * Created by yarenty on 16/02/2015.
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
