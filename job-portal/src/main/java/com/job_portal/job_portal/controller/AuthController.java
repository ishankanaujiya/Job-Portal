package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.dto.LoginDto;
import com.job_portal.job_portal.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController
{
    @Autowired
    private AuthService authService;

    @PostMapping("/add")
    public String checkLogin(@RequestBody LoginDto loginDto)
    {
        if(authService.login(loginDto.username(), loginDto.password()))
        {
            return "Correct";
        }
        return "incorrect";
//       return Map.of("Success",isSuccess);
    }
}