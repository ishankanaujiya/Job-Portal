package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.repository.AdminRepository;
import com.job_portal.job_portal.repository.EmployeeRepository;
import com.job_portal.job_portal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService
{
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin add(Admin admin) {

        return adminRepository.save(admin);
    }

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}
