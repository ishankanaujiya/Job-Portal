package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignServiceImpl implements DesignService
{
    @Autowired
    private DesignRepository designRepository;

    @Override
    public Design add(Design design) {
        return designRepository.save(design);
    }

    @Override
    public List<Design> getAll() {
        return designRepository.findAll();
    }
}
