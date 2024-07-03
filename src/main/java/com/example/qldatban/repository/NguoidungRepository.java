package com.example.qldatban.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.qldatban.model.Nguoidung;

@Repository
public interface NguoidungRepository extends JpaRepository<Nguoidung, Long>{
    
    @Query("SELECT n FROM Nguoidung n WHERE n.hoten LIKE %?1% OR n.sdt LIKE %?1% OR n.email LIKE %?1%")
    List<Nguoidung> search(String keyword);
}
