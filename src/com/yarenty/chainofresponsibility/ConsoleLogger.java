package com.yarenty.chainofresponsibility;

/**
 * Created by yarenty on 03/02/15.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(final int level) {
        this.level = level;
    }

    @Override
    protected void write(final String message) {
        System.out.println("Console::Logger:: " + message);
    }

}
