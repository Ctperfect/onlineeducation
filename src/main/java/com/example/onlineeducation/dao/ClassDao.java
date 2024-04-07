package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.classes;

public interface ClassDao {
    classes findById(int id);
    void save(classes classObj);
    void update(classes classObj);
    void deleteById(int id);
}
