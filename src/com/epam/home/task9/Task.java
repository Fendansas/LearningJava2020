package com.epam.home.task9;

import java.io.Serializable;
import java.time.LocalDateTime;

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




    /*private LocalDateTime setLocalDateTime() {
        if (priority.name().equals(URGENTLY)) {

            deadLine = deadLine1.plusDays(1L);
        } else if (priority.name().equals(CURRENT)) {
            deadLine = deadLine1.plusDays(2L);
        } else if (priority.name().equals(LONG)) {
            deadLine = deadLine1.plusDays(3L);
        }
        deadLine.plusDays(3L);
        return deadLine;
    }

     */


    //else (priority.equals(LONG)) {
    //    localDateTime.plusDays(LONG.getType())

    //Ticket ticket1 = new Ticket(100, departureTime1, departureTime1.plusHours(4L), "9C");

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

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadLine = deadLine;
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
