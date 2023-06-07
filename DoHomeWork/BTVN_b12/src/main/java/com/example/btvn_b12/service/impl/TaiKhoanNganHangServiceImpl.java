package com.example.btvn_b12.service.impl;

import com.example.btvn_b12.entity.TaiKhoanNganHang;
import com.example.btvn_b12.repository.TaiKhoanNganHangRepositoryTKNH;
import com.example.btvn_b12.service.TaiKhoanNganHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class TaiKhoanNganHangServiceImpl implements TaiKhoanNganHangService {
    @Autowired
    private TaiKhoanNganHangRepositoryTKNH repositoryTKNH;
    @Override
    public List<TaiKhoanNganHang> getAll() {
        return repositoryTKNH.findAll();
    }


}
