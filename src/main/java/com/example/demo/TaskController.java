package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("saveTask")
    public String saveTask(@RequestBody TaskModel task) {
        if (taskService.getTask("" + task.getTaskId()) == null) {
            taskService.addTask(task);
            return "Task Added Successfully!";
        }
        return "Already task exists with same id";
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
    public String deleteTask(@RequestParam("id") String id) {
        if (taskService.getTask(id) == null)
            return "Task id does not exists";
        taskService.deleteTask(id);
        return "Task (" + id + ") Deleted Successfully";
    }

}
