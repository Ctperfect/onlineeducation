package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.user_course_scores;

import java.util.List;

public interface UserCourseScoresDao {
    List<user_course_scores> findByUserId(int userId);
    user_course_scores findById(int id);
    void save(user_course_scores score);
    void update(user_course_scores score);
    void deleteById(int id);
}
