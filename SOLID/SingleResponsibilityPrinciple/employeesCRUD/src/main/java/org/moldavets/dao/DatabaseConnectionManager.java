package org.moldavets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/employees-database";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1234";

    private static DatabaseConnectionManager connectionInstance;
    private static Connection connection;


    public DatabaseConnectionManager() {
    }

    public DatabaseConnectionManager getManagerInstance() {
        if(connectionInstance == null) {
            connectionInstance = new DatabaseConnectionManager();
        }
        return connectionInstance;
    }

    public Connection getConnectionObject() {
        return connection;
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
