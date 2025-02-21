package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FullstackServiceImpl implements FullstackService
{
    @Autowired
    private FullstackRepository fullstackRepository;

    @Override
    public Fullstack add(Fullstack fullstack) {
        return fullstackRepository.save(fullstack);
    }

    @Override
    public List<Fullstack> getAll() {
        return fullstackRepository.findAll();
    }
}
