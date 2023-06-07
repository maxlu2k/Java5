package com.example.btvn_b10.repository;

import com.example.btvn_b10.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepositorySS extends JpaRepository<NhanVien, Long> {
}
