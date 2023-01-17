package com.example.Student.Management.repository;

import com.example.Student.Management.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudRepo extends JpaRepository<Students,Integer> {
}
