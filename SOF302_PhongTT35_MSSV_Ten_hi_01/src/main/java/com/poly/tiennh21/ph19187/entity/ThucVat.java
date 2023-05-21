package com.poly.tiennh21.ph19187.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ThucVat {
    private Integer id;
    private String loaiCay;
    private String ten;
    private Integer tuoi;
    private Boolean gioiTinh;
    private String khuVuc;
}
