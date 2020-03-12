package com.esgi.mivi;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task(LocalDateTime.of(2020, 03, 12, 17, 00), "First task");
        Task task2 = new Task(LocalDateTime.of(2020, 03, 11, 17, 00), "Second task");
        Task task3 = new Task(LocalDateTime.of(2020, 03, 10, 17, 00), "Third task");
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        TaskShower.showTasks(taskManager);
    }
}
