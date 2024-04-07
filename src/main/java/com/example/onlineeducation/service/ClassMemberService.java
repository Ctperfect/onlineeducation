package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.ClassMemberDao;
import com.example.onlineeducation.entity.class_members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClassMemberService {

    private final ClassMemberDao classMemberDao;

    @Autowired
    public ClassMemberService(ClassMemberDao classMemberDao) {
        this.classMemberDao = classMemberDao;
    }

    public class_members findById(int id) {
        return classMemberDao.findById(id);
    }

    public void save(class_members member) {
        classMemberDao.save(member);
    }

    public void update(class_members member) {
        classMemberDao.update(member);
    }

    public void deleteById(int id) {
        classMemberDao.deleteById(id);
    }
}
