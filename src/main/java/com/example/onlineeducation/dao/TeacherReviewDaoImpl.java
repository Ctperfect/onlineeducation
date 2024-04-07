package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.teacher_reviews;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherReviewDaoImpl implements TeacherReviewDao {

    private final SqlSession sqlSession;

    @Autowired
    public TeacherReviewDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public teacher_reviews findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.TeacherReviewDao.findById", id);
    }

    @Override
    public void save(teacher_reviews review) {
        sqlSession.insert("com.example.onlineeducation.dao.TeacherReviewDao.save", review);
    }

    @Override
    public void update(teacher_reviews review) {
        sqlSession.update("com.example.onlineeducation.dao.TeacherReviewDao.update", review);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.TeacherReviewDao.deleteById", id);
    }
}
