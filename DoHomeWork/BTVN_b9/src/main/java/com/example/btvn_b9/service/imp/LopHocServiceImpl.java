package com.example.btvn_b9.service.imp;

import com.example.btvn_b9.entity.LopHoc;
import com.example.btvn_b9.repository.LopHocRepository;
import com.example.btvn_b9.service.LopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopHocServiceImpl implements LopHocService {
    @Autowired
    private LopHocRepository repository;


    @Override
    public List<LopHoc> getAll() {
        return repository.findAll();
    }

    @Override
    public LopHoc detailLopHoc(Long id) {
        for(LopHoc x : repository.findAll()){
            if (x.getId() == id){
                return x;
            }
        }
        return null;
    }

    @Override
    public void add(LopHoc lopHoc) {
        repository.save(lopHoc);
    }

    @Override
    public void update(LopHoc lopHoc) {
        repository.save(lopHoc);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Page<LopHoc> pTrang(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return repository.findAll(pageable);
    }

    @Override
    public Page<LopHoc> searchPTrang(String name, String diaDiem,Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return repository.searchAll(name, diaDiem, pageable);
    }

    @Override
    public List<LopHoc> search(String name, String diaDiem) {

        return null;
//        return repository.searchAll(name, diaDiem);
    }
}
