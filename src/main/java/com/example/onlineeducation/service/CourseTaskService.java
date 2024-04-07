package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.CourseTaskDao;
import com.example.onlineeducation.entity.course_tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseTaskService {

    private final CourseTaskDao courseTaskDao;

    @Autowired
    public CourseTaskService(CourseTaskDao courseTaskDao) {
        this.courseTaskDao = courseTaskDao;
    }
    // 根据课程 ID 查询所有课程任务
    public List<course_tasks> findAllByCourseId(int courseId) {
        return courseTaskDao.findAllByCourseId(courseId);
    }


    public course_tasks findById(int id) {
        return courseTaskDao.findById(id);
    }

    public void save(course_tasks task) {
        courseTaskDao.save(task);
    }

    public void update(course_tasks task) {
        courseTaskDao.update(task);
    }

    public void deleteById(int id) {
        courseTaskDao.deleteById(id);
    }
}
