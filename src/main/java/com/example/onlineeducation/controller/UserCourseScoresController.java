package com.example.onlineeducation.controller;

import com.example.onlineeducation.entity.user_course_scores;
import com.example.onlineeducation.service.UserCourseScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user_course_scores")
public class UserCourseScoresController {

    private final UserCourseScoresService userCourseScoresService;

    @Autowired
    public UserCourseScoresController(UserCourseScoresService userCourseScoresService) {
        this.userCourseScoresService = userCourseScoresService;
    }

    // 根据ID获取用户课程分数
    @GetMapping("/{id}")
    public user_course_scores getUserCourseScore(@PathVariable("id") int id) {
        return userCourseScoresService.findById(id);
    }
    // 根据用户ID获取所有课程分数
    @GetMapping("/user/{userId}")
    public List<user_course_scores> getUserScoresByUserId(@PathVariable("userId") int userId) {
        return userCourseScoresService.findByUserId(userId);
    }

    // 保存用户课程分数
    @PostMapping("/save")
    public void saveUserCourseScore(@RequestBody user_course_scores score) {
        userCourseScoresService.save(score);
    }

    // 更新用户课程分数
    @PutMapping("/update")
    public void updateUserCourseScore(@RequestBody user_course_scores score) {
        userCourseScoresService.update(score);
    }

    // 删除指定ID的用户课程分数
    @DeleteMapping("/delete/{id}")
    public void deleteUserCourseScore(@PathVariable("id") int id) {
        userCourseScoresService.deleteById(id);
    }
}