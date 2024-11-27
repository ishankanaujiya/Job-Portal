package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService emlpoyeeService;

    @GetMapping("/list")
    public List<Employee> getValue() {
        System.out.println("Written");
        return emlpoyeeService.getAll();
    }

    @PostMapping("/add")
    public Employee addUser(@RequestBody Employee employee) {
        System.out.println("Written into the Database");
        return emlpoyeeService.add(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateValue(@RequestBody Employee employee, @PathVariable int id) {
        return emlpoyeeService.update(employee, id);
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
        emlpoyeeService.delete(id);
        return Map.of("Success",true);
    }

    @GetMapping("/find/{name}")
    public List<Employee> findName(@PathVariable String name) {
        Employee employee = new Employee();
        return emlpoyeeService.findByName(name);
//        if (employee == null)
//        {
//            return "No Employee Record Found";
//        }
//        else
//        {
//            return "Employee Found";
//        }
    }
}
