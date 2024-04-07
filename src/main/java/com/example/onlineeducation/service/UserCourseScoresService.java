package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.UserCourseScoresDao;
import com.example.onlineeducation.entity.user_course_scores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserCourseScoresService {

    private final UserCourseScoresDao userCourseScoresDao;

    @Autowired
    public UserCourseScoresService(UserCourseScoresDao userCourseScoresDao) {
        this.userCourseScoresDao = userCourseScoresDao;
    }

    public user_course_scores findById(int id) {
        return userCourseScoresDao.findById(id);
    }
    public List<user_course_scores> findByUserId(int userId) {
        return userCourseScoresDao.findByUserId(userId);
    }

    public void save(user_course_scores score) {
        userCourseScoresDao.save(score);
    }

    public void update(user_course_scores score) {
        userCourseScoresDao.update(score);
    }

    public void deleteById(int id) {
        userCourseScoresDao.deleteById(id);
    }
}
