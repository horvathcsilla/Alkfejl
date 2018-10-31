package com.teamproject.familytodo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamproject.familytodo.repository.ToDoListRepository;
import com.teamproject.familytodo.model.ToDoList;

@Service
public class ToDoListService {

    @Autowired
    private ToDoListRepository toDoListRepository;

    public List<ToDoList> findAll() {
        return toDoListRepository.findAll();
    }
}