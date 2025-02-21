package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.repository.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatascServiceImpl implements DatascService
{
    @Autowired
    private DatascRepository datascRepository;

    @Override
    public Datasc add(Datasc datasc) {
        return datascRepository.save(datasc);
    }

    @Override
    public List<Datasc> getAll() {
        return datascRepository.findAll();
    }

    @Override
    public void delete(int id) {
        getById(id);
        datascRepository.deleteById(id);
    }

    @Override
    public void getById(int id) {
        Optional<Datasc> optionalUser = datascRepository.findById(id);
        optionalUser.orElseThrow((() -> new RuntimeException("User not Found")));

    }
}
