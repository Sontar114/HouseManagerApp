package com.example.Manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Manager.repository.ManagerRepository;
import com.example.Manager.model.Manager;

import java.util.List;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {

    @Autowired
    ManagerRepository studentRepository;

    @PostMapping
    public String create(@RequestBody Manager student) {
        studentRepository.save(student);
        return "Manager is created";
    }

    @GetMapping
    public List<Manager> getAllManagers() {
        List<Manager> students = studentRepository.findAll();
        return students;
    }
}
