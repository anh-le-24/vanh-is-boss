package com.example.qldatban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.qldatban.model.Doitac;

@Repository
public interface DoitacRepository extends JpaRepository<Doitac, Long>{
    
}
