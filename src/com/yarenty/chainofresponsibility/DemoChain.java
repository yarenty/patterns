package com.yarenty.chainofresponsibility;

/**
 * Creates a chain of receiver objects for a request.
 * This pattern decouples sender and receiver of a request based on type of request.
 *
 * Behavioral pattern.
 *
 * Normally each receiver contains reference to another receiver. If one object cannot handle request then
 * it passes the same to the next receiver and so on.
 *
 *
 * Created by yarenty on 03/02/15.
 */
public class DemoChain {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }


    public static void main(String[] args){

        System.out.println("\n\n ***CHAIN OF RESPONSIBILITY*** \n Creates a chain of receiver objects for a request.\n" +
                " This pattern decouples sender and receiver of a request based on type of request.\n" +
                " \n" +
                " Behavioral pattern.\n" +
                " \n" +
                " Normally each receiver contains reference to another receiver. If one object cannot handle request then\n" +
                " it passes the same to the next receiver and so on.\n\n");

        AbstractLogger logger = getChainOfLoggers();

        logger.logMessage(AbstractLogger.INFO,"This is info level");
        logger.logMessage(AbstractLogger.DEBUG,"This is debug level");
        logger.logMessage(AbstractLogger.ERROR,"This is error level");

    }
}
