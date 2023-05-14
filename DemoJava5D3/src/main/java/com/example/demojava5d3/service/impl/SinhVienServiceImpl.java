package com.example.demojava5d3.service.impl;

import com.example.demojava5d3.entity.SinhVien;
import com.example.demojava5d3.service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien>lists = new ArrayList<>();

    public SinhVienServiceImpl(){
        lists.add(new SinhVien("ph191","Minh",21,"hanoi",true));
        lists.add(new SinhVien("ph192","Long",22,"hanoi",true));
        lists.add(new SinhVien("ph193","Hùng",23,"hanoi",true));
        lists.add(new SinhVien("ph194","Thắng",21,"hanoi",true));
        lists.add(new SinhVien("ph195","Chiến",21,"hanoi",true));
        lists.add(new SinhVien("ph196","Linh",22,"hanoi",false));
        lists.add(new SinhVien("ph197","Giang",20,"hanoi",false));
    };
    @Override
    public List<SinhVien> getAll() {
        return lists;
    }

    @Override
    public SinhVien detailSinhVien(String ma) {
        for(SinhVien sv : lists){
            if(sv.getMssv().equalsIgnoreCase(ma)){
                return sv;
            }
        }
        return null;
    }
}