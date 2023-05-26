package com.poly.tiennh21.ph19187.service.Impl;

import com.poly.tiennh21.ph19187.entity.ThucVat;
import com.poly.tiennh21.ph19187.service.ThucVatService;

import java.util.ArrayList;
import java.util.List;

public class ThưcVatServiceImpl implements ThucVatService {

    public ThưcVatServiceImpl() {
        lists.add(new ThucVat("a","Otto",true,5,"rau củ"));
        lists.add(new ThucVat("b","đào",true,15,"cây cảnh"));
        lists.add(new ThucVat("c","mai",true,15,"cây cảnh"));
    }

    private List<ThucVat> lists = new ArrayList<>();
    @Override
    public List<ThucVat> getAll() {
        return lists;
    }

    @Override
    public ThucVat detailById(String ma) {
        for (ThucVat x : lists){
            if(x.getMa().equalsIgnoreCase(ma)){
                return x;
            }
        }
        return null;
    }

    @Override
    public ThucVat detail(ThucVat thucVat) {

        return null;
    }


    @Override
    public void deleteThucVat(String ma) {
        System.out.println(ma + "aaaaaaaaaaaa");
        lists.remove(detailById(ma));
    }

    @Override
    public void addThucVat(ThucVat thucVat) {
        lists.add(thucVat);
    }

    @Override
    public void update(String ma) {

    }
}
