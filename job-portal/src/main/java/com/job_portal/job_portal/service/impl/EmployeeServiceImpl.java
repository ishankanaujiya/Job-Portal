package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.repository.EmployeeRepository;
import com.job_portal.job_portal.service.EmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class EmployeeServiceImpl implements EmployeeService
{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee add(Employee employee) {
        System.out.println("Written into the Database");

        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee, int id) {
        Optional<Employee> optionalObject = employeeRepository.findById(id);
        System.out.println(id);
        if(optionalObject.isEmpty())
        {
            Employee employee1 = optionalObject.orElseThrow((()->new RuntimeException("User not found")));
            System.out.println("Error");
        }
        else
        {
            employee.setId(id);
            return employeeRepository.save(employee);
        }

        return null;
    }

    @Override
    public Boolean delete(int id) {
        Optional<Employee> optionalObject = employeeRepository.findById(id);
        if(optionalObject.isEmpty())
        {
            Employee employee1 = optionalObject.orElseThrow((()->new RuntimeException("User not found")));
            System.out.println("Error");
            return false;
        }
        else
        {
            employeeRepository.deleteById(id);
            return true;
        }


    }

    @Override
    public Employee findByUsername(String username) {
        return employeeRepository.findByUsername(username);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);

    }
}
