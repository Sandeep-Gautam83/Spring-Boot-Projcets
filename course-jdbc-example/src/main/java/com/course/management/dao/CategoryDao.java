package com.course.management.dao;

import com.course.management.entities.Category;
import com.course.management.utils.CategoryRowMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

   @PostConstruct
   public void inti() {
       String createTableQuery="create table if not exists categories(id int primary key, title varchar(100) not null,description varchar(500))";
    jdbcTemplate.update(createTableQuery);
       System.out.println("Table created");
   }

    //create table



    // Save category
    public Category save(Category category) {
        // Parameterized query
        String query = "INSERT INTO categories (id, title, description) VALUES (?, ?, ?)";
        int rows = jdbcTemplate.update(query, category.getId(), category.getTitle(), category.getDescription());
        System.out.println(rows + " row(s) affected");
        return category;
    }

    // Update category
    public Category update(int categoryId, Category newCat) {
        String query = "UPDATE categories SET title = ?, description = ? WHERE id = ?";
        int update = jdbcTemplate.update(query, newCat.getTitle(), newCat.getDescription(), categoryId);
        System.out.println(update + " row(s) updated");
       newCat.setId(categoryId);
        return newCat;
    }

    // Get all categories
    public List<Category> getAll() {
        String query = "SELECT * FROM categories ";
        List<Category> categories = jdbcTemplate.query(query, new CategoryRowMapper());
   return categories;
    }

    // Get single category by ID
    public Category get(int categoryId) {
        String query = "SELECT * FROM categories WHERE id = ?";
//        return jdbcTemplate.queryForObject(query, Category.class, categoryId);
        return jdbcTemplate.queryForObject(query, new CategoryRowMapper(), categoryId);
    }

    //delete category
    public  void delete(int categoryId){
       String query = "delete from categories where id = ?";
       jdbcTemplate.update(query,categoryId);
    }


}
