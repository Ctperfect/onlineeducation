package com.example.onlineeducation.controller;

import com.example.onlineeducation.entity.course_tasks;
import com.example.onlineeducation.service.CourseTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course-tasks")
@CrossOrigin
public class CourseTaskController {

    private final CourseTaskService courseTaskService;

    @Autowired
    public CourseTaskController(CourseTaskService courseTaskService) {
        this.courseTaskService = courseTaskService;
    }

    // 查看课程任务详情
    @GetMapping("/{taskId}")
    public ResponseEntity<course_tasks> getTaskById(@PathVariable int taskId) {
        course_tasks task = courseTaskService.findById(taskId);
        if (task != null) {
            return new ResponseEntity<>(task, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    // 根据课程 ID 查询所有课程任务
    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<course_tasks>> getAllTasksByCourseId(@PathVariable int courseId) {
        List<course_tasks> taskList = courseTaskService.findAllByCourseId(courseId);
        return new ResponseEntity<>(taskList, HttpStatus.OK);
    }


    // 创建课程任务
    @PostMapping("/create_course_tasks")
    public ResponseEntity<Void> createTask(@RequestBody course_tasks task) {
        courseTaskService.save(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // 更新课程任务
    @PutMapping("/{taskId}")
    public ResponseEntity<Void> updateTask(@PathVariable int taskId, @RequestBody course_tasks task) {
        task.setTaskId(taskId);
        courseTaskService.update(task);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 删除课程任务
    @DeleteMapping("/{taskId}")
    public ResponseEntity<Void> deleteTask(@PathVariable int taskId) {
        courseTaskService.deleteById(taskId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
