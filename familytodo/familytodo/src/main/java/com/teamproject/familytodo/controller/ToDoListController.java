package com.teamproject.familytodo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamproject.familytodo.service.ToDoListService;
import com.teamproject.familytodo.model.ToDoList;

@RestController
@RequestMapping("/api/list")
class ToDoListController {

    @Autowired
    private ToDoListService toDoListService;

    @GetMapping("/all")
    public List<ToDoList> all() {
        return toDoListService.findAll();
    }
}