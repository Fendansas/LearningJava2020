package com.tasks.university;

public class Student extends Students {
    public Student(String name, String sureName, int tuitionFee, int course) {
        super(name, sureName, tuitionFee, course);
    }

    public static void duty() {
        System.out.println("Вытирает доску");
    }
}
