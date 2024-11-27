package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> getAll();
    Employee add(Employee employee);
    Employee update(Employee employee, int id);
    Boolean delete(int id);
    Employee findByUsername(String username);
    List<Employee> findByName(String name);
}
