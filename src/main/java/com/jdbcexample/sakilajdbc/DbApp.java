package com.jdbcexample.sakilajdbc;

import com.jdbcexample.sakilajdbc.actor.domain.Actor;
import com.jdbcexample.sakilajdbc.category.domain.Category;
import com.jdbcexample.sakilajdbc.category.service.CategoryService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DbApp {
    private List<Category> categoryList;
    static CategoryService categoryService = new CategoryService();


    public static void main(String[] args) throws SpecialException, SQLException {
        // listAllCategory();
        //  writeAllCategoryByName();
        //  updateActor();
        // saveCategory();
          updateCategory();

       /* JoinTables joinTables = new JoinTables();
        Actor actor = joinTables.getPlayedFilmsByActorID(3);

        System.out.println(actor);*/

    }

    private static void listAllCategory() {
        List<Category> categoryList = categoryService.findAllCategory();
        for (Category category2 : categoryList) {
            System.out.println(category2);
        }
    }

    private static void saveCategory() throws SpecialException {
        Category category = new Category();
        category.setCategoryName("UNİVERSAL");
        Date lastUpdate = category.getLastUpdate();
        Date sqlDate = new Date(lastUpdate.getTime());


        category.setLastUpdate(sqlDate);
        categoryService.saveCategory(category);
    }

    private static void writeAllCategoryByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Name = ");
        String firstName = scanner.nextLine();

        List<Category> categoryList1 = categoryService.findAllCategoryByFirstName(firstName);
        for (Category category : categoryList1) {
            System.out.println(category);
        }
    }

    private static void updateCategory() {
        listAllCategory();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Güncellemek istediğiniz ID = ");
        int id = scanner.nextInt();

        CategoryService categoryService = new CategoryService();
        Category category = categoryService.findCategoryById(id);

        Date lastUpdate = category.getLastUpdate();
        Date sqlDate = new Date(lastUpdate.getTime());

        System.out.print("New Category (" + category.getCategoryName() + ")= ");
        String newName = scanner.next();


        category.setCategoryName(newName);
        category.setLastUpdate(sqlDate);

        categoryService.saveCategory(category);

        listAllCategory();
    }

}
