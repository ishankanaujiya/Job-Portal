package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.*;

import java.util.List;

public interface DesignService
{
    Design add(Design design);
    List<Design> getAll();


    void delete(int id);
    void getById(int id);

}
