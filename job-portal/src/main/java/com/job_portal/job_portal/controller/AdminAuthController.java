package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.dto.LoginDto;
import com.job_portal.job_portal.service.AdminAuthService;
import com.job_portal.job_portal.service.AuthForRecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth_admin")
public class AdminAuthController
{
    @Autowired
    private AdminAuthService adminAuthService;

    @PostMapping("/add")
//    public String checkLogin(@RequestBody LoginDto loginDto)
//    {
//        if(authService.login(loginDto.username(), loginDto.password()))
//        {
//            return "Correct";
//        }
//        return "incorrect";
////       return Map.of("Success",isSuccess);
//    }
    public Map<String,Boolean> login (@RequestBody LoginDto loginDto){

        boolean isSuccess = adminAuthService.login(loginDto.username(), loginDto.password());
        return Map.of("success",isSuccess);
    }
}
