package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    final List<TaskModel> taskList = new ArrayList<TaskModel>();

    private TaskRepository repo;

    @Autowired
    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<TaskModel> getallTasks() {
        return repo.findAll();
        // return taskList;
    }

    public void addTask(TaskModel newtask) {
        repo.save(newtask);
        // taskList.add(newtask);
    }

    public TaskModel getTask(String id) {
        return repo.findById(id).orElse(null);
        // for (TaskModel t : taskList) {
        // if (t.getTaskId().equals(id)) {
        // return t;
        // }
        // }
        // return null;
    }

    public void deleteTask(String id) {
        repo.deleteById(id);
        // taskList.removeIf((t) -> t.getTaskId().equals(id));
        return;
    }

    public TaskModel changeStatus(String id) {

        TaskModel t = repo.findById(id).orElse(null);
        if (t != null) {
            if (t.getTaskStatus().toLowerCase().equals("in progress"))
                t.setTaskStatus("Done");
            else if (t.getTaskStatus().toLowerCase().equals("on hold"))
                t.setTaskStatus("In Progress");
            else
                t.setTaskStatus("On Hold");
        }
        repo.save(t);
        return t;
        // System.out.println("Finding Task");
        // for (TaskModel t : taskList) {

        // if (t.getTaskId().equals(id)) {
        // // System.out.println("Task Name: " + t.getTaskName());

        // if (t.getTaskStatus().toLowerCase().equals("in progress"))
        // t.setTaskStatus("Done");
        // else if (t.getTaskStatus().toLowerCase().equals("on hold"))
        // t.setTaskStatus("In Progress");
        // else
        // t.setTaskStatus("On Hold");

        // return t;
        // }
        // }
        // return null;
    }

}
