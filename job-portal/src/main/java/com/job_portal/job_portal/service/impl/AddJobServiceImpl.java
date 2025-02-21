package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.AddJobRepository;
import com.job_portal.job_portal.repository.AdminRepository;
import com.job_portal.job_portal.repository.ApplyJobRepository;
import com.job_portal.job_portal.repository.EmployeeRepository;
import com.job_portal.job_portal.service.AddJobService;
import com.job_portal.job_portal.service.AdminService;
import com.job_portal.job_portal.service.ApplyJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddJobServiceImpl implements AddJobService
{
    @Autowired
    private AddJobRepository addJobRepository;

    @Override
    public AddJob add(AddJob addJob) {
        return addJobRepository.save(addJob);
    }

    @Override
    public List<AddJob> getAll() {
        return addJobRepository.findAll();
    }

    @Override
    public void delete(int id) {
        getById(id);
        addJobRepository.deleteById(id);
    }

    @Override
    public void getById(int id) {
        Optional<AddJob> optionalUser = addJobRepository.findById(id);
        optionalUser.orElseThrow((() -> new RuntimeException("User not Found")));

    }
}
