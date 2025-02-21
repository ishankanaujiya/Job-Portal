package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.*;

import java.util.List;

public interface BackendService
{
    Backend add(Backend backend);
    List<Backend> getAll();


    void delete(int id);
    void getById(int id);

}
