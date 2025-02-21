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
import java.util.Optional;

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

    @Override
    public void delete(int id) {
        getById(id);
        frontendRepository.deleteById(id);
    }

    @Override
    public void getById(int id) {
        Optional<Frontend> optionalUser = frontendRepository.findById(id);
        optionalUser.orElseThrow((() -> new RuntimeException("User not Found")));

    }

    @Override
    public Frontend update(Frontend frontend, int id) {
        Optional<Frontend> optionalObject = frontendRepository.findById(id);
        System.out.println(id);
        if(optionalObject.isEmpty())
        {
            Frontend frontend1 = optionalObject.orElseThrow((()->new RuntimeException("User not found")));
            System.out.println("Error");
        }
        else
        {
            frontend.setId(id);
            return frontendRepository.save(frontend);
        }

        return null;
    }
}
