package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    final List<TaskModel> taskList = new ArrayList<TaskModel>();

    public List<TaskModel> getallTasks() {
        return taskList;
    }

    public void addTask(TaskModel newtask) {
        taskList.add(newtask);
    }

    public TaskModel changeStatus(String id) {
        // System.out.println("Finding Task");
        for (TaskModel t : taskList) {

            if (t.getTaskId().equals(id)) {
                // System.out.println("Task Name: " + t.getTaskName());

                if (t.getTaskStatus().toLowerCase().equals("in progress"))
                    t.setTaskStatus("Done");
                else if (t.getTaskStatus().toLowerCase().equals("on hold"))
                    t.setTaskStatus("In Progress");
                else
                    t.setTaskStatus("On Hold");

                return t;
            }
        }
        return null;
    }

    public TaskModel getTask(String id) {
        for (TaskModel t : taskList) {
            if (t.getTaskId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    public void deleteTask(String id) {
        taskList.removeIf((t) -> t.getTaskId().equals(id));
        return;
    }
}
