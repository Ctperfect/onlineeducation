package com.example.onlineeducation.controller;

import com.example.onlineeducation.entity.course_chapters;
import com.example.onlineeducation.service.CourseChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course-chapters")
public class CourseChaptersController {

    private final CourseChapterService courseChapterService;

    @Autowired
    public CourseChaptersController(CourseChapterService courseChapterService) {
        this.courseChapterService = courseChapterService;
    }

    // 获取课程章节详情
    @GetMapping("/{chapterId}")
    public ResponseEntity<course_chapters> getChapterById(@PathVariable int chapterId) {
        course_chapters chapter = courseChapterService.findById(chapterId);
        if (chapter != null) {
            return new ResponseEntity<>(chapter, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<course_chapters>> getAllChaptersByCourseId(@PathVariable int courseId) {
        List<course_chapters> chaptersList = courseChapterService.findAllChaptersByCourseId(courseId);
        return new ResponseEntity<>(chaptersList, HttpStatus.OK);
    }

    // 创建课程章节
    @PostMapping("/create_course_chapters")
    public ResponseEntity<Void> createChapter(@RequestBody course_chapters chapter) {
        courseChapterService.save(chapter);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // 更新课程章节
    @PutMapping("/{chapterId}")
    public ResponseEntity<Void> updateChapter(@PathVariable int chapterId, @RequestBody course_chapters chapter) {
        chapter.setChapterId(chapterId);
        courseChapterService.update(chapter);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 删除课程章节
    @DeleteMapping("/{chapterId}")
    public ResponseEntity<Void> deleteChapter(@PathVariable int chapterId) {
        courseChapterService.deleteById(chapterId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
