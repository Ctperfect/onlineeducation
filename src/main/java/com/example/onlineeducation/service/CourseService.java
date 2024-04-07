package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.CourseDao;
import com.example.onlineeducation.entity.courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseService {

    private final CourseDao courseDao;

    @Autowired
    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public courses findById(int id) {
        return courseDao.findById(id);
    }

    public List<courses> getAllCourses() {
        return courseDao.getAllCourses();
    }

    public void save(courses course) {
        courseDao.save(course);
    }

    public void update(courses course) {
        courseDao.update(course);
    }

    public void deleteById(int id) {
        courseDao.deleteById(id);
    }
}
