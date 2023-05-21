package com.poly.tiennh21.ph19187.service.Impl;

import com.poly.tiennh21.ph19187.entity.ThucVat;
import com.poly.tiennh21.ph19187.service.ThucVatService;

import java.util.ArrayList;
import java.util.List;

public class ThucVatServiceImpl implements ThucVatService {
    public ThucVatServiceImpl(){
        lists.add(new ThucVat(1,"ăn quả","Đào",1,true,"1"));
        lists.add(new ThucVat(2,"cảnh","Trúc Mai",1,true,"1"));
        lists.add(new ThucVat(3,"ăn quả","Cam",1,true,"1"));
        lists.add(new ThucVat(4,"ăn quả","Quýt",1,true,"1"));
        lists.add(new ThucVat(5,"cảnh","hih",1,true,"1"));
    }

    private List<ThucVat> lists = new ArrayList<>();
    @Override
    public List<ThucVat> getAll() {
        return lists;
    }

    @Override
    public List<ThucVat> timKiem(String ten, Integer min, Integer max) {
        List<ThucVat> result = new ArrayList<>();
        for (ThucVat tv : lists){
            if(tv.getTen().equalsIgnoreCase(ten) && tv.getTuoi() >= min && tv.getTuoi() <= max ){
                result.add(tv);
            }
        }
        return result;
    }

    @Override
    public void addThucVat(ThucVat thucVat) {

    }
}
