package com.course.management.utils;

import com.course.management.entities.Course;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseRowMapper implements RowMapper<Course> {

    @Override
    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        Course course = new Course();
        course.setCourseId(rs.getInt("courseId"));
        course.setTitle(rs.getString("title"));
        course.setDescription(rs.getString("description"));

        // Cast price to int (decimal values will be truncated)
        course.setPrice((int) rs.getDouble("price"));

        course.setCategoryId(rs.getInt("category_id"));
        return course;
    }
}
