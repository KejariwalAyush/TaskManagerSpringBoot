package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int taskId;
    @Column(name = "holderName")
    private String taskHolderName;
    @Column(name = "date")
    private String taskDate;
    @Column(name = "name")
    private String taskName;
    @Column(name = "status")
    private String taskStatus;

    // public String getTaskId() {
    // return taskId;
    // }

    // public String getTaskHolderName() {
    // return taskHolderName;
    // }

    // public void setTaskHolderName(String holderName) {
    // this.taskHolderName = holderName;
    // }

    // public String getTaskDate() {
    // return taskDate;
    // }

    // public void setTaskDate(String date) {
    // this.taskDate = date;
    // }

    // public String getTaskName() {
    // return taskName;
    // }

    // public void setTaskName(String name) {
    // this.taskName = name;
    // }

    // public String getTaskStatus() {
    // return taskStatus;
    // }

    // public void setTaskStatus(String status) {
    // this.taskStatus = status;
    // }

    // public TaskModel(String id, String holderName, String date, String name,
    // String status) {
    // this.taskId = id;
    // this.taskHolderName = holderName;
    // this.taskDate = date;
    // this.taskName = name;
    // this.taskStatus = status;
    // }

}
