package com.example.btvnb3.service;

import com.example.btvnb3.entity.GiangVien;

import java.util.List;

public interface GiangVienService {
List<GiangVien> getAll();
GiangVien detailGiangVien(String ma);
List<GiangVien> findByTen(String ten);
List<GiangVien> deleteById(String id);
List<GiangVien> findByGioiTinh();


}
