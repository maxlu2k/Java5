package com.example.btvn_b11.service.impl;

import com.example.btvn_b11.entity.PhongBan;
import com.example.btvn_b11.repository.PhongBanRepositoryPB;
import com.example.btvn_b11.service.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongBanServiceImpl implements PhongBanService {
    @Autowired
    private PhongBanRepositoryPB repositoryPB;

    @Override
    public List<PhongBan> getAll() {
        return repositoryPB.findAll();
    }

    @Override
    public Page<PhongBan> pages(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return repositoryPB.findAll(pageable);
    }
}
