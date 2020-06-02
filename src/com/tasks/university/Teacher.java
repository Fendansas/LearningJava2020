package com.tasks.university;

public class Teacher {
    private String name;
    private String surname;
    private int salary;
    private Rank rank;

    public Teacher(String name, String surname, int salary, Rank rank) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
