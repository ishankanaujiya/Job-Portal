package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.Recruiter;
import com.job_portal.job_portal.service.AdminAuthService;
import com.job_portal.job_portal.service.AdminService;
import com.job_portal.job_portal.service.AuthForRecruiterService;
import com.job_portal.job_portal.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAuthServiceImpl implements AdminAuthService {
    @Autowired
    private AdminService adminService;

    @Override
    public boolean login(String username, String password) {
        Admin admin = adminService.findByUsername(username);
        if(admin !=null)
        {
            return admin.getPassword().equals(password);

        }

        return false;
    }

}