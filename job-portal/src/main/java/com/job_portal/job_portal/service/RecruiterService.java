package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.model.Recruiter;

import java.util.List;

public interface RecruiterService {
    List<Recruiter> getAll();
    Recruiter add(Recruiter recruiter);
    Recruiter update(Recruiter recruiter, int id);
    void delete(int id);



    void getById(int id);

    Recruiter findByUsername(String username);
}
