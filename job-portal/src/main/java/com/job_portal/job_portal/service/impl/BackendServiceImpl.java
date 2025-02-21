package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void delete(int id) {
        getById(id);
        backendRepository.deleteById(id);
    }

    @Override
    public void getById(int id) {
        Optional<Backend> optionalUser = backendRepository.findById(id);
        optionalUser.orElseThrow((() -> new RuntimeException("User not Found")));

    }
}
