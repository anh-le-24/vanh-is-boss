package com.example.qldatban.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DICHVUCC")
public class Dichvu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int madv;

    private String noidung;

    private int soluong;
   
    private double giadv;

    public Dichvu(){

    }

    public int getMadv() {
        return madv;
    }

    public void setMadv(int madv) {
        this.madv = madv;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiadv() {
        return giadv;
    }

    public void setGiadv(double giadv) {
        this.giadv = giadv;
    }

    public Dichvu(int madv, String noidung, int soluong, double giadv) {
        this.madv = madv;
        this.noidung = noidung;
        this.soluong = soluong;
        this.giadv = giadv;
    }

    public Dichvu(String noidung, int soluong, double giadv) {
        this.noidung = noidung;
        this.soluong = soluong;
        this.giadv = giadv;
    }

   
 
    
}