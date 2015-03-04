package com.yarenty.execute_around;

import java.sql.Connection;

/**
 * the execute around method pattern and how great it works together with lambdas.
 * <p/>
 * The pattern is popular when handling resources, but also fits other situations where you have common parts.
 * By using this pattern you remove the burden of having common code in several classes. That way they can focus on their core functionality.
 * <p/>
 * To give an example of this pattern, I’ve created a transaction handler.
 * <p/>
 * We have an interface, called Transaction, with an execute method.
 * <p/>
 * Created by yarenty on 04/03/2015.
 */
public class DemoExecuteAroundMethod {

    public static void main(final String[] args) throws Exception {
        System.out.println("*** EXECUTE AROUND METHOD****\n\n  the execute around method pattern and how great it " +
                "works together with lambdas.\n" +
                "The pattern is popular when handling resources, but also fits other situations where you have common " +
                "parts. By using this pattern you remove the burden of having common code in several classes. That way " +
                "they can focus on their core functionality.\n" +
                "To give an example of this pattern, I’ve created a transaction handler.\n" +
                "We have an interface, called Transaction, with an execute method.");


        testFailedPurchase();
        testSuccessfulPurchase();
    }


    public static void testSuccessfulPurchase() throws Exception {

        TransactionHandler.runInTransaction(connection -> {

            final int ticketId = findAvailableTicket(connection);

            reserveTicket(ticketId, connection);
            markAsBought(ticketId, connection);
        });


//        assertEquals(getNrOfTicketsIn(TicketState.AVAILABLE), 9);
//        assertEquals(getNrOfTicketsIn(TicketState.RESERVED), 0);
//        assertEquals(getNrOfTicketsIn(TicketState.BOUGHT), 1);
    }


    public static void testFailedPurchase() throws Exception {

        TransactionHandler.runInTransaction(connection -> {

            final int ticketId = findAvailableTicket(connection);

            reserveTicket(ticketId, connection);
            throw new IllegalStateException("Not approved credit card");
        });

//        assertEquals(getNrOfTicketsIn(TicketState.AVAILABLE), 10);
//        assertEquals(getNrOfTicketsIn(TicketState.RESERVED), 0);
//        assertEquals(getNrOfTicketsIn(TicketState.BOUGHT), 0);
    }


    private static void markAsBought(final int ticketId, final Connection connection) {
        System.out.println("bought ticket #" + ticketId);

    }

    private static void reserveTicket(final int ticketId, final Connection connection) {
        System.out.println("reserving ticket #" + ticketId);

    }


    private static int findAvailableTicket(final Connection connection) {
        System.out.println("finding ticket #0");
        return 0;
    }
}
