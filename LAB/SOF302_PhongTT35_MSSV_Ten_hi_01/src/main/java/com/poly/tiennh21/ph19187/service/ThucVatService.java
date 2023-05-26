package com.poly.tiennh21.ph19187.service;

import com.poly.tiennh21.ph19187.entity.ThucVat;

import java.util.List;

public interface ThucVatService {

    List<ThucVat> getAll();
    ThucVat detailById(String ma);
    ThucVat detail(ThucVat thucVat);
    void deleteThucVat(String ma);
    void addThucVat(ThucVat thucVat);
    void update(String ma);
}
