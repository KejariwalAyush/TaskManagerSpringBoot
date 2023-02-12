package com.example.demo;

public class TaskModel {
    final private String taskId;
    private String taskHolderName;
    private String taskDate;
    private String taskName;
    private String taskStatus;

    public String getTaskId() {
        return taskId;
    }

    public String getTaskHolderName() {
        return taskHolderName;
    }

    public void setTaskHolderName(String holderName) {
        this.taskHolderName = holderName;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String date) {
        this.taskDate = date;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String name) {
        this.taskName = name;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String status) {
        this.taskStatus = status;
    }

    public TaskModel(String id, String holderName, String date, String name, String status) {
        this.taskId = id;
        this.taskHolderName = holderName;
        this.taskDate = date;
        this.taskName = name;
        this.taskStatus = status;
    }

}
