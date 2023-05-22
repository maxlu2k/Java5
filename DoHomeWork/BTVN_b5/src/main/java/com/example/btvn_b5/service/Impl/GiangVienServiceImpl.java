package com.example.btvn_b5.service.Impl;

import com.example.btvn_b5.entity.GiangVien;
import com.example.btvn_b5.service.GiangVienService;

import java.util.ArrayList;
import java.util.List;

public class GiangVienServiceImpl implements GiangVienService {
    private List<GiangVien> lists = new ArrayList<>();

    public GiangVienServiceImpl() {
        lists.add(new GiangVien("anv1", "Nguyen Van A", "23", "Ha Noi"));
        lists.add(new GiangVien("anv2", "Nguyen Van B", "24", "Ha Noi"));
        lists.add(new GiangVien("anv3", "Nguyen Van C", "30", "Ha Noi"));
        lists.add(new GiangVien("anv4", "Nguyen Van D", "32", "Ha Noi"));
        lists.add(new GiangVien("anv5", "Nguyen Van E", "25", "Ha Noi"));
        lists.add(new GiangVien("anv6", "A", "25", "Ha Noi"));
    }

    @Override
    public List<GiangVien> getAll() {
        return lists;
    }

    @Override
    public GiangVien detailGiangVien(String maGV) {
        for (GiangVien gv : lists) {
            if (gv.getMaGV().equalsIgnoreCase(maGV)) {
                return gv;
            }
        }
        return null;
    }

    @Override
    public void deleteGV(String maGV) {
        GiangVien giangVien = detailGiangVien(maGV);
        lists.remove(giangVien);
    }

    @Override
    public List<GiangVien> searchGVByName(String ten, Integer min, Integer max) {
//        List<GiangVien> result = new ArrayList<>();
//        for (GiangVien gv : lists) {
//            String[] nameParts = gv.getTen().split(" ");
//            if (nameParts.length > 0 && nameParts[nameParts.length - 1].equalsIgnoreCase(ten)) {
//                result.add(gv);
//            }
//        }
//        return result;
        List<GiangVien> result = new ArrayList<>();
        for (GiangVien gv : lists) {
            if (gv.getTen().equalsIgnoreCase(ten)) {
                if (Integer.parseInt(gv.getTuoi()) >= min && Integer.parseInt(gv.getTuoi()) <= max) {
                    result.add(gv);
                }
            } else {
                String[] nameParts = gv.getTen().split(" ");
                if (nameParts.length > 0 && nameParts[nameParts.length - 1].equalsIgnoreCase(ten)) {
                    if (Integer.parseInt(gv.getTuoi()) >= min && Integer.parseInt(gv.getTuoi()) <= max) {
                        result.add(gv);
                    }
                }
            }
        }
        return result;
    }

    @Override
    public void addGV(GiangVien giangVien) {
        lists.add(giangVien);
    }
}
