package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTransaction {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;

        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Establish the connection to the database
            String url = "jdbc:mysql://localhost:3306/testdb";
            String username = "testuser";
            String password = "testpass";
            conn = DriverManager.getConnection(url, username, password);

            // Step 3: Disable auto-commit mode
            conn.setAutoCommit(false);

            // Step 4: Create the prepared statements
            String sql1 = "INSERT INTO Employees (name, age, salary) VALUES (?, ?, ?)";
            stmt1 = conn.prepareStatement(sql1);
            stmt1.setString(1, "Jane");
            stmt1.setInt(2, 35);
            stmt1.setDouble(3, 50000);

            String sql2 = "INSERT INTO Departments (name) VALUES (?)";
            stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1, "HR");

            // Step 5: Execute the prepared statements
            stmt1.executeUpdate();
            stmt2.executeUpdate();

            // Step 6: Commit the transaction
            conn.commit();
        } catch (ClassNotFoundException e) {
            // Could not find the database driver
            e.printStackTrace();
        } catch (SQLException e) {
            // An error occurred while working with the database
            e.printStackTrace();
            try {
                // Step 7: Roll back the transaction
                conn.rollback();
            } catch (SQLException e2) {
                // Failed to roll back the transaction
                e2.printStackTrace();
            }
        } finally {
            // Step 8: Close the connection and statement
            try {
                if (stmt1 != null) {
                    stmt1.close();
                }
            } catch (SQLException e) {
                // Failed to close the statement
                e.printStackTrace();
            }
            try {
                if (stmt2 != null) {
                    stmt2.close();
                }
            } catch (SQLException e) {
                // Failed to close the connection
                e.printStackTrace();
            }
        }
    }
}
