package com.example.btvn_b11.repository;

import com.example.btvn_b11.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepositoryPB  extends JpaRepository<PhongBan, Long> {
}
