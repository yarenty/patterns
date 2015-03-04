package com.yarenty.execute_around;

/**
 * Created by yarenty on 04/03/2015.
 */

import java.sql.Connection;

public class TransactionHandler {

    public static void runInTransaction(final Transaction transaction) throws Exception {

        final Connection dbConnection = createDatabaseConnection();
        // dbConnection.setAutoCommit(false);

        try {

            System.out.println("Starting transaction");
            transaction.execute(dbConnection);

            System.out.println("Committing transaction");
            //dbConnection.commit();

        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("Rolling back...");
            //dbConnection.rollback();
        } finally {
            // dbConnection.close();
        }
    }

    private static Connection createDatabaseConnection() throws Exception {
        System.out.println("create connection");
        // Class.forName("com.mysql.jdbc.Driver");
        return null; //DriverManager.getConnection("jdbc:mysql://localhost:3306/ticket_system", "user", "password");
    }
}