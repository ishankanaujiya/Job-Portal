package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.AddJob;
import com.job_portal.job_portal.model.ApplyJob;
import com.job_portal.job_portal.model.Backend;
import com.job_portal.job_portal.model.Frontend;
import com.job_portal.job_portal.service.ApplyJobService;
import com.job_portal.job_portal.service.BackendService;
import com.job_portal.job_portal.service.FrontendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backendjob")
public class BackendController
{
    @Autowired
    private BackendService backendService ;

    @PostMapping("/add")
    public Backend addUser(@RequestBody Backend backend) {
        System.out.println("Written into the Database");
        return backendService.add(backend);
    }

    @GetMapping("/list")
    public List<Backend> getValue() {
        System.out.println("Written");
        return backendService.getAll();
    }
}
