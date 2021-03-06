package com.epam.home.task9;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

import static com.epam.home.task9.Priority.*;

public class Task implements Serializable {

    private static final long serialVersionUID = 5023650380303526172L;

    private String name;
    private String category;
    private Priority priority;
   // private LocalDateTime deadLine1 = LocalDateTime.now();
    private LocalDateTime deadLine = LocalDateTime.now();
    //private LocalDateTime deadLine = deadLine1.plusDays(5L);

    public Task(String name, String category, Priority priority, LocalDateTime deadLine) {
        this.name = name;
        this.category = category;
        this.priority = priority;

        if (priority.equals(LONG)){
            deadLine = deadLine.plusDays(5L);
        } else if (priority.equals(URGENTLY)){
            deadLine = deadLine.plusDays(1L);
        } else if (priority.equals(CURRENT)){
            deadLine = deadLine.plusDays(2L);
        }

        this.deadLine = deadLine;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }



    public void setDeadLine(LocalDateTime deadLine) {
        this.deadLine = deadLine;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", priority=" + priority +
                ", deadLine=" + deadLine +
                '}' + "\r\n";
    }
}
