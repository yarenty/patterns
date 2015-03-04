package com.yarenty.execute_around;

/**
 * Created by yarenty on 04/03/2015.
 */

import java.sql.Connection;
import java.sql.SQLException;

public interface Transaction {
    public void execute(Connection connection) throws SQLException;
}
