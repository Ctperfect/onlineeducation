package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.teachers;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDaoImpl implements TeacherDao {

    private final SqlSession sqlSession;

    @Autowired
    public TeacherDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public teachers findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.TeacherDao.findById", id);
    }

    @Override
    public void save(teachers teacher) {
        sqlSession.insert("com.example.onlineeducation.dao.TeacherDao.save", teacher);
    }

    @Override
    public void update(teachers teacher) {
        sqlSession.update("com.example.onlineeducation.dao.TeacherDao.update", teacher);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.TeacherDao.deleteById", id);
    }
}
