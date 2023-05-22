package com.poly.tiennh21.ph19187.service.Impl;

import com.poly.tiennh21.ph19187.entity.ThucVat;
import com.poly.tiennh21.ph19187.service.ThucVatService;

import java.util.ArrayList;
import java.util.List;

public class ThucVatServiceImpl implements ThucVatService {
    public ThucVatServiceImpl(){
        lists.add(new ThucVat("ăn quả","Đào",1,true,"1"));
        lists.add(new ThucVat("cảnh","Trúc Mai",1,true,"1"));
        lists.add(new ThucVat("ăn quả","Cam",1,true,"1"));
        lists.add(new ThucVat("ăn quả","Quýt",1,true,"1"));
        lists.add(new ThucVat("cảnh","hih",1,true,"1"));
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
    public ThucVat timKiemTheoID(Integer id) {
        for (ThucVat x : lists){
            if(x.getId() == id){
                return x;
            }
        }
        return null;
    }


    @Override
    public void addThucVat(ThucVat thucVat) {

        lists.add(thucVat);
    }

    @Override
    public void deleteThucVat(Integer id) {
        ThucVat thucVat = timKiemTheoID(id);
        lists.remove(thucVat);
    }

}
