package com.example.btvn_b12.service;

import com.example.btvn_b12.entity.CoSo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CoSoService {
    List<CoSo> getAll();
    void add(CoSo coSo);
    void delete(UUID id);
    Optional<CoSo> findByID(UUID id);
}
