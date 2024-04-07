package com.example.onlineeducation.dao;

import com.example.onlineeducation.entity.user_learning_records;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserLearningRecordsDaoImpl implements  UserLearningRecordsDao{
    private final SqlSession sqlSession;

    @Autowired
    public UserLearningRecordsDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public user_learning_records findById(int id) {
        return sqlSession.selectOne("com.example.onlineeducation.dao.UserLearningRecordsDao.findById", id);
    }

    @Override
    public void save(user_learning_records record) {
        sqlSession.insert("com.example.onlineeducation.dao.UserLearningRecordsDao.save", record);
    }

    @Override
    public void update(user_learning_records record) {
        sqlSession.update("com.example.onlineeducation.dao.UserLearningRecordsDao.update", record);
    }

    @Override
    public void deleteById(int id) {
        sqlSession.delete("com.example.onlineeducation.dao.UserLearningRecordsDao.deleteById", id);
    }
    @Override
    public List<user_learning_records> findByUserId(int userId) {
        return sqlSession.selectList("com.example.onlineeducation.dao.UserLearningRecordsDao.findByUserId", userId);
    }
}
