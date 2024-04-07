package com.example.onlineeducation.entity;

public class course_tasks {
    private int taskId;
    private int courseId;
    private String taskContent;
    private String taskType;
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }



    @Override
    public String toString() {
        return "course_tasks{" +
                "taskId=" + taskId +
                ", courseId=" + courseId +
                ", taskContent='" + taskContent + '\'' +
                ", taskType='" + taskType + '\'' +
                '}';
    }

}
