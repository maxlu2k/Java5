package com.poly.tiennh21.ph19187.service;

import com.poly.tiennh21.ph19187.entity.ThucVat;

import java.util.List;

public interface ThucVatService {
    List<ThucVat> getAll();
    List<ThucVat> timKiem(String ten, Integer min, Integer max);
    ThucVat timKiemTheoID(Integer id);
    void addThucVat(ThucVat thucVat);

    void deleteThucVat(Integer id);
}
