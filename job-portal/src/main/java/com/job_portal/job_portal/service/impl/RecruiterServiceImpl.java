package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.Employee;

import com.job_portal.job_portal.model.Recruiter;
import com.job_portal.job_portal.repository.RecruiterRepository;
import com.job_portal.job_portal.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruiterServiceImpl implements RecruiterService {

    @Autowired
    private RecruiterRepository recruiterRepository;


    @Override
    public List<Recruiter> getAll() {
        return recruiterRepository.findAll();
    }

    @Override
    public Recruiter add(Recruiter recruiter) {
        System.out.println("Written into the Database");

        return recruiterRepository.save(recruiter);
    }

    @Override
    public Recruiter update(Recruiter recruiter, int id) {
        Optional<Recruiter> optionalObject = recruiterRepository.findById(id);
        System.out.println(id);
        if (optionalObject.isEmpty()) {
            Recruiter recruiter1 = optionalObject.orElseThrow((() -> new RuntimeException("User not found")));
            System.out.println("Error");
        } else {
            recruiter.setId(id);
            return recruiterRepository.save(recruiter);
        }

        return null;
    }

//    @Override
//    public Boolean delete(int id) {
//        Optional<Employee> optionalObject = employeeRepository.findById(id);
//        if(optionalObject.isEmpty())
//        {
//            Employee employee1 = optionalObject.orElseThrow((()->new RuntimeException("User not found")));
//            System.out.println("Error");
//            return false;
//        }
//        else
//        {
//            employeeRepository.deleteById(id);
//            return true;
//        }
//
//
//    }

    @Override
    public void delete(int id) {
        getById(id);
        recruiterRepository.deleteById(id);
    }

    @Override
    public void getById(int id) {
        Optional<Recruiter> optionalUser = recruiterRepository.findById(id);
        optionalUser.orElseThrow((() -> new RuntimeException("User not Found")));

    }


    @Override
    public Recruiter findByUsername(String username) {
        return recruiterRepository.findByUsername(username);
    }
}

