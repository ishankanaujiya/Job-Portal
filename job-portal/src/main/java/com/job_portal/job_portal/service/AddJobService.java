package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.*;

import java.util.List;

public interface AddJobService
{
    AddJob add(AddJob addJob);
    List<AddJob> getAll();

}
