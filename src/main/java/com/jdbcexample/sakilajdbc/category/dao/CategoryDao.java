package com.jdbcexample.sakilajdbc.category.dao;

import com.jdbcexample.sakilajdbc.SpecialException;
import com.jdbcexample.sakilajdbc.category.domain.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    private final String url = "jdbc:mysql://localhost:3306/sakila";
    private final String user = "root";
    private final String password = "tolga123";
    private String listSql = "SELECT * FROM category";
    private String nameSql = "SELECT * FROM category Where name = ?";


    public CategoryDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Category> findAllCategory() {

        List<Category> categoryList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(listSql);
             ResultSet rs = statement.executeQuery(listSql)
        ) {
            while (rs.next()) {
                int id = rs.getInt("category_id");
                String firstName = rs.getString("name");
                Date lastUpdate = rs.getDate("last_update");

                Category category = new Category();
                category.setCategoryId(id);
                category.setCategoryName(firstName);
                category.setLastUpdate(lastUpdate);
                categoryList.add(category);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return categoryList;
    }

    public Category findCategoryById(int id) {

        String sql = "Select * from category where category_id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int recordId = resultSet.getInt("category_id");
                String name = resultSet.getString("name");
                Date last_update = resultSet.getDate("last_update");

                Category category = new Category();
                category.setCategoryId(recordId);
                category.setCategoryName(name);
                category.setLastUpdate(last_update);
                return category;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Category> findAllCategoryByFirstName(String firstName) {

        List<Category> categoryList = new ArrayList<Category>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(nameSql);
        ) {

            preparedStatement.setString(1, firstName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("category_id");
                String name = resultSet.getString("name");
                Date last_update = resultSet.getDate("last_update");

                Category category = new Category();
                category.setCategoryId(id);
                category.setCategoryName(name);
                category.setLastUpdate(last_update);
                categoryList.add(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return categoryList;
    }

    public int saveCategory(Category category) {

        String sql = "insert into category " +
                     "       (name, last_update)" +
                     "values (?, ?)";


        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {

            preparedStatement.setString(1,category.getCategoryName());
            java.util.Date lastUpdate = category.getLastUpdate();
            Date sqlDate = new Date(lastUpdate.getTime());
            preparedStatement.setDate(2, sqlDate);


            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
