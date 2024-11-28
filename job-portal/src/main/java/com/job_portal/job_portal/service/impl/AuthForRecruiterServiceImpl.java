package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.Recruiter;
import com.job_portal.job_portal.service.AuthForRecruiterService;
import com.job_portal.job_portal.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthForRecruiterServiceImpl implements AuthForRecruiterService {
    @Autowired
    private RecruiterService recruiterService;

    @Override
    public boolean login(String username, String password) {
        Recruiter recruiter = recruiterService.findByUsername(username);
        if(recruiter !=null)
        {
            return recruiter.getPassword().equals(password);

        }

        return false;
    }

}
