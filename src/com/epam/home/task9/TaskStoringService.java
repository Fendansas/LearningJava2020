package com.epam.home.task9;

import java.io.IOException;
import java.util.List;

public interface TaskStoringService {

    void saveTask(Task task) throws IOException;

    void saveTasks(List<Task> tasks) throws IOException;

    Task readTask() throws IOException;

    List<Task> readTasks() throws IOException;







}
