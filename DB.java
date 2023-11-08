package com.SCMS.Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/SCMS";
    public static Connection connection;

    public DB() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, "madhur", "123456");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            if (connection == null)
                new DB();
            connection = DriverManager.getConnection(CONNECTION_STRING, "madhur", "123456");
            return connection;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
