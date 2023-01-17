package com.example.Student.Management.service;

//import com.example.Employee.management.System.entity.Employee;
//import com.example.Employee.management.System.repository.EmpRepo;
import com.example.Student.Management.entity.Students;
import com.example.Student.Management.repository.StudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudService {


    @Autowired
    private StudRepo studRepo;


    public List<Students> getAllStud() {
        return studRepo.findAll();
    }

    public void addstud(Students students) {
        studRepo.save(students);
    }

    public Students getStudById(int id) {

        Optional<Students> e = studRepo.findById(id);
        if (e.isPresent()) {
            return e.get();

        } else {
            return null;
        }
    }

    public void deleteStud(int id) {
        studRepo.deleteById(id);

    }


}
