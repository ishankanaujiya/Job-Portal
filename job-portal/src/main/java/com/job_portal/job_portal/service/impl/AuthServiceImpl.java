package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.service.AuthService;
import com.job_portal.job_portal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private EmployeeService employeeService;

    @Override
    public boolean login(String username, String password) {
        Employee employee = employeeService.findByUsername(username);
        if(employee !=null)
        {
            return employee.getPassword().equals(password);

        }

        return false;
    }

}

