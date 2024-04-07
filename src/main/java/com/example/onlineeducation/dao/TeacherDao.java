package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.teachers;

public interface TeacherDao {
    teachers findById(int id);
    void save(teachers teacher);
    void update(teachers teacher);
    void deleteById(int id);
}
