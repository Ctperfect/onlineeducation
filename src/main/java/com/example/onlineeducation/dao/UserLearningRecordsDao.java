package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.user_learning_records;

import java.util.List;

public interface  UserLearningRecordsDao{
    user_learning_records findById(int id);

    void save(user_learning_records record);
    void update(user_learning_records record);
    void deleteById(int id);
    List<user_learning_records> findByUserId(int userId);
}
