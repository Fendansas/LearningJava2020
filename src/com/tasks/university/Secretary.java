package com.tasks.university;

public class Secretary extends Employees {
    public Secretary(String name, String surName, int salary) {
        super(name, surName, salary);
    }

    public static void issuesAMagazine() {
        System.out.println(" выдаю журнал старосте");
    }
}
