package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.ContactUs;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactUsController
{
    @Autowired
    private ContactUsService contactUsService;

    @PostMapping("/add")
    public ContactUs addUser(@RequestBody ContactUs contactUs) {
        return contactUsService.add(contactUs);
    }
}
