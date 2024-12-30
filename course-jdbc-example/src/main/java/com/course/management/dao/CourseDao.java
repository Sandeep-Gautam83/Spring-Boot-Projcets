package com.course.management.dao;

import com.course.management.entities.Course;
import com.course.management.utils.CourseRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Create a new course
    // Create a new course
    public Course save(Course course) {
        // Updated query without courseId for auto-increment behavior
        String query = "INSERT INTO courses (title, description, price, category_id) VALUES (?, ?, ?, ?)";
        int rowsAffected = jdbcTemplate.update(query,
                course.getTitle(),
                course.getDescription(),
                course.getPrice(),
                course.getCategoryId());
        System.out.println(rowsAffected + " row(s) affected");
        return course;
    }


    // Get all courses
    public List<Course> getAll() {
        String query = "SELECT * FROM courses";
        return jdbcTemplate.query(query, new CourseRowMapper());
    }

    // Get a single course by ID
    public Course get(int courseId) {
        String query = "SELECT * FROM courses WHERE courseId = ?";
        return jdbcTemplate.queryForObject(query, new CourseRowMapper(), courseId);
    }

    // Get courses by category
    public List<Course> getCourseByCategory(int categoryId) {
        String query = "SELECT * FROM courses WHERE category_id = ?";
        return jdbcTemplate.query(query, new CourseRowMapper(), categoryId);
    }

    // Update an existing course
    public Course update(Course course) {
        String query = "UPDATE courses SET title = ?, description = ?, price = ?, category_id = ? WHERE courseId = ?";
        int rowsAffected = jdbcTemplate.update(query,
                course.getTitle(),
                course.getDescription(),
                course.getPrice(),
                course.getCategoryId(),
                course.getCourseId());
        System.out.println(rowsAffected + " row(s) updated");
        return course;
    }

    // Delete a course by ID
    public void delete(int courseId) {
        String query = "DELETE FROM courses WHERE courseId = ?";
        int rowsAffected = jdbcTemplate.update(query, courseId);
        System.out.println(rowsAffected + " row(s) deleted");
    }


}
