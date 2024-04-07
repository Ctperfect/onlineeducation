package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.CourseChapterDao;
import com.example.onlineeducation.entity.course_chapters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseChapterService {

    private final CourseChapterDao courseChapterDao;

    @Autowired
    public CourseChapterService(CourseChapterDao courseChapterDao) {
        this.courseChapterDao = courseChapterDao;
    }

    public course_chapters findById(int id) {
        return courseChapterDao.findById(id);
    }

    public void save(course_chapters chapter) {
        courseChapterDao.save(chapter);
    }

    public void update(course_chapters chapter) {
        courseChapterDao.update(chapter);
    }

    public void deleteById(int id) {
        courseChapterDao.deleteById(id);
    }

    // 根据课程id查询所有章节
    public List<course_chapters> findAllChaptersByCourseId(int courseId) {
        return courseChapterDao.findAllChaptersByCourseId(courseId);
    }
}
