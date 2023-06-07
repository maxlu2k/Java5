package com.example.btvn_b10.service.impl;

import com.example.btvn_b10.entity.NhanVien;
import com.example.btvn_b10.repository.NhanVienRepositorySS;
import com.example.btvn_b10.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienRepositoryImpl implements NhanVienService {
    @Autowired
    private NhanVienRepositorySS repository;
    @Override
    public List<NhanVien> getAll() {
        return repository.findAll();
    }

    @Override
    public Page<NhanVien> pages(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo,size);
        return repository.findAll(pageable);
    }
}
