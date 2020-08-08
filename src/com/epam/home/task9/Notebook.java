package com.epam.home.task9;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private List<Task> tasks = new ArrayList<>();

    // добавляем задачу
    public void addTask (Task task){
        tasks.add(task);
    }
    // удаляем задачу
    public void deleteTask(String task){
        Task taskToRemove = null;
        for (Task taskInNotebook : tasks){
            if (taskInNotebook.getName().equals(task)){ // ищем есть такое имя задачит в списке
                taskToRemove = taskInNotebook; // если задача такая есть присваеваем значение
            }
        }
        if (taskToRemove!=null){
            tasks.remove(taskToRemove); // удаляем задчу
        }
    }

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
