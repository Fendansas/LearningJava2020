package com.tasks.university;

public class Subject {
    private String nameSubject;
    private int trainingHours;

    public Subject(String nameSubject, int trainingHours) {
        this.nameSubject = nameSubject;
        this.trainingHours = trainingHours;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getTrainingHours() {
        return trainingHours;
    }

    public void setTrainingHours(int trainingHours) {
        this.trainingHours = trainingHours;
    }
}
