package com.epam.home.task9;

import java.time.LocalDateTime;

import static com.epam.home.task9.Priority.CURRENT;
import static com.epam.home.task9.Priority.URGENTLY;
import static com.epam.home.task9.Priority.LONG;
public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        LocalDateTime departureTime = LocalDateTime.now();

        LocalDateTime departureTimeURG = departureTime.plusDays(1L);
        LocalDateTime departureTimeCUR = departureTime.plusDays(2L);
        LocalDateTime departureTimeLON = departureTime.plusDays(5L);


        Task task = new Task("Поспать", "Дела", URGENTLY);
        Task task1 = new Task("Поесть", "Дела", CURRENT);
        Task task2 = new Task("Домой", "Дела", LONG);

        notebook.addTask(task);
        notebook.addTask(task1);
        notebook.addTask(task2);
        System.out.println(notebook);

        notebook.deleteTask("Поесть");

        System.out.println(notebook);
    }


}
