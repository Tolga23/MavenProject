package com.jdbcexample.sakilajdbc.category.service;

import com.jdbcexample.sakilajdbc.SpecialException;
import com.jdbcexample.sakilajdbc.category.dao.CategoryDao;
import com.jdbcexample.sakilajdbc.category.domain.Category;

import java.util.List;

public class CategoryService {

    private CategoryDao categoryDao = new CategoryDao();

    public List<Category> findAllCategory() {
        return categoryDao.findAllCategory();
    }

    public Category findCategoryById(int id) {
        return categoryDao.findCategoryById(id);
    }

    public List<Category> findAllCategoryByFirstName(String firstName) {
        return categoryDao.findAllCategoryByFirstName(firstName);
    }

    public int saveCategory(Category category) {

        if (category.getCategoryName() == null || "".equals(category.getCategoryName())) throw new RuntimeException("Kategori adı olmadan kayıt yapılamaz.");
        return categoryDao.saveCategory(category);
    }


}
