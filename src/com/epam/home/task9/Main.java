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
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Notebook notebook = new Notebook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Старт __________________________________________________________");
        LocalDateTime departureTime = LocalDateTime.now();
        //tasks = taskStoringService.readTasks();
        notebook = noteStoringService.readNote();

        boolean state = true;

        while (state == true) {
            printOptions();
            int a = scanner.nextInt();
            if (a==1) {
                System.out.println(notebook);
                state = true;
            } else if (a == 2){
                notebook.addTask(Notebook.create());
                noteStoringService.saveNote(notebook);
                System.out.println(notebook);
                state = true;
            } else if (a == 3){
                System.out.println("В видите название задачи для ее изменения");
                notebook.renameTask(scanner.nextLine());
                noteStoringService.saveNote(notebook);
                System.out.println(notebook);
                state = true;
            } else if (a == 4){
                notebook.deleteTask(scanner.nextLine());
                noteStoringService.saveNote(notebook);
                System.out.println(notebook.getTasks());
                state = true;
            } else if (a == 0){
                state = false;
            }

        }


        System.out.println("_____________________");


        System.out.println(notebook);
        System.out.println("_____________________");

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

        //создаем задачу =========================================================
     /*   notebook.addTask(Notebook.create());
        System.out.println(notebook);

        //System.out.println(notebook.getTasks());

        //удаляем
        notebook.deleteTask(scanner.nextLine());
        System.out.println(notebook.getTasks());

        // меняем имя
        System.out.println("В видите название задачи для ее изменения");
        notebook.renameTask(scanner.nextLine());
        System.out.println(notebook.getTasks());


        //taskStoringService.saveTask(task);
        noteStoringService.saveNote(notebook);

      */

        ////////////////////////////////////////////////////////////////============================
    }

    private static void load() throws IOException {
        tasks = taskStoringService.readTasks();
        notebook = noteStoringService.readNote();
    }

    private static void print(List<Task> tasks) {
        tasks.forEach(System.out::println);
    }

    //создаем и удаляем
   /* private static void processUserChoice(Notebook notebook, String name) {
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

    */

    private static void addToNote(Notebook notebook, String item) {
        List<Task> collectedItems = tasks.stream()
                .filter(itemInStream -> itemInStream.getName().equals(item))
                .collect(Collectors.toList());
        if (!collectedItems.isEmpty()) {
            notebook.addTask(collectedItems.get(0));
        }
    }

    private static void printOptions() {
        System.out.println("1 -> посмотреть список задачь");
        System.out.println("2 -> создать новую задачу");
        System.out.println("3 -> переименовать задачу");
        System.out.println("4 -> Удалить задачу");
        System.out.println("0 -> ваход");
    }

}
