package com.tasks.university;

public class GroupLeader extends Students {
    public GroupLeader(String name, String sureName, int tuitionFee, int course) {
        super(name, sureName, tuitionFee, course);
    }


    public static void keepsALog(){
        System.out.println("Я храню журнал");
    }
}
