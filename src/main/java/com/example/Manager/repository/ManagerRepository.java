package com.example.Manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Manager.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, String> {}