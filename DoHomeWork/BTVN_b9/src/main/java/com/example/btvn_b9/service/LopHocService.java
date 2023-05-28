package com.example.btvn_b9.service;

import com.example.btvn_b9.entity.LopHoc;
import org.springframework.data.domain.Page;

import java.util.List;

public interface LopHocService {
    List<LopHoc> getAll();

    LopHoc detailLopHoc(Long id);
    void add(LopHoc lopHoc);

    void update(LopHoc lopHoc);

    void deleteById(Long id);

    Page<LopHoc> pTrang(Integer pageNo, Integer size);
    Page<LopHoc> searchPTrang(String name, String diaDiem,Integer pageNo, Integer size);
    List<LopHoc> search(String name, String diaDiem);

}
