package com.tasks.university;

public class Students extends DeansOffice {

    private int tuitionFee; // оплата за учебу
    private int course;
    private String faculty;

    public Students(String position, int salary, String surname, String name, String dateOfBirth, String address, Integer phoneNumber, int tuitionFee, int course, String faculty) {
        super(position, salary, surname, name, dateOfBirth, address, phoneNumber);
        this.tuitionFee = tuitionFee;
        this.course = course;
        this.faculty = faculty;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
