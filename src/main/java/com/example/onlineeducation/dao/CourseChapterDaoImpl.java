package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.course_chapters;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseChapterDaoImpl implements CourseChapterDao {

    private final SqlSession sqlSession;

    @Autowired
    public CourseChapterDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public course_chapters findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.CourseChapterDao.findById", id);
    }

    @Override
    public void save(course_chapters chapter) {
        sqlSession.insert("com.example.onlineeducation.dao.CourseChapterDao.save", chapter);
    }

    @Override
    public void update(course_chapters chapter) {
        sqlSession.update("com.example.onlineeducation.dao.CourseChapterDao.update", chapter);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.CourseChapterDao.deleteById", id);
    }
    @Override
    public List<course_chapters> findAllChaptersByCourseId(int courseId) {
        return sqlSession.selectList("com.example.onlineeducation.dao.CourseChapterDao.findAllChaptersByCourseId", courseId);
    }
}
