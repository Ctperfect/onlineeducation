package com.example.onlineeducation.controller;

import com.example.onlineeducation.entity.users;
import com.example.onlineeducation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 用户登录
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        users user = userService.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            if ("admin".equals(username) && "admin".equals(password)) {
                return new ResponseEntity<>("管理员登录成功", HttpStatus.OK); // 管理员登录成功提示
            } else {
                return new ResponseEntity<>("用户登录成功", HttpStatus.OK); // 普通用户登录成功提示
            }
        } else {
            return new ResponseEntity<>("登录失败，请检查用户名和密码", HttpStatus.UNAUTHORIZED); // 登录失败提示
        }
    }


    // 创建用户（仅管理员可用）
    @PostMapping(value = "/create-user", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<users> createUser(@RequestBody users user) {
        users createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    // 删除用户（仅管理员可用）
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable int userId) {
        int deletedCount = userService.deleteUserById(userId);
        if (deletedCount > 0) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 成功删除用户
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 用户不存在
        }
    }

    // 更新用户信息
    @PutMapping("/update")
    public ResponseEntity<String> updateUser(@RequestBody users user) {
        // 验证输入
        if (user == null || user.getUserId() == 0) {
            return new ResponseEntity<>("请求体缺少用户ID", HttpStatus.BAD_REQUEST);
        }

        // 检查用户是否存在
        users existingUser = userService.getUserById(user.getUserId());
        if (existingUser == null) {
            return new ResponseEntity<>("用户不存在", HttpStatus.NOT_FOUND);
        }

        // 更新用户信息
        users updatedUser = userService.updateUser(user);
        if (updatedUser != null) {
            return new ResponseEntity<>("用户信息更新成功", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("用户信息更新失败", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    // 获取用户信息
    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable int userId) {
        users user = userService.getUserById(userId);
        if (user != null) {
            return ResponseEntity.ok(user); // 获取用户信息成功
        } else {
            return ResponseEntity.notFound().build(); // 用户不存在
        }
    }


    // 更新密码
    @PutMapping("/change-password/{userId}")
    public ResponseEntity<Void> changePassword(@PathVariable int userId, @RequestParam String password) {
        // 获取用户信息
        users user = userService.getUserById(userId);
        if (user != null) {
            // 检查密码长度
            if (password.length() < 6 || password.length() > 20) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // 密码长度不符合要求
            }
            // 更新密码
            user.setPassword(password);
            userService.updateUser(user);
            return new ResponseEntity<>(HttpStatus.OK); // 更新密码成功
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 用户不存在
        }
    }


    // 获取所有用户列表（仅管理员可用）
    @GetMapping("/all")
    public ResponseEntity<List<users>> getAllUsers() {
        List<users> userList = userService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
