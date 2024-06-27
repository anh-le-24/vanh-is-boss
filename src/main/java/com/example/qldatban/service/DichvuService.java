package com.example.qldatban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qldatban.model.Dichvu;
import com.example.qldatban.repository.DichvuRepository;

@Service
public class DichvuService {
    
    @Autowired
    private DichvuRepository dichvuRepository;

    public List<Dichvu> getAllDichVu(){
        return dichvuRepository.findAll();
    }
}
