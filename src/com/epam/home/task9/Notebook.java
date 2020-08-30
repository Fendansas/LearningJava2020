package com.epam.home.task9;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

import static com.epam.home.task9.Priority.*;

public class Notebook implements Serializable {

    private static final long serialVersionUID = -8627723303753989017L;

    private List<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static Priority priority;


    //сортировка по дате
    public void sort() {
        tasks.sort(Comparator.comparing(o -> o.getDeadLine()));
        System.out.println(tasks);
    }

    // добавляем задачу
    public void addTask(Task task) {
        tasks.add(task);
    }

    // удаляем задачу
    public void deleteTask(String task) {
        Task taskToRemove = null;

        for (Task taskInNotebook : tasks) {
            if (taskInNotebook.getName().equals(task)) { // ищем есть такое имя задачит в списке
                taskToRemove = taskInNotebook; // если задача такая есть присваеваем значение
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove); // удаляем задчу
        }
    }

    //выводим время которе оталось о конца выполнения задачи
    public void timeToAnd(String task) {
        LocalDateTime localDateTimeAnd = LocalDateTime.now();
        for (Task taskInNotebook : tasks) {
            if (taskInNotebook.getName().equals(task)) { // ищем есть такое имя задачит в списке
                System.out.println("Время");
                LocalDateTime from = LocalDateTime.now();
                LocalDateTime to = taskInNotebook.getDeadLine();
                Duration duration = Duration.between(from, to);
                int hours = (int) (duration.toHours() % 24);
                System.out.println("До дэдлайна осталось " + duration.toDays() + " Дней и " + hours + " часов");

            }
        }

    }

    // создаем задачу
    public static Task create() {
        return new Task(getName(), getCategory(), getPriority(), getDate());
    }

    //коректеровка имени задачи
    public void renameTask(String task) {
        for (Task taskInNotebook : tasks) {
            if (taskInNotebook.getName().equals(task)) { // ищем есть такое имя задачит в списке
                System.out.println("В видите новое имя");
                taskInNotebook.setName(scanner.nextLine()); // если задача такая есть присваеваем новое имя
            }
        }

    }

    private static String getName() {
        System.out.println("Enter name: ");
        return scanner.nextLine();
    }

    private static String getCategory() {
        System.out.println("Enter Category: ");
        return scanner.nextLine();
    }

    private static Priority getPriority() {
        System.out.println("Выбeри приоритет:LONG, URGENTLY, CURRENT");
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            System.out.println("Please input value");
            input = scanner.nextLine();
        }
        if (input.equalsIgnoreCase("LONG")) {
            priority = LONG;
        } else if (input.equalsIgnoreCase("URGENTLY")) {
            priority = URGENTLY;
        } else if (input.equalsIgnoreCase("CURRENT")) {
            priority = CURRENT;
        }
        return priority;
    }

    private static LocalDateTime getDate() {
        LocalDateTime deadLine = LocalDateTime.now();
        return deadLine;

    }
    ////////////////////////////////////////////////////////////


    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "tasks=" + tasks +
                '}' + "\r\n";
    }
}
