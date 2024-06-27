package com.example.qldatban.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DOITAC")
public class Doitac {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long madt;
    private Long mand;
    private String tennhahang;
    private String sonhanh;
    private String duongnh;
    private String quannh;
    private String thanhphonh;
    private String mota;
    private String linklienket;
    private String linkggmap;
    private String hoadontb;
    private Time giomo;
    private Time giodong;
    private int sochongoi;
    private int madv;
    private Date ngaydk;
    
    public Doitac() {
    }

    public Doitac(Long madt, Long mand, String tennhahang, String sonhanh, String duongnh, String quannh,
            String thanhphonh, String mota, String linklienket, String linkggmap, String hoadontb, Time giomo,
            Time giodong, int sochongoi, int madv, Date ngaydk) {
        this.madt = madt;
        this.mand = mand;
        this.tennhahang = tennhahang;
        this.sonhanh = sonhanh;
        this.duongnh = duongnh;
        this.quannh = quannh;
        this.thanhphonh = thanhphonh;
        this.mota = mota;
        this.linklienket = linklienket;
        this.linkggmap = linkggmap;
        this.hoadontb = hoadontb;
        this.giomo = giomo;
        this.giodong = giodong;
        this.sochongoi = sochongoi;
        this.madv = madv;
        this.ngaydk = ngaydk;
    }

    public Long getMadt() {
        return madt;
    }

    public void setMadt(Long madt) {
        this.madt = madt;
    }

    public Long getMand() {
        return mand;
    }

    public void setMand(Long mand) {
        this.mand = mand;
    }

    public String getTennhahang() {
        return tennhahang;
    }

    public void setTennhahang(String tennhahang) {
        this.tennhahang = tennhahang;
    }

    public String getSonhahang() {
        return sonhanh;
    }

    public void setSonhahang(String sonhanh) {
        this.sonhanh = sonhanh;
    }

    public String getDuongnh() {
        return duongnh;
    }

    public void setDuongnh(String duongnh) {
        this.duongnh = duongnh;
    }

    public String getQuannh() {
        return quannh;
    }

    public void setQuannh(String quannh) {
        this.quannh = quannh;
    }

    public String getThanhphonh() {
        return thanhphonh;
    }

    public void setThanhphonh(String thanhphonh) {
        this.thanhphonh = thanhphonh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getLinklienket() {
        return linklienket;
    }

    public void setLinklienket(String linklienket) {
        this.linklienket = linklienket;
    }

    public String getLinkggmap() {
        return linkggmap;
    }

    public void setLinkggmap(String linkggmap) {
        this.linkggmap = linkggmap;
    }

    public String getHoadontb() {
        return hoadontb;
    }

    public void setHoadontb(String hoadontb) {
        this.hoadontb = hoadontb;
    }

    public Time getGiomo() {
        return giomo;
    }

    public void setGiomo(Time giomo) {
        this.giomo = giomo;
    }

    public Time getGiodong() {
        return giodong;
    }

    public void setGiodong(Time giodong) {
        this.giodong = giodong;
    }

    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }

    public int getMadv() {
        return madv;
    }

    public void setMadv(int madv) {
        this.madv = madv;
    }

    public Date getNgaydk() {
        return ngaydk;
    }

    public void setNgaydk(Date ngaydk) {
        this.ngaydk = ngaydk;
    }

    
}