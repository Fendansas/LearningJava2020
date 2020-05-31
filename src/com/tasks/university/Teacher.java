package com.tasks.university;

public class Teacher extends DeansOffice {

    public Teacher(String position, int salary, String surname, String name, String dateOfBirth, String address, Integer phoneNumber) {
        super(position, salary, surname, name, dateOfBirth, address, phoneNumber);
    }
    public static int AssessStudent(String subject){ // выставляет оценки студентам
        int setSesult;
        setSesult =5;
        return  setSesult;
    }

}
