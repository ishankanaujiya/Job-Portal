package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/datascjob")
public class DatascController
{
    @Autowired
    private DatascService datascService;

    @PostMapping("/add")
    public Datasc addUser(@RequestBody Datasc datasc) {
        System.out.println("Written into the Database");
        return datascService.add(datasc);
    }

    @GetMapping("/list")
    public List<Datasc> getValue() {
        System.out.println("Written");
        return datascService.getAll();
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
        datascService.delete(id);
        return Map.of("Success",true);
    }
}
