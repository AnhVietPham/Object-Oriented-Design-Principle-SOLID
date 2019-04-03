package com.avp.srp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection connection;
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection("some/example/myDb");
            System.out.println("Established Database Connection...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disConnect() {
        try {
            connection.close();
            System.out.println("Disconnect from Database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
