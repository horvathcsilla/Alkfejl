package com.teamproject.familytodo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.teamproject.familytodo.model.ToDoList;

@Repository
public interface ToDoListRepository extends CrudRepository<ToDoList, Integer> {

    @Override
    public List<ToDoList> findAll();
}