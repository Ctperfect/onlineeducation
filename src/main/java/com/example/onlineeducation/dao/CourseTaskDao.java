package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.course_tasks;

import java.util.List;

public interface CourseTaskDao {
    course_tasks findById(int id);
    void save(course_tasks task);
    void update(course_tasks task);
    void deleteById(int id);

    List<course_tasks> findAllByCourseId(int courseId);
}
