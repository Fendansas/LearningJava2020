package com.tasks.university;

import java.util.ArrayList;

public class DeansOffice {
    private int beginningOfWork;
    private int endOfWork;
    private ArrayList<Secretary> secretary;
    private ArrayList<Dean> deans;

    public DeansOffice(int beginningOfWork, int endOfWork) {
        this.beginningOfWork = beginningOfWork;
        this.endOfWork = endOfWork;
    }

    public int getBeginningOfWork() {
        return beginningOfWork;
    }

    public void setBeginningOfWork(int beginningOfWork) {
        this.beginningOfWork = beginningOfWork;
    }

    public int getEndOfWork() {
        return endOfWork;
    }

    public void setEndOfWork(int endOfWork) {
        this.endOfWork = endOfWork;
    }

    public ArrayList<Secretary> getSecretary() {
        return secretary;
    }

    public void setSecretary(ArrayList<Secretary> secretary) {
        this.secretary = secretary;
    }

    public ArrayList<Dean> getDeans() {
        return deans;
    }

    public void setDeans(ArrayList<Dean> deans) {
        this.deans = deans;
    }
}
