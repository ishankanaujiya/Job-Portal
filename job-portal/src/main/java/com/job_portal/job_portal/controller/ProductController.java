package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.*;
import com.job_portal.job_portal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/productjob")
public class ProductController
{
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product addUser(@RequestBody Product product) {
        System.out.println("Written into the Database");
        return productService.add(product);
    }

    @GetMapping("/list")
    public List<Product> getValue() {
        System.out.println("Written");
        return productService.getAll();
    }

    @DeleteMapping("/delete/{id}")
//    public String deleteValue(@PathVariable int id) {
//        if (emlpoyeeService.delete(id)) {
//            return "Deleted Successfully";
//        } else {
//            return "Information not Found";
//        }
//    }

    public Map<String,Boolean> deleteById(@PathVariable int id) {
        productService.delete(id);
        return Map.of("Success",true);
    }
}
