package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.model.LoginInfo;
import lombok.extern.java.Log;

import java.util.List;

public interface LoginInfoService
{
     LoginInfo add(LoginInfo loginInfo);
//    Admin findByUsername(String username);


    List<LoginInfo> getAll();
    void delete(int id);
    void getById(int id);
}
