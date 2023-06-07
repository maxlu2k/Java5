package com.example.btvn_b10.service;

import com.example.btvn_b10.entity.NhanVien;
import org.springframework.data.domain.Page;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> getAll();
    Page<NhanVien> pages(Integer pageNo, Integer size);
}
