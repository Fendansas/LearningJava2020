package com.tasks.university;

public abstract class Library extends UniversityMadElks {
    private String title;
    private String subject;
    private String author;

    public Library(String title, String subject, String author) {
        this.title = title;
        this.subject = subject;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
