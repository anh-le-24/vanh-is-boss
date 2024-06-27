package com.example.qldatban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired

    @GetMapping("/home")
    public String getAdmin(){
        return "admin";
    }

    @GetMapping("/thongke")
    public String getThongke(){
        return "thongke";
    }

}
