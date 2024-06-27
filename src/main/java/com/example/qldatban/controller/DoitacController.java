package com.example.qldatban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.qldatban.service.DoitacService;

@Controller
@RequestMapping("/doitac")
public class DoitacController {
    
    @Autowired
    private DoitacService doitacService;

    @GetMapping("/tatca")
    public String getAllDoitac(Model model){
        model.addAttribute("doitacs",doitacService.getAllDoitac());
        return "doitachtml";
    }
}
