package com.example.start_springboot_maven.entity;

public class Course {
    private int courseId;
    private String courseName;
    private String price;
    private int fromSellerId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getFromSellerId() {
        return fromSellerId;
    }

    public void setFromSellerId(int fromSellerId) {
        this.fromSellerId = fromSellerId;
    }
}
