package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.ContactUs;
import com.job_portal.job_portal.repository.ContactUsRepository;
import com.job_portal.job_portal.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsServiceImpl implements ContactUsService {

    @Autowired
    private ContactUsRepository contactUsRepository;

    @Override
    public ContactUs add(ContactUs contactUs) {
        return contactUsRepository.save(contactUs);
    }
}
