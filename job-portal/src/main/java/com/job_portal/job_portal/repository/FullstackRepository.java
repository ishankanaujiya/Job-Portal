package com.job_portal.job_portal.repository;

import com.job_portal.job_portal.model.AddJob;
import com.job_portal.job_portal.model.Admin;

import com.job_portal.job_portal.model.Frontend;
import com.job_portal.job_portal.model.Fullstack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FullstackRepository extends JpaRepository<Fullstack, Integer> {


}

