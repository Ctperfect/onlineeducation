package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.TeacherReviewDao;
import com.example.onlineeducation.entity.teacher_reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherReviewService {

    private final TeacherReviewDao teacherReviewDao;

    @Autowired
    public TeacherReviewService(TeacherReviewDao teacherReviewDao) {
        this.teacherReviewDao = teacherReviewDao;
    }

    public teacher_reviews findById(int id) {
        return teacherReviewDao.findById(id);
    }

    public void save(teacher_reviews review) {
        teacherReviewDao.save(review);
    }

    public void update(teacher_reviews review) {
        teacherReviewDao.update(review);
    }

    public void deleteById(int id) {
        teacherReviewDao.deleteById(id);
    }
}
