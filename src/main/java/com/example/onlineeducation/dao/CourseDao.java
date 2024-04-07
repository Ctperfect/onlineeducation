package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.courses;

import java.util.List;

public interface CourseDao {
    courses findById(int id);
    List<courses> getAllCourses();
    void save(courses course);
    void update(courses course);
    void deleteById(int id);
}
