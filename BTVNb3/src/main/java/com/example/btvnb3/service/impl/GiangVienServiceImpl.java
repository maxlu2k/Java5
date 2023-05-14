package com.example.btvnb3.service.impl;

import com.example.btvnb3.entity.GiangVien;
import com.example.btvnb3.service.GiangVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class GiangVienServiceImpl implements GiangVienService {

    private List<GiangVien> lists = new ArrayList<>();

    public GiangVienServiceImpl(){
        lists.add(new GiangVien("ph1912","Dung",22,true,"Hanoi"));
        lists.add(new GiangVien("ph1913","Minh",21,true,"Hanoi"));
        lists.add(new GiangVien("ph1914","Hang",20,false,"Hanoi"));
        lists.add(new GiangVien("ph1915","Long",21,true,"Hanoi"));
        lists.add(new GiangVien("ph1916","Kien",19,true,"Hanoi"));
        lists.add(new GiangVien("ph1917","Linh",20,false,"Hanoi"));
        lists.add(new GiangVien("ph1918","Giang",22,false,"Hanoi"));
        lists.add(new GiangVien("ph1919","Hai",23,true,"Hanoi"));
    }
    @Override
    public List<GiangVien> getAll() {
        return lists;
    }

    @Override
    public GiangVien detailGiangVien(String ma) {
        for(GiangVien gv : lists){
            if(gv.getMa().equalsIgnoreCase(ma)){;
            return gv;
            }
        }
        return null;
    }

    @Override
    public List<GiangVien> findByTen(String ten) {
        List<GiangVien> result = new ArrayList<>();
        for (GiangVien gv : lists) {
            if (gv.getTen().equalsIgnoreCase(ten)) {
                result.add(gv);
            }
        }
        return result;
    }

    @Override
    public List<GiangVien> deleteById(String id) {
        GiangVien gvToDelete = null;
        for (GiangVien gv : lists) {
            if (gv.getId().equalsIgnoreCase(id)) {
                gvToDelete = gv;
                break;
            }
        }
        if (gvToDelete != null) {
            lists.remove(gvToDelete);
        }
        return lists;
    }

    @Override
    public List<GiangVien> findByGioiTinh() {
        List<GiangVien> result = new ArrayList<>();
        for (GiangVien gv : lists) {
            if (gv.getGioiTinh() == false) {
                result.add(gv);
            }
        }
        return result;
    }
}
