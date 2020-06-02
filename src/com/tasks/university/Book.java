package com.tasks.university;

public class Book {
    private String name;
    private String subject; // тема
    private int idBook; // в идеале id должен присваиватся автоматически ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public Book(String name, String subject, int idBook) {
        this.name = name;
        this.subject = subject;
        this.idBook = idBook;
    }
}
