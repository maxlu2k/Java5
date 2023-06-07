package com.example.btvn_b12.service.impl;

import com.example.btvn_b12.entity.CoSo;
import com.example.btvn_b12.repository.CoSoRepositoryCS;
import com.example.btvn_b12.service.CoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CoSoServiceImpl implements CoSoService {
    @Autowired
    private CoSoRepositoryCS repositoryCS;

    @Override
    public List<CoSo> getAll() {
        return repositoryCS.findAll();
    }

    @Override
    public void add(CoSo coSo) {
        repositoryCS.save(coSo);
    }

    @Override
    public void delete(UUID id) {
        repositoryCS.deleteById(id);
    }

    @Override
    public Optional<CoSo> findByID(UUID id) {
        return repositoryCS.findById(id);
    }


}
