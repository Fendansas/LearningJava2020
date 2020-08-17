package com.epam.home.task9;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.epam.home.task9.Priority.CURRENT;
import static com.epam.home.task9.Priority.URGENTLY;
import static com.epam.home.task9.Priority.LONG;

public class Main {

    private static TaskStoringService taskStoringService = new TaskStoringServiceImpl();
    private static NoteStoringService noteStoringService = new NoteStoringServiceImpl();
    private static List<Task> tasks;
    private static Notebook notebook;

    public static void main(String[] args) throws IOException {
        Notebook notebook = new Notebook();

        load();

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (true) {
            //print(tasks);
            System.out.println();
            Task task = TaskCreator.create();
            notebook.addTask(task);
            System.out.println(tasks);
            System.out.println("Enter choice: ");
            choice = scanner.nextLine();
            if (!choice.equals("stop")) {
                processUserChoice(notebook, choice);
            } else {
                break;
            }
        }
        noteStoringService.saveNote(notebook);


        //oteStoringService.saveNote(notebook);


      /*  Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (true) {
            print(items);
            System.out.println();
            System.out.println(cart);
            System.out.println("Enter choice: ");
            choice = scanner.nextLine();
            if (!choice.equals("stop")) {
                processUserChoice(cart, choice);
            } else {
                break;
            }
        }

        cartStoringService.saveCart(cart);

       */
//////////////////////////////////////////////////////////////////////////////

       /* LocalDateTime departureTime = LocalDateTime.now();
        load();
        System.out.println(notebook);
        LocalDateTime departureTimeURG = departureTime.plusDays(1L);
        LocalDateTime departureTimeCUR = departureTime.plusDays(2L);
        LocalDateTime departureTimeLON = departureTime.plusDays(5L);

        Task task = new Task("Поспать", "Дела");
        Task task1 = new Task("Поесть", "Дела");
        Task task2 = new Task("Домой", "Дела");
        TaskCreator.create();

        notebook.addTask(task);
        notebook.addTask(task1);
        notebook.addTask(task2);
        notebook.addTask(TaskCreator.create());
        System.out.println(notebook);
        noteStoringService.saveNote(notebook);

        notebook.deleteTask("Поесть");

        System.out.println(notebook);


        */

        ////////////////////////////////////////////////////////////////
    }

    private static void load() throws IOException {
        tasks = taskStoringService.readTasks();
        notebook = noteStoringService.readNote();
    }

    private static void print(List<Task> tasks) {
        tasks.forEach(System.out::println);
    }

    //создаем и удаляем
    private static void processUserChoice(Notebook notebook, String name) {
        String[] userChoice = name.split(" ");
        switch (userChoice[0]) {
            case "add":
                addToNote(notebook, userChoice[1]);
                break;
            case "delete":
                notebook.deleteTask(userChoice[1]);

                break;
            default:
                System.out.println("bla-bla-bla");
        }

    }

    private static void addToNote(Notebook notebook, String item) {
        List<Task> collectedItems = tasks.stream()
                .filter(itemInStream -> itemInStream.getName().equals(item))
                .collect(Collectors.toList());
        if (!collectedItems.isEmpty()) {
            notebook.addTask(collectedItems.get(0));
        }
    }
}
