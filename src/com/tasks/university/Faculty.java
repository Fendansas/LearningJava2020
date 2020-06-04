package com.tasks.university;

import java.util.ArrayList;
import java.util.HashSet;

public class Faculty {
    private String nameFacultu;
    private String specialty; //специальность
    private ArrayList<Student> student;
    private ArrayList<GroupLeader> groupLeader;
    private ArrayList<Teacher> teacher;
    private HashSet<Subject> subject;

    public Faculty(String nameFacultu, String specialty, ArrayList<Student> student, ArrayList<GroupLeader> groupLeader, ArrayList<Teacher> teacher, HashSet<Subject> subject) {
        this.nameFacultu = nameFacultu;
        this.specialty = specialty;
        this.student = student;
        this.groupLeader = groupLeader;
        this.teacher = teacher;
        this.subject = subject;
    }

    public String getNameFacultu() {
        return nameFacultu;
    }

    public void setNameFacultu(String nameFacultu) {
        this.nameFacultu = nameFacultu;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public ArrayList<GroupLeader> getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(ArrayList<GroupLeader> groupLeader) {
        this.groupLeader = groupLeader;
    }

    public ArrayList<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(ArrayList<Teacher> teacher) {
        this.teacher = teacher;
    }

    public HashSet<Subject> getSubject() {
        return subject;
    }

    public void setSubject(HashSet<Subject> subject) {
        this.subject = subject;
    }
}
