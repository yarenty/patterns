package com.yarenty.chainofresponsibility;

/**
 * Created by yarenty on 03/02/15.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Error::Logger:: " +message);
    }

}
