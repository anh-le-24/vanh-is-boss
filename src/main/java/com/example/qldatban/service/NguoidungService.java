package com.example.qldatban.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qldatban.model.Nguoidung;
import com.example.qldatban.repository.NguoidungRepository;

@Service
public class NguoidungService {

    @Autowired
    private NguoidungRepository nguoidungRepository;

    public List<Nguoidung> getAllNguoidung(){
        return nguoidungRepository.findAll();
    }

    public Optional<Nguoidung> getNguoidungById(Long id){
        return nguoidungRepository.findById(id);
    }

    public void saveOrUpdate(Nguoidung nguoidung) {
        nguoidungRepository.save(nguoidung);
    }

    public void deleteNguoidung(Long id) {
        nguoidungRepository.deleteById(id);
    }

    public List<Nguoidung> searchNguoidung(String keyword) {
        return nguoidungRepository.search(keyword);
    }


}
