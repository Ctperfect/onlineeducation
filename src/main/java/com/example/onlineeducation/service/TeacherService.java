package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.TeacherDao;
import com.example.onlineeducation.entity.teachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherService {

    private final TeacherDao teacherDao;

    @Autowired
    public TeacherService(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public teachers findById(int id) {
        return teacherDao.findById(id);
    }

    public void save(teachers teacher) {
        teacherDao.save(teacher);
    }

    public void update(teachers teacher) {
        teacherDao.update(teacher);
    }

    public void deleteById(int id) {
        teacherDao.deleteById(id);
    }
}
