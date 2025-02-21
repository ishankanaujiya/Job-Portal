package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.*;

import java.util.List;

public interface FullstackService
{
    Fullstack add(Fullstack fullstack);
    List<Fullstack> getAll();


    void delete(int id);
    void getById(int id);

}
