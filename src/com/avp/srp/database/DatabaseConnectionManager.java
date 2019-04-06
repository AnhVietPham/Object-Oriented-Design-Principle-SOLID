package com.avp.srp.database;

import java.sql.Connection;

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
        // Todo something connecting DB
        System.out.println("Established Database Connection...");

    }

    public void disConnect() {
        // Todo something closing DB
        System.out.println("Disconnect from Database...");

    }
}
