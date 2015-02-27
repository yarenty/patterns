package com.yarenty.command;

/**
 * Created by yarenty on 10/02/2015.
 */
public class DemoCommandPattern {


    public static void main(final String[] args) {


        System.out.println("\n\n **COMMAND PATTERN*** \n Command pattern is data driven pattern" +
                " and falls under behavioural category. A request is wrapped under an object as command and" +
                " passed to invoker object. Invoker object looks for the appropriate object which can handle this" +
                " command to the corresponding object which executes the command.\n" +
                " \n" +
                " Behavioral pattern.\n" +
                " \n\n");


        final Stock absStock = new Stock();

        final BuyStock buyStockOrder = new BuyStock(absStock);
        final SellStock sellStockOrder = new SellStock(absStock);

        final Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
