package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController
{
    @Autowired
    private AdminService adminService;

    @PostMapping("/add")
    public Admin addUser(@RequestBody Admin admin) {
        System.out.println("Written into the Database");
        return adminService.add(admin);
    }
}
