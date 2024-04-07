package com.example.onlineeducation.entity;

import java.util.Date;

public class class_members {
    private int memberId;
    private int classId;
    private int userId;
    private Date joinTime;
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    @Override
    public String toString() {
        return "class_members{" +
                "memberId=" + memberId +
                ", classId=" + classId +
                ", userId=" + userId +
                ", joinTime=" + joinTime +
                '}';
    }



    // Constructors, getters, and setters

}

