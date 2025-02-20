package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.ApplyJob;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.model.LoginInfo;
import com.job_portal.job_portal.service.AdminService;
import com.job_portal.job_portal.service.ApplyJobService;
import com.job_portal.job_portal.service.LoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/logindata")
public class LoginInfoController
{
    @Autowired
    private LoginInfoService loginInfoService;

    @PostMapping("/add")
    public LoginInfo addUser(@RequestBody LoginInfo loginInfo) {
        System.out.println("Written into the Database");
        return loginInfoService.add(loginInfo);
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
        loginInfoService.delete(id);
        return Map.of("Success",true);
    }

    @GetMapping("/list")
    public List<LoginInfo> getValue() {
        System.out.println("Written");
        return loginInfoService.getAll();
    }
}
