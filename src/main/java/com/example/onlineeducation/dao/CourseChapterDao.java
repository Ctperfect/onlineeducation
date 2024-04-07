package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.course_chapters;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseChapterDao {
    course_chapters findById(int id);
    void save(course_chapters chapter);
    void update(course_chapters chapter);
    void deleteById(int id);
    List<course_chapters> findAllChaptersByCourseId(@Param("courseId") int courseId);
}
