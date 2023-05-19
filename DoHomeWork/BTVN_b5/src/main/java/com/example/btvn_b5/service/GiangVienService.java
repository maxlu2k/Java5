package com.example.btvn_b5.service;

import com.example.btvn_b5.entity.GiangVien;

import java.util.List;

public interface GiangVienService {
    List<GiangVien> getAll();
    GiangVien detailGiangVien(String maGV);
    void deleteGV(String maGV);

    List<GiangVien> searchGVByName(String ten, Integer min, Integer max);
    void addGV(GiangVien giangVien);

}
