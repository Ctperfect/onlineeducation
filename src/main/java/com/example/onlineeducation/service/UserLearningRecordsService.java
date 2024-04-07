package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.UserLearningRecordsDao;
import com.example.onlineeducation.entity.user_learning_records;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UserLearningRecordsService {

    private final UserLearningRecordsDao userLearningRecordsDao;

    @Autowired
    public UserLearningRecordsService(UserLearningRecordsDao userLearningRecordsDao) {
        this.userLearningRecordsDao = userLearningRecordsDao;
    }

    public user_learning_records findById(int id) {
        return userLearningRecordsDao.findById(id);
    }

    public void save(user_learning_records record) {
        userLearningRecordsDao.save(record);
    }

    public void update(user_learning_records record) {
        userLearningRecordsDao.update(record);
    }

    public void deleteById(int id) {
        userLearningRecordsDao.deleteById(id);
    }

    public List<user_learning_records> findByUserId(int userId) {
        return userLearningRecordsDao.findByUserId(userId);
    }
}
