package com.example.onlineeducation.entity;

public class teachers {
    private int teacherId;
    private String teacherName;
    private String courseTaught;
    private float teachingQualityScore;
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }

    public float getTeachingQualityScore() {
        return teachingQualityScore;
    }

    public void setTeachingQualityScore(float teachingQualityScore) {
        this.teachingQualityScore = teachingQualityScore;
    }

    @Override
    public String toString() {
        return "teachers{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", courseTaught='" + courseTaught + '\'' +
                ", teachingQualityScore=" + teachingQualityScore +
                '}';
    }

}
