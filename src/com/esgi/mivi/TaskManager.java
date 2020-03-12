package com.esgi.mivi;

import java.util.ArrayList;
import java.util.Collections;

public class TaskManager
{
    private ArrayList<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public Task getTaskByIndex(int index) {
        return taskList.get(index);
    }

    public int getTaskCOunt() {
        return this.taskList.size();
    }
}
