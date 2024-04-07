package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.class_members;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClassMemberDaoImpl implements ClassMemberDao {

    private final SqlSession sqlSession;

    @Autowired
    public ClassMemberDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public class_members findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.ClassMemberDao.findById", id);
    }

    @Override
    public void save(class_members member) {
        sqlSession.insert("com.example.onlineeducation.dao.ClassMemberDao.save", member);
    }

    @Override
    public void update(class_members member) {
        sqlSession.update("com.example.onlineeducation.dao.ClassMemberDao.update", member);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.ClassMemberDao.deleteById", id);
    }
}
