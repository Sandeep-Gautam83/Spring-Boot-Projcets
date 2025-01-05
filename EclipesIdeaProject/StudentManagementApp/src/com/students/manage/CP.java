package com.students.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {

    // Static connection variable to reuse the same connection
    private static Connection con;

    // Method to create and return a connection
    public static Connection createC() {
        try {
            // Database credentials and URL
            String user = "root"; // Replace with your MySQL username
            String password = ""; // Replace with your MySQL password
            String url = "jdbc:mysql://localhost:3306/student_manage?useSSL=false";  // Disable SSL if not using SSL for local development

            // Create and return the connection
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Connection established successfully.");
            }
        } catch (SQLException e) {
            System.err.println("Error connecting to the database. Check the URL, username, or password.");
            e.printStackTrace();
        }
        return con;
    }

    // Optional: Close the connection (if needed)
    public static void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Connection closed successfully.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing the connection.");
            e.printStackTrace();
        }
    }
}
