package com.yarenty.chainofresponsibility;

/**
 * Created by yarenty on 03/02/15.
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    //next element of responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(final AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(final int level, final String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(final String message);


}
