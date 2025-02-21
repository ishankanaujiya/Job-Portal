package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.AddJob;
import com.job_portal.job_portal.model.ApplyJob;
import com.job_portal.job_portal.model.Frontend;
import com.job_portal.job_portal.service.ApplyJobService;
import com.job_portal.job_portal.service.FrontendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/frontendjob")
public class FrontendController
{
    @Autowired
    private FrontendService frontendService;

    @PostMapping("/add")
    public Frontend addUser(@RequestBody Frontend frontend) {
        System.out.println("Written into the Database");
        return frontendService.add(frontend);
    }

    @GetMapping("/list")
    public List<Frontend> getValue() {
        System.out.println("Written");
        return frontendService.getAll();
    }
}
