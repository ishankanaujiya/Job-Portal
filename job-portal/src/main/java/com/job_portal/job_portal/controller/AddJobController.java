package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.AddJob;
import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.model.LoginInfo;
import com.job_portal.job_portal.service.AddJobService;
import com.job_portal.job_portal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addjob")
public class AddJobController
{
    @Autowired
    private AddJobService addJobService;

    @PostMapping("/add")
    public AddJob addJobForUser(@RequestBody AddJob addJob) {
        System.out.println("Written into the Database");
        return addJobService.add(addJob);
    }

    @GetMapping("/list")
    public List<AddJob> getValue() {
        System.out.println("Written");
        return addJobService.getAll();
    }
}
