package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackendServiceImpl implements BackendService
{
    @Autowired
    private BackendRepository backendRepository;

    @Override
    public Backend add(Backend backend ) {
        return backendRepository.save(backend);
    }

    @Override
    public List<Backend> getAll() {
        return backendRepository.findAll();
    }
}
