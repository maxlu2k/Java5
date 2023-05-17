package com.example.demojava5d3.service;

import com.example.demojava5d3.entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    List<SinhVien> getAll();

    SinhVien detailSinhVien(String ma);

    List<SinhVien> removeSinhVien(String ma);

    void deleteSinhVien(String ma);

    void addSinhVien(SinhVien sinhVien);
}
