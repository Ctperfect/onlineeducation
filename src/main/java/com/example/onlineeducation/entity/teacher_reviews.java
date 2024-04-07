package com.example.onlineeducation.entity;
import java.util.Date;
public class teacher_reviews {
    private int reviewId;
    private int teacherId;
    private int studentId;
    private String reviewContent;
    private Date reviewTime;
    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    @Override
    public String toString() {
        return "teacher_reviews{" +
                "reviewId=" + reviewId +
                ", teacherId=" + teacherId +
                ", studentId=" + studentId +
                ", reviewContent='" + reviewContent + '\'' +
                ", reviewTime=" + reviewTime +
                '}';
    }


}
