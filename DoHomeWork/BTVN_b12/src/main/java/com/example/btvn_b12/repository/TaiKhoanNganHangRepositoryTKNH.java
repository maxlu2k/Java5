package com.example.btvn_b12.repository;

import com.example.btvn_b12.entity.TaiKhoanNganHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface TaiKhoanNganHangRepositoryTKNH extends JpaRepository<TaiKhoanNganHang, UUID> {
}
