package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.courses;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDaoImpl implements CourseDao {

    private final SqlSession sqlSession;

    @Autowired
    public CourseDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public courses findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.CourseDao.findById", id);
    }

    @Override
    public List<courses> getAllCourses() {
        return sqlSession.selectList("com.example.onlineeducation.dao.CourseDao.getAllCourses");
    }

    @Override
    public void save(courses course) {
        sqlSession.insert("com.example.onlineeducation.dao.CourseDao.save", course);
    }

    @Override
    public void update(courses course) {
        sqlSession.update("com.example.onlineeducation.dao.CourseDao.update", course);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.CourseDao.deleteById", id);
    }
}
