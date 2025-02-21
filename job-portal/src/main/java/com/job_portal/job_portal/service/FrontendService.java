package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.*;

import java.util.List;

public interface FrontendService
{
    Frontend add(Frontend frontend);
    List<Frontend> getAll();



    Frontend update(Frontend frontend, int id);
    void delete(int id);
    void getById(int id);

}
