package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void delete(int id) {
        getById(id);
        fullstackRepository.deleteById(id);
    }

    @Override
    public void getById(int id) {
        Optional<Fullstack> optionalUser = fullstackRepository.findById(id);
        optionalUser.orElseThrow((() -> new RuntimeException("User not Found")));

    }
}
