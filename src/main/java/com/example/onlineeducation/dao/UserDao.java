package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    // 创建用户
    int createUser(users user);

    // 根据用户ID删除用户
    int deleteUserById(int userId);

    // 更新用户信息
    int updateUser(users user);

    // 根据用户名查询用户
    users getUserByUsername(String username);

    // 根据用户ID查询用户
    users getUserById(int userId);

    // 获取所有用户
    List<users> getAllUsers();
}
