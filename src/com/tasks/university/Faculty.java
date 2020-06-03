package com.tasks.university;

public class Faculty {
    private String nameFacultu;
    private String specialty; //специальность
    private Student student;
    private GroupLeader groupLeader;
    private Teacher teacher;
    private Subject subject;



    public Faculty(String nameFacultu, String specialty, Student student, GroupLeader groupLeader, Teacher teacher, Subject subject) {
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public GroupLeader getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(GroupLeader groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
