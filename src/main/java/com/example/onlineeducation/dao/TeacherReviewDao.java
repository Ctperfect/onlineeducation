package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.teacher_reviews;

public interface TeacherReviewDao {
    teacher_reviews findById(int id);
    void save(teacher_reviews review);
    void update(teacher_reviews review);
    void deleteById(int id);
}
