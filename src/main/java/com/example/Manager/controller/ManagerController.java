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
    ManagerRepository managerRepository;

    @PostMapping
    public String create(@RequestBody Manager manager) {
        managerRepository.save(manager);
        return "Manager is created";
    }

    @GetMapping
    public List<Manager> getAllManagers() {
        List<Manager> manager = managerRepository.findAll();
        return manager;
    }
}
