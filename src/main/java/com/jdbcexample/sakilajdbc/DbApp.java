package com.jdbcexample.sakilajdbc;

import com.jdbcexample.sakilajdbc.actor.dao.ActorDao;
import com.jdbcexample.sakilajdbc.actor.domain.Actor;
import com.jdbcexample.sakilajdbc.category.dao.CategoryDao;
import com.jdbcexample.sakilajdbc.category.domain.Category;

import java.util.List;
import java.util.Scanner;

public class DbApp {
    private List<Category> categoryList;

    public static void main(String[] args) {
        CategoryDao dbOperations = new CategoryDao();

        List<Category> categoryList = dbOperations.findAllCategory();

        for (Category category : categoryList) {
            System.out.println(category);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String firstName = sc.next();
        List<Category> categoryByName = dbOperations.findAllCategoryByFirstName(firstName);
        for (Category categoryName: categoryByName) {
            System.out.println(categoryName);
        }




    }
}
