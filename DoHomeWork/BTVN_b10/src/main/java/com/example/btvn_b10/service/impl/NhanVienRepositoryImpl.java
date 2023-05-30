package com.example.btvn_b10.service.impl;

import com.example.btvn_b10.entity.NhanVien;
import com.example.btvn_b10.repository.NhanVienRepository;
import com.example.btvn_b10.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienRepositoryImpl implements NhanVienService {
    @Autowired
    private NhanVienRepository repository;
    @Override
    public List<NhanVien> getAll() {
        return repository.findAll();
    }
}
