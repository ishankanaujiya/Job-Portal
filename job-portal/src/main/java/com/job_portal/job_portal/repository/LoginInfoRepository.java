package com.job_portal.job_portal.repository;

import com.job_portal.job_portal.model.Admin;

import com.job_portal.job_portal.model.LoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginInfoRepository extends JpaRepository<LoginInfo, Integer> {
//    Admin findByUsername(String username);

}

