package com.epam.home.task9;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
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
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Notebook notebook = new Notebook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Старт __________________________________________________________");
        LocalDateTime departureTime = LocalDateTime.now();
        //Task task = new Task("Поспать", "Дела", LONG, departureTime);
        //notebook.addTask(task);
        //noteStoringService.saveNote(notebook);

        tasks = taskStoringService.readTasks();
        notebook = noteStoringService.readNote();




        boolean state = true;

        while (state == true) {
            try {
                printOptions();
                int a = scanner.nextInt();
                state = Menu(notebook, scanner, state, a);
            } catch (InputMismatchException e) {
                System.out.println("Ошибка : " + e);
                scanner.nextLine();
                System.out.println("Попробуй еще");
            }
        }


      /*  System.out.println("_____________________");
        System.out.println(notebook);
        System.out.println("_____________________");

       */

        /*Task task = new Task("Поспать", "Дела", LONG, departureTime);
        Task task1 = new Task("Поесть", "Дела", CURRENT, departureTime);
        Task task2 = new Task("Домой", "Дела", URGENTLY, departureTime);
        notebook.addTask(task);
        notebook.addTask(task1);
        notebook.addTask(task2);
        System.out.println(notebook);
        notebook.deleteTask("Поесть");
        System.out.println(notebook);
         */

    }

    private static boolean Menu(Notebook notebook, Scanner scanner, boolean state, int a) {
        if (a == 1) {
            System.out.println(notebook);
            state = true;
        } else if (a == 2) {
            try {
                notebook.addTask(Notebook.create());
                noteStoringService.saveNote(notebook);
                System.out.println(notebook);
                state = true;
            } catch (NullPointerException e) {
                System.out.println("Ошибка : " + e);
                scanner.nextLine();
                System.out.println("Поробуй еще раз");
            }
        } else if (a == 3) {
            System.out.println("В видите название задачи для ее изменения");
            notebook.renameTask(scanner.next());
            noteStoringService.saveNote(notebook);
            System.out.println(notebook);
            state = true;
        } else if (a == 4) {
            System.out.println("В видите название задачи для ее удаленя");
            notebook.deleteTask(scanner.next());
            noteStoringService.saveNote(notebook);
            System.out.println(notebook.getTasks());
            state = true;
        } else if (a == 5) {
            System.out.println("Сортировка");
            notebook.sort();
            state = true;
        } else if (a == 6) {
            System.out.println("Time to end");
            notebook.timeToAnd(scanner.next());
            state = true;

        } else if (a == 0) {
            state = false;
        }
        return state;
    }

    private static void load() throws IOException {
        tasks = taskStoringService.readTasks();
        notebook = noteStoringService.readNote();
    }

    private static void print(List<Task> tasks) {
        tasks.forEach(System.out::println);
    }




    private static void printOptions() {
        System.out.println("1 -> посмотреть список задачь");
        System.out.println("2 -> создать новую задачу");
        System.out.println("3 -> переименовать задачу");
        System.out.println("4 -> Удалить задачу");
        System.out.println("5 -> Сортируем задачи");
        System.out.println("6 -> Time to end");
        System.out.println("0 -> выход");
    }

}
