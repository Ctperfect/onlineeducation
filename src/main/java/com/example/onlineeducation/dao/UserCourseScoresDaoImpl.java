package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.user_course_scores;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserCourseScoresDaoImpl implements UserCourseScoresDao {
    private final SqlSession sqlSession;

    @Autowired
    public UserCourseScoresDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public user_course_scores findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.UserCourseScoresDao.findById", id);
    }
    @Override
    public List<user_course_scores> findByUserId(int userId) {
        return sqlSession.selectList("com.example.onlineeducation.dao.UserCourseScoresDao.findByUserId", userId);
    }

    @Override
    public void save(user_course_scores score) {
        sqlSession.insert("com.example.onlineeducation.dao.UserCourseScoresDao.save", score);
    }

    @Override
    public void update(user_course_scores score) {
        sqlSession.update("com.example.onlineeducation.dao.UserCourseScoresDao.update", score);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.UserCourseScoresDao.deleteById", id);
    }
}
