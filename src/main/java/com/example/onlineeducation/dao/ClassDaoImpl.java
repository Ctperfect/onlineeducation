package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.classes;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClassDaoImpl implements ClassDao {

    private final SqlSession sqlSession;

    @Autowired
    public ClassDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public classes findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.ClassDao.findById", id);
    }

    @Override
    public void save(classes classObj) {
        sqlSession.insert("com.example.onlineeducation.dao.ClassDao.save", classObj);
    }

    @Override
    public void update(classes classObj) {
        sqlSession.update("com.example.onlineeducation.dao.ClassDao.update", classObj);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.ClassDao.deleteById", id);
    }
}
