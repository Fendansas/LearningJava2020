package com.tasks.university;

public abstract class Students {
    private String name;
    private String sureName;
    private int tuitionFee; // оплата за учебу
    private int course;



    public Students(String name, String sureName, int tuitionFee, int course) {
        this.name = name;
        this.sureName = sureName;
        this.tuitionFee = tuitionFee;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
