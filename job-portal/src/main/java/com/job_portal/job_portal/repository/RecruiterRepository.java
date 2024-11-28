package com.job_portal.job_portal.repository;

import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.model.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecruiterRepository extends JpaRepository<Recruiter, Integer> {
    Recruiter findByUsername(String username);

}
