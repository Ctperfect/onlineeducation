package com.example.onlineeducation;

import com.example.onlineeducation.entity.users;
import com.example.onlineeducation.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OnlineeducationApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testUserDao() {
        // 创建用户
        users user = new users();
        user.setUsername("testUser");
        user.setPassword("password");
        userDao.createUser(user);

        // 根据用户名查询用户
        users retrievedUser = userDao.getUserByUsername("testUser");
        System.out.println("Retrieved user: " + retrievedUser);

        // 更新用户信息
        retrievedUser.setUsername("updatedUsername");
        userDao.updateUser(retrievedUser);

        // 再次查询用户，确认更新成功
        users updatedUser = userDao.getUserByUsername("updatedUsername");
        System.out.println("Updated user: " + updatedUser);

        // 获取所有用户
        List<users> userList = userDao.getAllUsers();
        System.out.println("All users: " + userList);

        // 根据用户ID删除用户
        userDao.deleteUserById(updatedUser.getUserId());

        // 再次查询用户，确认删除成功
        users deletedUser = userDao.getUserByUsername("updatedUsername");
        System.out.println("Deleted user: " + deletedUser);
    }
}
