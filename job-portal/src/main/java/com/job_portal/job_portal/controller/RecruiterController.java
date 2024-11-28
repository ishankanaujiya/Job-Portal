package com.job_portal.job_portal.controller;


import com.job_portal.job_portal.model.Recruiter;
import com.job_portal.job_portal.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
    @Autowired
    private RecruiterService recruiterService;

    @GetMapping("/list")
    public List<Recruiter> getValue() {
        System.out.println("Written");
        return recruiterService.getAll();
    }

    @PostMapping("/add")
    public Recruiter addUser(@RequestBody Recruiter recruiter) {
        System.out.println("Written into the Database");
        return recruiterService.add(recruiter);
    }

    @PutMapping("/update/{id}")
    public Recruiter updateValue(@RequestBody Recruiter recruiter, @PathVariable int id) {
        return recruiterService.update(recruiter, id);
    }

    @DeleteMapping("/delete/{id}")
//    public String deleteValue(@PathVariable int id) {
//        if (emlpoyeeService.delete(id)) {
//            return "Deleted Successfully";
//        } else {
//            return "Information not Found";
//        }
//    }

    public Map<String,Boolean> deleteById(@PathVariable int id) {
        recruiterService.delete(id);
        return Map.of("Success",true);
    }

//    @GetMapping("/find/{name}")
//    public List<Employee> findName(@PathVariable String name) {
//        Employee employee = new Employee();
//        return recruiterService.findByName(name);
//        if (employee == null)
//        {
//            return "No Employee Record Found";
//        }
//        else
//        {
//            return "Employee Found";
//        }
    }

