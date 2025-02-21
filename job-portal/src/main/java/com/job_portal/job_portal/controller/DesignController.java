package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.service.ApplyJobService;
import com.job_portal.job_portal.service.DesignService;
import com.job_portal.job_portal.service.FrontendService;
import com.job_portal.job_portal.service.FullstackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/designjob")
public class DesignController
{
    @Autowired
    private DesignService designService;

    @PostMapping("/add")
    public Design addUser(@RequestBody Design design) {
        System.out.println("Written into the Database");
        return designService.add(design);
    }

    @GetMapping("/list")
    public List<Design> getValue() {
        System.out.println("Written");
        return designService.getAll();
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
        designService.delete(id);
        return Map.of("Success",true);
    }
}
