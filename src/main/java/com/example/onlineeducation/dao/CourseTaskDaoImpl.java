package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.course_tasks;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseTaskDaoImpl implements CourseTaskDao {

    private final SqlSession sqlSession;

    @Autowired
    public CourseTaskDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public course_tasks findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.CourseTaskDao.findById", id);
    }

    @Override
    public void save(course_tasks task) {
        sqlSession.insert("com.example.onlineeducation.dao.CourseTaskDao.save", task);
    }

    @Override
    public void update(course_tasks task) {
        sqlSession.update("com.example.onlineeducation.dao.CourseTaskDao.update", task);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.CourseTaskDao.deleteById", id);
    }
    @Override
    public List<course_tasks> findAllByCourseId(int courseId) {
        return sqlSession.selectList("com.example.onlineeducation.dao.CourseTaskDao.findAllByCourseId", courseId);
    }

}
