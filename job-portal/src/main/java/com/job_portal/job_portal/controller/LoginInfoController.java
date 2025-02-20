package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.ApplyJob;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.model.LoginInfo;
import com.job_portal.job_portal.service.AdminService;
import com.job_portal.job_portal.service.ApplyJobService;
import com.job_portal.job_portal.service.LoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logindata")
public class LoginInfoController
{
    @Autowired
    private LoginInfoService loginInfoService;

    @PostMapping("/add")
    public LoginInfo addUser(@RequestBody LoginInfo loginInfo) {
        System.out.println("Written into the Database");
        return loginInfoService.add(loginInfo);
    }
}
