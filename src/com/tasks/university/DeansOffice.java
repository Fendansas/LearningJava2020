package com.tasks.university;

public abstract class DeansOffice extends UniversityMadElks {
    private String position;
    private int salary;
    private String surname;
    private String name;
    private String dateOfBirth;
    private String address;
    private Integer phoneNumber;

    public DeansOffice(String position, int salary, String surname, String name, String dateOfBirth, String address, Integer phoneNumber) {
        this.position = position;
        this.salary = salary;
        this.surname = surname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "DeansOffice{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
