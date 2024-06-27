package com.example.qldatban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.qldatban.model.Dichvu;

@Repository
public interface DichvuRepository extends JpaRepository<Dichvu, Integer>{
    
}
