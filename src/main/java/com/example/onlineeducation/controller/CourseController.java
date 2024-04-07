package com.example.onlineeducation.controller;

import com.example.onlineeducation.entity.courses;
import com.example.onlineeducation.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // 查询所有课程列表
    @GetMapping("/all")
    public ResponseEntity<List<courses>> getAllCourses() {
        List<courses> coursesList = courseService.getAllCourses(); // 根据实际情况调整方法名
        return new ResponseEntity<>(coursesList, HttpStatus.OK);
    }

    // 查看课程详情
    @GetMapping("/{courseId}")
    public ResponseEntity<courses> getCourseById(@PathVariable int courseId) {
        courses course = courseService.findById(courseId);
        if (course != null) {
            return new ResponseEntity<>(course, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 创建课程
    @PostMapping("create_course")
    public ResponseEntity<Void> createCourse(@RequestBody courses course) {
        courseService.save(course);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // 更新课程
    @PutMapping("/{courseId}")
    public ResponseEntity<Void> updateCourse(@PathVariable int courseId, @RequestBody courses course) {
        course.setCourseId(courseId);
        courseService.update(course);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 删除课程
    @DeleteMapping("/{courseId}")
    public ResponseEntity<Void> deleteCourse(@PathVariable int courseId) {
        courseService.deleteById(courseId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
