package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.ClassDao;
import com.example.onlineeducation.entity.classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClassService {

    private final ClassDao classDao;

    @Autowired
    public ClassService(ClassDao classDao) {
        this.classDao = classDao;
    }

    public classes findById(int id) {
        return classDao.findById(id);
    }

    public void save(classes classObj) {
        classDao.save(classObj);
    }

    public void update(classes classObj) {
        classDao.update(classObj);
    }

    public void deleteById(int id) {
        classDao.deleteById(id);
    }
}
