package com.example.onlineeducation.entity;
import java.util.Date;
public class user_learning_records {
    private int userId;
    private int courseId;
    private float progress;
    private int learningDuration;
    private Date learningTime;

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

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }

    public int getLearningDuration() {
        return learningDuration;
    }

    public void setLearningDuration(int learningDuration) {
        this.learningDuration = learningDuration;
    }

    public Date getLearningTime() {
        return learningTime;
    }

    public void setLearningTime(Date learningTime) {
        this.learningTime = learningTime;
    }
    private int recordId;

    @Override
    public String toString() {
        return "user_learning_records{" +
                "recordId=" + recordId +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", progress=" + progress +
                ", learningDuration=" + learningDuration +
                ", learningTime=" + learningTime +
                '}';
    }


}
