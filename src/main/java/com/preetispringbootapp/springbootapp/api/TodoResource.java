package com.preetispringbootapp.springbootapp.api;

import com.preetispringbootapp.springbootapp.domain.Todo;
import com.preetispringbootapp.springbootapp.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/todos")


public class TodoResource {
    private TodoRepository todoRepository;

    @Autowired
    public TodoResource( TodoRepository todoRepository)
    {
        this.todoRepository= todoRepository;

    }

    @PostMapping
    public ResponseEntity<Void> Create(@RequestBody Todo todo)
    {
        Todo Saved=todoRepository.save(todo);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<Todo> fetchAll()
    {
        Iterable<Todo> todos = todoRepository.findAll();

        List<Todo> todoList = new ArrayList<>();
        for (Todo todo : todos) {
            todoList.add(todo);
        }
        return todoList;
    }

    
}


