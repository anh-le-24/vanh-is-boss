package com.example.qldatban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qldatban.model.Doitac;
import com.example.qldatban.repository.DoitacRepository;

@Service
public class DoitacService {
    
    @Autowired
    private DoitacRepository doitacRepository;

    public List<Doitac> getAllDoitac(){
        return doitacRepository.findAll();
    }
    
}
