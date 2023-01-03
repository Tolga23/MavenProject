package com.jdbcexample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcApp {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the database
            String url = "jdbc:mysql://localhost:3306/jdbctest";
            String username = "root";
            String password = "tolga123";
            conn = DriverManager.getConnection(url, username, password);

            // Create a statement
            stmt = conn.createStatement();

            // Execute the query
            String sql = "SELECT * FROM Person";

            String sql1 = "UPDATE Person SET id = id * 1 WHERE id > 0";
            stmt.executeUpdate(sql1);

            rs = stmt.executeQuery(sql);

            // Step 5: Process the results
            List<Person> personList = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
                Person person = new Person(id,name);
                personList.add(person);

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

