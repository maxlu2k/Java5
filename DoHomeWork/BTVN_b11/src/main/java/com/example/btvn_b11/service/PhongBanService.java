package com.example.btvn_b11.service;

import com.example.btvn_b11.entity.PhongBan;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PhongBanService {
    List<PhongBan> getAll();
    Page<PhongBan> pages(Integer pageNo, Integer size);
}
