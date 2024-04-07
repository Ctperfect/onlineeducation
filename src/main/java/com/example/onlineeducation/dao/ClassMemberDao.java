package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.class_members;

public interface ClassMemberDao {
    class_members findById(int id);
    void save(class_members member);
    void update(class_members member);
    void deleteById(int id);
}
