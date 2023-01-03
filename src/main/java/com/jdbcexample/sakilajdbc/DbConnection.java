package com.jdbcexample.sakilajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private final String url = "jdbc:mysql://localhost:3306/sakila";
    private final String user = "root";
    private final String password = "tolga123";
    private Connection conn = null;

    public  DbConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getConnect(){
        try (Connection conn = DriverManager.getConnection(url,user,password)){

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
