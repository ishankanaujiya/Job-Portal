package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.*;

import java.util.List;

public interface ProductService
{
    Product add(Product product);
    List<Product> getAll();


    void delete(int id);
    void getById(int id);

}
