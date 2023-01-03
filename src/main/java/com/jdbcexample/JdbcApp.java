package com.jdbcexample;

import java.sql.*;

public class JdbcApp {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");


            // Establish the connection to the database
            String url = "jdbc:mysql://localhost:3306/testdb";
            String username = "testuser";
            String password = "testpass";
            conn = DriverManager.getConnection(url, username, password);

            // Create a statement
            stmt = conn.createStatement();

            // Execute the query
            String sql = "SELECT * FROM Employees";
            rs = stmt.executeQuery(sql);

            /*  String sql = "UPDATE Employees SET salary = salary * 1.1 WHERE age > 30";
                stmt.executeUpdate(sql);*/

            /*  Create a prepared statement
            String sql = "SELECT * FROM Employees WHERE age > ?";
            stmt = conn.prepareStatement(sql);

            // Bind values to the placeholders
            stmt.setInt(1, 30);

            // Execute the prepared statement
            rs = stmt.execute Query();
            * */

            // Step 5: Process the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double salary = rs.getDouble("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary);
            }
        } catch (ClassNotFoundException e) {
            // Could not find the database driver
            e.printStackTrace();
        } catch (SQLException e) {
            // An error occurred while working with the database
            e.printStackTrace();
        } finally {
            // Step 6: Close the connection, statement, and result set
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                // Failed to close the result set
                e.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                // Failed to close the statement
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                // Failed to close the connection
                e.printStackTrace();
            }
        }
    }
}

