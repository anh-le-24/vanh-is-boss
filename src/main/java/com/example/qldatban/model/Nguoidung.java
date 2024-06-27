package com.example.qldatban.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="NGUOIDUNG")
public class Nguoidung {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long mand;

    private String hoten;

    private String sdt;

    private String email;

    private String password;

    private String sonha;
    private String duong;
    private String quan;
    private String thanhpho;

    private Date ngaytaotk;

    private int solandatban;

    private int mapq;

    public Nguoidung() {
    }

    public Nguoidung(Long mand, String hoten, String sdt, String email, String password, String sonha, String duong,
            String quan, String thanhpho, Date ngaytaotk, int solandatban, int mapq) {
        this.mand = mand;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.password = password;
        this.sonha = sonha;
        this.duong = duong;
        this.quan = quan;
        this.thanhpho = thanhpho;
        this.ngaytaotk = ngaytaotk;
        this.solandatban = solandatban;
        this.mapq = mapq;
    }

    public Long getMand() {
        return mand;
    }

    public void setMand(Long mand) {
        this.mand = mand;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public Date getNgaytaotk() {
        return ngaytaotk;
    }

    public void setNgaytaotk(Date ngaytaotk) {
        this.ngaytaotk = ngaytaotk;
    }

    public int getSolandatban() {
        return solandatban;
    }

    public void setSolandatban(int solandatban) {
        this.solandatban = solandatban;
    }

    public int getMapq() {
        return mapq;
    }

    public void setMapq(int mapq) {
        this.mapq = mapq;
    }

    

}
