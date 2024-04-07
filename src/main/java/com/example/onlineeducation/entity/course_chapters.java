package com.example.onlineeducation.entity;

public class course_chapters {
    private int chapterId;
    private int courseId;
    private String chapterContent;
    private int teacherId;
    private String videoLink;
    @Override
    public String toString() {
        return "course_chapters{" +
                "chapterId=" + chapterId +
                ", courseId=" + courseId +
                ", chapterContent='" + chapterContent + '\'' +
                ", teacherId=" + teacherId +
                ", videoLink='" + videoLink + '\'' +
                '}';
    }


    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getChapterContent() {
        return chapterContent;
    }

    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }


}
