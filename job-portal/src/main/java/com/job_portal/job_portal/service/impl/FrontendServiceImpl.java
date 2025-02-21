package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.*;
import com.job_portal.job_portal.service.AddJobService;
import com.job_portal.job_portal.service.AdminService;
import com.job_portal.job_portal.service.ApplyJobService;
import com.job_portal.job_portal.service.FrontendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrontendServiceImpl implements FrontendService
{
    @Autowired
    private FrontendRepository frontendRepository;

    @Override
    public Frontend add(Frontend frontend ) {
        return frontendRepository.save(frontend);
    }

    @Override
    public List<Frontend> getAll() {
        return frontendRepository.findAll();
    }
}
