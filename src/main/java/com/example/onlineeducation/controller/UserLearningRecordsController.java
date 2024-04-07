package com.example.onlineeducation.controller;

import com.example.onlineeducation.entity.user_learning_records;
import com.example.onlineeducation.service.UserLearningRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-learning-records")
public class UserLearningRecordsController {

    private final UserLearningRecordsService userLearningRecordsService;

    @Autowired
    public UserLearningRecordsController(UserLearningRecordsService userLearningRecordsService) {
        this.userLearningRecordsService = userLearningRecordsService;
    }

    // 查看学习记录详情
    @GetMapping("/{recordId}")
    public ResponseEntity<user_learning_records> getRecordById(@PathVariable int recordId) {
        user_learning_records record = userLearningRecordsService.findById(recordId);
        if (record != null) {
            return new ResponseEntity<>(record, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 根据用户ID查看学习记录
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<user_learning_records>> getRecordsByUserId(@PathVariable int userId) {
        List<user_learning_records> records = userLearningRecordsService.findByUserId(userId);
        if (!records.isEmpty()) {
            return new ResponseEntity<>(records, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    // 创建学习记录
    @PostMapping("creata_user_learning_records")
    public ResponseEntity<Void> createRecord(@RequestBody user_learning_records record) {
        userLearningRecordsService.save(record);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // 更新学习记录
    @PutMapping("/{recordId}")
    public ResponseEntity<Void> updateRecord(@PathVariable int recordId, @RequestBody user_learning_records record) {
        record.setRecordId(recordId);
        userLearningRecordsService.update(record);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 删除学习记录
    @DeleteMapping("/{recordId}")
    public ResponseEntity<Void> deleteRecord(@PathVariable int recordId) {
        userLearningRecordsService.deleteById(recordId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
