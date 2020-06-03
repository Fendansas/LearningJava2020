package com.tasks.university;

public class Dean extends Employees {
    public Dean(String name, String surName, int salary) {
        super(name, surName, salary);
    }

    public static void setsOff() {
        System.out.println("если повезет поставлю зачет");
    }
}
