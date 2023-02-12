package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("saveTask")
    public String saveTask(@RequestBody TaskModel task) {
        taskService.addTask(task);

        return "Added Task Success";
    }

    @GetMapping("alltasks")
    public List<TaskModel> getallTasks() {
        return taskService.getallTasks();
    }

    @GetMapping("changeStatus")
    public TaskModel changeStatus(@RequestParam("id") String id) {
        return taskService.changeStatus(id);
    }

    @GetMapping("getTask")
    public TaskModel getTask(@RequestParam("id") String id) {
        return taskService.getTask(id);
    }

    @GetMapping("deleteTask")
    public void deleteTask(@RequestParam("id") String id) {
        taskService.deleteTask(id);
    }

}
