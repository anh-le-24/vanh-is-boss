package com.example.qldatban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.qldatban.service.DichvuService;

@Controller
@RequestMapping("/dichvu")
public class DichvuController {
    
    @Autowired
    private DichvuService dichvuService;

    @GetMapping
    public String getAllDV(Model model){
        model.addAttribute("dichvus", dichvuService.getAllDichVu());
        return "dichVu"; 
    }

}
