package com.example.onlineeducation.service;

import com.example.onlineeducation.dao.UserDao;
import com.example.onlineeducation.entity.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public users createUser(users user) {
        userDao.createUser(user);
        return user;
    }

    public int deleteUserById(int userId) {
        return userDao.deleteUserById(userId);
    }

    public users updateUser(users user) {
        userDao.updateUser(user);
        return user;
    }

    public users getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    public users getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    public List<users> getAllUsers() {
        return userDao.getAllUsers();
    }
}
