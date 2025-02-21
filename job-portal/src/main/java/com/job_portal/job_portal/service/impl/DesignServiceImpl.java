package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void delete(int id) {
        getById(id);
        designRepository.deleteById(id);
    }

    @Override
    public void getById(int id) {
        Optional<Design> optionalUser = designRepository.findById(id);
        optionalUser.orElseThrow((() -> new RuntimeException("User not Found")));

    }
}
