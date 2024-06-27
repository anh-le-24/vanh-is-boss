package com.example.qldatban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.qldatban.model.Nguoidung;

@Repository
public interface NguoidungRepository extends JpaRepository<Nguoidung, Long>{
    
}
