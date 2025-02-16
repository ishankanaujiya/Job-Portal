package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.ApplyJob;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.repository.AdminRepository;
import com.job_portal.job_portal.repository.ApplyJobRepository;
import com.job_portal.job_portal.repository.EmployeeRepository;
import com.job_portal.job_portal.service.AdminService;
import com.job_portal.job_portal.service.ApplyJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplyJobServiceImpl implements ApplyJobService
{
    @Autowired
    private ApplyJobRepository applyJobRepository;

    @Override
    public ApplyJob add(ApplyJob applyJob) {
        return applyJobRepository.save(applyJob);
    }
}
