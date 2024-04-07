package com.example.onlineeducation.entity;

public class user_course_scores {
    private int recordId;
    private int userId;
    private int courseId;
    private float score;
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "user_course_scores{" +
                "recordId=" + recordId +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", score=" + score +
                '}';
    }


}
