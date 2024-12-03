package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.model.Recruiter;

public interface AdminAuthService
{
    boolean login(String username, String password);


}
