package com.epam.home.task9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static javax.script.ScriptEngine.FILENAME;

public class TaskStoringServiceImpl implements TaskStoringService {

    private static final String FILENAME = "storage.txt";

    @Override
    public void saveTask(Task task) throws IOException {

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILENAME);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(task);
            System.out.println("Saved item: " + task);
        } catch (IOException e) {
            System.out.println("An exception is thrown during saving item: " + task);
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        }

    }

    @Override
    public void saveTasks(List<Task> tasks) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(FILENAME);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Task task : tasks) {
                try {
                    objectOutputStream.writeObject(task);
                } catch (IOException e) {
                    System.out.println("An exception is thrown during saving items with task: " + task);
                    e.printStackTrace();
                }
                System.out.println("Saved task: " + task);
            }

        } catch (IOException e) {
            System.out.println("An exception is thrown during saving tasks.");
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        }


    }

    @Override
    public Task readTask() throws IOException {

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Task task = null;
        try {
            fileInputStream = new FileInputStream(FILENAME);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            if (object instanceof Task) {
                task = (Task) object;
                System.out.println("Task is read: " + task);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An exception is thrown during reading task.");
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            objectInputStream.close();
        }
        return task;

    }

    @Override
    public List<Task> readTasks() throws IOException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Task task = null;
        List<Task> items = new ArrayList<>();

        try {
            fileInputStream = new FileInputStream(FILENAME);
            objectInputStream = new ObjectInputStream(fileInputStream);
            while (fileInputStream.available() > 0) {
                Object object = objectInputStream.readObject();
                if (object instanceof Task) {
                    task = (Task) object;
                    System.out.println("task is read: " + task);
                    items.add(task);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An exception is thrown during reading task.");
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            objectInputStream.close();
        }
        return items;
    }
}
