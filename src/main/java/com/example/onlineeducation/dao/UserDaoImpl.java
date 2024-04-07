package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.users;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public UserDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public int createUser(users user) {
        return sqlSessionTemplate.insert("createUser", user);
    }

    @Override
    public int deleteUserById(int userId) {
        return sqlSessionTemplate.delete("deleteUserById", userId);
    }

    @Override
    public int updateUser(users user) {
        return sqlSessionTemplate.update("updateUser", user);
    }

    @Override
    public users getUserByUsername(String username) {
        return sqlSessionTemplate.selectOne("getUserByUsername", username);
    }

    @Override
    public users getUserById(int userId) {
        return sqlSessionTemplate.selectOne("getUserById", userId);
    }

    @Override
    public List<users> getAllUsers() {
        return sqlSessionTemplate.selectList("getAllUsers");
    }
}
