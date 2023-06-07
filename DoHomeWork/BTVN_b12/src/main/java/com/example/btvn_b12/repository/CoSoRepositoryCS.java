package com.example.btvn_b12.repository;

import com.example.btvn_b12.entity.CoSo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CoSoRepositoryCS extends JpaRepository<CoSo, UUID> {
}
