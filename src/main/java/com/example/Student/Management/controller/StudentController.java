package com.example.Student.Management.controller;

//import com.example.Employee.management.System.entity.Employee;
//import com.example.Employee.management.System.repository.EmpRepo;
//import com.example.Employee.management.System.service.EmpService;
import com.example.Student.Management.entity.Students;
import com.example.Student.Management.service.StudService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudService studService;


    @GetMapping("/")
    public String home(Model n)
    {
        List<Students> stud=studService.getAllStud();
        n.addAttribute("stud",stud);
        return "index";
    }




    @GetMapping("/addstud")
    public String addstud()
    {
        return "addstud";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Students students){

        System.out.println(students);
        studService.addstud(students);
//        session.setAttribute("msg","Employee saved successfully...");

        return "redirect:/";


    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model n){

        Students s=studService.getStudById(id);
        n.addAttribute("stud",s);
        return "edit";
    }
    @PostMapping("/update")
    public String updateStud(@ModelAttribute Students s){

        studService.addstud(s);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStud(@PathVariable int id){
        studService.deleteStud(id);
        return "redirect:/";
    }



}
